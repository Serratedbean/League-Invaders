package league;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	
	int speed = 1;
	
	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	void draw(Graphics g)
	{
		 g.setColor(Color.RED);
	     g.fillRect(x, y, width, height);
		
	}
	
	public void update()
	{
		y-=speed;
		
	}

}
