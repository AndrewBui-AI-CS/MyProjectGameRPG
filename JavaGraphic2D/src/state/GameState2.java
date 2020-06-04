package state;

import java.awt.Graphics;

import javax.swing.JOptionPane;

import tilegame.Handler;
import tilegame.util.User;
import tilegame.util.UserData;
import tilegame.worlds.World2;

public class GameState2 extends State {
	// load world
	private World2 world2;
	// khởi tạo level cho state
	private int currentLevel = 1;
	// khởi tạo
	public GameState2(Handler handler) {
		// TODO Auto-generated constructor stub
		super(handler);
		world2 = new World2(handler, "res/World/World2");
		handler.setWorld2(world2);
		
	}

	// tick + render
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		world2.tick();
		if (isNewGame) {

		} else if (world2.getEntityManager().countMonstersLeft() > 0) {
			return; // còn quái vật thì return
		} else {
			String name = JOptionPane.showInputDialog("Input your name: ");
			UserData.users.add(new User(name, String.valueOf(currentLevel)));
			State.setState(world2.getHandler().getGame().winState);
			// hết quái vật -> win
			
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		world2.render(g);

	}

}
