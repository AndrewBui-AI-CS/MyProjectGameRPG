package state;

import java.awt.Graphics;

import tilegame.Handler;
import tilegame.gfx.Assets;
import tilegame.ui.ClickListener;
import tilegame.ui.UIImageButton;
import tilegame.ui.UIManager;

public class MenuState extends State {
	// UI
	private UIManager uiManager;

	// Khởi tạo
	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUiManager(uiManager);
		uiManager.addObject(new UIImageButton(200, 200, 64, 64, Assets.button, new ClickListener() {

			@Override
			// click thì sẽ chuyển sang gameState
			public void onClick() {
				// TODO Auto-generated method stub
				handler.getGame().gameState = new GameState(handler);
				State.setState(handler.getGame().gameState);

			}
		}));
	}

	// tick + render
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		uiManager.tick();
		handler.getMouseManager().setUiManager(uiManager);
		State.setState(handler.getGame().menuState);

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		uiManager.render(g);
	}

}
