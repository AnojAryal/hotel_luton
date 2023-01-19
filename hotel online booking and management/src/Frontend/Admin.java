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

import BusinessLayer.BLInvoice;
import BusinessLayer.BLBooking;
import BusinessLayer.BLBookingTable;
import BusinessLayer.BLCorporate;
import BusinessLayer.RoomBL;
import Helper.InputException;
import Models.AllModel;
import Models.Booking;
import Models.Corporate;
import Models.Login;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.Label;

public class Admin extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel model;
	private DefaultTableModel bookingmodel;

	private JTable bookingTable;
	private JTable roomTable;
	private Object billing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

					Admin rep = new Admin();
					rep.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public Admin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1800, 900);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(new Color(190, 190, 190));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Head = new JLabel();
		Head.setText("LUTON HOTEL ADMINISTRATION ");
		Head.setForeground(new Color(64, 0, 64));
		Head.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Head.setBackground(new Color(255, 0, 0));
		Head.setBounds(334, 34, 700, 55);
		contentPane.add(Head);
        
        JDesktopPane repField = new JDesktopPane();
        repField.setBorder(new LineBorder(Color.BLACK, 2, true));
        repField.setBackground(Color.ORANGE);
        repField.setForeground(new Color(153, 204, 255));
        repField.setBounds(33, 100, 796, 512);
        contentPane.add(repField);
        
        JButton addRoomButton = new JButton("Add Room");
        addRoomButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
       
        		if(bookingTable.getSelectionModel().isSelectionEmpty()) {
        			return;
        		}
        		int row = bookingTable.getSelectedRow();
        		DefaultTableModel model = (DefaultTableModel) bookingTable.getModel();
        		int bookingId = Integer.parseInt(model.getValueAt(row, 6).toString());
        		
        		String roomNo = JOptionPane.showInputDialog("Enter the room no.");
        		AllModel allmodel = new AllModel();
        		allmodel.setRoomNo(Integer.parseInt(roomNo));
        		allmodel.setBooking_ID(bookingId);
        		
        		BLBooking blBooking = new BLBooking();
        		try {
					blBooking.assignRoom(allmodel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		
        		
        	}
        });
        addRoomButton.setForeground(Color.BLACK);
        addRoomButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        addRoomButton.setBackground(Color.CYAN);
        addRoomButton.setBounds(481, 38, 138, 30);
        repField.add(addRoomButton);
        
        JButton roomButton = new JButton("Room");
        roomButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		loadAllRoom();
        	}
        });
        roomButton.setForeground(Color.BLACK);
        roomButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        roomButton.setBackground(Color.CYAN);
        roomButton.setBounds(216, 38, 107, 30);
        repField.add(roomButton);
        
        JButton bookingButton = new JButton("Booking");
        bookingButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		loadAllBooking();
        	}
        });
        bookingButton.setForeground(Color.BLACK);
        bookingButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        bookingButton.setBackground(Color.CYAN);
        bookingButton.setBounds(333, 38, 138, 30);
        repField.add(bookingButton);
        
        JButton logOutButton = new JButton("Check-Out");
        logOutButton.setBounds(1180, 583, 143, 39);
        contentPane.add(logOutButton);
        logOutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	   Invoice login =  new Invoice();
        		login.setVisible(true);
        		dispose();
        	}
        });
        repField.setLayer(logOutButton, 2);
        
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(57, 100, 689, 187);
        repField.add(desktopPane);
        desktopPane.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 11, 669, 165);
        desktopPane.add(scrollPane);
        
        bookingTable = new JTable();
        scrollPane.setViewportView(bookingTable);
        
        JDesktopPane desktopPane_1 = new JDesktopPane();
        desktopPane_1.setBounds(57, 298, 689, 179);
        repField.add(desktopPane_1);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 11, 669, 165);
        desktopPane_1.add(scrollPane_1);
        
        roomTable = new JTable();
        scrollPane_1.setViewportView(roomTable);
        logOutButton.setForeground(Color.BLACK);
        logOutButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
        logOutButton.setBackground(Color.GREEN);
        
        JLabel lblBillings = new JLabel();
        lblBillings.setText("ADMINISTRATION");
        lblBillings.setForeground(Color.BLUE);
        lblBillings.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblBillings.setBackground(Color.BLACK);
        lblBillings.setBounds(1026, 116, 194, 40);
        contentPane.add(lblBillings);
        
        JLabel lblNewLabel_1_1 = new JLabel("\r\n");
        lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\aabbbaa.jpg"));
        lblNewLabel_1_1.setBounds(877, 167, 432, 382);
        contentPane.add(lblNewLabel_1_1);
        
        model = new DefaultTableModel();
		Object[] columnsName = new Object[4];
		columnsName[0] = "ROOM NUMBER";
		columnsName[1] = "ROOM TYPE";
		columnsName[2] = "ROOM RATE";
		columnsName[3] = "ROOM STATUS";
		

        model.setColumnCount(0);

        model.setColumnIdentifiers(columnsName);
		
			}

	private void loadAllRoom() {
		try {
			RoomBL roomBL = new RoomBL();
			ArrayList<AllModel> model = roomBL.getRoom();
			setTableData(model);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}
	
	private void setTableData(ArrayList<AllModel> models) {
		// Create the object array from arraylist and add to the table row
		Object[] rowData = new Object[4];
		// set the number of rows in table model to zero
		model.setRowCount(0);
		for(int i=0; i<models.size(); i++) {
			rowData[0] = models.get(i).getRoom_No();
			rowData[1] = models.get(i).getRoom_Type();
			rowData[2] = models.get(i).getRoom_Rate();
			rowData[3] = models.get(i).getRoom_Status();
			model.addRow(rowData);
		}
		roomTable.setModel(model);
	
	
		
		
		
	
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
	private void loadAllBooking() {
		try {
			BLBookingTable blbookingtable = new BLBookingTable();
			ArrayList<AllModel> model = BLBookingTable.Booking();
			setTableData1(model);
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}
	
	private void setTableData1(ArrayList<AllModel> models) {
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