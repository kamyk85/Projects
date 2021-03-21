import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	public MainFrame()	{
		super ("Registration Form");
		JPanel panel = new MainPanel();
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(true);
		setSize(new Dimension(600, 400));
		setLocation(new Point(300, 300));
	}
}
