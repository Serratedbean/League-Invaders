package league;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;



	public class Rocketship extends GameObject {

		
		 int speed = 25;
		
		Rocketship(int x, int y, int width, int height) {
			super(x, y, width, height);
			// TODO Auto-generated constructor stub
		} 
		
	    public void left() {
	        x-=speed;
	    }
	    public void right() {
	        x+=speed;
	    }
	    public void up() {
	        y-=speed;
	    }
	    public void down() {
	        y+=speed;
	    }
	    
		void draw(Graphics g)
		{
			g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
		}
		

		
		
	}


	