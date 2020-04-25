package miniproject;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class SignUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField signupname;
	private JTextField ok1;
	private JTextField ok2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(26, 91, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone No");
		lblNewLabel_1.setBounds(26, 131, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(26, 171, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		signupname = new JTextField();
		signupname.setBounds(104, 88, 117, 20);
		contentPane.add(signupname);
		signupname.setColumns(10);
		
		ok1 = new JTextField();
		ok1.setBounds(104, 128, 117, 20);
		contentPane.add(ok1);
		ok1.setColumns(10);
		
		ok2 = new JTextField();
		ok2.setBounds(104, 168, 117, 20);
		contentPane.add(ok2);
		ok2.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String s1=signupname.getText().toString();
			
			String sql = "SELECT * FROM users where name='"+s1+"' ;";
			try (Connection conn = db_helper.getConnection();
			        Statement stmt  = conn.createStatement();
			        ResultSet rs    = stmt.executeQuery(sql)) {
			       if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Username already exists, please try another!");
			       }
			       else {
				// success code
			String s3=ok1.getText().toString();
			String s2=ok2.getText().toString();
			if(s1.equals("")|s2.equals("")|s3.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please fill all the required fields!");
			}
			else
				
			{
				insertCandidate(s1,s2,s3); 
				login login1=new login();
				login1.setVisible(true);
				dispose();
				 	
			}	}} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.getMessage();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.getMessage();
				}

			
			
			
			
			
			}//closed here action
		});
		btnNewButton.setBounds(104, 213, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Sign Up");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(26, 5, 136, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Please enter your basic details");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(26, 50, 195, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(SignUp.class.getResource("/miniproject/sdfsd.png")));
		lblNewLabel_5.setBounds(267, 42, 157, 180);
		contentPane.add(lblNewLabel_5);
	}
	public static int insertCandidate(String Name,String mName,String lName) {
		
		ResultSet rs = null;
		int candidateId = 0;
		String sql = "INSERT INTO users(Name,Pass,Phone)"
		+ "VALUES(?,?,?)";
		try (Connection conn = db_helper.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, Name);
			pstmt.setString(2, mName);
			pstmt.setString(3, lName);
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
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return candidateId;
		
	}
}
