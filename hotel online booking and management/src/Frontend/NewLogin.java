package Frontend;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BusinessLayer.BLCorporate;
import BusinessLayer.BLNonCorporate;
import Helper.InputException;
import Models.AllModel;
import Models.Corporate;
import Models.NonCorporate;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class NewLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tfemail;
	private JTextField tfpassword;
	private  JCheckBox userChoiseBox;

	/**
	 * Launch the application.
	 */
	

	

	public static void main  (String[] args) {
		try {
			NewLogin window =new NewLogin();
			window.setVisible(true);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the frame.
	 */
	public NewLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(265, 72, 800, 546);
	        desktopPane.setBackground(Color.GRAY);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        tfemail = new JTextField();
	        tfemail.setBackground(Color.WHITE);
	        tfemail.setBounds(377, 208, 322, 43);
	        desktopPane.add(tfemail);
	        tfemail.setColumns(10);
	        
	        JLabel lblLoginToLuton =new JLabel();
	        lblLoginToLuton.setBounds(99, 21, 599, 55);
	        lblLoginToLuton.setForeground(Color.YELLOW);
	        lblLoginToLuton.setBackground(Color.BLACK);
	        lblLoginToLuton.setText("WELCOME TO LUTON HOTEL");
	        lblLoginToLuton.setFont(new Font ("Times New Roman", Font.BOLD, 40));
	        desktopPane.add(lblLoginToLuton);
	        
	        tfpassword = new JTextField();
	        tfpassword.setBackground(Color.WHITE);
	        tfpassword.setBounds(377, 281, 322, 43);
	        tfpassword.setColumns(10);
	        desktopPane.add(tfpassword);
	        
	        JButton clickheretosignupbtn = new JButton("Don't have an account? Sign Up!");
	        clickheretosignupbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        clickheretosignupbtn.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 Register signUp = new Register();
	                 signUp.setVisible(true);
	        	}
	        });
	        clickheretosignupbtn.setBackground(Color.GRAY);
	        clickheretosignupbtn.setForeground(Color.BLUE);
	        clickheretosignupbtn.setBounds(247, 457, 264, 43);
	        desktopPane.add(clickheretosignupbtn);
	        
	        JLabel labelemail = new JLabel();
	        labelemail.setText("Email");
	        labelemail.setForeground(Color.BLUE);
	        labelemail.setFont(new Font("Times New Roman", Font.BOLD, 40));
	        labelemail.setBackground(Color.BLACK);
	        labelemail.setBounds(141, 208, 194, 40);
	        desktopPane.add(labelemail);
	        
	        JLabel labelpassword = new JLabel();
	        labelpassword.setText("Password");
	        labelpassword.setForeground(Color.BLUE);
	        labelpassword.setFont(new Font("Times New Roman", Font.BOLD, 40));
	        labelpassword.setBackground(Color.BLACK);
	        labelpassword.setBounds(141, 281, 194, 40);
	        desktopPane.add(labelpassword);
	        
	        userChoiseBox = new JCheckBox("Corporate User");
	        userChoiseBox.setBounds(377, 346, 119, 23);
	        desktopPane.add(userChoiseBox);
	        
	        
	        JButton loginbutton = new JButton("Login");
	        loginbutton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        		if(userChoiseBox.isSelected()) {
	        			corporateinf();
	        		}
	        		else {
	        			nonCorporateinf();
	        		}
	        	
	        		
	        	}
	        });
	        loginbutton.setBounds(309, 388, 119, 43);
	        loginbutton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        desktopPane.add(loginbutton);
	        
	        JLabel lblfeelLikeHome = new JLabel();
	        lblfeelLikeHome.setText("\"FEEL LIKE HOME\"");
	        lblfeelLikeHome.setForeground(Color.ORANGE);
	        lblfeelLikeHome.setFont(new Font("Times New Roman", Font.BOLD, 36));
	        lblfeelLikeHome.setBackground(Color.BLACK);
	        lblfeelLikeHome.setBounds(231, 87, 407, 55);
	        desktopPane.add(lblfeelLikeHome);
	        
	        
	        
	        
	        
	}
	private void corporateinf() {
        // On click of the log In buttond
        // It fetch the data from the field
        // Create an object of Service Layer and pass the model to Service layer
        // Perform the required action from the Service layer.
        try {
            Corporate corporateLogin = new Corporate();
            corporateLogin.setEmail(tfemail.getText());
            corporateLogin.setPassword(String.valueOf(tfpassword.getText()));


            BLCorporate corporateLoginBL = new BLCorporate();
            corporateLoginBL.validateLogin(corporateLogin);
            corporateLoginBL.logininf(corporateLogin);


        }
        catch(InputException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

	}
	private void nonCorporateinf() {
		// On click of the log In button
		// It fetch the data from the field
		// Create an object of Service Layer and pass the model to Service layer
		// Perform the required action from the Service layer.
		try {
			AllModel model = new AllModel();
			model.setEmail(tfemail.getText());
			model.setPassword(String.valueOf(tfpassword.getText()));

    


			BLNonCorporate noncorporateLoginBL = new BLNonCorporate();
			noncorporateLoginBL.validateLogin(model);
			noncorporateLoginBL.logininf(model);


		}
		catch(InputException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

   }
}