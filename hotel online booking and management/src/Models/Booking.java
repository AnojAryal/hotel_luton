package Models;

public class Booking {
  private int Booking_ID;
  private String FullName;
  private String Address;
  private String Check_in_date;
  private String Check_out_date;
  private String Room_Type;
  private String Postal_code;
  private int roomNo;
  
  
  public Booking() {
		this.Booking_ID = 0;
		this.FullName ="";
		this.Address ="";
		this.Check_in_date = "";
		this.Check_out_date= "";
		this.Room_Type= "";
		this.Postal_code = "";
		this.roomNo = 0;
	}



public Booking(int booking_ID,String fullname,String address, String check_in_date, String check_out_date,String Room_Type, String postal_code, int roomNo) {
	
	this.Booking_ID = booking_ID;
	this.FullName = fullname;
	this.Address = address;
	this.Check_in_date = check_in_date;
	this.Check_out_date = check_out_date;
	this.Room_Type  = Room_Type;
	this.Postal_code = postal_code;
	this.roomNo = roomNo;
}



public int getBooking_ID() {
	return Booking_ID;
}



public void setBooking_ID(int booking_ID) {
	Booking_ID = booking_ID;
}



public String getFullName() {
	return FullName;
}



public void setFullName(String fullName) {
	FullName = fullName;
}



public String getAddress() {
	return Address;
}



public void setAddress(String address) {
	Address = address;
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



public void setRoom_Type(String room_Type) {
	Room_Type = room_Type;
}



public String getPostal_code() {
	return Postal_code;
}



public void setPostal_code(String postal_code) {
	Postal_code = postal_code;
}



public int getRoomNo() {
	return roomNo;
}



public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}



}