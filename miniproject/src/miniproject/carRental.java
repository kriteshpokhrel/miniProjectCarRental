package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class carRental extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static String startYear1,startMonth1,startDay1,fullStartDate;			//start date all
	public static String endYear1,endMonth1,endDay1,fullEndDate;				//end date all
	public static int startYearInt, startMonthInt,startDayInt,endYearInt,endMonthInt,endDayInt; ///int conversion
	public static int bookDays,advaPrice;
	public static String citySelect1, locSelect1,advaPriceStr;
	private JTextField locSelect;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carRental frame = new carRental();
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
	public carRental() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please choose the corresponding dates");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 0, 339, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Select");
		
		btnNewButton.setBounds(2102, 68, 89, 26);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Select");
	
		button.setBounds(295, 196, 89, 22);
		contentPane.add(button);


		final JComboBox<String> startDay = new JComboBox<String>();
		startDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			startDay1= startDay.getSelectedItem().toString();
			//startday
			startDay1=startDay.getSelectedItem().toString();
			startDayInt= Integer.parseInt(startDay1);
			}
		});
		startDay.setBounds(156, 71, 40, 20);
		contentPane.add(startDay);
		startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
			

		final JComboBox<String> startMonth = new JComboBox<String>();
		startMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		
		startMonth.setBounds(117, 71, 37, 20);
		contentPane.add(startMonth);

		startMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			startMonth1=startMonth.getSelectedItem().toString();
			//startmonth
			startMonth1=startMonth.getSelectedItem().toString();
			startMonthInt= Integer.parseInt(startMonth1);
		
			if(startMonth1.equals("1"))
			{

				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
			}
			else if(startMonth1.equals("2"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));				
			}
			else if(startMonth1.equals("3"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(startMonth1.equals("4"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(startMonth1.equals("5"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(startMonth1.equals("6"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(startMonth1.equals("7"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(startMonth1.equals("8"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(startMonth1.equals("9"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(startMonth1.equals("10"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(startMonth1.equals("11"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(startMonth1.equals("12"))
			{
				startDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			}
		});
		
		final JComboBox<String> endDay = new JComboBox<String>();
		endDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    endDay1= endDay.getSelectedItem().toString();
			//endday
			endDay1=endDay.getSelectedItem().toString();
			endDayInt= Integer.parseInt(endDay1);
			
			
			///day check start
			if(startYearInt==endYearInt)
			{
			if(startMonthInt==endMonthInt)
			{
				if(startDayInt>=endDayInt)
				//warning for month mistake
				JOptionPane.showMessageDialog(null, "Please choose the day field correctly!");
			}
			}
			}
		});
		endDay.setBounds(156, 123, 40, 20);
		contentPane.add(endDay);
		endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		

		
		final JComboBox<String> endMonth = new JComboBox<String>();
		endMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		endMonth.setBounds(117, 123, 37, 20);
		contentPane.add(endMonth);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(100, 46, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblTo = new JLabel("Till");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTo.setBounds(100, 102, 46, 14);
		contentPane.add(lblTo);
		
		final JComboBox startYear = new JComboBox();
		startYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//startyear 
			startYear1=startYear.getSelectedItem().toString();
			startYearInt= Integer.parseInt(startYear1);
		
			}
		});
		startYear.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024"}));
		startYear.setBounds(55, 71, 61, 20);
		contentPane.add(startYear);
		
		final JComboBox endYear = new JComboBox();
		endYear.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024"}));
		endYear.setBounds(55, 123, 61, 20);
		contentPane.add(endYear);
		
	
		endYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//endyear
				endYear1=endYear.getSelectedItem().toString();
				endYearInt= Integer.parseInt(endYear1);
				
				
				if(startYearInt>endYearInt)
				{
					//warning for year mistake
					JOptionPane.showMessageDialog(null, "Please choose the year field correctly!");
				}
				else if(((endYearInt-startYearInt)>1)|((endYearInt-startYearInt)==1&((endMonthInt-startMonthInt)>1)))
				{
					JOptionPane.showMessageDialog(null, "Maximum booking duration is one year!");
				}
				//endyear 
			}
		});
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(carRental.class.getResource("/miniproject/calendar.png")));
		lblNewLabel_1.setBounds(262, 31, 150, 144);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tell us your startiing point");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 157, 253, 18);
		contentPane.add(lblNewLabel_2);
		
		final JComboBox citySelect = new JComboBox();
		citySelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				citySelect1=citySelect.getSelectedItem().toString();
			}
		});
		citySelect.setModel(new DefaultComboBoxModel(new String[] {"Ahmedabad", "Bangalore", "Chandigath", "Chennai", "Delhi NCR", "Guwahati", "Hyderabad", "Indore", "Jaipur", "Jodhpur", "Kolkata", "Lucknow", "Manglore", "Mumbai", "Mysore", "Nagpur", "Patna", "Pune", "Raipur", "Ranchi", "Silguri", "Udaipur", "Vijayawada", "Mangalore", "", ""}));
		citySelect.setBounds(13, 197, 98, 20);
		contentPane.add(citySelect);
		
		locSelect = new JTextField();
		locSelect.setBounds(115, 197, 140, 20);
		contentPane.add(locSelect);
		locSelect.setColumns(10);
		endMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			endMonth1=endMonth.getSelectedItem().toString();
			//endmonth
			endMonth1=endMonth.getSelectedItem().toString();
			endMonthInt= Integer.parseInt(endMonth1);
			
			///check start
			if(startYearInt==endYearInt)
			{
			if(startMonthInt>endMonthInt)
			{
				//warning for month mistake
				JOptionPane.showMessageDialog(null, "Please choose the month field correctly!");
			}
			}
			
			//checkend
			if(endMonth1.equals("1"))
			{

				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
			}
			else if(endMonth1.equals("2"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));				
			}
			else if(endMonth1.equals("3"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(endMonth1.equals("4"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(endMonth1.equals("5"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(endMonth1.equals("6"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(endMonth1.equals("7"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(endMonth1.equals("8"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(endMonth1.equals("9"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(endMonth1.equals("10"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			else if(endMonth1.equals("11"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));				
			}
			else if(endMonth1.equals("12"))
			{
				endDay.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));				
			}
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locSelect1=locSelect.getText().toString();
			if(startYear1 == null|endYear1==null|endDay1==null|startDay1==null|startMonth1==null|endMonth1==null)
			{
				JOptionPane.showMessageDialog(null, "Please select all the fields!");      
			}
			else
			{
				//setting full dates
				fullStartDate= startDay1+"/"+startMonth1+"/"+startYear1;
				fullEndDate= endDay1+"/"+endMonth1+"/"+endYear1;
			////ratecalc
				if(startYearInt==endYearInt)
				{
				 bookDays=((endMonthInt-startMonthInt-1)*30)+endDayInt+(30-startDayInt);
				}
				else
				{	//for different years
					bookDays=((12-startMonthInt)+endMonthInt-1)*30+endDayInt+(30-startDayInt);
				}
				
				int conf=JOptionPane.showConfirmDialog(null, "Booking will be made from "+startYear1+"/"+startMonth1+"/"+startDay1+" to "+endYear1+"/"+endMonth1+ "/" + endDay1,"Confirm your booking date!", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE );
				
				if(conf==0)
				{
					advaPrice=bookDays*450;
					advaPriceStr=Integer.toString(advaPrice);
				carView carviu=new carView();
				carviu.setVisible(true);
				dispose();
				}
				else
				{
					carRental carRent2=new carRental();
					carRent2.setVisible(true); 
					dispose();
				}
			}
			}
				});
		
	}
}
