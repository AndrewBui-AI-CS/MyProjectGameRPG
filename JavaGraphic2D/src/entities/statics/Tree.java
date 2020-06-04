package entities.statics;

import java.awt.Graphics;

import entities.Entity;
import tilegame.Handler;
import tilegame.gfx.Assets;
import tilegame.items.Item;
import tilegame.tiles.Tile;

public class Tree extends Entity{
	public Tree(Handler handler, float x, float y)
	{
		super(handler, x, y, Tile.TILE_WIDTH , Tile.TILE_HEIGHT * 2);
		// set bounds cho tree tai than cay( doan ma no solid)
		// chinh lai sau
		bounds.x = 10;
		bounds.y = (int) (height/1.5f);
		bounds.width = width - 20;
		bounds.height = (int) (height - height / 1.5f); 
	}

	// tick + render
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Assets.tree, (int) (x - handler.getGameCamera().getxOffset()), (int) (y- handler.getGameCamera().getyOffset()), width , height, null);
		
	}
	public void die()
	{
		handler.getWorld().getItemManager().addItem(Item.woodItem.creatNew((int)x, (int)y));
	}
}
