package Frontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import BusinessLayer.BLCorporate;
import Helper.InputException;
import Models.Corporate;
import Models.Login;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class NewCorporate extends JFrame {
	private JTextField tfcname;
	private JTextField tfccontact;
	private JTextField tfcemail;
	private JTextField tfcpass;
	private JTextField tfcconfirmpass;

	


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCorporate frame = new NewCorporate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewCorporate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(279, 44, 849, 627);
	        desktopPane.setBackground(Color.GRAY);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        tfcname = new JTextField();
	        tfcname.setBackground(Color.WHITE);
	        tfcname.setBounds(310, 138, 410, 43);
	        desktopPane.add(tfcname);
	        tfcname.setColumns(10);
	        
	        JLabel lblLoginToLuton =new JLabel();
	        lblLoginToLuton.setBounds(193, 45, 656, 55);
	        lblLoginToLuton.setForeground(Color.GREEN);
	        lblLoginToLuton.setBackground(Color.BLACK);
	        lblLoginToLuton.setText("CORPORATE CUSTOMER REGISTRATION");
	        lblLoginToLuton.setFont(new Font("Times New Roman", Font.BOLD, 28));
	        desktopPane.add(lblLoginToLuton);
	        
	        tfcemail = new JTextField();
	        tfcemail.setBackground(Color.WHITE);
	        tfcemail.setBounds(310, 285, 410, 43);
	        tfcemail.setColumns(10);
	        desktopPane.add(tfcemail);
	        
	        JLabel lblcompanyname = new JLabel();
	        lblcompanyname.setText("Company Name");
	        lblcompanyname.setForeground(Color.BLUE);
	        lblcompanyname.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        lblcompanyname.setBackground(Color.BLACK);
	        lblcompanyname.setBounds(54, 141, 194, 40);
	        desktopPane.add(lblcompanyname);
	        
	        JLabel lblEmail = new JLabel();
	        lblEmail.setText("Email");
	        lblEmail.setForeground(Color.BLUE);
	        lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        lblEmail.setBackground(Color.BLACK);
	        lblEmail.setBounds(54, 288, 144, 40);
	        desktopPane.add(lblEmail);
	        
	        JButton btncompanysignup = new JButton("Sign Up");
	        btncompanysignup.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		userCorporate();
	        	}
	        });
	        btncompanysignup.setBounds(601, 539, 119, 43);
	        btncompanysignup.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        desktopPane.add(btncompanysignup);
	        
	        tfccontact = new JTextField();
	        tfccontact.setColumns(10);
	        tfccontact.setBackground(Color.WHITE);
	        tfccontact.setBounds(310, 212, 410, 43);
	        desktopPane.add(tfccontact);
	        
	        JLabel lblContactNo = new JLabel();
	        lblContactNo.setText("Contact ");
	        lblContactNo.setForeground(Color.BLUE);
	        lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        lblContactNo.setBackground(Color.BLACK);
	        lblContactNo.setBounds(54, 215, 144, 40);
	        desktopPane.add(lblContactNo);
	        
	        JLabel lblcomppass = new JLabel();
	        lblcomppass.setText("Password");
	        lblcomppass.setForeground(Color.BLUE);
	        lblcomppass.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        lblcomppass.setBackground(Color.BLACK);
	        lblcomppass.setBounds(52, 353, 146, 40);
	        desktopPane.add(lblcomppass);
	        
	        tfcpass = new JTextField();
	        tfcpass.setColumns(10);
	        tfcpass.setBackground(Color.WHITE);
	        tfcpass.setBounds(310, 350, 410, 43);
	        desktopPane.add(tfcpass);
	        
	        JLabel lblcompconpass = new JLabel();
	        lblcompconpass.setText("Confirm Password ");
	        lblcompconpass.setForeground(Color.BLUE);
	        lblcompconpass.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        lblcompconpass.setBackground(Color.BLACK);
	        lblcompconpass.setBounds(54, 426, 239, 40);
	        desktopPane.add(lblcompconpass);
	        
	        tfcconfirmpass = new JTextField();
	        tfcconfirmpass.setColumns(10);
	        tfcconfirmpass.setBackground(Color.WHITE);
	        tfcconfirmpass.setBounds(310, 423, 410, 43);
	        desktopPane.add(tfcconfirmpass);
	        
	        JButton btnbackc = new JButton("Back");
	        btnbackc.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Register signUp = new Register();
	                 signUp.setVisible(true);
	        	}
	        });
	        btnbackc.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        btnbackc.setBounds(54, 539, 119, 43);
	        desktopPane.add(btnbackc);
	        
	        
	}
	private void userCorporate() {
        // On click of the log In button
        // It fetch the data from the field
        // Create an object of Service Layer and pass the model to Service layer
        // Perform the required action from the Service layer.
        try {
        	Corporate corporate = new Corporate();
            corporate.setCompany_Name(tfcname.getText());
            corporate.setContact(tfccontact.getText());
            corporate.setEmail(tfcemail.getText());
            corporate.setPassword(tfcpass.getText());
            corporate.setConfirm_Password(tfcconfirmpass.getText());
           
            


            BLCorporate userSL = new BLCorporate();
            userSL.validateCorporate(corporate);
            userSL.corporateinf(corporate);


        }
        catch(InputException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
 }
}

