package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class adminMode extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static String dateStr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminMode frame = new adminMode();
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
	public adminMode() throws SQLException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrator Mode");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(104, 11, 193, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please select your preferred operation");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(21, 46, 276, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("View all bookings");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminViewAllBookings adv1;
				try {
					adv1 = new adminViewAllBookings();
					adv1.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(31, 82, 167, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Cancel Bookings");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminViewAllBookings adv1;
				try {
					cancelBookAdmin cbad1=new cancelBookAdmin();
					cbad1.setVisible(true);
					adv1 = new adminViewAllBookings();
					adv1.setVisible(true);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBounds(31, 142, 167, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(adminMode.class.getResource("/miniproject/hiclipart.com.png")));
		lblNewLabel_2.setBounds(280, 47, 154, 190);
		contentPane.add(lblNewLabel_2);
		
		JButton button = new JButton("Suspend users");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uSuspendAdmin uSus1=new uSuspendAdmin();
				uSus1.setVisible(true);
				allUsers al1=new allUsers();
				al1.setVisible(true);
			}
		});
		button.setBounds(31, 172, 167, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("View all users");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allUsers all3=new allUsers();
				all3.setVisible(true);
			}
		});
		btnNewButton.setBounds(31, 112, 167, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Sign Out");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			login lg2=new login();
			lg2.setVisible(true);
			dispose();
			}
		});
		btnNewButton_2.setBounds(309, 235, 85, 18);
		contentPane.add(btnNewButton_2);
	}
}
