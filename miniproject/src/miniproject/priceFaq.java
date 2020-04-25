package miniproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;

public class priceFaq extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					priceFaq frame = new priceFaq();
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
	public priceFaq() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("1. Advance payment is done on the basis of no of days fow which the car is booked.");
		label.setBounds(10, 57, 471, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Note: Advance Payment do not have any hidden charges.");
		label_1.setBounds(24, 75, 341, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("2.  Use of your rented car for sports, adventure, races rallies and other ");
		label_2.setBounds(10, 93, 458, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("competitive events is forbidden.");
		label_3.setBounds(24, 111, 398, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("3. The final cost will be calculated when costumer returns the car");
		label_4.setBounds(10, 131, 398, 18);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("4. For over speeding violations over 125 Km/hr, there will be a fine of INR. 2500");
		label_5.setBounds(10, 151, 458, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("5. Delay in return of car will attract extra charges.");
		label_6.setBounds(10, 169, 398, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("6. Costumer liability in the event of theft or accident to the vehicle is restricted to ");
		label_7.setBounds(10, 187, 458, 18);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("maximum amount of INR.10000. CarRental's insurance handles the remainder.");
		label_8.setBounds(23, 205, 458, 18);
		contentPane.add(label_8);
		
		JLabel lblNewLabel = new JLabel("General Queries");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(141, 11, 194, 25);
		contentPane.add(lblNewLabel);
	}
}
