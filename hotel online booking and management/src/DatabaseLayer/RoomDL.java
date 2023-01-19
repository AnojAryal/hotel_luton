package DatabaseLayer;

import Helper.DatabaseConnector;
import Models.AllModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RoomDL {
	private AllModel model;
	private DatabaseConnector db;
	private Connection connection;
	
	
	public RoomDL() throws Exception {
		this.model = new AllModel();
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public RoomDL(AllModel model) throws Exception {
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
	
	
	
	public ArrayList<AllModel> getRoom() throws Exception {
		try {
			ArrayList<AllModel> model = new ArrayList<AllModel>();
			String query = "SELECT * FROM room";
			Statement statement = this.connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				AllModel allmodel = new AllModel();
				allmodel.setRoom_No(rs.getString("room_number"));
				allmodel.setRoom_Type(rs.getString("room_type"));
				allmodel.setRoom_Rate(rs.getString("room_rate"));
				allmodel.setRoom_Status(rs.getString("room_Status"));
				model.add(allmodel);
			}
			return model;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
}