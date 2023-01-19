package Models;

public class AllModel {
		  private int Booking_ID;
		  private int Customer_ID;
		  private int user_ID;
		  private String  Invoice_ID;
		  private String Company_Name;
		  private String Contact;
		  private String Email;
		  private String First_Name ;
	      private String Last_Name;
		  private String Address;
		  private String Credit_Card_No;
		  private String Password;
		  private String FullName;
		  private String Check_in_date;
		  private String Check_out_date;
		  private String Room_Type;
		  private String booking_status;
		  private String Room_No;
		  private String Room_Rate;
		  private String Room_Status;
		  private String Postal_code;
		  private int roomNo;
		  private String Total;
		  private String Discount_Provided;
		  
		  
		  
		  
		  public AllModel() {
				this.Booking_ID = 0;
				this.Customer_ID = 0;
				this.Invoice_ID = "";
				this.user_ID = 0;
				this.Company_Name = "";
				this.Contact = "";
				this.Email = "";
				this.First_Name = "";
				this.Last_Name = "";
				this.Address = "";
				this.Credit_Card_No = "";
				this.Password = "";
				this.FullName = "";
				this.Check_in_date = "";
				this.Check_out_date = "";
				this.Room_Type = "";
				this.Room_No = "";
				this.Room_Rate = "";
				this.Room_Status = "";
				this.booking_status= "";
				this.Postal_code = "";
				this.roomNo = 0;
				this.Total="";
				this.Discount_Provided="";
				
			}
		  public AllModel(int Booking_ID,int Customer_ID, int user_ID,String Total,String Discount_Provided,String Invoice_ID, String Company_Name, String Contact, String Email, String First_Name, String  booking_status,
					String Last_Name,	String Address , String Password, String FullName, String Check_in_date, String Check_out_date , String Room_Type, String Postal_code, String Room_No, String Room_Rate, String Room_Status) {
					super();
					this.Booking_ID=Booking_ID;
					this.Customer_ID = Customer_ID;
					this.user_ID = user_ID;
					this.Discount_Provided=Discount_Provided;
					this.Invoice_ID = Invoice_ID;
					this.Company_Name = Company_Name;
					this.Contact = Contact;
					this.Email = Email;
					this.First_Name= First_Name;
					this.Last_Name = Last_Name;
					this.Address= Address;
					this.Password= Password;
					this.FullName =FullName;
					this.Check_in_date= Check_in_date;
					this.Room_Type= Room_Type;
					this.Room_No= Room_No;
					this.Room_Rate= Room_Rate;
					this. booking_status = booking_status;
					this.Room_Status= Room_Status;
					this.Postal_code=Postal_code;
					
					
					
				}
		
		
		public String getInvoice_ID() {
			return Invoice_ID;
		}
		public void setInvoice_ID(String invoice_ID) {
			Invoice_ID = invoice_ID;
		}
		public int getBooking_ID() {
			return Booking_ID;
		}
		public void setBooking_ID(int booking_ID) {
			Booking_ID = booking_ID;
		}
		public int getCustomer_ID() {
			return Customer_ID;
		}
		public void setCustomer_ID(int customer_ID) {
			Customer_ID = customer_ID;
		}
		public int getUser_ID() {
			return user_ID;
		}
		public void setUser_ID(int user_ID) {
			this.user_ID = user_ID;
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
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getFullName() {
			return FullName;
		}
		public void setFullName(String fullName) {
			FullName = fullName;
		}
		public String getCheck_in_date() {
			return Check_in_date;
		}
		public void setCheck_in_date(String check_in_date) {
			Check_in_date = check_in_date;
		}
		public String getCheck_out_date() {
			return Check_out_date;
		}
		public void setCheck_out_date(String check_out_date) {
			Check_out_date = check_out_date;
		}
		public  String getRoom_Type() {
			return Room_Type;
		}
		
		public String getRoom_No() {
			return Room_No;
		}
		public void setRoom_No(String room_No) {
			Room_No = room_No;
		}
		public String getRoom_Rate() {
			return Room_Rate;
		}
		public void setRoom_Rate(String room_Rate) {
			Room_Rate = room_Rate;
		}
		public String getRoom_Status() {
			return Room_Status;
		}
		public void setRoom_Status(String room_Status) {
			Room_Status = room_Status;
		}
		public  void setRoom_Type(String room_Type) {
			Room_Type = room_Type;
		}
		public String getPostal_code() {
			return Postal_code;
		}
		public void setPostal_code(String postal_code) {
			Postal_code = postal_code;
		}
		public String getBooking_status() {
			return booking_status;
		}
		public void setBooking_status(String booking_status) {
			this.booking_status = booking_status;
		}
		public int getRoomNo() {
			return roomNo;
		}
		public void setRoomNo(int roomNo) {
			this.roomNo = roomNo;
		}
		public String getTotal() {
			return Total;
		}
		public void setTotalbill(String Total) {
			this.Total = Total;
		}
		public String getDiscount_Provided() {
			return Discount_Provided;
		}
		public void setDiscount_Provided(String discount_Provided) {
			Discount_Provided = discount_Provided;
		
		}
		public void setTotal(String total) {
			Total = total;
		}
		
		
		
		
}
		


