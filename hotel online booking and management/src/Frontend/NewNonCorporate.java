package Frontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import BusinessLayer.BLCorporate;
import BusinessLayer.BLNonCorporate;
import Helper.InputException;
import Models.Corporate;
import Models.Login;
import Models.NonCorporate;

import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class NewNonCorporate extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldconfirmpass2;
	private JTextField tffname1;
	private JTextField tflname1;
	private JTextField tfadd2;
	private JTextField tfccno;
	private JTextField tfemail2;
	private JTextField tfcpass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewNonCorporate frame = new NewNonCorporate();
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
	public NewNonCorporate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(263, 33, 849, 627);
	        desktopPane.setBackground(Color.GRAY);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        JLabel lblLoginToLuton =new JLabel();
	        lblLoginToLuton.setBounds(71, 46, 656, 55);
	        lblLoginToLuton.setForeground(Color.GREEN);
	        lblLoginToLuton.setBackground(Color.BLACK);
	        lblLoginToLuton.setText("NON-CORPORATE CUSTOMER REGISTRATION");
	        lblLoginToLuton.setFont(new Font("Times New Roman", Font.BOLD, 28));
	        desktopPane.add(lblLoginToLuton);
	        
	        JLabel lblFirstName = new JLabel();
	        lblFirstName.setText("First Name");
	        lblFirstName.setForeground(Color.BLUE);
	        lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblFirstName.setBackground(Color.BLACK);
	        lblFirstName.setBounds(54, 141, 144, 40);
	        desktopPane.add(lblFirstName);
	        
	        JLabel lblEmail = new JLabel();
	        lblEmail.setText("Email");
	        lblEmail.setForeground(Color.BLUE);
	        lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblEmail.setBackground(Color.BLACK);
	        lblEmail.setBounds(54, 331, 144, 40);
	        desktopPane.add(lblEmail);
	        
	        JButton btnsignup = new JButton("Sign Up");
	        btnsignup.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		nonCorporate();
	        	}
	        });
	        btnsignup.setBounds(644, 539, 119, 43);
	        btnsignup.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        desktopPane.add(btnsignup);
	        
	        JLabel lbllastname = new JLabel();
	        lbllastname.setText("Last Name ");
	        lbllastname.setForeground(Color.BLUE);
	        lbllastname.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lbllastname.setBackground(Color.BLACK);
	        lbllastname.setBounds(54, 192, 144, 40);
	        desktopPane.add(lbllastname);
	        
	        JLabel lblpassword = new JLabel();
	        lblpassword.setText("Password");
	        lblpassword.setForeground(Color.BLUE);
	        lblpassword.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblpassword.setBackground(Color.BLACK);
	        lblpassword.setBounds(52, 382, 146, 40);
	        desktopPane.add(lblpassword);
	        
	        JLabel lblverifypass = new JLabel();
	        lblverifypass.setText("Confirm Password ");
	        lblverifypass.setForeground(Color.BLUE);
	        lblverifypass.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblverifypass.setBackground(Color.BLACK);
	        lblverifypass.setBounds(54, 433, 239, 40);
	        desktopPane.add(lblverifypass);
	        
	        textFieldconfirmpass2 = new JTextField();
	        textFieldconfirmpass2.setColumns(10);
	        textFieldconfirmpass2.setBackground(Color.WHITE);
	        textFieldconfirmpass2.setBounds(287, 433, 292, 34);
	        desktopPane.add(textFieldconfirmpass2);
	        
	        JButton btnback = new JButton("Back");
	        btnback.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 Register signUp = new Register();
	                 signUp.setVisible(true);
	        	}
	        });
	        btnback.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        btnback.setBounds(54, 539, 119, 43);
	        desktopPane.add(btnback);
	        
	        JLabel lblAddress = new JLabel();
	        lblAddress.setText("Address");
	        lblAddress.setForeground(Color.BLUE);
	        lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblAddress.setBackground(Color.BLACK);
	        lblAddress.setBounds(54, 237, 144, 40);
	        desktopPane.add(lblAddress);
	        
	        tffname1 = new JTextField();
	        tffname1.setColumns(10);
	        tffname1.setBackground(Color.WHITE);
	        tffname1.setBounds(287, 147, 292, 34);
	        desktopPane.add(tffname1);
	        
	        tflname1 = new JTextField();
	        tflname1.setColumns(10);
	        tflname1.setBackground(Color.WHITE);
	        tflname1.setBounds(287, 192, 292, 34);
	        desktopPane.add(tflname1);
	        
	        tfadd2 = new JTextField();
	        tfadd2.setColumns(10);
	        tfadd2.setBackground(Color.WHITE);
	        tfadd2.setBounds(287, 237, 292, 34);
	        desktopPane.add(tfadd2);
	        
	        tfccno = new JTextField();
	        tfccno.setColumns(10);
	        tfccno.setBackground(Color.WHITE);
	        tfccno.setBounds(287, 285, 292, 34);
	        desktopPane.add(tfccno);
	        
	        tfemail2 = new JTextField();
	        tfemail2.setColumns(10);
	        tfemail2.setBackground(Color.WHITE);
	        tfemail2.setBounds(287, 330, 292, 34);
	        desktopPane.add(tfemail2);
	        
	        tfcpass2 = new JTextField();
	        tfcpass2.setColumns(10);
	        tfcpass2.setBackground(Color.WHITE);
	        tfcpass2.setBounds(287, 382, 292, 34);
	        desktopPane.add(tfcpass2);
	        
	        JLabel lblCreditcardno = new JLabel();
	        lblCreditcardno.setText("Credit-Card-No");
	        lblCreditcardno.setForeground(Color.BLUE);
	        lblCreditcardno.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblCreditcardno.setBackground(Color.BLACK);
	        lblCreditcardno.setBounds(54, 280, 171, 40);
	        desktopPane.add(lblCreditcardno);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\rn.png"));
	        lblNewLabel.setBackground(Color.ORANGE);
	        lblNewLabel.setBounds(623, 165, 179, 282);
	        desktopPane.add(lblNewLabel);
	        
	        
	}
	private void nonCorporate() {
        // On click of the log In button
        // It fetch the data from the field
        // Create an object of Service Layer and pass the model to Service layer
        // Perform the required action from the Service layer.
        try {
        	NonCorporate noncorporate = new NonCorporate();
        	noncorporate.setFirst_Name(tffname1.getText());
        	noncorporate.setLast_Name(tflname1.getText());
        	noncorporate.setAddress(tfadd2.getText());
        	noncorporate.setCredit_Card_No(tfccno.getText());
        	noncorporate.setEmail(tfemail2.getText());
        	noncorporate.setPassword(tfcpass2.getText());
        	noncorporate.setConfirm_Password(textFieldconfirmpass2.getText());
           
            
            


            BLNonCorporate userSL = new BLNonCorporate();
            userSL.validateNonCorporate(noncorporate);
            userSL.noncorporateinf(noncorporate);


        }
        catch(InputException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
 }
}
