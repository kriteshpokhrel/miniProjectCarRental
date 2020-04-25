package miniproject;

import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class carView extends JFrame {

	private JPanel framebhanam;
	public static String selectedCar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carView frame = new carView();
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
	public carView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1658, 935);
		framebhanam = new JPanel();
		framebhanam.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(framebhanam);
		framebhanam.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JLabel lblNewLabel_1 = new JLabel("Please select your preferred car");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(602, 0, 307, 30);
		framebhanam.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(1118, 172, 139, 24);
		framebhanam.add(label_2);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon(carView.class.getResource("/miniproject/PngItem_4908697.png")));
		label_22.setBounds(10, 725, 150, 117);
		framebhanam.add(label_22);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon(carView.class.getResource("/miniproject/hexa1.png")));
		label_24.setBounds(407, 725, 160, 102);
		framebhanam.add(label_24);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(carView.class.getResource("/miniproject/NicePng_mahindra-pickup-png_2621965.png")));
		label_16.setBounds(1179, 516, 150, 117);
		framebhanam.add(label_16);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon(carView.class.getResource("/miniproject/kisspng-mahindra-scorpio-mahindra-mahindra-audi-s4-car-s-classic-car-5acce133933103.5498988915233764356029.png")));
		label_18.setBounds(784, 505, 168, 117);
		framebhanam.add(label_18);
		
		JLabel label_20 = new JLabel("Features: 5 Seater, Manual Gear System");
		label_20.setBounds(939, 88, 239, 30);
		framebhanam.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(carView.class.getResource("/miniproject/40444_Hyundai_Elite_I20_1-715x395.png")));
		label_21.setBounds(784, 104, 160, 92);
		framebhanam.add(label_21);
		
		JLabel label_23 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_23.setBounds(949, 114, 231, 30);
		framebhanam.add(label_23);
		
		JLabel label_25 = new JLabel("3 Baggage Capacity ");
		label_25.setBounds(954, 145, 122, 30);
		framebhanam.add(label_25);
		
		JLabel lblPriceInrday = new JLabel("PRICE: INR 899/day");
		lblPriceInrday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPriceInrday.setBounds(937, 186, 139, 14);
		framebhanam.add(lblPriceInrday);
		
		JButton button_5 = new JButton("Book");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Hyundai i20";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_5.setBackground(SystemColor.menu);
		button_5.setBounds(801, 200, 122, 24);
		framebhanam.add(button_5);
		
		JLabel label_27 = new JLabel("Hyundai i20");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_27.setBounds(801, 59, 139, 34);
		framebhanam.add(label_27);
		
		JButton button = new JButton("Book");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Ford Freestyle";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button.setBackground(SystemColor.menu);
		button.setBounds(1191, 200, 122, 24);
		framebhanam.add(button);
		
		JLabel lblPriceInrday_1 = new JLabel("PRICE: INR 949/day");
		lblPriceInrday_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPriceInrday_1.setBounds(1339, 186, 139, 14);
		framebhanam.add(lblPriceInrday_1);
		
		JLabel label_1 = new JLabel("3 Baggage Capacity ");
		label_1.setBounds(1356, 146, 122, 30);
		framebhanam.add(label_1);
		
		JLabel label_5 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_5.setBounds(1349, 114, 245, 30);
		framebhanam.add(label_5);
		
		JLabel label_7 = new JLabel("Features: 5 Seater, Manual Gear System\r\n");
		label_7.setBounds(1339, 88, 315, 30);
		framebhanam.add(label_7);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(carView.class.getResource("/miniproject/64-642033_ford-png-photo-ford-freestyle-on-road-price.png")));
		label_9.setBounds(1174, 88, 155, 102);
		framebhanam.add(label_9);
		
		JLabel label_10 = new JLabel("Ford Freestyle");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_10.setBounds(1190, 59, 139, 34);
		framebhanam.add(label_10);
		
		JButton button_6 = new JButton("Book");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			selectedCar="Mahindra KUV100";
			bookDetails bd1=new bookDetails();
			bd1.setVisible(true);
			dispose();
			}
		});
		button_6.setBackground(SystemColor.menu);
		button_6.setBounds(17, 200, 122, 24);
		framebhanam.add(button_6);
		
		JLabel lblPriceInr_2 = new JLabel("PRICE: INR 799/day");
		lblPriceInr_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPriceInr_2.setBounds(153, 186, 139, 14);
		framebhanam.add(lblPriceInr_2);
		
		JLabel label_29 = new JLabel("3 Baggage Capacity ");
		label_29.setBounds(170, 145, 122, 30);
		framebhanam.add(label_29);
		
		JLabel label_30 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_30.setBounds(161, 123, 243, 30);
		framebhanam.add(label_30);
		
		JLabel label_31 = new JLabel("Features: 5 Seater, Manual Gear System");
		label_31.setBounds(153, 95, 251, 30);
		framebhanam.add(label_31);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon(carView.class.getResource("/miniproject/PikPng.com_nxt-logo-png_2561129.png")));
		label_32.setBounds(0, 104, 160, 92);
		framebhanam.add(label_32);
		
		JLabel lblMahindraKuv = new JLabel("Mahindra KUV 100");
		lblMahindraKuv.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMahindraKuv.setBounds(10, 59, 169, 34);
		framebhanam.add(lblMahindraKuv);
		
		JButton button_7 = new JButton("Book");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Maruti Swift";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_7.setBackground(SystemColor.menu);
		button_7.setBounds(418, 200, 122, 24);
		framebhanam.add(button_7);
		
		JLabel lblPriceInr_3 = new JLabel("PRICE: INR 849/day");
		lblPriceInr_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPriceInr_3.setBounds(554, 186, 139, 14);
		framebhanam.add(lblPriceInr_3);
		
		JLabel lblBaggageCapacity = new JLabel("2 Baggage Capacity ");
		lblBaggageCapacity.setBounds(571, 145, 122, 30);
		framebhanam.add(lblBaggageCapacity);
		
		JLabel label_34 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_34.setBounds(556, 123, 239, 30);
		framebhanam.add(label_34);
		
		JLabel label_35 = new JLabel("Features: 5 Seater, Manual Gear System");
		label_35.setBounds(536, 95, 251, 30);
		framebhanam.add(label_35);
		
		JLabel label_36 = new JLabel("");
		label_36.setIcon(new ImageIcon(carView.class.getResource("/miniproject/swift.png")));
		label_36.setBounds(407, 114, 160, 92);
		framebhanam.add(label_36);
		
		JLabel lblMarutiSwift = new JLabel("Maruti Swift");
		lblMarutiSwift.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMarutiSwift.setBounds(418, 66, 139, 34);
		framebhanam.add(lblMarutiSwift);
		
		JLabel label_37 = new JLabel("");
		label_37.setIcon(new ImageIcon(carView.class.getResource("/miniproject/maraszzo.png")));
		label_37.setBounds(1191, 725, 150, 117);
		framebhanam.add(label_37);
		
		JButton button_10 = new JButton("Book");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Maruti Baleno";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_10.setBackground(SystemColor.menu);
		button_10.setBounds(10, 415, 122, 24);
		framebhanam.add(button_10);
		
		JLabel label_53 = new JLabel("PRICE: INR 949/day");
		label_53.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_53.setBounds(158, 401, 139, 14);
		framebhanam.add(label_53);
		
		JLabel lblBaggageCapacity_1 = new JLabel("4 Baggage Capacity ");
		lblBaggageCapacity_1.setBounds(175, 361, 122, 30);
		framebhanam.add(lblBaggageCapacity_1);
		
		JLabel label_55 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_55.setBounds(168, 329, 245, 30);
		framebhanam.add(label_55);
		
		JLabel label_56 = new JLabel("Features: 5 Seater, Manual Gear System\r\n");
		label_56.setBounds(158, 303, 315, 30);
		framebhanam.add(label_56);
		
		JLabel lblMarutiBaleno = new JLabel("Maruti Baleno");
		lblMarutiBaleno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMarutiBaleno.setBounds(7, 267, 139, 34);
		framebhanam.add(lblMarutiBaleno);
		
		JLabel label_58 = new JLabel("");
		label_58.setIcon(new ImageIcon(carView.class.getResource("/miniproject/baleno.png")));
		label_58.setBounds(5, 300, 155, 102);
		framebhanam.add(label_58);
		
		JButton button_11 = new JButton("Book");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Volkswogen Polo";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_11.setBackground(SystemColor.menu);
		button_11.setBounds(407, 415, 122, 24);
		framebhanam.add(button_11);
		
		JLabel label_59 = new JLabel("PRICE: INR 949/day");
		label_59.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_59.setBounds(555, 401, 139, 14);
		framebhanam.add(label_59);
		
		JLabel lblBaggageCapacity_2 = new JLabel("0 Baggage Capacity ");
		lblBaggageCapacity_2.setBounds(572, 361, 122, 30);
		framebhanam.add(lblBaggageCapacity_2);
		
		JLabel label_61 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_61.setBounds(565, 329, 245, 30);
		framebhanam.add(label_61);
		
		JLabel label_62 = new JLabel("Features: 5 Seater, Manual Gear System\r\n");
		label_62.setBounds(555, 303, 315, 30);
		framebhanam.add(label_62);
		
		JLabel lblVolkswagenPolo = new JLabel("Volkswagen Polo");
		lblVolkswagenPolo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVolkswagenPolo.setBounds(407, 267, 163, 34);
		framebhanam.add(lblVolkswagenPolo);
		
		JLabel label_64 = new JLabel("");
		label_64.setIcon(new ImageIcon(carView.class.getResource("/miniproject/polo.png")));
		label_64.setBounds(348, 300, 209, 102);
		framebhanam.add(label_64);
		
		JButton button_12 = new JButton("Book");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Mahindra TUV300";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_12.setBackground(SystemColor.menu);
		button_12.setBounds(791, 415, 122, 24);
		framebhanam.add(button_12);
		
		JLabel label_65 = new JLabel("PRICE: INR 949/day");
		label_65.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_65.setBounds(939, 401, 139, 14);
		framebhanam.add(label_65);
		
		JLabel lblBaggageCapacity_3 = new JLabel("0 Baggage Capacity ");
		lblBaggageCapacity_3.setBounds(956, 361, 122, 30);
		framebhanam.add(lblBaggageCapacity_3);
		
		JLabel label_67 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_67.setBounds(949, 329, 245, 30);
		framebhanam.add(label_67);
		
		JLabel lblFeaturesSeater = new JLabel("Features: 7 Seater, Manual Gear System\r\n");
		lblFeaturesSeater.setBounds(939, 303, 315, 30);
		framebhanam.add(lblFeaturesSeater);
		
		JLabel lblMahindraMahindraTuv = new JLabel("Mahindra TUV 300");
		lblMahindraMahindraTuv.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMahindraMahindraTuv.setBounds(791, 267, 185, 34);
		framebhanam.add(lblMahindraMahindraTuv);
		
		JLabel label_70 = new JLabel("");
		label_70.setIcon(new ImageIcon(carView.class.getResource("/miniproject/tuv300.png")));
		label_70.setBounds(760, 303, 190, 102);
		framebhanam.add(label_70);
		
		JButton button_13 = new JButton("Book");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Ford Ecosport";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_13.setBackground(SystemColor.menu);
		button_13.setBounds(1191, 402, 122, 24);
		framebhanam.add(button_13);
		
		JLabel label_71 = new JLabel("PRICE: INR 949/day");
		label_71.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_71.setBounds(1339, 388, 139, 14);
		framebhanam.add(label_71);
		
		JLabel lblBaggageCapacity_4 = new JLabel("4 Baggage Capacity ");
		lblBaggageCapacity_4.setBounds(1356, 348, 122, 30);
		framebhanam.add(lblBaggageCapacity_4);
		
		JLabel label_73 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_73.setBounds(1349, 316, 245, 30);
		framebhanam.add(label_73);
		
		JLabel label_74 = new JLabel("Features: 5 Seater, Manual Gear System\r\n");
		label_74.setBounds(1339, 290, 315, 30);
		framebhanam.add(label_74);
		
		JLabel lblFordEcosport = new JLabel("Ford Ecosport");
		lblFordEcosport.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFordEcosport.setBounds(1186, 267, 139, 34);
		framebhanam.add(lblFordEcosport);
		
		JLabel label_76 = new JLabel("");
		label_76.setIcon(new ImageIcon(carView.class.getResource("/miniproject/ecosport.png")));
		label_76.setBounds(1186, 287, 155, 102);
		framebhanam.add(label_76);
		
		JLabel label = new JLabel("Mahindra Marazzo");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(1197, 698, 169, 34);
		framebhanam.add(label);
		
		JLabel label_3 = new JLabel("Features: 7 Seater, Manual Gear System\r\n");
		label_3.setBounds(1345, 725, 315, 30);
		framebhanam.add(label_3);
		
		JLabel label_26 = new JLabel("First 60 kms free, INR 16/km after 60 km");
		label_26.setBounds(1345, 751, 235, 30);
		framebhanam.add(label_26);
		
		JLabel label_28 = new JLabel("0 Baggage Capacity ");
		label_28.setBounds(1362, 783, 122, 30);
		framebhanam.add(label_28);
		
		JLabel label_33 = new JLabel("PRICE: INR 1299/day");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_33.setBounds(1355, 832, 139, 14);
		framebhanam.add(label_33);
		
		JButton button_8 = new JButton("Book");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Mahindra Marazzo";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_8.setBackground(SystemColor.menu);
		button_8.setBounds(1197, 846, 122, 24);
		framebhanam.add(button_8);
		
		JLabel label_38 = new JLabel("");
		label_38.setIcon(new ImageIcon(carView.class.getResource("/miniproject/kicks.png")));
		label_38.setBounds(790, 725, 150, 117);
		framebhanam.add(label_38);
		
		JLabel label_39 = new JLabel("Nissan Kicks");
		label_39.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_39.setBounds(784, 698, 169, 34);
		framebhanam.add(label_39);
		
		JLabel label_40 = new JLabel("Features: 7 Seater, Manual Gear System\r\n");
		label_40.setBounds(932, 725, 315, 30);
		framebhanam.add(label_40);
		
		JLabel label_41 = new JLabel("First 60 kms free, INR 14/km after 60 km");
		label_41.setBounds(943, 751, 235, 30);
		framebhanam.add(label_41);
		
		JLabel label_42 = new JLabel("0 Baggage Capacity ");
		label_42.setBounds(949, 783, 122, 30);
		framebhanam.add(label_42);
		
		JLabel label_43 = new JLabel("PRICE: INR 1249/day");
		label_43.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_43.setBounds(942, 832, 139, 14);
		framebhanam.add(label_43);
		
		JButton button_9 = new JButton("Book");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Nissan Kicks";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_9.setBackground(SystemColor.menu);
		button_9.setBounds(795, 846, 122, 24);
		framebhanam.add(button_9);
		
		JButton button_4 = new JButton("Book");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Tata Hexa";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_4.setBackground(SystemColor.menu);
		button_4.setBounds(407, 846, 122, 24);
		framebhanam.add(button_4);
		
		JLabel label_19 = new JLabel("PRICE: INR 1199/day");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_19.setBounds(554, 824, 139, 14);
		framebhanam.add(label_19);
		
		JLabel label_50 = new JLabel("5 Baggage Capacity ");
		label_50.setBounds(554, 783, 122, 30);
		framebhanam.add(label_50);
		
		JLabel label_51 = new JLabel("First 60 kms free, INR 16/km after 60 km");
		label_51.setBounds(554, 751, 248, 30);
		framebhanam.add(label_51);
		
		JLabel label_52 = new JLabel("Features: 7 Seater, Manual Gear System\r\n");
		label_52.setBounds(539, 725, 271, 30);
		framebhanam.add(label_52);
		
		JLabel label_54 = new JLabel("Tata Hexa");
		label_54.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_54.setBounds(407, 690, 169, 34);
		framebhanam.add(label_54);
		
		JLabel label_45 = new JLabel("2 Baggage Capacity ");
		label_45.setBounds(173, 783, 122, 30);
		framebhanam.add(label_45);
		
		JLabel label_46 = new JLabel("PRICE: INR 1149/day");
		label_46.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_46.setBounds(156, 832, 139, 14);
		framebhanam.add(label_46);
		
		JButton button_3 = new JButton("Book");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Hyundai Crerta AT";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(8, 846, 122, 24);
		framebhanam.add(button_3);
		
		JLabel label_47 = new JLabel("First 60 kms free, INR 14/km after 60 km");
		label_47.setBounds(166, 751, 238, 30);
		framebhanam.add(label_47);
		
		JLabel label_48 = new JLabel("Features: 5 Seater, Automatic Gear System\r\n");
		label_48.setBounds(156, 725, 248, 30);
		framebhanam.add(label_48);
		
		JLabel label_49 = new JLabel("Hyundai Creta AT");
		label_49.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_49.setBounds(8, 690, 169, 34);
		framebhanam.add(label_49);
		
		JButton button_1 = new JButton("Book");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Mahindra XUV500";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_1.setBackground(SystemColor.menu);
		button_1.setBounds(1195, 633, 122, 24);
		framebhanam.add(button_1);
		
		JLabel label_4 = new JLabel("PRICE: INR 1105/day");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(1353, 619, 139, 14);
		framebhanam.add(label_4);
		
		JLabel label_6 = new JLabel("3 Baggage Capacity ");
		label_6.setBounds(1360, 570, 122, 30);
		framebhanam.add(label_6);
		
		JLabel label_8 = new JLabel("First 60 kms free, INR 14/km after 60 km");
		label_8.setBounds(1343, 538, 235, 30);
		framebhanam.add(label_8);
		
		JLabel label_11 = new JLabel("Features: 7 Seater, Manual Gear System\r\n");
		label_11.setBounds(1343, 512, 315, 30);
		framebhanam.add(label_11);
		
		JLabel label_12 = new JLabel("Mahindra XUV 500");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_12.setBounds(1195, 485, 169, 34);
		framebhanam.add(label_12);
		
		JLabel label_13 = new JLabel("Features: 7 Seater, Manual Gear System\r\n");
		label_13.setBounds(943, 512, 263, 30);
		framebhanam.add(label_13);
		
		JLabel label_14 = new JLabel("First 60 kms free, INR 12/km after 60 km");
		label_14.setBounds(953, 538, 253, 30);
		framebhanam.add(label_14);
		
		JLabel label_15 = new JLabel("3 Baggage Capacity ");
		label_15.setBounds(960, 570, 122, 30);
		framebhanam.add(label_15);
		
		JLabel label_17 = new JLabel("PRICE: INR 1049/24 hr");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_17.setBounds(943, 619, 139, 14);
		framebhanam.add(label_17);
		
		JButton button_2 = new JButton("Book");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Mahindra Scorpio";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(795, 633, 122, 24);
		framebhanam.add(button_2);
		
		JLabel label_44 = new JLabel("Mahindra Scorpio");
		label_44.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_44.setBounds(784, 488, 169, 34);
		framebhanam.add(label_44);
		
		JLabel lblHyundaiVerna = new JLabel("Hyundai Verna");
		lblHyundaiVerna.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHyundaiVerna.setBounds(10, 498, 139, 34);
		framebhanam.add(lblHyundaiVerna);
		
		JLabel label_60 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_60.setBounds(173, 547, 245, 30);
		framebhanam.add(label_60);
		
		JLabel label_63 = new JLabel("Features: 5 Seater, Manual Gear System\r\n");
		label_63.setBounds(163, 521, 315, 30);
		framebhanam.add(label_63);
		
		JLabel lblBaggageCapacity_5 = new JLabel("6 Baggage Capacity ");
		lblBaggageCapacity_5.setBounds(180, 579, 122, 30);
		framebhanam.add(lblBaggageCapacity_5);
		
		JLabel label_68 = new JLabel("PRICE: INR 949/day");
		label_68.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_68.setBounds(163, 619, 139, 14);
		framebhanam.add(label_68);
		
		JButton button_14 = new JButton("Book");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Hyundai Verna";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_14.setBackground(SystemColor.menu);
		button_14.setBounds(15, 633, 122, 24);
		framebhanam.add(button_14);
		
		JLabel label_69 = new JLabel("");
		label_69.setIcon(new ImageIcon(carView.class.getResource("/miniproject/verna2.png")));
		label_69.setBounds(-49, 531, 209, 102);
		framebhanam.add(label_69);
		
		JLabel lblTataNexonAt = new JLabel("Tata Nexon AT");
		lblTataNexonAt.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTataNexonAt.setBounds(401, 485, 139, 34);
		framebhanam.add(lblTataNexonAt);
		
		JLabel label_75 = new JLabel("First 60 kms free, INR 10/km after 60 km");
		label_75.setBounds(536, 547, 245, 30);
		framebhanam.add(label_75);
		
		JLabel lblFeaturesSeater_1 = new JLabel("Features: 5 Seater, Automatic Gear System\r\n");
		lblFeaturesSeater_1.setBounds(531, 516, 315, 30);
		framebhanam.add(lblFeaturesSeater_1);
		
		JLabel lblBaggageCapacity_6 = new JLabel("0 Baggage Capacity ");
		lblBaggageCapacity_6.setBounds(554, 570, 122, 30);
		framebhanam.add(lblBaggageCapacity_6);
		
		JLabel label_79 = new JLabel("PRICE: INR 949/day");
		label_79.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_79.setBounds(554, 619, 139, 14);
		framebhanam.add(label_79);
		
		JButton button_15 = new JButton("Book");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCar="Tata Nexon AT";
				bookDetails bd1=new bookDetails();
				bd1.setVisible(true);
				dispose();
			}
		});
		button_15.setBackground(SystemColor.menu);
		button_15.setBounds(412, 633, 122, 24);
		framebhanam.add(button_15);
		
		JLabel label_80 = new JLabel("");
		label_80.setIcon(new ImageIcon(carView.class.getResource("/miniproject/nexon.png")));
		label_80.setBounds(359, 531, 180, 102);
		framebhanam.add(label_80);
		
		JLabel lblAdvcanePrice = new JLabel("* advance price is same for all car variants");
		lblAdvcanePrice.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblAdvcanePrice.setBounds(1390, 23, 204, 14);
		framebhanam.add(lblAdvcanePrice);
		
		JLabel advaLbl = new JLabel("");
		advaLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		advaLbl.setBounds(10, 0, 231, 37);
		framebhanam.add(advaLbl);
		advaLbl.setText("Advance Price: INR."+carRental.advaPrice+"*");
	}
}
