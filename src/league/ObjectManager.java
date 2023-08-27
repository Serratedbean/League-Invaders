package league;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship rocket;
	
	Alien aliens;
	
	Random random = new Random();
	
	ObjectManager() {
		
		
	}
	
	
	ArrayList<Projectile> listP = new ArrayList<Projectile>();
	
	ArrayList<Alien> listA = new ArrayList<Alien>();
	
	void addProjectile(Projectile projectiles) 
	{
		listP.add(projectiles);
	}
	
	void addAliens(Alien aliens) 
	{
		listA.add(aliens);
		listA.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
	}
	
	void update()
	{
		for(int i = 0; i< listA.size(); i++) {
			Alien A = listA.get(i);
			A.update();
			
			
		}
	}
	
	void draw(Graphics g)
	{
		 
	}
	

}
