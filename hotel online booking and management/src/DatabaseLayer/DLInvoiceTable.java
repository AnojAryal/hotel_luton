package DatabaseLayer;

import Helper.DatabaseConnector;
import Models.AllModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DLInvoiceTable {
	private AllModel model;
	private DatabaseConnector db;
	private Connection connection;
	
	
	public DLInvoiceTable() throws Exception {
		this.model = new AllModel();
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DLInvoiceTable(AllModel model) throws Exception {
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
	
	
	
	public ArrayList<AllModel> getInvoice() throws Exception {
		try {
			ArrayList<AllModel> model = new ArrayList<AllModel>();
			String query = "SELECT Invoice_ID ,FullName, Address, Contact,Check_in_date, Check_out_date, Total FROM Invoice";
			Statement statement = this.connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				AllModel allmodel = new AllModel();
				allmodel.setInvoice_ID(rs.getString("Invoice_ID"));
				allmodel.setFullName(rs.getString("FullName"));	
				allmodel.setAddress(rs.getString("Address"));
				allmodel.setContact(rs.getString("Contact"));
				allmodel.setCheck_in_date(rs.getString("Check_in_date"));
				allmodel.setCheck_out_date(rs.getString("Check_out_date"));;
				allmodel.setTotal(rs.getString("Total"));
				
				
				
			
				model.add(allmodel);
			}
			return model;
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	
}