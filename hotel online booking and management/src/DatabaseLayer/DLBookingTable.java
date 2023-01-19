package DatabaseLayer;

import Helper.DatabaseConnector;
import Models.AllModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DLBookingTable {
	private AllModel model;
	private DatabaseConnector db;
	private Connection connection;
	
	
	public DLBookingTable() throws Exception {
		this.model = new AllModel();
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DLBookingTable(AllModel model) throws Exception {
		this.model = model;
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public AllModel getModel() {
		return model;
	}

	public void setUser(AllModel model) {
		this.model = model;
	}
	
	
	
	public ArrayList<AllModel> getBooking() throws Exception {
		try {
			ArrayList<AllModel> model = new ArrayList<AllModel>();
			String query = "SELECT FullName, Address, Check_in_date, Check_out_date, Room_Type, Booking_status, Booking_ID FROM booking";
			Statement statement = this.connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				AllModel allmodel = new AllModel();
				allmodel.setFullName(rs.getString("FullName"));
				allmodel.setAddress(rs.getString("Address"));
				allmodel.setCheck_in_date(rs.getString("Check_in_date"));
				allmodel.setCheck_out_date(rs.getString("Check_out_date"));
				allmodel.setRoom_Type(rs.getString("Room_Type"));
				allmodel.setBooking_status(rs.getString("Booking_status"));
				allmodel.setBooking_ID(rs.getInt("Booking_ID"));

				
				
			
				model.add(allmodel);
			}
			return model;
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	
}