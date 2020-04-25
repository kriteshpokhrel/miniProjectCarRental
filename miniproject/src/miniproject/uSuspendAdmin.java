package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class uSuspendAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField susUser;
	public static String susUser1;
	allUsers all1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uSuspendAdmin frame = new uSuspendAdmin();
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
	public uSuspendAdmin() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Suspend Users");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(130, 11, 140, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter the username to be suspended.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 68, 320, 14);
		contentPane.add(lblNewLabel_1);
		
		susUser = new JTextField();
		susUser.setBounds(10, 92, 130, 20);
		contentPane.add(susUser);
		susUser.setColumns(10);
		
		JButton btnNewButton = new JButton("Suspend");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				susUser1=susUser.getText().toString();
				if(susUser1.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter Username");
					
				}
				else
				{
				int conf=JOptionPane.showConfirmDialog(null, "User "+susUser1+" will be suspended! " ,"Confirm your action!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
				System.out.println(conf);
				if(conf==0)
				{
				////sql code to delete user
					 Connection conn = null;
					   Statement stmt = null;
					String sql = "DELETE  FROM users where Name='"+susUser1+"';";
					 try {
						conn = db_helper.getConnection();
						  stmt = conn.createStatement();
						  stmt.executeUpdate(sql);
						  JOptionPane.showMessageDialog(null, "All Bookings registered to the user have been deleted (if present) and the user has been suspended.");

					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				//del bookings if present
					String sql2 = "DELETE  FROM bookdetails where Username='"+susUser1+"';";
					 try {
						conn = db_helper.getConnection();
						  stmt = conn.createStatement();
						  stmt.executeUpdate(sql2);
						 
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
				
				
				else
				{
					uSuspendAdmin uSus2=new uSuspendAdmin();
					uSus2.setVisible(true); 
					dispose();
				}
			}}
		});
		btnNewButton.setBounds(150, 92, 89, 20);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(uSuspendAdmin.class.getResource("/miniproject/udelete.png")));
		lblNewLabel_3.setBounds(294, 80, 130, 158);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Note: All bookings made by the user");
		lblNewLabel_2.setBounds(10, 198, 229, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("will also be deleted.");
		lblNewLabel_4.setBounds(38, 215, 163, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Refresh the other window after suspending user.");
		lblNewLabel_5.setBounds(10, 236, 320, 14);
		contentPane.add(lblNewLabel_5);
	
	
	
	
	}
}
