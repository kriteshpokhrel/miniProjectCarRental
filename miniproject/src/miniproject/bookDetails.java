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
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class bookDetails extends JFrame {

	private JPanel contentPane;
	private JTextField bookName;
	private JTextField dlNo;
	private JTextField bookEmail;
	public static String bookEmail1,bookContact1,bookName1,dlNo1,bookId1;
	private JTextField bookContact;
	public static int advPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookDetails frame = new bookDetails();
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
	public bookDetails() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel headLabel = new JLabel("Enter your basic details for booking.");
		headLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		headLabel.setBounds(20, 22, 312, 20);
		contentPane.add(headLabel);
		
		JLabel bName = new JLabel("Name:");
		bName.setBounds(10, 70, 58, 20);
		contentPane.add(bName);
		
		JLabel contactLabel = new JLabel("Contact No:\r\n\r\n");
		contactLabel.setBounds(10, 163, 72, 20);
		contentPane.add(contactLabel);
		
		JLabel bEmail = new JLabel("Email:");
		bEmail.setBounds(10, 132, 46, 20);
		contentPane.add(bEmail);
		
		bookName = new JTextField();
		bookName.setBounds(78, 70, 227, 20);
		contentPane.add(bookName);
		bookName.setColumns(10);
		
		dlNo = new JTextField();
		
		dlNo.setColumns(10);
		dlNo.setBounds(78, 101, 227, 20);
		contentPane.add(dlNo);
		
		bookEmail = new JTextField();
		
		bookEmail.setColumns(10);
		bookEmail.setBounds(78, 132, 227, 20);
		contentPane.add(bookEmail);
		
		JButton doneButton = new JButton("Submit");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//date to make ID
				java.util.Date date=null;
				DateFormat dateFormat=null;
				date = Calendar.getInstance().getTime();
				dateFormat = new SimpleDateFormat("ddmmss");  
				 bookId1 = new String("BKD"+dateFormat.format(date));
int conf=JOptionPane.showConfirmDialog(null, "Confirm your details!","Confirm dialog", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE );

				if(conf==0)
				{
				//submit code here

					bookName1=bookName.getText().toString();
					dlNo1=dlNo.getText().toString();
					bookEmail1=bookEmail.getText().toString();
					bookContact1=bookContact.getText().toString();
					ResultSet rs = null;
					int candidateId = 0;
					String sql = "INSERT INTO bookdetails(Booking_ID,Username,Booked_name,DL_no,Email_ID,Contact_No,Selected_car,From_Date,To_Date,City,Location,Advance_Payment)"
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
					try (Connection conn = db_helper.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql);) {
						pstmt.setString(1, bookId1);
						pstmt.setString(2, login.logUser);
						pstmt.setString(3, bookName1);
						pstmt.setString(4, dlNo1);
						pstmt.setString(5, bookEmail1);
						pstmt.setString(6, bookContact1);
						pstmt.setString(7, carView.selectedCar);
						pstmt.setString(8,carRental.fullStartDate);
						pstmt.setString(9,carRental.fullEndDate);
						pstmt.setString(10,carRental.citySelect1);
						pstmt.setString(11,carRental.locSelect1);
						pstmt.setString(12,carRental.advaPriceStr);
						int rowAffected = pstmt.executeUpdate();
						if(rowAffected == 1)
						{
							rs = pstmt.getGeneratedKeys();
						if(rs.next())
							candidateId = rs.getInt(1);
						
						}
					}
					
					catch (SQLException ex) {
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					} 
					
					finally {
						try {
							if(rs != null)  rs.close();
						}
						catch (SQLException e1) {
							System.out.println(e1.getMessage());
						}
					}
					confirmBook cb1=new confirmBook();
					cb1.setVisible(true);
					dispose();

				}
				else
				{
					bookDetails bd2=new bookDetails();
					bd2.setVisible(true); 
					dispose();
				}
							}

		});
		doneButton.setBounds(135, 216, 89, 23);
		contentPane.add(doneButton);
		
		JLabel dlLabel = new JLabel("DL No:");
		dlLabel.setBounds(10, 101, 46, 20);
		contentPane.add(dlLabel);
		
		bookContact = new JTextField();
		bookContact.setColumns(10);
		bookContact.setBounds(78, 163, 227, 20);
		contentPane.add(bookContact);
		
		JLabel lblNewLabel_1 = new JLabel("(as on DL)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_1.setBounds(10, 84, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(bookDetails.class.getResource("/miniproject/book2.png")));
		lblNewLabel.setBounds(320, 70, 109, 125);
		contentPane.add(lblNewLabel);
	}
}
