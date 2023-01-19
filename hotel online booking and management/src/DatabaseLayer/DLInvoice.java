package DatabaseLayer;

import Models.AllModel;
import Helper.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Frontend.Admin;

public class DLInvoice {
	private AllModel invoice;
	private DatabaseConnector db;
	private Connection connection;
	
	
	public DLInvoice() throws Exception {
		this.invoice = new AllModel();
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DLInvoice(AllModel invoice) throws Exception {
		this.invoice = invoice;
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}

	

	public AllModel getInvoice() {
		return invoice;
	}

	public void setInvoice(AllModel invoice) {
		this.invoice = invoice;
	}

	
	
	public AllModel save() throws Exception {
		try {
			// prepare for the data to be returned in case of insert
			
			// create the statement
			String query = "SELECT  Invoice_ID,FullName, Address,Contact, Check_in_date, Check_out_date,Total  FROM Invoice";
			PreparedStatement statement = this.connection.prepareStatement(query);
			statement.setString(1, this.invoice.getInvoice_ID());
			statement.setString(2, this.invoice.getFullName());
			statement.setString(3, this.invoice.getAddress());
			statement.setString(4, this.invoice.getCheck_in_date());
			statement.setString(5, this.invoice.getCheck_out_date());
			statement.setString(6, this.invoice.getContact());
			
			statement.setString(7, this.invoice.getTotal());
			// execute the query
			int noOfUpdate = statement.executeUpdate();
			if(noOfUpdate>0) {
				ResultSet rs = statement.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					this.invoice.setBooking_ID(id);
				}	
			}
			return this.invoice;
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	
	
	}
	
	

