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

public class SingleRoom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleRoom frame = new SingleRoom();
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
	public SingleRoom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(168, 52, 1033, 611);
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
	        
	        JButton btnNewButton_1_2_1 = new JButton("Single Rooms");
	        btnNewButton_1_2_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        btnNewButton_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
	        btnNewButton_1_2_1.setBackground(new Color(128, 128, 128));
	        btnNewButton_1_2_1.setBounds(395, 65, 193, 40);
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
	        
	        JLabel lblNewLabel_1 = new JLabel("\r\n");
	        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\single2.jpg"));
	        lblNewLabel_1.setBounds(536, 139, 393, 248);
	        desktopPane.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_1_1 = new JLabel("\r\n");
	        lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\single 3.png"));
	        lblNewLabel_1_1.setBounds(98, 136, 393, 254);
	        desktopPane.add(lblNewLabel_1_1);
	        
	        JLabel lblTheseRoomsAre = new JLabel();
	        lblTheseRoomsAre.setText("These rooms are assigned to one person or a couple. It contains only one bed ");
	        lblTheseRoomsAre.setForeground(Color.BLACK);
	        lblTheseRoomsAre.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblTheseRoomsAre.setBackground(Color.BLACK);
	        lblTheseRoomsAre.setBounds(126, 398, 737, 40);
	        desktopPane.add(lblTheseRoomsAre);
	        
	        JLabel lblWithSofaTelevision = new JLabel();
	        lblWithSofaTelevision.setText("with sofa, television and a drawyer.");
	        lblWithSofaTelevision.setForeground(Color.BLACK);
	        lblWithSofaTelevision.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblWithSofaTelevision.setBackground(Color.BLACK);
	        lblWithSofaTelevision.setBounds(126, 432, 352, 40);
	        desktopPane.add(lblWithSofaTelevision);
	        
	        JLabel lblCostPer = new JLabel();
	        lblCostPer.setText("COST: 250$ PER DAY ");
	        lblCostPer.setForeground(Color.BLUE);
	        lblCostPer.setFont(new Font("Times New Roman", Font.BOLD, 22));
	        lblCostPer.setBackground(new Color(0, 0, 255));
	        lblCostPer.setBounds(376, 487, 242, 40);
	        desktopPane.add(lblCostPer);
	        
	     
	}
}