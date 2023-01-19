package DatabaseLayer;

import Models.AllModel;
import Models.Booking;
import Models.Corporate;
import Helper.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Frontend.BookingDetails;
import Frontend.Home;

public class DLBooking {
	private Booking booking;
	private DatabaseConnector db;
	private Connection connection;
	private AllModel allmodel;
	public String status = "pending";
	
	
	public DLBooking() throws Exception {
		this.booking = new Booking();
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DLBooking(Booking booking) throws Exception {
		this.booking = booking;
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}
	public DLBooking(AllModel allmodel) throws Exception {
		this.allmodel = allmodel;
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public Booking getUser() {
		return booking;
	}

	public void setUser(Booking booking) {
		this.booking = booking;
	}
	
	
	public AllModel getAllmodel() {
		return allmodel;
	}

	public void setAllmodel(AllModel allmodel) {
		this.allmodel = allmodel;
	}

	public Booking save() throws Exception {
		try {
			// create the statement
			String query = "INSERT INTO booking(FullName, Address, Check_in_date ,Check_out_date,Room_Type,postal_Code,booking_status) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement statement = this.connection.prepareStatement(query);
			statement.setString(1, this.booking.getFullName());
			statement.setString(2, this.booking.getAddress());
			statement.setString(3, this.booking.getCheck_in_date());
			statement.setString(4, this.booking.getCheck_out_date());
			statement.setObject(5, this.booking.getRoom_Type());
			statement.setString(6, this.booking.getPostal_code());
			statement.setString(7, status);
			// execute the query
			if (statement.executeUpdate()>0) {
	            JOptionPane.showMessageDialog(null,"Booking request sent");
	            BookingDetails bd =new BookingDetails();
	            bd.setVisible(true);
	            

			}
			
			else {
	            JOptionPane.showMessageDialog(null,"Invalid information");

			}
			return this.booking;
		}catch(Exception ex) {
			throw ex;
		}		
	}
	
	public AllModel updateRoom() throws Exception {
		PreparedStatement updateRoom;
		PreparedStatement updateStatus;
		ResultSet urs;
		
		try {
			String inserRoomNoQuery = "update booking b set b.RoomNo = ? where b.Booking_ID = ?";
			String inserupdateQuery = "update booking b set b.Booking_status = 'Booked' where b.Booking_ID = ?";
			updateRoom = this.connection.prepareStatement(inserRoomNoQuery);
			updateRoom.setInt(1, this.allmodel.getRoomNo());
			updateRoom.setInt(2, this.allmodel.getBooking_ID());
			
			updateStatus = this.connection.prepareStatement(inserupdateQuery);
			updateStatus.setInt(1, this.allmodel.getBooking_ID());
			
				try {
					
					if(updateRoom.executeUpdate() != 0) {
						if(updateStatus.executeUpdate() != 0) {
							JOptionPane.showMessageDialog(null, "Booking Accepted", "Complete", 2);
						}
					}
					
					
					
				} catch (Exception ex) {
					throw ex;
				}
		
		
		} catch (Exception ex) {
			throw ex;
		}
	
			return allmodel;
	}
		
		
}
	



