package state;

import java.awt.Graphics;

import javax.swing.JOptionPane;

import tilegame.Handler;
import tilegame.util.User;
import tilegame.util.UserData;
import tilegame.worlds.World;

public class GameState extends State {
	// load world
	private World world;
	// khởi tạo level cho state
	private int currentLevel = 1;
	// khởi tạo
	public GameState(Handler handler) {
		// TODO Auto-generated constructor stub
		super(handler);
		world = new World(handler, "res/World/World1");
		handler.setWorld(world);
	}

	// tick + render
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		world.tick();
		if (isNewGame) {

		} else if (world.getEntityManager().countMonstersLeft() > 0) {
			return; // còn quái vật thì return
		} else {
//			String name = JOptionPane.showInputDialog("Input your name: ");
//			UserData.users.add(new User(name, String.valueOf(currentLevel)));
			handler.getGame().gameState2 = new GameState2(handler);
		 State.setState(world.getHandler().getGame().levelState);
			// hết quái vật -> win
			
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		world.render(g);
	}

}
