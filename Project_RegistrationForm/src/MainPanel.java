import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener{

	private JButton register;
	private JTextField user;
	private JPasswordField password1, password2;
	private JLabel label, luser, lpass1, lpass2;
	private Auth auth;
	
	public MainPanel()	{
		setBackground(Color.yellow);
		
		register = new JButton("Register");
		register.setBounds(250, 120, 100, 30);
		register.addActionListener(this);
		
		user = new JTextField();
		user.setBounds(200, 0, 250, 30);
		
		luser = new JLabel("Login");
		luser.setBounds(75, 0, 120, 30);
		
		password1 = new JPasswordField();
		password1.setBounds(200, 40, 250, 30);
		
		lpass1 = new JLabel("Password");
		lpass1.setBounds(75, 40, 120, 30);
		
		password2 = new JPasswordField();
		password2.setBounds(200, 80, 250, 30);
		
		lpass2 = new JLabel("Confirm Password");
		lpass2.setBounds(75, 80, 120, 30);
		
		label = new JLabel();
		label.setBounds(100, 160, 400, 30);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		setLayout(null);
		add(register);
		add(user);
		add(luser);
		add(password1);
		add(lpass1);
		add(password2);
		add(lpass2);
		add(label);
		
		auth = new Auth();
	}
	
	public void clearField (JTextField user, JPasswordField password1, JPasswordField password2) {
		user.setText("");
		password1.setText("");
		password2.setText("");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source == register)	{
			String userFromField = user.getText();
			char[] pass1 = password1.getPassword();
			char[] pass2 = password2.getPassword();
			String passwordFromField1 = String.valueOf(pass1);
			String passwordFromField2 = String.valueOf(pass2);
			AuthStatus result = auth.verify (userFromField, passwordFromField1, passwordFromField2);
			label.setText(result.getMessage());
			if (result == AuthStatus.SUCCESS)
				clearField(user, password1, password2);
		}
		
	}
	
}
