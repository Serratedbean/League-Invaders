package league;

import javax.swing.JFrame;


public class LeagueInvaders {
	
	JFrame frame = new JFrame();
	GamePanel gamePanel = new GamePanel();

	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	
	
	public LeagueInvaders()
	{

		
		
		
		
	}
	
	public void setup()
	{
		
		
		frame.add(gamePanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.addKeyListener(gamePanel);
		

	}
	
	
}
