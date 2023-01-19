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

public class Checkout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkout frame = new Checkout();
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
	public Checkout() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\aboutt.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(159, 86, 1033, 554);
	        desktopPane.setBackground(Color.CYAN);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        JLabel lblLutonHotel = new JLabel();
	        lblLutonHotel.setText("LUTON HOTEL");
	        lblLutonHotel.setForeground(Color.BLACK);
	        lblLutonHotel.setFont(new Font("Times New Roman", Font.BOLD, 28));
	        lblLutonHotel.setBackground(Color.BLACK);
	        lblLutonHotel.setBounds(20, 11, 235, 40);
	        desktopPane.add(lblLutonHotel);
	        
	        JLabel lblBestExperienceEver = new JLabel();
	        lblBestExperienceEver.setText("Thank You For Visiting !!");
	        lblBestExperienceEver.setForeground(Color.BLACK);
	        lblBestExperienceEver.setFont(new Font("Times New Roman", Font.BOLD, 62));
	        lblBestExperienceEver.setBackground(Color.BLACK);
	        lblBestExperienceEver.setBounds(154, 255, 725, 80);
	        desktopPane.add(lblBestExperienceEver);
	        
	        JButton btnNewButton_1_1 = new JButton("Logout");
	        btnNewButton_1_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		NewLogin login =  new NewLogin();
	          		login.setVisible(true);
	        		
	        	}
	        });
	        btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        btnNewButton_1_1.setBounds(879, 472, 109, 43);
	        desktopPane.add(btnNewButton_1_1);
	        
	     
	}
}