package project;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class CountdownTimer implements Runnable {
	
	private int value;
	private Info info;
	private JTextField label;
	private JLabel label2;
	

	public CountdownTimer()	{}
	
	public CountdownTimer(Info info, JTextField label, JLabel label2)	{
		value = 0;
		this.info = info;
		this.label = label;
		this.label2 = label2;
	}
	
	private void changeLabel()	{
		String text = String.valueOf(value);
		label.setText(text);
	}
	

	@Override
	public void run() {
		while (true)	{
			if (info.getStatus() == Status.START)	{
				value = Integer.parseInt(label.getText());	
				
				if (value == 0)	{
					changeLabel();	
					label2.setText("END OF TIME!!!");
					}
					
					else if (!(value == 0))	{
						value--;
						changeLabel();
						label2.setText("");
					}
			}	else if (info.getStatus() == Status.CLEAR)	{
				value = 0;
				changeLabel();
				label2.setText("");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e)	{
				e.printStackTrace();
			}
		}
		
	}

}
