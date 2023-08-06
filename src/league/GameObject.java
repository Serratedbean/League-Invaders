package league;

import java.awt.Color;

public class GameObject {

	 int x;
	 int y;
	 int width;
	 int height;
	 
	 int speed = 0;
	
	 GameObject(int x, int y, int width, int height)
	 {
		 
	 }
	
	 
	 public void update()
	 {
		 
	 }
	
	
}

	public class Rocketship extends GameObject {

		Rocketship(int x, int y, int width, int height) {
			super(x, y, width, height);
			// TODO Auto-generated constructor stub
		} 
		
		void draw()
		{
			g.setColor(Color.BLUE);
	        g.fillRect(100, 100, 100, 100);
		}
		
	}