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

public class TwinRoom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwinRoom frame = new TwinRoom();
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
	public TwinRoom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(167, 25, 1033, 613);
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
	        
	        JButton btnNewButton_1_2_1 = new JButton("Twin Rooms");
	        btnNewButton_1_2_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        	}
	        });
	        btnNewButton_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_1.setBackground(new Color(128, 128, 128));
	        btnNewButton_1_2_1.setBounds(414, 78, 205, 40);
	        desktopPane.add(btnNewButton_1_2_1);
	        
	        JButton btnNewButton_1_2_2 = new JButton("Back");
	        btnNewButton_1_2_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Rooms signIn = new Rooms();
	                 signIn.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_2.setBackground(Color.GREEN);
	        btnNewButton_1_2_2.setBounds(891, 549, 119, 40);
	        desktopPane.add(btnNewButton_1_2_2);
	        
	        JLabel lblCostPer = new JLabel();
	        lblCostPer.setText("COST: 400$ PER DAY ");
	        lblCostPer.setForeground(Color.BLUE);
	        lblCostPer.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblCostPer.setBackground(new Color(0, 0, 255));
	        lblCostPer.setBounds(404, 487, 242, 40);
	        desktopPane.add(lblCostPer);
	        
	        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("\r\n");
	        lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\twin2.jpg"));
	        lblNewLabel_1_1_1_1_1.setBounds(552, 144, 393, 254);
	        desktopPane.add(lblNewLabel_1_1_1_1_1);
	        
	        JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("\r\n");
	        lblNewLabel_1_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\twin1.jpg"));
	        lblNewLabel_1_1_1_1_1_1.setBounds(103, 144, 393, 254);
	        desktopPane.add(lblNewLabel_1_1_1_1_1_1);
	        
	        JLabel lblRoomFacilitiesFurnished = new JLabel();
	        lblRoomFacilitiesFurnished.setText("Most of the rooms are with two separate beds, but there are also a few rooms with a double bed. Room size appr. 12-14 sqm. The");
	        lblRoomFacilitiesFurnished.setForeground(Color.BLACK);
	        lblRoomFacilitiesFurnished.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lblRoomFacilitiesFurnished.setBackground(Color.BLACK);
	        lblRoomFacilitiesFurnished.setBounds(123, 409, 797, 23);
	        desktopPane.add(lblRoomFacilitiesFurnished);
	        
	        JLabel lblRoomSizeAppr = new JLabel();
	        lblRoomSizeAppr.setText(" room is fully equipped with private bath room with shower, WC, hairdryer, umbrella, shoe spoon, telephone, TV, safe box");
	        lblRoomSizeAppr.setForeground(Color.BLACK);
	        lblRoomSizeAppr.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lblRoomSizeAppr.setBackground(Color.BLACK);
	        lblRoomSizeAppr.setBounds(123, 432, 809, 23);
	        desktopPane.add(lblRoomSizeAppr);
	        
	        JLabel lblMinibarWorkingDesk = new JLabel();
	        lblMinibarWorkingDesk.setText(" minibar, working desk and free WiFi. Max. occupancy 2 persons.\r\n\r\n");
	        lblMinibarWorkingDesk.setForeground(Color.BLACK);
	        lblMinibarWorkingDesk.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lblMinibarWorkingDesk.setBackground(Color.BLACK);
	        lblMinibarWorkingDesk.setBounds(123, 453, 809, 23);
	        desktopPane.add(lblMinibarWorkingDesk);
	        
	     
	}
}