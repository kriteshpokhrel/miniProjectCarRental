package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class confirmBook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					confirmBook frame = new confirmBook();
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
	public confirmBook() {
		
		setBounds(100, 100, 400, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your booking has been confirmed");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(76, 6, 358, 22);
		contentPane.add(lblNewLabel);
		
		JLabel unameLbl = new JLabel("New label");
		unameLbl.setBounds(220, 44, 141, 14);
		contentPane.add(unameLbl);
		
		JLabel nameLbl = new JLabel("New label");
		nameLbl.setBounds(10, 44, 175, 14);
		contentPane.add(nameLbl);
		
		JLabel dlLbl = new JLabel("New label");
		dlLbl.setBounds(10, 94, 175, 14);
		contentPane.add(dlLbl);
		
		JLabel emailLbl = new JLabel("New label");
		emailLbl.setBounds(220, 69, 127, 14);
		contentPane.add(emailLbl);
		
		JLabel contactLbl = new JLabel("New label");
		contactLbl.setBounds(10, 69, 175, 14);
		contentPane.add(contactLbl);
		
		JLabel carLbl = new JLabel("New label");
		carLbl.setBounds(10, 116, 220, 14);
		contentPane.add(carLbl);
		
		JLabel fromLbl = new JLabel("New label");
		fromLbl.setBounds(10, 141, 185, 14);
		contentPane.add(fromLbl);
		
		JLabel toLbl = new JLabel("New label");
		toLbl.setBounds(220, 141, 169, 14);
		contentPane.add(toLbl);
		
		JLabel cityLbl = new JLabel("New label");
		cityLbl.setBounds(10, 166, 220, 14);
		contentPane.add(cityLbl);
		
		JLabel locLbl = new JLabel("New label");
		locLbl.setBounds(10, 191, 220, 14);
		contentPane.add(locLbl);
		
		JLabel priceLbl = new JLabel("");
		priceLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		priceLbl.setBounds(10, 233, 220, 16);
		contentPane.add(priceLbl);
		System.out.println(bookDetails.dlNo1);
		
		JLabel bookidLbl = new JLabel("");
		bookidLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		bookidLbl.setBounds(10, 213, 199, 14);
		contentPane.add(bookidLbl);
		
		
		//setting text
		unameLbl.setText("Username: "+login.logUser);
		nameLbl.setText("Booked Name: "+bookDetails.bookName1);
		dlLbl.setText("DL No.: "+bookDetails.dlNo1);
		contactLbl.setText("Contact No: "+bookDetails.bookContact1);
		emailLbl.setText("Email: "+bookDetails.bookEmail1);
		fromLbl.setText("From: "+ carRental.fullStartDate);
		toLbl.setText("To: "+carRental.fullEndDate);
		carLbl.setText("Selected Car: " +carView.selectedCar);
		cityLbl.setText("City: "+carRental.citySelect1);
		locLbl.setText("Location: "+carRental.locSelect1);
		priceLbl.setText("Advance Price: INR."+carRental.advaPrice);
		bookidLbl.setText("Booking ID:"+bookDetails.bookId1);
		
		
		
		JButton btnNewButton = new JButton("Done!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp2=new HomePage();
				hp2.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(127, 259, 75, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("T&C's");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				priceFaq f1=new priceFaq();
				f1.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(305, 285, 63, 15);
		contentPane.add(btnNewButton_1);
		
	}
}
