package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class HomePage extends JFrame {

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
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please select your preffered operation");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(31, 11, 338, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(48, 125, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton carRentalButton = new JButton("Car Rental");
		carRentalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			carRental carRent=new carRental();
			carRent.setVisible(true); 
		
			}
		});
		carRentalButton.setBounds(31, 78, 174, 23);
		contentPane.add(carRentalButton);
		
		JButton bookStatusView = new JButton("Booking Status\r\n");
		bookStatusView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "SELECT * FROM bookdetails where Username='"+login.logUser+"';";
				try (Connection conn = db_helper.getConnection();
				        Statement stmt  = conn.createStatement();
				        ResultSet rs    = stmt.executeQuery(sql)) {
				       if (rs.next()) {
			viewBookDetails showDetails=new viewBookDetails();
			showDetails.setVisible(true);
			
			}
				       else {
							JOptionPane.showMessageDialog(null, "No bookings made!");
							dispose();
							HomePage return1=new HomePage();
							return1.setVisible(true);
							
				       }
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}});
		bookStatusView.setBounds(31, 112, 174, 23);
		contentPane.add(bookStatusView);
		
		JButton btnNewButton = new JButton("Cancel Booking");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "SELECT * FROM bookdetails where Username='"+login.logUser+"';";
				try (Connection conn = db_helper.getConnection();
				        Statement stmt  = conn.createStatement();
				        ResultSet rs    = stmt.executeQuery(sql)) {
				       if (rs.next()) {

							//sameassql
							final viewBookDetails vb2 ;
							
								vb2 = new viewBookDetails();
								vb2.setVisible(true);
						
							
							
							userCancelBook c1=new userCancelBook();
							c1.setVisible(true);
							
							
							
			}
				       else {
							JOptionPane.showMessageDialog(null, "No bookings made to cancel!");
							dispose();
							HomePage return1=new HomePage();
							return1.setVisible(true);
							
				       }
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnNewButton.setBounds(31, 147, 174, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HomePage.class.getResource("/miniproject/e7882ff6fc951274c144c2389709b6d7.png")));
		lblNewLabel_1.setBounds(263, 33, 161, 184);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Sign Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			login.logUser="";
			login lg1=new login();
			lg1.setVisible(true);
			dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(304, 228, 80, 19);
		contentPane.add(btnNewButton_1);
	}
}
