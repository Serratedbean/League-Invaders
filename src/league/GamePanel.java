package league;

import java.awt.*;

import java.awt.Graphics;

import javax.swing.*;

public class GamePanel extends JPanel 
{

	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
	
    int currentState = MENU;
	
    public void updateMenuState() 
    {  
    	
    }
    public void updateGameState() 
    {  
    	
    }
    public void updateEndState()  
    {  
    	
    }
	
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(100, 100, 100, 100);
		
		if(currentState == MENU){
		    drawMenuState(g);
		}
		else if(currentState == GAME){
		    drawGameState(g);
		}
		else if(currentState == END){
		    drawEndState(g);
		}
		

	}
	
	public void drawMenuState(Graphics g) 
	{  
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
	public void  drawGameState(Graphics g) 
	{  
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
	}
	public void  drawEndState(Graphics g)  
	{  
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
	

	
}
