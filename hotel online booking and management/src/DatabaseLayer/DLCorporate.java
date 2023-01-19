package DatabaseLayer;

import Models.Corporate;
import Models.Login;
import Helper.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Frontend.NewCorporate;
import Frontend.Home;
import Frontend.NewLogin;

public class DLCorporate{
	private Corporate corporate;
	private DatabaseConnector db;
	private Connection connection;

	public DLCorporate() throws Exception {
		this.corporate = new Corporate();
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public DLCorporate(Corporate corporate) throws Exception {
		this.corporate = corporate;try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public Corporate getCorporateatt() {
		return corporate;
	}

	public void setCorporateatt(Corporate corporate) {
		this.corporate = corporate;
	}
	public Corporate save() throws Exception {
		try {
			String query = "INSERT INTO  Corporate (Company_Name, Contact, Email, Password, Confirm_Password) VALUES(?,?,?,?,?)";
			PreparedStatement statement = this.connection.prepareStatement(query);
			statement.setString(1, this.corporate.getCompany_Name());
			statement.setString(2, this.corporate.getContact());
			statement.setString(3, this.corporate.getEmail());
			statement.setString(4, this.corporate.getPassword());			
			statement.setString(5, this.corporate.getConfirm_Password());
			
			// execute the query
			try {
                if(statement.executeUpdate() !=0) {
                    JOptionPane.showMessageDialog(null,"Your account has been successfully created");
                    NewLogin log = new NewLogin();
                    log.setVisible(true);
                    log.setLocationRelativeTo(null);
                    NewCorporate reg = new NewCorporate();
                    reg.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please check your details");
                }

                }
                 catch (Exception ex) {
                        throw ex;
			}
			return this.corporate;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public Corporate corporate() throws Exception {

        PreparedStatement customers;
        ResultSet cust;
        String query = "SELECT * FROM Corporate WHERE Email = ? AND Password = ? ";
        try {

            customers = this.connection.prepareStatement(query);
            customers.setString(1, this.corporate.getEmail());
            customers.setString(2, this.corporate.getPassword());
            cust = customers.executeQuery();

            //condition if the username and password match
            if (cust.next())
            {
                //take user to user Login page
                Home log = new Home();
                log.setVisible(true);
                log.setLocationRelativeTo(null);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username Password", "Error", 2);
            }

        }catch(Exception ex) {
            throw ex;
        }


        return corporate;
    }
}
