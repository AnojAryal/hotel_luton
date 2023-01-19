package Models;

public class Corporate  {
	private int Customer_id;
	private String Company_Name;
	private String Contact;
	private  String Email;
	private  String Password;
	private String Confirm_Password;
	


	public Corporate() {
		this.Customer_id = 0;
		this.Company_Name = "";
		this.Contact= "";
		this.Email= "";
		this.Password = "";
		this.Confirm_Password = "";
	}



	public Corporate(int Customer_id ,  String Company_Name , String Contact , String Email, String Password, String Confirm_Password) {
		this.Customer_id =Customer_id ;
		this.Company_Name = Company_Name;
		this.Contact= Contact;
		this.Email= Email;
		this.Password = Password;
		this.Confirm_Password = Confirm_Password;
		
		
	}



	public int getCustomer_id() {
		return Customer_id;
	}



	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}



	public String getCompany_Name() {
		return Company_Name;
	}



	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}



	public String getContact() {
		return Contact;
	}



	public void setContact(String contact) {
		Contact = contact;
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



	public String getConfirm_Password() {
		return Confirm_Password;
	}



	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}


}