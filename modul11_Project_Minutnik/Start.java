package modul11_Project_Minutnik;

import java.awt.EventQueue;

public class Start {

	public static void main(String[] args)	{
		EventQueue.invokeLater(new Runnable()	{
			@Override
			public void run()	{
				new MainFrame();
			}
		});
	}
	
}
