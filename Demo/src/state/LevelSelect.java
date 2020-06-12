package state;

import tilegame.Game;
import tilegame.Handler;
import tilegame.gfx.Assets;
import tilegame.ui.ClickListener;
import tilegame.ui.UIImageButton;
import tilegame.ui.UIManager;

import java.awt.*;

public class LevelSelect extends State {
    private UIManager uiManager;
    public LevelSelect(Handler handler){
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUiManager(uiManager);

        uiManager.addObject(new UIImageButton(0, 0, 800, 600, Assets.menuImage, new ClickListener() {
            @Override
            // click thì sẽ chuyển sang gameStatemenuState
            public void onClick() {
                // TODO Auto-generated method stub

            }
        }));
        uiManager.addObject(new UIImageButton(320, 400, 200, 30, Assets.easy, new ClickListener() {
            // click thì sẽ chuyển sang gameStatemenuState
            public void onClick() {
                // TODO Auto-generated method stub
                Game.gameState = new GameState(handler);
                State.setState(handler.getGame().levelState1);
                // TODO Auto-generated method stub

            }
        }));

        uiManager.addObject(new UIImageButton(320, 450, 200, 30, Assets.hard, new ClickListener() {
            @Override
            // click thì sẽ chuyển sang gameStatemenuState
            public void onClick() {
                // TODO Auto-generated method stub
                Game.gameState = new GameState(handler);
                State.setState(handler.getGame().levelState1);
                // TODO Auto-generated method stub

            }
        }));

    }
    @Override
    public void tick() {
        // TODO Auto-generated method stub
        uiManager.tick();
        handler.getMouseManager().setUiManager(uiManager);

    }

    @Override
    public void render(Graphics g) {
        uiManager.render(g);
    }
}
