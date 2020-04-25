package miniproject;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class login extends JFrame {

	/**
	 * 
	 */
	public static String logUser;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField t2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to CarRentals");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(69, 21, 237, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setBounds(25, 71, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(25, 110, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		t1 = new JTextField(15);
		t1.setBounds(97, 68, 120, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JButton lbutton = new JButton("");
		lbutton.setIcon(new ImageIcon(login.class.getResource("/miniproject/late.png")));
		lbutton.setBorderPainted(false); 	//extra delete start
		lbutton.setContentAreaFilled(false);	//end
		
		lbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			logUser=t1.getText().toString();
			String logPass=t2.getText().toString();
			
			String sql = "SELECT * FROM users where name='"+logUser+"' && pass='"+logPass+"';";
			try (Connection conn = db_helper.getConnection();
			        Statement stmt  = conn.createStatement();
			        ResultSet rs    = stmt.executeQuery(sql)) {
			       if (rs.next()) {
			    	 
			    	   try {
			    		   
							Thread.sleep(10);
						
			    	   }catch (InterruptedException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
			    	   HomePage nw=new HomePage();
			    	   nw.setVisible(true); 
			    	   dispose();
			       }
			       else {
						JOptionPane.showMessageDialog(null, "Not a valid Username and Password");
			       }
			   } catch (SQLException ex) {
			       System.out.println(ex.getMessage());
			   } catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
			}
		});
		lbutton.setBounds(97, 135, 76, 31);
		contentPane.add(lbutton);
		
		JButton sbutton = new JButton("");
		
		sbutton.setIcon(new ImageIcon(login.class.getResource("/miniproject/button (7).png")));
		sbutton.setBorderPainted(false); 	//extra delete start
		sbutton.setContentAreaFilled(false);	//end
		sbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			SignUp signup=new SignUp();
			signup.setVisible(true);
			dispose();
			}
		});
		sbutton.setBounds(97, 185, 89, 31);
		contentPane.add(sbutton);
		
		JLabel lblNewLabel_4 = new JLabel("For new users, click here.");
		lblNewLabel_4.setBounds(101, 169, 157, 17);
		contentPane.add(lblNewLabel_4);
		
		JButton abutton = new JButton("");
		abutton.setIcon(new ImageIcon(login.class.getResource("/miniproject/button (8).png")));
		abutton.setBorderPainted(false); 	//extra delete start
		abutton.setContentAreaFilled(false);	//end
		
		abutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			adminModeLogin adminmodelogin;
			try {
				adminmodelogin = new adminModeLogin();
				adminmodelogin.setVisible(true);
				dispose();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				// JOptionPane.showMessageDialog(null, "Bandai cha");
			}
		});
		abutton.setBounds(286, 219, 124, 31);
		contentPane.add(abutton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("/miniproject/btn.png")));
		lblNewLabel_3.setBounds(290, 37, 120, 135);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Click here for admin mode");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(282, 202, 142, 14);
		contentPane.add(lblNewLabel_5);
		
		t2 = new JPasswordField();
		t2.setBounds(97, 107, 120, 20);
		contentPane.add(t2);
		
	
	}
}
