package tilegame;

import tilegame.gfx.GameCamera;
import tilegame.input.KeyManager;
import tilegame.input.MouseManager;
import tilegame.worlds.World;
import tilegame.worlds.World2;
// handler kết tập các lớp khác với nhiệm vụ điều khiển việc khởi tạo và thực hiện của chúng.
public class Handler {
	private Game game;
	private World world ;	
	private World2 world2;
	public World2 getWorld2() {
		return world2;
	}
	public void setWorld2(World2 world2) {
		this.world2 = world2;
	}
	public Handler(Game game)
	{
		this.game = game;
	}
	// cac phuong thuc get, set. 
	public int getWidth()
	{
		return game.getWidth();
	}
	public int getHeight()
	{
		return game.getHeight();
	}
	public KeyManager getKeyManager()
	{
		return game.getKeyManager();
	}
	public GameCamera getGameCamera()
	{
		return game.getGameCamera();
	}
	public MouseManager getMouseManager()
	{
		return game.getMouseManager();
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public World getWorld() {
		return world;
	}
	public void setWorld(World world) {
		this.world = world;
	}
	
}
