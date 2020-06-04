package state;

import java.awt.Color;
import java.awt.Graphics;

import tilegame.Handler;
import tilegame.gfx.Assets;
import tilegame.ui.ClickListener;
import tilegame.ui.UIImageButton;
import tilegame.ui.UIManager;

public class LevelState extends State{
	private UIManager uiManager;
	// level demo
	public int currentLevel = 2;
	// timer
	private long timer = 0;
	// Khởi tạo
	public LevelState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUiManager(uiManager);
		uiManager.addObject(new UIImageButton(200, 200, 64, 64, Assets.button, new ClickListener() {

			@Override
			// click thì sẽ chuyển sang gameState
			public void onClick() {
				// TODO Auto-generated method stub
				handler.getGame().gameState2 = new GameState(handler);
			
					State.setState(handler.getGame().gameState2);

			}
		}));
	}

	// tick + render
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		uiManager.tick();
		handler.getMouseManager().setUiManager(uiManager);
//		State.setState(handler.getGame().levelState);

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.drawString("LEVEL : " + currentLevel, 450, 100);
		uiManager.render(g);
	}

}
