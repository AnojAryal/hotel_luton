
        package Frontend;

		import java.awt.Color;
		import java.awt.EventQueue;
		import java.awt.Font;
		import javax.swing.JFrame;
		import javax.swing.JPanel;
		import javax.swing.border.EmptyBorder;
		import javax.swing.JLabel;
		import javax.swing.JDesktopPane;
		import javax.swing.JButton;
		import java.awt.event.ActionListener;
		import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

		public class Home extends JFrame {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private JPanel contentPane;

			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Home frame = new Home();
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
			public Home() {
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\homee.jpg"));
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
			        lblSpendQuality.setText("Spend Quality");
			        lblSpendQuality.setForeground(Color.BLACK);
			        lblSpendQuality.setFont(new Font("Times New Roman", Font.BOLD, 40));
			        lblSpendQuality.setBackground(Color.BLACK);
			        lblSpendQuality.setBounds(55, 176, 271, 40);
			        desktopPane.add(lblSpendQuality);
			        
			        JLabel lblHolidaysWithUs = new JLabel();
			        lblHolidaysWithUs.setText("Holidays With Us!");
			        lblHolidaysWithUs.setForeground(Color.BLACK);
			        lblHolidaysWithUs.setFont(new Font("Times New Roman", Font.BOLD, 40));
			        lblHolidaysWithUs.setBackground(Color.BLACK);
			        lblHolidaysWithUs.setBounds(55, 223, 326, 40);
			        desktopPane.add(lblHolidaysWithUs);
			        
			        JButton btnNewButton_1 = new JButton("Book Now");
			        btnNewButton_1.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		NewBooking signIn = new NewBooking();
			                 signIn.setVisible(true);
			        	}
			        	
			        });
			        btnNewButton_1.setBackground(Color.YELLOW);
			        btnNewButton_1.setBounds(863, 11, 154, 40);
			        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
			        desktopPane.add(btnNewButton_1);
			        
			        JButton btnNewButton_1_2 = new JButton("Rooms");
			        btnNewButton_1_2.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		Rooms signIn = new Rooms();
			                 signIn.setVisible(true);
			        	}
			        });
			        btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
			        btnNewButton_1_2.setBackground(new Color(128, 128, 128));
			        btnNewButton_1_2.setBounds(394, 11, 119, 40);
			        desktopPane.add(btnNewButton_1_2);
			        
			        JLabel lblLutonHotel = new JLabel();
			        lblLutonHotel.setText("LUTON HOTEL");
			        lblLutonHotel.setForeground(Color.BLACK);
			        lblLutonHotel.setFont(new Font("Times New Roman", Font.BOLD, 28));
			        lblLutonHotel.setBackground(Color.BLACK);
			        lblLutonHotel.setBounds(20, 11, 235, 40);
			        desktopPane.add(lblLutonHotel);
			        
			        JLabel lblEnojyYourHolidays = new JLabel();
			        lblEnojyYourHolidays.setText("Enojy Your Holidays In Luton Hotel. Have A Good Time With Your Loved Ones.\r\n");
			        lblEnojyYourHolidays.setForeground(Color.BLACK);
			        lblEnojyYourHolidays.setFont(new Font("Times New Roman", Font.BOLD, 13));
			        lblEnojyYourHolidays.setBackground(Color.BLACK);
			        lblEnojyYourHolidays.setBounds(55, 271, 495, 32);
			        desktopPane.add(lblEnojyYourHolidays);
			        
			        JButton btnNewButton_1_1 = new JButton("Best Experience Ever!");
			        btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
			        btnNewButton_1_1.setBackground(Color.RED);
			        btnNewButton_1_1.setBounds(55, 372, 259, 40);
			        desktopPane.add(btnNewButton_1_1);
			        
			        JLabel lblBestExperienceEver = new JLabel();
			        lblBestExperienceEver.setText("Best Experience Ever.\r\n");
			        lblBestExperienceEver.setForeground(Color.BLACK);
			        lblBestExperienceEver.setFont(new Font("Times New Roman", Font.BOLD, 16));
			        lblBestExperienceEver.setBackground(Color.BLACK);
			        lblBestExperienceEver.setBounds(55, 305, 154, 32);
			        desktopPane.add(lblBestExperienceEver);
			        
			        JLabel lblNewLabel = new JLabel("");
			        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\homepic.jpeg"));
			        lblNewLabel.setBounds(517, 95, 422, 350);
			        desktopPane.add(lblNewLabel);
			        
			        JButton btnNewButton_1_2_1 = new JButton("About Us");
			        btnNewButton_1_2_1.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		AboutUs signIn = new AboutUs();
			                 signIn.setVisible(true);
			        	}
			        });
			        btnNewButton_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
			        btnNewButton_1_2_1.setBackground(new Color(128, 128, 128));
			        btnNewButton_1_2_1.setBounds(517, 11, 154, 40);
			        desktopPane.add(btnNewButton_1_2_1);
			        
			        JButton btnNewButton_1_2_2 = new JButton("Logout");
			        btnNewButton_1_2_2.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		NewLogin signIn = new NewLogin();
			                 signIn.setVisible(true);
			        		
			        	}
			        });
			        btnNewButton_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
			        btnNewButton_1_2_2.setBackground(Color.GREEN);
			        btnNewButton_1_2_2.setBounds(898, 484, 119, 40);
			        desktopPane.add(btnNewButton_1_2_2);
			        
			        JButton btnNewButton_1_2_1_1 = new JButton("Contact Us");
			        btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		ContactUs Contact = new ContactUs();
			        		Contact.setVisible(true);
			        	}
			        });
			        btnNewButton_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
			        btnNewButton_1_2_1_1.setBackground(Color.GRAY);
			        btnNewButton_1_2_1_1.setBounds(674, 11, 171, 40);
			        desktopPane.add(btnNewButton_1_2_1_1);
			        
			     
			}
		}