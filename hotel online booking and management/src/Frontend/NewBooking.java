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

import BusinessLayer.BLBooking;
import BusinessLayer.BLCorporate;
import Helper.InputException;
import Models.Booking;
import Models.Corporate;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class NewBooking extends JFrame {

	private JPanel contentPane;
	private JTextField tfpcode;
	private JTextField tfcodate;
	private JTextField tffname;
	private JTextField tfadd;
	private JTextField tfciddate;	
	private JComboBox combobox12;/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBooking frame = new NewBooking();
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
	public NewBooking() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\booook.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(269, 33, 839, 594);
	        desktopPane.setBackground(Color.ORANGE);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        JLabel lblLoginToLuton =new JLabel();
	        lblLoginToLuton.setBounds(296, 49, 283, 55);
	        lblLoginToLuton.setForeground(Color.BLACK);
	        lblLoginToLuton.setBackground(Color.BLACK);
	        lblLoginToLuton.setText("MAKE A BOOKING");
	        lblLoginToLuton.setFont(new Font("Times New Roman", Font.BOLD, 30));
	        desktopPane.add(lblLoginToLuton);
	        
	        JButton btnNewButton_1 = new JButton("Request Booking");
	        btnNewButton_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		saveBookinginf();
	        		dispose();
	
	        	}
	        });
	        btnNewButton_1.setBounds(588, 514, 186, 43);
	        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        desktopPane.add(btnNewButton_1);
	        
	        JLabel lblCheckindate = new JLabel();
	        lblCheckindate.setText("Check-In-Date");
	        lblCheckindate.setForeground(Color.BLUE);
	        lblCheckindate.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblCheckindate.setBackground(Color.BLACK);
	        lblCheckindate.setBounds(45, 243, 141, 40);
	        desktopPane.add(lblCheckindate);
	        
	        tfciddate = new JTextField();
	        tfciddate.setColumns(10);
	        tfciddate.setBackground(Color.WHITE);
	        tfciddate.setBounds(196, 244, 197, 43);
	        desktopPane.add(tfciddate);
	        
	        JLabel lblCheckoutdate = new JLabel();
	        lblCheckoutdate.setText("Check-Out-Date");
	        lblCheckoutdate.setForeground(Color.BLUE);
	        lblCheckoutdate.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblCheckoutdate.setBackground(Color.BLACK);
	        lblCheckoutdate.setBounds(414, 247, 162, 40);
	        desktopPane.add(lblCheckoutdate);
	        
	        JLabel lblRoomType = new JLabel();
	        lblRoomType.setText("Room Type\r\n");
	        lblRoomType.setForeground(Color.BLUE);
	        lblRoomType.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblRoomType.setBackground(Color.BLACK);
	        lblRoomType.setBounds(45, 316, 119, 40);
	        desktopPane.add(lblRoomType);
	        
	        tfpcode = new JTextField();
	        tfpcode.setColumns(10);
	        tfpcode.setBackground(Color.WHITE);
	        tfpcode.setBounds(577, 317, 197, 43);
	        desktopPane.add(tfpcode);
	        
	        tfcodate = new JTextField();
	        tfcodate.setColumns(10);
	        tfcodate.setBackground(Color.WHITE);
	        tfcodate.setBounds(577, 244, 197, 43);
	        desktopPane.add(tfcodate);
	        
	        JLabel lblPostalCode = new JLabel();
	        lblPostalCode.setText("Postal Code");
	        lblPostalCode.setForeground(Color.BLUE);
	        lblPostalCode.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblPostalCode.setBackground(Color.BLACK);
	        lblPostalCode.setBounds(417, 316, 119, 40);
	        desktopPane.add(lblPostalCode);
	        
	        String [] room = {"Single Room", "Double Room", "Twin Room"};
	        combobox12 = new JComboBox(room);
	        combobox12.setBounds(196, 317, 197, 43);
	        desktopPane.add(combobox12);
	        
	        tffname = new JTextField();
	        tffname.setColumns(10);
	        tffname.setBackground(Color.WHITE);
	        tffname.setBounds(196, 167, 197, 43);
	        desktopPane.add(tffname);
	        
	        tfadd = new JTextField();
	        tfadd.setColumns(10);
	        tfadd.setBackground(Color.WHITE);
	        tfadd.setBounds(577, 167, 197, 43);
	        desktopPane.add(tfadd);
	        
	        JLabel lblFullnmae = new JLabel();
	        lblFullnmae.setText("FullName");
	        lblFullnmae.setForeground(Color.BLUE);
	        lblFullnmae.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblFullnmae.setBackground(Color.BLACK);
	        lblFullnmae.setBounds(45, 167, 141, 40);
	        desktopPane.add(lblFullnmae);
	        
	        JLabel lblAddress = new JLabel();
	        lblAddress.setText("Address");
	        lblAddress.setForeground(Color.BLUE);
	        lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblAddress.setBackground(Color.BLACK);
	        lblAddress.setBounds(414, 170, 141, 40);
	        desktopPane.add(lblAddress);
	        
	        JButton btnNewButton_1_1_1 = new JButton("Back");
	        btnNewButton_1_1_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 Home signUp = new Home();
	                 signUp.setVisible(true);
	        		
	        	}
	        });
	        btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        btnNewButton_1_1_1.setBounds(45, 514, 99, 43);
	        desktopPane.add(btnNewButton_1_1_1);
	        
	        JPanel panel = new JPanel();
	        panel.setBounds(346, 239, -260, -41);
	        contentPane.add(panel);
	        
	        
	}
	
	private void saveBookinginf() {
		
        // On click of the log In button
        // It fetch the data from the field
        // Create an object of Service Layer and pass the model to Service layer
        // Perform the required action from the Service layer.
        try {
            Booking booking = new Booking();
            booking.setFullName(tffname.getText());
            booking.setAddress(tfadd.getText());
            booking.setCheck_in_date(tfciddate.getText());
            booking.setCheck_out_date(tfcodate.getText());
            booking.setRoom_Type(combobox12.getSelectedItem().toString());
            booking.setPostal_code(tfpcode.getText());


            BLBooking bookingBL = new BLBooking();
            bookingBL.validateBooking(booking);
            bookingBL.bookinginf(booking);
            


        }
        catch(InputException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
}
}