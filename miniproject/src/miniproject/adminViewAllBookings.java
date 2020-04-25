package miniproject;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminViewAllBookings extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminViewAllBookings frame = new adminViewAllBookings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public adminViewAllBookings() throws SQLException {
		
		setBounds(300, 300, 1150, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		
		//start
	    ArrayList columnNames = new ArrayList();
	    ArrayList data = new ArrayList();
	    
	    Connection connection = null;
		try {
			connection = db_helper.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Statement stmt = connection.createStatement();
	    String sql = "SELECT * FROM bookdetails";
	    ResultSet rs = stmt.executeQuery(sql);
	    ResultSetMetaData md = rs.getMetaData();
	    int columns = md.getColumnCount();
	    for (int i = 1; i <= columns; i++) {
	      columnNames.add(md.getColumnName(i));
	    }
	    while (rs.next()) {
	      ArrayList row = new ArrayList(columns); 
	      for (int i = 1; i <= columns; i++) {
	        row.add(rs.getObject(i));
	      }
	      data.add(row);
	    }
	    Vector columnNamesVector = new Vector();
	    Vector dataVector = new Vector();
	    for (int i = 0; i < data.size(); i++) {
	      ArrayList subArray = (ArrayList) data.get(i);
	      Vector subVector = new Vector();
	      for (int j = 0; j < subArray.size(); j++) {
	        subVector.add(subArray.get(j));
	      }
	      dataVector.add(subVector);
	    }
	    for (int i = 0; i < columnNames.size(); i++)
	      columnNamesVector.add(columnNames.get(i));
	    JTable table = new JTable(dataVector, columnNamesVector) {
	      public Class getColumnClass(int column) {
	        for (int row = 0; row < getRowCount(); row++) {
	          Object o = getValueAt(row, column);
	          if (o != null) {
	            return o.getClass();
	          }
	        }
	        return Object.class;
	      }
	    };
	    JScrollPane scrollPane = new JScrollPane(table);
	    getContentPane().add(scrollPane, BorderLayout.CENTER);
	    JPanel buttonPanel = new JPanel();
	    getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	    
	    JButton btnNewButton = new JButton("Refresh ");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		adminViewAllBookings adb2;
				try {
					adb2 = new adminViewAllBookings();
					adb2.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		
	    		dispose();
	    	}
	    });
	    buttonPanel.add(btnNewButton);
	;
		//end
		
	}

}
