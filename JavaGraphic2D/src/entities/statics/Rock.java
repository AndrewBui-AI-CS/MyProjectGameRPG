package entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import tilegame.Handler;
import tilegame.gfx.Assets;
import tilegame.items.Item;
import tilegame.tiles.Tile;

public class Rock extends StaticEntity{
	public Rock(Handler handler , float x, float y)
	{
		super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
		// chinh lai sau
		bounds.x = 3;
		bounds.y = (int) (height/2f);
		bounds.height =(int) (height - height/2f);
		bounds.width = width -6;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillRect((int) (x+bounds.x -handler.getGameCamera().getxOffset()), (int) (y+bounds.y-handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
		g.drawImage(Assets.rock, (int)(x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width , height, null );
	}
	// tao item ma nhan vat co the nhat duoc sau khi chet
	public void die()
	{
		handler.getWorld().getItemManager().addItem(Item.rockItem.creatNew((int)x, (int)y));

	}
}
