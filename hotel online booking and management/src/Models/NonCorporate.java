package Models;

public class NonCorporate {
	private int Customer_ID ;
	private String First_Name ;
	private String Last_Name;
	private String Address;
	private String Credit_Card_No;
	private String Email;
	private String Password;
	private String Confirm_Password;
	private String Contact;


	
	
public NonCorporate() {
	this.Customer_ID = 0;
	this.First_Name = "";
	this.Last_Name = "";
	this.Credit_Card_No = "";
	this.Address = "";
	this.Email = "";
	this.Password = "";
	this.Confirm_Password = "";
	this.Contact = "";
}




public NonCorporate(int customer_ID, String first_Name, String last_Name, String CreditCardNo, String address, String email,
	String password,	String contact) {
	super();
	Customer_ID = customer_ID;
	First_Name = first_Name;
	Last_Name = last_Name;
	Credit_Card_No = CreditCardNo;
	Address = address;
	Email = email;
	Password= password;
	Contact = contact;
}




public int getCustomer_ID() {
	return Customer_ID;
}




public void setCustomer_ID(int customer_ID) {
	Customer_ID = customer_ID;
}




public String getFirst_Name() {
	return First_Name;
}




public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}




public String getLast_Name() {
	return Last_Name;
}




public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}




public String getAddress() {
	return Address;
}




public void setAddress(String address) {
	Address = address;
}




public String getCredit_Card_No() {
	return Credit_Card_No;
}




public void setCredit_Card_No(String credit_Card_No) {
	Credit_Card_No = credit_Card_No;
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




public String getContact() {
	return Contact;
}




public void setContact(String contact) {
	Contact = contact;
}


}

