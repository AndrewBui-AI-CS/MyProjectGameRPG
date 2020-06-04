package tilegame.gfx;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

// lop cha de lay anh
public class Assets {
	public static Font font28;
	public static BufferedImage[] button, player; // hình ảnh nút ở menu
	// hình ảnh của nhân vật
	public static BufferedImage playerImage;
	public static BufferedImage[] playerDefendUp, playerDefendDown, playerDefendLeft, playerDefendRight;
	public static BufferedImage[] playerAttackRight, playerAttackUp, playerAttackDown, playerAttackLeft, skillfulAttack;
	// hình ảnh kho chứa, các thực thể.
	public static BufferedImage inventoryScreen, rock, tree, tile;
	// hình ảnh quái vật
	public static BufferedImage[] monsterGoUP, monsterGoDown, monsterGoRight, monsterGoLeft;
	public static BufferedImage[] monsterAttackUP, monsterAttackDown, monsterAttackRight, monsterAttackLeft;

	public static void init() // load any image, sound, ...
	{
		font28 = FontLoader.loadFont("res/fonts/slkscr.ttf", (int) 28); // load font có sẵn
		SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/textures/rock.png"));
		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/tree.png"));
		SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/textures/tile.png"));
//		SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/textures/cauthang.png"));f
//		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/caybui.png"));
//		SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/textures/caydacam.png"));
//		SpriteSheet sheet4 = new SpriteSheet(ImageLoader.loadImage("/textures/caythong.png"));
		SpriteSheet sheet5 = new SpriteSheet(ImageLoader.loadImage("/textures/button1.png"));
		SpriteSheet sheet6 = new SpriteSheet(ImageLoader.loadImage("/textures/button2.png"));
//		SpriteSheet sheet7 = new SpriteSheet(ImageLoader.loadImage("/textures/caytim.png"));
//		SpriteSheet sheet8 = new SpriteSheet(ImageLoader.loadImage("/textures/caytron.png"));
		SpriteSheet sheet9 = new SpriteSheet(ImageLoader.loadImage("/textures/inventoryScreen.png"));
//		SpriteSheet sheet10 = new SpriteSheet(ImageLoader.loadImage("/textures/chuh.png"));
//		SpriteSheet sheet11= new SpriteSheet(ImageLoader.loadImage("/textures/da.png"));
//		SpriteSheet sheet12= new SpriteSheet(ImageLoader.loadImage("/textures/hangrao.png"));
//		SpriteSheet sheet13= new SpriteSheet(ImageLoader.loadImage("/textures/lomdom.png"));
//		SpriteSheet sheet14 = new SpriteSheet(ImageLoader.loadImage("/textures/nencomuiten.png"));
//		SpriteSheet sheet15 = new SpriteSheet(ImageLoader.loadImage("/textures/nendat.png"));
//		SpriteSheet sheet16= new SpriteSheet(ImageLoader.loadImage("/textures/nendat2.png"));
//		SpriteSheet sheet17 = new SpriteSheet(ImageLoader.loadImage("/textures/nendat3.png"));
//		SpriteSheet sheet18 = new SpriteSheet(ImageLoader.loadImage("/textures/nendoi.png"));
//		SpriteSheet sheet19 = new SpriteSheet(ImageLoader.loadImage("/textures/nendoi2.png"));
//		SpriteSheet sheet20 = new SpriteSheet(ImageLoader.loadImage("/textures/nhadoi.png"));
//		SpriteSheet sheet21 = new SpriteSheet(ImageLoader.loadImage("/textures/nhahuong.png"));
//		SpriteSheet sheet22= new SpriteSheet(ImageLoader.loadImage("/textures/nha.png"));
//		SpriteSheet sheet23 = new SpriteSheet(ImageLoader.loadImage("/textures/raotrang.png"));
//		SpriteSheet sheet24 = new SpriteSheet(ImageLoader.loadImage("/textures/suoimoi.png"));
//		SpriteSheet sheet25 = new SpriteSheet(ImageLoader.loadImage("/textures/suoiogocphai.png"));
//		SpriteSheet sheet26 = new SpriteSheet(ImageLoader.loadImage("/textures/suoi.png"));
		SpriteSheet sheet27 = new SpriteSheet(ImageLoader.loadImage("/textures/chemtrai.png"));
		SpriteSheet sheet28 = new SpriteSheet(ImageLoader.loadImage("/textures/chemcachuong.png"));
		SpriteSheet sheet29 = new SpriteSheet(ImageLoader.loadImage("/textures/phongthuduoi.png"));
		SpriteSheet sheet30 = new SpriteSheet(ImageLoader.loadImage("/textures/phongthuphai.png"));
		SpriteSheet sheet31 = new SpriteSheet(ImageLoader.loadImage("/textures/phongthutrai.png"));
		SpriteSheet sheet32 = new SpriteSheet(ImageLoader.loadImage("/textures/phongthutren.png"));
		SpriteSheet sheet33 = new SpriteSheet(ImageLoader.loadImage("/textures/tuyetchieu.png"));
		SpriteSheet sheet34 = new SpriteSheet(ImageLoader.loadImage("/textures/banphai.png"));
		SpriteSheet sheet35 = new SpriteSheet(ImageLoader.loadImage("/textures/banlen.png"));
		SpriteSheet sheet36 = new SpriteSheet(ImageLoader.loadImage("/textures/banxuong.png"));
		SpriteSheet sheet37 = new SpriteSheet(ImageLoader.loadImage("/textures/bantrai.png"));
		SpriteSheet sheet38 = new SpriteSheet(ImageLoader.loadImage("/textures/dichuyen.png"));
		SpriteSheet sheet39 = new SpriteSheet(ImageLoader.loadImage("/textures/dichuyentrai.png"));
		SpriteSheet sheet40 = new SpriteSheet(ImageLoader.loadImage("/textures/nhanvatnam.png"));
		playerDefendDown = new BufferedImage[3];
		playerDefendUp = new BufferedImage[3];
		playerDefendLeft = new BufferedImage[3];
		playerDefendRight = new BufferedImage[3];
		playerAttackDown = new BufferedImage[3];
		playerAttackLeft = new BufferedImage[3];
		playerAttackRight = new BufferedImage[3];
		playerAttackUp = new BufferedImage[3];
		skillfulAttack = new BufferedImage[8];

		monsterGoUP = new BufferedImage[3];
		monsterGoDown = new BufferedImage[3];
		monsterGoLeft = new BufferedImage[3];
		monsterGoRight = new BufferedImage[3];
		monsterAttackDown = new BufferedImage[4];
		monsterAttackUP = new BufferedImage[4];
		monsterAttackLeft = new BufferedImage[4];
		monsterAttackRight = new BufferedImage[4];

		playerDefendDown[0] = sheet29.crop(0, 25,  45, 38);
		playerDefendDown[1] = sheet29.crop(0, 92,  45, 38);
		playerDefendDown[2] = sheet29.crop(0, 155,  45, 38);
		playerDefendUp[0] = sheet32.crop(25, 27,  45, 38);
		playerDefendUp[1] = sheet32.crop(25, 90, 45, 38);
		playerDefendUp[2] = sheet32.crop(25, 157,  45, 38);
		playerDefendRight[0] = sheet30.crop(15, 22,  45, 38);
		playerDefendRight[1] = sheet30.crop(15, 87,  45, 38);
		playerDefendRight[2] = sheet30.crop(15, 147,  45, 38);
		playerDefendLeft[0] = sheet31.crop(45, 20,  45, 38);
		playerDefendLeft[1] = sheet31.crop(45, 87,  45, 38);
		playerDefendLeft[2] = sheet31.crop(45, 147,  45, 38);
		playerAttackDown[0] = sheet28.crop(0, 10, 45, 38);
		playerAttackDown[1] = sheet28.crop(0, 78, 45, 38);
		playerAttackDown[2] = sheet28.crop(0, 127, 45, 38);
		playerAttackUp[0] = sheet28.crop(68, 3, 45, 38);
		playerAttackUp[1] = sheet28.crop(62, 67, 45, 38);
		playerAttackUp[2] = sheet28.crop(62, 127, 45, 38);
		playerAttackRight[0] = sheet28.crop(132, 0, 45, 38);
		playerAttackRight[1] = sheet28.crop(132, 67, 45, 38);
		playerAttackRight[2] = sheet28.crop(132, 127, 45, 38);
		playerAttackLeft[0] = sheet27.crop(0, 0, 45, 38);
		playerAttackLeft[1] = sheet27.crop(0, 78, 45, 38);
		playerAttackLeft[2] = sheet27.crop(0, 126, 45, 38);
		skillfulAttack[0] = sheet33.crop(0, 0, 45, 38);
		skillfulAttack[1] = sheet33.crop(0, 55, 45, 38);
		skillfulAttack[2] = sheet33.crop(0, 120, 45, 38);
		skillfulAttack[3] = sheet33.crop(0, 188, 45, 38);
		skillfulAttack[4] = sheet33.crop(0, 256, 58, 38);
		skillfulAttack[5] = sheet33.crop(0, 313, 58, 38);
		skillfulAttack[6] = sheet33.crop(0, 376, 45, 38);
		skillfulAttack[7] = sheet33.crop(0, 438, 45, 38);
		playerImage = sheet40.crop(0, 0, 96, 64);
		

		monsterGoDown[0] = sheet38.crop(0, 0, 56, 56);
		monsterGoDown[1] = sheet38.crop(126, 0, 60, 60);
		monsterGoDown[2] = sheet38.crop(189, 0, 60, 60);
		monsterGoRight[0] = sheet38.crop(0, 120, 56, 56);
		monsterGoRight[1] = sheet38.crop(126, 120, 60, 60);
		monsterGoRight[2] = sheet38.crop(189, 120, 60, 60);
		monsterGoUP[0] = sheet38.crop(0, 60, 56, 56);
		monsterGoUP[1] = sheet38.crop(126, 60, 60, 60);
		monsterGoUP[2] = sheet38.crop(189, 60, 60, 60);
		monsterGoLeft[0] = sheet39.crop(0, 120, 56, 56);
		monsterGoLeft[1] = sheet39.crop(126, 120, 60, 60);
		monsterGoLeft[2] = sheet39.crop(189, 120, 60, 60);
		monsterAttackDown[0] = sheet36.crop(65, 20, 56, 56);
		monsterAttackDown[1] = sheet36.crop(126, 17, 60, 60);
		monsterAttackDown[2] = sheet36.crop(192, 17, 60, 60);
		monsterAttackDown[3] = sheet36.crop(575, 17, 45, 50);
		monsterAttackUP[0] = sheet35.crop(65, 20, 56, 56);
		monsterAttackUP[1] = sheet35.crop(126, 17, 60, 60);
		monsterAttackUP[2] = sheet35.crop(192, 17, 60, 60);
		monsterAttackUP[3] = sheet35.crop(575, 17, 45, 50);
		monsterAttackLeft[0] = sheet37.crop(0, 20, 40, 47);
		monsterAttackLeft[1] = sheet37.crop(126, 20, 40, 47);
		monsterAttackLeft[2] = sheet37.crop(192, 20, 40, 47);
		monsterAttackLeft[3] = sheet37.crop(380, 20, 40, 47);
		monsterAttackRight[0] = sheet34.crop(0, 20, 40, 48);
		monsterAttackRight[1] = sheet34.crop(126, 20, 40, 48);
		monsterAttackRight[2] = sheet34.crop(192, 20, 40, 48);
		monsterAttackRight[3] = sheet34.crop(505, 20, 40, 48);

		button = new BufferedImage[2];
		rock = sheet1.crop(0, 0, 135, 108);
		tree = sheet2.crop(0, 0, 204, 388);
		tile = sheet3.crop(0, 0, 30, 30);
		button[0] = sheet5.crop(0, 0, 1024, 1024);
		button[1] = sheet6.crop(0, 0, 860, 663);
		inventoryScreen = sheet9.crop(0, 0, 512, 384);

//		cauThang = sheet1.crop(0, 0, 70, 90);
//		cayBui = sheet2.crop(118, 75, 81, 91);
//		cayDacam = sheet3.crop(0, 0, 65, 72);
//		cayThong = sheet4.crop(0, 0, 64, 98);
//		cayTim = sheet7.crop(80, 0, 77, 55);
//		cayTron = sheet8.crop(0, 0, 48, 61);
//		chu_H = sheet10.crop(0, 0, 70, 90);
//		Da = sheet11.crop(0, 0, 35, 35);  
//		hangRao = sheet12.crop(0, 0, 30, 40);
//		lomDom = sheet13.crop(0, 0, 80, 50); 
//		nenDat = sheet15.crop(0, 0, 70, 90);
//		nenDat2 =sheet16.crop(0, 0, 70, 90);
//		nenDat3 = sheet17.crop(0, 0, 70, 90);
//		nenDoi = sheet18.crop(50, 0, 60, 60);
//		nenDoi2 = sheet19.crop(0, 0, 48, 50);
//		nhaDoi = sheet20.crop(0, 0, 70, 90);
//		nhaHuong = sheet21.crop(0, 0, 122, 98);
//		Nha = sheet22.crop(90, 3, 157, 150);
//		raoTrang = sheet23.crop(0, 0, 70, 90);
//		suoiMoi = sheet24.crop(0, 0, 70, 90);
//		suoiGocPhai =sheet25.crop(0, 0, 70, 90);
//		Suoi = sheet26.crop(0, 0, 70, 90);
//		nenMuiten = sheet14.crop(0, 0, 70, 90);
	}
}
