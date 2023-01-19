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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Models.Login;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Register extends JFrame {

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
					Register frame = new Register();
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
	public Register() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(307, 117, 745, 519);
	        desktopPane.setBackground(Color.ORANGE);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        JButton btnNewButton_1_1 = new JButton("Already have Account ! Login?");
	        btnNewButton_1_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	NewLogin signUp = new NewLogin();
	                 signUp.setVisible(true);
                	 
	        		
	        	}
	        });
	        btnNewButton_1_1.setBackground(Color.GRAY);
	        btnNewButton_1_1.setForeground(Color.BLUE);
	        btnNewButton_1_1.setBounds(260, 448, 214, 31);
	        desktopPane.add(btnNewButton_1_1);
	        
	        JButton btnNewButton_1 = new JButton("NON-CORPORATE ");
	        btnNewButton_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		 NewNonCorporate Signup = new NewNonCorporate();
	                 Signup.setVisible(true);
	        	}
	        });
	        btnNewButton_1.setBounds(441, 226, 278, 40);
	        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        desktopPane.add(btnNewButton_1);
	        
	        JLabel lblfeelLikeHome = new JLabel();
	        lblfeelLikeHome.setText("SIGN UP TO LUTON HOTEL");
	        lblfeelLikeHome.setForeground(Color.BLACK);
	        lblfeelLikeHome.setFont(new Font("Times New Roman", Font.BOLD, 38));
	        lblfeelLikeHome.setBackground(Color.BLACK);
	        lblfeelLikeHome.setBounds(177, 52, 525, 56);
	        desktopPane.add(lblfeelLikeHome);
	        
	        JButton btnNewButton_1_2 = new JButton("CORPORATE ");
	        btnNewButton_1_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		NewCorporate signUp = new NewCorporate();
	                 signUp.setVisible(true);
	        	}
	        });
	        btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        btnNewButton_1_2.setBounds(441, 305, 278, 40);
	        desktopPane.add(btnNewButton_1_2);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\1.jpg"));
	        lblNewLabel.setBounds(46, 141, 349, 266);
	        desktopPane.add(lblNewLabel);
	        
	       	        
	        
	      
            }
	}



