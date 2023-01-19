package Models;

public class BookingDetails {
	  private int Booking_ID;
	  private String Address;
	  private String FullName;
	  private String Check_in_date;
	  private String Check_out_date;
	  private String booking_status;
	  
	  private String Room_Rate;
	  private String Room_Type;
	
	 /** for(int i=0; i<models.size(); i++) {
			rowData[0] = models.get(i).getFullName();
			rowData[1] = models.get(i).getAddress();
			rowData[2] = models.get(i).getCheck_in_date();
			rowData[3] = models.get(i).getCheck_out_date();
			rowData[4] = models.get(i).getRoom_Type();
			rowData[5] = models.get(i).getBooking_status();
			rowData[6] = models.get(i).getBooking_ID();

	  **/
	  public BookingDetails() {
			this.Booking_ID = 0;
			
			this.Address = "";
			this.FullName = "";
			this.Check_in_date = "";
			this.Check_out_date = "";
			
			this.Room_Rate = "";
			this.Room_Type = "";
			this.booking_status= "";
	  }
	  
	  
	  public BookingDetails(int Booking_ID, String  booking_status,
					String Address , String FullName, String Check_in_date, String Check_out_date ,  String Room_No, String Room_Rate) {
				super();
				this.Booking_ID=Booking_ID;
				this.FullName =FullName;
				this.Address =Address;
				this.Check_in_date= Check_in_date;
			
				this.Room_Rate= Room_Rate;
				this.Room_Type= Room_Type;
				this.booking_status = booking_status;
				
}


	public int getBooking_ID() {
		return Booking_ID;
	}


	public void setBooking_ID(int booking_ID) {
		Booking_ID = booking_ID;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
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


	public String getBooking_status() {
		return booking_status;
	}


	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}


	
	public String getRoom_Rate() {
		return Room_Rate;
	}


	public void setRoom_Rate(String room_Rate) {
		Room_Rate = room_Rate;
	}


	public String getRoom_Type() {
		return Room_Type;
	}


	public void setRoom_Type(String room_Type) {
		Room_Type = room_Type;
	}


}