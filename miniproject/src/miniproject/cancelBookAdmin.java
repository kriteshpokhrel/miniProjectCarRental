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

public class cancelBookAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField deleteBook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancelBookAdmin frame = new cancelBookAdmin();
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
	public cancelBookAdmin() throws SQLException{
	
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bookings Cancel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(112, 11, 194, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter the booking ID to be cancelled");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 48, 383, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("(refer to the other open window to view all booking details)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(14, 65, 355, 10);
		contentPane.add(lblNewLabel_2);
		
		deleteBook = new JTextField();
		deleteBook.setBounds(10, 87, 178, 20);
		contentPane.add(deleteBook);
		deleteBook.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String deleteBookID=deleteBook.getText().toString();
				if(deleteBookID.equals(""))
					 JOptionPane.showMessageDialog(null, "Please enter Booking ID!");
				//delete code
				else
				{
				 Connection conn = null;
				   Statement stmt = null;
				String sql = "DELETE  FROM bookdetails where Booking_ID='"+deleteBookID+"';";
				 try {
					conn = db_helper.getConnection();
					  stmt = conn.createStatement();
					  stmt.executeUpdate(sql);
					  JOptionPane.showMessageDialog(null, "Booking has been cancelled.");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				         
			}}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(198, 87, 103, 21);
		contentPane.add(btnNewButton);
	}
}
