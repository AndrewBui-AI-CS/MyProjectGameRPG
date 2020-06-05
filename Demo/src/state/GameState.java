package state;

import java.awt.Graphics;

import tilegame.Handler;
import tilegame.worlds.World;

public class GameState extends State implements AutoCloseable{
	// load world
	private World world;
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
				State.setState(world.getHandler().getGame().levelState);
		
			
			// hết quái vật -> nhay level
			
			
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		world.render(g);
	}

}