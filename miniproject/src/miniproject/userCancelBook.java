package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class userCancelBook extends JFrame {

	private JPanel contentPane;
	private JTextField delBookID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userCancelBook frame = new userCancelBook();
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
	public userCancelBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cancel Bookings");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(111, 11, 226, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter the booking ID to be cancelled");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 59, 363, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("(refer to other window open to view your bookings)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(16, 71, 226, 14);
		contentPane.add(lblNewLabel_2);
		
		delBookID = new JTextField();
		delBookID.setBounds(10, 96, 139, 20);
		contentPane.add(delBookID);
		delBookID.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String delBookID1=delBookID.getText();
				//overloading class
				if(delBookID1.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter booking ID!");
					
				}
				else
				{
				class overloading{
					public void methodOverloading(int confInt)
					{
						//if part
						//del code
						
						 Connection conn2 = null;
						   Statement stmt2 = null;
						String sql2 = "DELETE  FROM bookdetails where Booking_ID='"+delBookID1+"';";
						 try {
							conn2 = db_helper.getConnection();
							  stmt2 = conn2.createStatement();
							int succ=  stmt2.executeUpdate(sql2);
							if(succ==1)
							{
							  JOptionPane.showMessageDialog(null, "Your booking "+delBookID1+" has been cancelled.");
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Enter valid booking ID!");
							}
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					dispose();	 
					}
					public void methodOverloading(String confStr) {
						//else part
						dispose();
					}
				}
				//show confirm option
				String sql = "SELECT * FROM bookdetails where Booking_ID='"+delBookID1+"';";///here
				try (Connection conn = db_helper.getConnection();
				        Statement stmt  = conn.createStatement();
				        ResultSet rs    = stmt.executeQuery(sql)) {
		  if (rs.next()) {


				
				int conf=JOptionPane.showConfirmDialog(null, "Are you sure that you want to cancel your booking?","Confirm dialog", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE );
				overloading ov1=new overloading();
				
				if(conf==0)
				{
					ov1.methodOverloading(0);
				}
				else
					ov1.methodOverloading("No");
				       	}
				      
				       else {
							JOptionPane.showMessageDialog(null, "Enter a valid Booking ID!");
							dispose();
							userCancelBook rld1=new userCancelBook();
							rld1.setVisible(true);
							
				       }
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
				}}
		});
		btnNewButton.setBounds(164, 95, 89, 20);
		contentPane.add(btnNewButton);
	}
}
