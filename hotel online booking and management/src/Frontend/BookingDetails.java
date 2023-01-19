package Frontend;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import BusinessLayer.BLBookingDetails;
import BusinessLayer.RoomBL;
import Models.AllModel;
import Models.Booking;
import Models.Login;


import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class BookingDetails extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel demo;
	private DefaultTableModel model;
	private JTable table;
	private JTable bookingTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

					BookingDetails rep = new BookingDetails();
					rep.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public BookingDetails() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1800, 900);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(new Color(190, 190, 190));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Head = new JLabel();
		Head.setText("BOOKING DETAILS");
		Head.setForeground(Color.RED);
		Head.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Head.setBackground(new Color(255, 0, 0));
		Head.setBounds(523, 23, 412, 55);
		contentPane.add(Head);
        
        JDesktopPane repField = new JDesktopPane();
        repField.setBorder(new LineBorder(Color.BLACK, 2, true));
        repField.setBackground(Color.ORANGE);
        repField.setForeground(new Color(153, 204, 255));
        repField.setBounds(281, 89, 845, 573);
        contentPane.add(repField);
        
        JButton addRoomButton = new JButton("Cancell Booking ");
        addRoomButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Rooms room = new Rooms();
        		contentPane.add(room);
        		room.setVisible(true);
        	}
        });
        addRoomButton.setForeground(Color.BLACK);
        addRoomButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        addRoomButton.setBackground(Color.CYAN);
        addRoomButton.setBounds(1013, 514, 187, 30);
        repField.add(addRoomButton);
        
        JButton roomButton = new JButton("View Booking ");
        roomButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		loadAllBookings();
        		
        	}
        
        		
        	}
        );
        roomButton.setForeground(Color.BLACK);
        roomButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        roomButton.setBackground(Color.CYAN);
        roomButton.setBounds(370, 36, 167, 30);
        repField.add(roomButton);
        
        JButton bookingButton = new JButton("Edit Bookings");
        bookingButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        			
        	}
        });
        bookingButton.setForeground(Color.BLACK);
        bookingButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bookingButton.setBackground(Color.CYAN);
        bookingButton.setBounds(359, 305, 167, 30);
        repField.add(bookingButton);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(32, 102, 789, 178);
   repField.add(scrollPane);
   
        bookingTable = new JTable();
        scrollPane.setViewportView(bookingTable);
        
        JDesktopPane desktopPane = new JDesktopPane();
        scrollPane.setColumnHeaderView(desktopPane);
        desktopPane.setLayout(null);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 11, 669, 165);
        desktopPane.add(scrollPane_1);
        
        JButton btnBack = new JButton("BACK");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Home booking = new Home();
                booking.setVisible(true);
        	}
        });
        btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnBack.setBounds(702, 501, 119, 43);
        repField.add(btnBack);
        
	
	
        model = new DefaultTableModel();
		Object[] columnsName = new Object[7];
		columnsName[0] = "FULL NAME";
		columnsName[1] = "ADDRESS";
		columnsName[2] = "CHECK IN DATE";
		columnsName[3] = "CHECK OUT DATE";
		columnsName[4] = "ROOM TYPE";
		columnsName[5] = "BOOKING STATUS";
		columnsName[6] = "BOOKING ID";

    model.setColumnCount(0);

    model.setColumnIdentifiers(columnsName);
	
		}

private void loadAllBookings() {
	try {
		BLBookingDetails blbookingdetails = new BLBookingDetails();
		ArrayList<AllModel> model = blbookingdetails.Booking();
		setTableData(model);
	} catch (Exception e1) {
		JOptionPane.showMessageDialog(null, e1.getMessage());
	}
}




	private void setTableData(ArrayList<AllModel> models) {
		// Create the object array from arraylist and add to the table row
		Object[] rowData = new Object[7];
		// set the number of rows in table model to zero
		model.setRowCount(0);
		for(int i=0; i<models.size(); i++) {
			rowData[0] = models.get(i).getFullName();
			rowData[1] = models.get(i).getAddress();
			rowData[2] = models.get(i).getCheck_in_date();
			rowData[3] = models.get(i).getCheck_out_date();
			rowData[4] = models.get(i).getRoom_Type();
			rowData[5] = models.get(i).getBooking_status();
			rowData[6] = models.get(i).getBooking_ID();

			model.addRow(rowData);
		}
		bookingTable.setModel(model);
	
}
}