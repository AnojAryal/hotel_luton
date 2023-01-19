package Frontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import BusinessLayer.BLBookingTable;
import BusinessLayer.BLInvoice;
import BusinessLayer.BLInvoiceTable;
import Helper.InputException;
import Models.AllModel;

import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Invoice extends JFrame {

	private JPanel contentPane;
	private JTextField tfcod;
	private JTextField tfcid;
	private JTextField invoiceidtf;
	private JTextField tfaddress;
	private JTextField fullname;	
	private JTextField contacttf;
	private JTable Invoicetable;
	private DefaultTableModel model;
	private AllModel AllModel;/**
	
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice frame = new Invoice();
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
	public Invoice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\home\\OneDrive\\Desktop\\Images for pop\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		   contentPane.setLayout(null);
		
		   JDesktopPane desktopPane = new JDesktopPane();
		   desktopPane.setBounds(291, 66, 839, 609);
	        desktopPane.setBackground(Color.ORANGE);
	        contentPane.add(desktopPane);
	        desktopPane.setLayout(null);
	        desktopPane.setOpaque(true);
	        
	        JLabel lblLoginToLuton =new JLabel();
	        lblLoginToLuton.setBounds(287, 34, 283, 55);
	        lblLoginToLuton.setForeground(Color.BLACK);
	        lblLoginToLuton.setBackground(Color.BLACK);
	        lblLoginToLuton.setText("LUTON HOTEL ");
	        lblLoginToLuton.setFont(new Font("Times New Roman", Font.BOLD, 30));
	        desktopPane.add(lblLoginToLuton);
	        
	        JLabel lblCheckindate = new JLabel();
	        lblCheckindate.setText("Contact Num");
	        lblCheckindate.setForeground(Color.BLUE);
	        lblCheckindate.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblCheckindate.setBackground(Color.BLACK);
	        lblCheckindate.setBounds(57, 221, 141, 40);
	        desktopPane.add(lblCheckindate);
	        
	        fullname = new JTextField();
	        fullname.setColumns(10);
	        fullname.setBackground(Color.WHITE);
	        fullname.setBounds(196, 167, 197, 43);
	        desktopPane.add(fullname);
	        
	        JLabel lblCheckoutdate = new JLabel();
	        lblCheckoutdate.setText("Check-Out-Date");
	        lblCheckoutdate.setForeground(Color.BLUE);
	        lblCheckoutdate.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblCheckoutdate.setBackground(Color.BLACK);
	        lblCheckoutdate.setBounds(419, 221, 162, 40);
	        desktopPane.add(lblCheckoutdate);
	        
	        JButton btnNewButton_1_1 = new JButton("Next");
	        btnNewButton_1_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		  Checkout login =  new Checkout();
	          		login.setVisible(true);
	          		dispose();
	        		
	        		 
	        	}
	        });
	        btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        btnNewButton_1_1.setBounds(678, 543, 109, 43);
	        desktopPane.add(btnNewButton_1_1);
	        
	        JLabel lblRoomType = new JLabel();
	        lblRoomType.setText("FullName ");
	        lblRoomType.setForeground(Color.BLUE);
	        lblRoomType.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblRoomType.setBackground(Color.BLACK);
	        lblRoomType.setBounds(57, 166, 119, 40);
	        desktopPane.add(lblRoomType);
	        
	        tfcod = new JTextField();
	        tfcod.setColumns(10);
	        tfcod.setBackground(Color.WHITE);
	        tfcod.setBounds(577, 222, 197, 43);
	        desktopPane.add(tfcod);
	        
	        tfcid = new JTextField();
	        tfcid.setColumns(10);
	        tfcid.setBackground(Color.WHITE);
	        tfcid.setBounds(577, 167, 197, 43);
	        desktopPane.add(tfcid);
	        
	        String [] room = {"Single Room", "Double Room", "Twin Room"};
	        
	        invoiceidtf = new JTextField();
	        invoiceidtf.setColumns(10);
	        invoiceidtf.setBackground(Color.WHITE);
	        invoiceidtf.setBounds(196, 115, 197, 43);
	        desktopPane.add(invoiceidtf);
	        
	        tfaddress = new JTextField();
	        tfaddress.setColumns(10);
	        tfaddress.setBackground(Color.WHITE);
	        tfaddress.setBounds(577, 115, 197, 43);
	        desktopPane.add(tfaddress);
	        
	        JLabel lblFullnmae = new JLabel();
	        lblFullnmae.setText("Invoice ID");
	        lblFullnmae.setForeground(Color.BLUE);
	        lblFullnmae.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblFullnmae.setBackground(Color.BLACK);
	        lblFullnmae.setBounds(57, 109, 141, 40);
	        desktopPane.add(lblFullnmae);
	        
	        JLabel lblAddress = new JLabel();
	        lblAddress.setText("Address");
	        lblAddress.setForeground(Color.BLUE);
	        lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblAddress.setBackground(Color.BLACK);
	        lblAddress.setBounds(419, 115, 141, 40);
	        desktopPane.add(lblAddress);
	        
	        JLabel lblCheckindate_1 = new JLabel();
	        lblCheckindate_1.setText("Check-In-Date");
	        lblCheckindate_1.setForeground(Color.BLUE);
	        lblCheckindate_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        lblCheckindate_1.setBackground(Color.BLACK);
	        lblCheckindate_1.setBounds(419, 166, 141, 40);
	        desktopPane.add(lblCheckindate_1);
	        
	        contacttf = new JTextField();
	        contacttf.setColumns(10);
	        contacttf.setBackground(Color.WHITE);
	        contacttf.setBounds(196, 222, 197, 43);
	        desktopPane.add(contacttf);
	        
	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(57, 348, 717, 172);
	        desktopPane.add(scrollPane);
	        
	        Invoicetable = new JTable();
	        scrollPane.setColumnHeaderView(Invoicetable);
	        
	        JButton btnGenerateInvoice = new JButton("Generate Invoice");
	        btnGenerateInvoice.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		loadAllInvoice();
	        	}
	        });
	        btnGenerateInvoice.setForeground(Color.BLACK);
	        btnGenerateInvoice.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        btnGenerateInvoice.setBackground(Color.CYAN);
	        btnGenerateInvoice.setBounds(305, 297, 197, 40);
	        desktopPane.add(btnGenerateInvoice);
	        
	        JPanel panel = new JPanel();
	        panel.setBounds(346, 239, -260, -41);
	        contentPane.add(panel);
	        
	        
	        
	        
	      
	    	
	    	
			
			
			
	    	
			 model = new DefaultTableModel();
				Object[] columnsName = new Object[7];
				columnsName[0] = "INVOICE_ID";
				columnsName[1] = "FULL NAME";
				columnsName[2] =  "ADDRESS";
				columnsName[3] = "CONTACT";
				columnsName[4] = "CHECK IN DATE";
				columnsName[5] = "CHECK OUT DATE";
				columnsName[6] = "TOTAL";
				
				
				

		     model.setColumnCount(0);

		     model.setColumnIdentifiers(columnsName);
				
					}
		private void loadAllInvoice() {
			try {
				BLInvoiceTable blinvoice = new BLInvoiceTable();
				ArrayList<Models.AllModel> model = BLInvoiceTable.Invoice();
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
				rowData[0] = models.get(i).getInvoice_ID();
				rowData[1] = models.get(i).getFullName();
				rowData[2] = models.get(i).getAddress();
				rowData[3] = models.get(i).getContact();
				rowData[4] = models.get(i).getCheck_in_date();
				rowData[5] = models.get(i).getCheck_out_date();
				rowData[6] = models.get(i).getTotal();
			
			
				model.addRow(rowData);
				Invoicetable.setModel(model);
			}
			

	
	}
		private void userinvoice() {
		    // On click of the log In button
		    // It fetch the data from the field
		    // Create an object of Service Layer and pass the model to Service layer
		    // Perform the required action from the Service layer.
		    try {
		    	AllModel invoice = new AllModel();
		        invoice.setFullName(fullname.getText());
		        invoice.setCheck_in_date(tfcid.getText());
		        invoice.setCheck_out_date(tfcod.getText());
		        invoice.setAddress(tfaddress.getText()); 
		        invoice.setContact(contacttf.getText());
		        invoice.setInvoice_ID(invoiceidtf.getText());
		       

		        BLInvoice<AllModel> invoiceBL = new BLInvoice<AllModel>();
		        invoiceBL.validateUser(invoice);
		        invoiceBL.invoiceinf(invoice);
		        


		    }
		    catch(InputException ex) {
		        JOptionPane.showMessageDialog(null, ex.getMessage());
		    }
		    catch(Exception ex) {
		        JOptionPane.showMessageDialog(null, ex.getMessage());
		    }
		}
		public Object getInvoice() {
			return Invoicetable;
		}
		public void setInvoice(Object invoice) {
			this.Invoicetable = (JTable) invoice;
		}
		}
			



