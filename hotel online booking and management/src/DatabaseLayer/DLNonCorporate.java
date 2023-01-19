package DatabaseLayer;

import Models.AllModel;
import Models.Corporate;
import Models.Login;
import Models.NonCorporate;
import Helper.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Frontend.NewNonCorporate;
import Frontend.Admin;
import Frontend.Home;
import Frontend.NewLogin;

public class DLNonCorporate {
	private NonCorporate noncorporate;
	private AllModel model;
	private DatabaseConnector db;
	private Connection connection;

	public DLNonCorporate() throws Exception {
		this.noncorporate = new NonCorporate();
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public DLNonCorporate(NonCorporate noncorporate) throws Exception {
		this.noncorporate = noncorporate;try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}
	public DLNonCorporate(AllModel model) throws Exception {
			this.model = model;try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public NonCorporate getNonCorporate() {
		return noncorporate;
	}

	public void setNonCorporate( NonCorporate noncorporate) {
		this.noncorporate = noncorporate;
	}
	public NonCorporate save() throws Exception {
		try {
			String query = "INSERT INTO  non_Corporate (First_Name, Last_Name, Address,Credit_Card_No, Email, Password,  Confirm_Password) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement statement = this.connection.prepareStatement(query);
			statement.setString(1, this.noncorporate.getFirst_Name());
			statement.setString(2, this.noncorporate.getLast_Name());
			statement.setString(3, this.noncorporate.getAddress());
			statement.setString(4, this.noncorporate.getCredit_Card_No());
			statement.setString(5, this.noncorporate.getEmail());
			statement.setString(6, this.noncorporate.getPassword());			
			statement.setString(7, this.noncorporate.getConfirm_Password());
			
			
			// execute the query
			try {
                if(statement.executeUpdate() !=0) {
                    JOptionPane.showMessageDialog(null,"Your account has been successfully created");
                    NewLogin log = new NewLogin();
                    log.setVisible(true);
                    log.setLocationRelativeTo(null);
                    NewNonCorporate reg = new NewNonCorporate();
                    reg.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please check your details");
                }

                }
                 catch (Exception ex) {
                        throw ex;
			}
			return this.noncorporate;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public AllModel model() throws Exception {

        PreparedStatement customers;
        PreparedStatement reception;
        ResultSet cust;
        ResultSet recep;
        String query = "SELECT * FROM non_Corporate WHERE Email = ? AND Password = ? ";
        String adminQuery = "SELECT * FROM ADMIN WHERE Email = ? AND Password = ? AND UserType = 'admin'";
        try {

            customers = this.connection.prepareStatement(query);
            customers.setString(1, this.model.getEmail());
            customers.setString(2, this.model.getPassword());
            cust = customers.executeQuery();
            
            reception = this.connection.prepareStatement(adminQuery);
            reception.setString(1, this.model.getEmail());
            reception.setString(2, this.model.getPassword());
            cust = customers.executeQuery();
            recep = reception.executeQuery();

            //condition if the username and password match
            if (cust.next())
            {
                //take user to user Login page
                Home log = new Home();
                log.setVisible(true);
                log.setLocationRelativeTo(null);
                
            }
            else if (recep.next())
            {
                //take user to user Login page
                Admin admin = new Admin();
                admin.setVisible(true);
                admin.setLocationRelativeTo(null);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid email Password", "Error", 2);
            }

        }catch(Exception ex) {
            throw ex;
        }


        return model;
    }
}

