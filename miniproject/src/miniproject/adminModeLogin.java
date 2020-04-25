package miniproject;

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
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class adminModeLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField adminName;
	public static	String adminPass1,adminName1;
	private JPasswordField adminPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminModeLogin frame = new adminModeLogin();
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
	public adminModeLogin() throws SQLException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel layout1 = new JPanel();
		layout1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(layout1);
		layout1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrator Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(102, 11, 172, 36);
		layout1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 73, 81, 23);
		layout1.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(10, 118, 99, 23);
		layout1.add(lblPassword);
		
		adminName = new JTextField();
		adminName.setBounds(102, 75, 161, 20);
		layout1.add(adminName);
		adminName.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminName1=adminName.getText().toString();
				adminPass1=adminPass.getText().toString();
				String sql = "SELECT * FROM adminidpass where ID='"+adminName1+"' && pass='"+adminPass1+"';";
				try (Connection conn = db_helper.getConnection();
				        Statement stmt  = conn.createStatement();
				        ResultSet rs    = stmt.executeQuery(sql)) {
				       if (rs.next()) {
				    	   adminMode nw=new adminMode();
				    	   nw.setVisible(true); 
				    	   dispose();
				    	   
				       }
				       else {
							JOptionPane.showMessageDialog(null, "Not a valid Admin name and Password");
				       }
				   } catch (SQLException ex) {
				       System.out.println(ex.getMessage());
				   } catch (ClassNotFoundException e1) {
					
					e1.printStackTrace();
				}
				
				
				

			}
		});
		btnNewButton.setBounds(102, 165, 89, 23);
		layout1.add(btnNewButton);
		
		adminPass = new JPasswordField();
		adminPass.setBounds(102, 120, 161, 20);
		layout1.add(adminPass);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(adminModeLogin.class.getResource("/miniproject/as.jpg")));
		lblNewLabel_2.setBounds(273, 48, 161, 167);
		layout1.add(lblNewLabel_2);
	}
}
