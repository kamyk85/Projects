public enum AuthStatus {
	
	BAD_lOGIN("This login is already taken!"),
	BAD_PASSWORD("You have enteres the wrong password!"),
	EMPTY_FIELD("All fields must be completed!"),
	SUCCESS("Registration successfully!");
	
	private String message;
	
	AuthStatus(String message)	{
		this.message = message;
	}
	
	public String getMessage()	{
		return message;
	}
}
