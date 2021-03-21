import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.bind.DatatypeConverter;

public class Auth {

	private final String PATH = "D:\\aaakademia javy\\database.txt";
	private BufferedReader br = null;
	
	public Auth() {}
	
	public AuthStatus verify (String user, String password1, String password2)	{
		boolean isUserExistInDataBase = false;
		
		if (user == null || user.trim().isEmpty() 
				|| password1 == null || password1.trim().isEmpty()
				|| password2 == null || password2.trim().isEmpty())
			return AuthStatus.EMPTY_FIELD;
		
		// check if passwords are same
		if (password1.equals(password2)) {
			try {
				br = new BufferedReader(new FileReader(PATH));
				String line = br.readLine();
				
				// If datebase file is empty:
				if (line == null || line.equals("")) {
					saveNewUser(user, password1, true);
					return AuthStatus.SUCCESS;
				} 
				//if database file isn't empty
				else {
					isUserExistInDataBase = findUserInDataBase(user);
					
					if (isUserExistInDataBase == false) {
						saveNewUser (user, password1, false);
						return AuthStatus.SUCCESS;
					} else
						return AuthStatus.BAD_lOGIN;
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
		} else 
			return AuthStatus.BAD_PASSWORD;
	return AuthStatus.BAD_lOGIN;
	}
	
	private void saveNewUser (String user, String password, boolean isFirstUser) {
		FileWriter fw = null;
		try {
			if (isFirstUser)
				fw = new FileWriter(PATH, false);
			else
				fw = new FileWriter(PATH, true);
			
			String hash = createHash(password);
			String saveLine = user.toString() + ";" + hash + System.lineSeparator();
			fw.write(saveLine);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private boolean findUserInDataBase (String user) {
		String line = null;
		String [] splitData = null;
		String userFromField = null;
		try {
			br = new BufferedReader(new FileReader(PATH));
			while ((line = br.readLine()) != null) {
				splitData = line.split(";");
				userFromField = splitData[0];
				if (userFromField.equalsIgnoreCase(user))
					return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	private String createHash (String Password1) {
		MessageDigest md = null;
		
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			return "0";
		}
		
		md.update(Password1.getBytes());
		byte[] digest = md.digest();
		String hash = DatatypeConverter.printHexBinary(digest).toLowerCase();
		
		return hash;
	}
}
