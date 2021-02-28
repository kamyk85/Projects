package modul11_Project_Minutnik;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.LabelView;

public class MainPanel extends JPanel implements ActionListener	{

	private JButton start, stop, clear;
	private JTextField label;
	private JLabel label2;
	private Info info;

	public MainPanel() {
		
		setBackground(Color.BLACK);
		
		start = new JButton("Start");
		start.setBounds(0,0,100,30);
		start.setBackground(Color.yellow);
		start.addActionListener(this);
		
		stop = new JButton("Stop");
		stop.setBounds(0,40,100,30);
		stop.setBackground(Color.yellow);
		stop.addActionListener(this);
		
		clear = new JButton("Clear");
		clear.setBounds(0,80,100,30);
		clear.setBackground(Color.yellow);
		clear.addActionListener(this);
		
		label = new JTextField("0");
		label.setBounds(0,120,100,30);
		label.setFont(new Font("Arial",Font.BOLD,16));
		//label.setForeground(Color.white);
		
		label2 = new JLabel("");
		label2.setBounds(140,60, 140, 40);
		label2.setFont(new Font("Arial",Font.BOLD,16));
		label2.setForeground(Color.white);
		
		info = new Info(Status.STOP);
		
		setLayout(null);
		
		add(start);
		add(stop);
		add(clear);
		add(label);
		add(label2);
		
		CountdownTimer ctm = new CountdownTimer(info, label, label2);
		Thread t = new Thread(ctm);
		t.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source == start)
			info.setStatus(Status.START);
		else if (source == stop)
			info.setStatus(Status.STOP);
		else if (source == clear)
			info.setStatus(Status.CLEAR);
		
	}

}
