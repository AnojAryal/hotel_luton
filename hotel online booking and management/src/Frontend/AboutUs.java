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
import java.awt.Toolkit;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\aboutt.jpg"));
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
	        
	        JLabel lblSpendQuality = new JLabel();
	        lblSpendQuality.setText("INNOVATIVE BUSINESS");
	        lblSpendQuality.setForeground(Color.BLACK);
	        lblSpendQuality.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	        lblSpendQuality.setBackground(Color.BLACK);
	        lblSpendQuality.setBounds(519, 157, 271, 40);
	        desktopPane.add(lblSpendQuality);
	        
	        JLabel lblHolidaysWithUs = new JLabel();
	        lblHolidaysWithUs.setText("About Us!");
	        lblHolidaysWithUs.setForeground(Color.BLACK);
	        lblHolidaysWithUs.setFont(new Font("Times New Roman", Font.BOLD, 50));
	        lblHolidaysWithUs.setBackground(Color.BLACK);
	        lblHolidaysWithUs.setBounds(504, 193, 326, 40);
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
	        
	        JLabel lblEnojyYourHolidays = new JLabel();
	        lblEnojyYourHolidays.setText("Luton Hotel is a large independently run hotel located in the town of Luton.   ");
	        lblEnojyYourHolidays.setForeground(Color.BLACK);
	        lblEnojyYourHolidays.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lblEnojyYourHolidays.setBackground(Color.BLACK);
	        lblEnojyYourHolidays.setBounds(510, 267, 492, 32);
	        desktopPane.add(lblEnojyYourHolidays);
	        
	        JLabel lblBestExperienceEver = new JLabel();
	        lblBestExperienceEver.setText("It offers a variety of accommodation all of which offer a suite facilities.");
	        lblBestExperienceEver.setForeground(Color.BLACK);
	        lblBestExperienceEver.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lblBestExperienceEver.setBackground(Color.BLACK);
	        lblBestExperienceEver.setBounds(510, 299, 465, 32);
	        desktopPane.add(lblBestExperienceEver);
	        
	        JButton btnNewButton_1_2_2 = new JButton("Back");
	        btnNewButton_1_2_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Home signIn = new Home();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_2.setBackground(Color.GREEN);
	        btnNewButton_1_2_2.setBounds(870, 478, 119, 40);
	        desktopPane.add(btnNewButton_1_2_2);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\aboutus.jpg"));
	        lblNewLabel.setBounds(24, 136, 465, 315);
	        desktopPane.add(lblNewLabel);
	        
	        JLabel lblBestExperienceEver_1 = new JLabel();
	        lblBestExperienceEver_1.setText("Best Experience Ever.\r\n");
	        lblBestExperienceEver_1.setForeground(Color.BLACK);
	        lblBestExperienceEver_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
	        lblBestExperienceEver_1.setBackground(Color.BLACK);
	        lblBestExperienceEver_1.setBounds(643, 371, 176, 32);
	        desktopPane.add(lblBestExperienceEver_1);
	        
	     
	}
}