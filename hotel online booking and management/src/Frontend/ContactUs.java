package Frontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class ContactUs extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUs frame = new ContactUs();
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
	public ContactUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(159, 86, 1033, 554);
	        desktopPane.setBackground(Color.LIGHT_GRAY);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        JLabel lblHolidaysWithUs = new JLabel();
	        lblHolidaysWithUs.setText("Contact Us!");
	        lblHolidaysWithUs.setForeground(Color.BLACK);
	        lblHolidaysWithUs.setFont(new Font("Times New Roman", Font.BOLD, 50));
	        lblHolidaysWithUs.setBackground(Color.BLACK);
	        lblHolidaysWithUs.setBounds(480, 148, 326, 40);
	        desktopPane.add(lblHolidaysWithUs);
	        
	        JButton btnNewButton_1 = new JButton("Book Now");
	        btnNewButton_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		NewBooking signIn = new NewBooking();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1.setBackground(Color.YELLOW);
	        btnNewButton_1.setBounds(856, 11, 154, 40);
	        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        desktopPane.add(btnNewButton_1);
	        
	        JLabel lblLutonHotel = new JLabel();
	        lblLutonHotel.setText("LUTON HOTEL");
	        lblLutonHotel.setForeground(Color.BLACK);
	        lblLutonHotel.setFont(new Font("Times New Roman", Font.BOLD, 28));
	        lblLutonHotel.setBackground(Color.BLACK);
	        lblLutonHotel.setBounds(20, 11, 235, 40);
	        desktopPane.add(lblLutonHotel);
	        
	        JButton btnNewButton_1_2_2 = new JButton("Back");
	        btnNewButton_1_2_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Home signIn = new Home();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_2.setBackground(Color.GREEN);
	        btnNewButton_1_2_2.setBounds(874, 481, 119, 40);
	        desktopPane.add(btnNewButton_1_2_2);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\contactus.jpg"));
	        lblNewLabel.setBounds(66, 109, 350, 400);
	        desktopPane.add(lblNewLabel);
	        
	        JLabel lblBestExperienceEver_1 = new JLabel();
	        lblBestExperienceEver_1.setText("Best Experience Ever\r\n");
	        lblBestExperienceEver_1.setForeground(Color.BLACK);
	        lblBestExperienceEver_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
	        lblBestExperienceEver_1.setBackground(Color.BLACK);
	        lblBestExperienceEver_1.setBounds(53, 43, 163, 32);
	        desktopPane.add(lblBestExperienceEver_1);
	        
	        textField = new JTextField();
	        textField.setColumns(10);
	        textField.setBackground(Color.WHITE);
	        textField.setBounds(667, 217, 326, 43);
	        desktopPane.add(textField);
	        
	        textField_1 = new JTextField();
	        textField_1.setColumns(10);
	        textField_1.setBackground(Color.WHITE);
	        textField_1.setBounds(667, 270, 326, 43);
	        desktopPane.add(textField_1);
	        
	        textField_2 = new JTextField();
	        textField_2.setColumns(10);
	        textField_2.setBackground(Color.WHITE);
	        textField_2.setBounds(667, 324, 326, 59);
	        desktopPane.add(textField_2);
	        
	        JLabel label_2_1 = new JLabel();
	        label_2_1.setText("Enter Your Name");
	        label_2_1.setForeground(Color.BLUE);
	        label_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
	        label_2_1.setBackground(Color.BLACK);
	        label_2_1.setBounds(438, 220, 194, 40);
	        desktopPane.add(label_2_1);
	        
	        JLabel label_2_1_1 = new JLabel();
	        label_2_1_1.setText("Enter A Valid Email Address");
	        label_2_1_1.setForeground(Color.BLUE);
	        label_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
	        label_2_1_1.setBackground(Color.BLACK);
	        label_2_1_1.setBounds(438, 270, 212, 40);
	        desktopPane.add(label_2_1_1);
	        
	        JLabel label_2_1_2 = new JLabel();
	        label_2_1_2.setText("Type Your Message Here");
	        label_2_1_2.setForeground(Color.BLUE);
	        label_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
	        label_2_1_2.setBackground(Color.BLACK);
	        label_2_1_2.setBounds(438, 341, 206, 40);
	        desktopPane.add(label_2_1_2);
	        
	        JButton btnNewButton_1_1 = new JButton("Submit");
	        btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        btnNewButton_1_1.setBackground(new Color(128, 128, 128));
	        btnNewButton_1_1.setBounds(625, 415, 113, 40);
	        desktopPane.add(btnNewButton_1_1);
	        
	     
	}
}