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

public class Rooms extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rooms frame = new Rooms();
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
	public Rooms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(176, 74, 1033, 554);
	        desktopPane.setBackground(Color.LIGHT_GRAY);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
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
	        
	        JButton btnNewButton_1_2_1 = new JButton("Single Room ");
	        btnNewButton_1_2_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		SingleRoom signIn = new SingleRoom();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_1.setBackground(new Color(128, 128, 128));
	        btnNewButton_1_2_1.setBounds(86, 402, 193, 40);
	        desktopPane.add(btnNewButton_1_2_1);
	        
	        JButton btnNewButton_1_2_2 = new JButton("Back");
	        btnNewButton_1_2_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Home signIn = new Home();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_2.setBackground(Color.GREEN);
	        btnNewButton_1_2_2.setBounds(891, 490, 119, 40);
	        desktopPane.add(btnNewButton_1_2_2);
	        
	        JButton btnNewButton_1_2_1_1 = new JButton("Double Room");
	        btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		DoubleRoom signIn = new DoubleRoom();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_1_1.setBackground(Color.GRAY);
	        btnNewButton_1_2_1_1.setBounds(419, 402, 211, 40);
	        desktopPane.add(btnNewButton_1_2_1_1);
	        
	        JButton btnNewButton_1_2_1_2 = new JButton("Twin Room");
	        btnNewButton_1_2_1_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		TwinRoom signIn = new TwinRoom();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_1_2.setBackground(Color.GRAY);
	        btnNewButton_1_2_1_2.setBounds(792, 402, 171, 40);
	        desktopPane.add(btnNewButton_1_2_1_2);
	        
	        JLabel lblNewLabel = new JLabel("\r\n");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\single.jpg"));
	        lblNewLabel.setBounds(20, 99, 311, 286);
	        desktopPane.add(lblNewLabel);
	        
	        JLabel lblNewLabel_1 = new JLabel("\r\n");
	        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\d3.jpg"));
	        lblNewLabel_1.setBounds(356, 99, 332, 286);
	        desktopPane.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_1_1 = new JLabel("\r\n");
	        lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\twin.png"));
	        lblNewLabel_1_1.setBounds(715, 99, 295, 286);
	        desktopPane.add(lblNewLabel_1_1);
	        
	     
	}
}