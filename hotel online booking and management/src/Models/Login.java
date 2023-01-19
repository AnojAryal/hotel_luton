package Models;

  public class Login {
	private int user_ID;
	private String Email;
	private String Password;
	
	public Login() {
		this.user_ID = 0;
		this.Email = "";
		this.Password = "";
	}
	
	public Login(int id, String name, String address) {
		this.user_ID = id;
		this.Email = name;
		this.Password = address;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
		
	}

	

	
	


