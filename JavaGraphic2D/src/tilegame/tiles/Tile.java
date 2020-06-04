package tilegame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	// những stuff tĩnh sẽ đc khởi tạo
	public static Tile[] tiles = new Tile[400]; // max = 400 tiles
	public static Tile grassTile = new GrassTile(0); // grassTile kí hiệu là 0
	public static Tile dirtTile = new DirtTile(1);
	public static Tile rockTile = new RockTile(2);
	
	protected BufferedImage texture;

	protected final int id;

	public static final int TILE_WIDTH = 64, TILE_HEIGHT = 64;

	// khởi tạo cho các Tile
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		tiles[id] = this;

	}

	// tick + render
	public void tick() {
	}

	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null); // vừa draw vừa scale.
	}

	public int getId() {
		return id;
	}

	public boolean isSolid() {
		return false;
	}

}
