package details_screen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

import billing.Billing;
import calan.Calan;
import help.Help;

import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.Random;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Details_screen extends JFrame {

	private JPanel contentPane;
	private JTextField day;
	private JTextField yer;
	private JTextField mon;
	private JComboBox to;
	private JTextField pass1;
	private JTextField pass2;
	private JTextField pass3;
	private JTextField pass1_a;
	private JTextField pass2_a;
	private JTextField pass3_a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details_screen frame = new Details_screen();
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
	public Details_screen() {
		
		 
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookingScreen = new JLabel("BOOKING SCREEN");
		lblBookingScreen.setBackground(new Color(240, 240, 240));
		lblBookingScreen.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 28));
		lblBookingScreen.setBounds(299, 25, 220, 38);
		contentPane.add(lblBookingScreen);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(195, 74, 388, 2);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(22, 111, 202, 182);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		lblClass.setBounds(76, 11, 48, 24);
		panel.add(lblClass);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 33, 159, 2);
		panel.add(separator_2);
		
		JRadioButton eco = new JRadioButton("ECONOMY");
		eco.setBounds(15, 61, 109, 23);
		panel.add(eco);
		
		JRadioButton buis = new JRadioButton("BUISNESS");
		buis.setBounds(15, 98, 109, 23);
		panel.add(buis);
		
		JRadioButton frst = new JRadioButton("FIRST");
		frst.setBounds(15, 135, 109, 23);
		panel.add(frst);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/train.png")).getImage();
		 lblNewLabel.setIcon((Icon) new ImageIcon(img));
		lblNewLabel.setBounds(563, 0, 271, 274);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(234, 111, 285, 182);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDestination = new JLabel("DESTINATION");
		lblDestination.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		lblDestination.setBounds(91, 11, 104, 24);
		panel_1.add(lblDestination);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(63, 33, 159, 2);
		panel_1.add(separator_1);
		
		JComboBox from = new JComboBox();
		from.setModel(new DefaultComboBoxModel(new String[] {"Mumbai\t", "Delhi\t", "Ahmedabad\t", "Goa\t"}));
		from.setBounds(83, 71, 112, 24);
		panel_1.add(from);
		
		to = new JComboBox();
		to.setModel(new DefaultComboBoxModel(new String[] {"Goa\t", "Mumbai\t", "Delhi\t", "Ahmedabad\t"}));
		to.setBounds(83, 122, 112, 24);
		panel_1.add(to);
		
		JLabel lblNewLabel_1 = new JLabel("FROM");
		lblNewLabel_1.setBounds(27, 76, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setBounds(27, 127, 46, 14);
		panel_1.add(lblTo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(22, 338, 318, 300);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDateAndTime = new JLabel("DATE ");
		lblDateAndTime.setBounds(148, 11, 52, 24);
		lblDateAndTime.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		panel_2.add(lblDateAndTime);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(84, 33, 159, 2);
		panel_2.add(separator_3);
		
		day = new JTextField();
		day.setBounds(66, 59, 86, 17);
		panel_2.add(day);
		day.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DAY");
		lblNewLabel_2.setBounds(10, 62, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("YEAR");
		lblNewLabel_3.setBounds(10, 174, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		yer = new JTextField();
		yer.setColumns(10);
		yer.setBounds(66, 171, 86, 20);
		panel_2.add(yer);
		
		JLabel lblDay = new JLabel("MONTH");
		lblDay.setBounds(10, 119, 46, 14);
		panel_2.add(lblDay);
		
		mon = new JTextField();
		mon.setColumns(10);
		mon.setBounds(66, 116, 86, 20);
		panel_2.add(mon);
		
		JButton rest = new JButton("RESET");
		rest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mon.setText(null);
				yer.setText(null);
				day.setText(null);
			}
		});
		rest.setBounds(203, 170, 89, 23);
		panel_2.add(rest);
		
		JLabel lblNotebookingsCanOnly = new JLabel("Note:(bookings can only be made upto six months in advance)");
		lblNotebookingsCanOnly.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNotebookingsCanOnly.setBounds(10, 236, 298, 14);
		panel_2.add(lblNotebookingsCanOnly);
		
		JButton Hlp_but = new JButton("HELP");
		Hlp_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Help obj4=new Help();
				obj4.setVisible(true);
			}
		});
		Hlp_but.setBounds(99, 266, 89, 23);
		panel_2.add(Hlp_but);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(350, 338, 453, 300);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("TRAVALLERS DETAILS");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(118, 24, 203, 30);
		panel_3.add(lblNewLabel_4);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(72, 65, 320, 2);
		panel_3.add(separator_4);
		
		JLabel lblNewLabel_5 = new JLabel("PASSENGER 1");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_5.setBounds(20, 118, 67, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblPassenger = new JLabel("PASSENGER 2");
		lblPassenger.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPassenger.setBounds(20, 161, 67, 14);
		panel_3.add(lblPassenger);
		
		JLabel lblPassenger_1 = new JLabel("PASSENGER 3");
		lblPassenger_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPassenger_1.setBounds(20, 207, 67, 14);
		panel_3.add(lblPassenger_1);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(142, 92, 46, 14);
		panel_3.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAge.setBounds(260, 92, 46, 14);
		panel_3.add(lblAge);
		
		JCheckBox ch1 = new JCheckBox("Child");
		ch1.setBounds(350, 118, 97, 23);
		panel_3.add(ch1);
		
		JCheckBox ch2 = new JCheckBox("Child");
		ch2.setBounds(350, 157, 97, 23);
		panel_3.add(ch2);
		
		JCheckBox ch3 = new JCheckBox("Child");
		ch3.setBounds(350, 203, 97, 23);
		panel_3.add(ch3);
		
		pass1 = new JTextField();
		pass1.setColumns(10);
		pass1.setBounds(118, 115, 86, 20);
		panel_3.add(pass1);
		
		pass2 = new JTextField();
		pass2.setColumns(10);
		pass2.setBounds(118, 158, 86, 20);
		panel_3.add(pass2);
		
		pass3 = new JTextField();
		pass3.setColumns(10);
		pass3.setBounds(118, 204, 86, 20);
		panel_3.add(pass3);
		
		pass1_a = new JTextField();
		pass1_a.setColumns(10);
		pass1_a.setBounds(235, 115, 86, 20);
		panel_3.add(pass1_a);
		
		pass2_a = new JTextField();
		pass2_a.setColumns(10);
		pass2_a.setBounds(235, 155, 86, 20);
		panel_3.add(pass2_a);
		
		pass3_a = new JTextField();
		pass3_a.setColumns(10);
		pass3_a.setBounds(235, 204, 86, 20);
		panel_3.add(pass3_a);
		
		JButton trav_sub = new JButton("SUBMIT");
		trav_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fl=0;
				String n1,n2,n3,a1,a2,a3;
				String fr,whr;
				n1=pass1.getText();
				n2=pass2.getText();
				n3=pass3.getText();
				a1=pass1_a.getText();
				a2=pass2_a.getText();
				a3=pass3_a.getText();
				fr=to.getSelectedItem().toString();
				whr=from.getSelectedItem().toString();
				boolean chld1=ch1.isSelected();
				boolean chld2=ch2.isSelected();
				boolean chld3=ch3.isSelected();
				boolean cls1=eco.isSelected();
				boolean cls2=buis.isSelected();
				boolean cls3=frst.isSelected();
				int check1=fr.compareTo(whr);
				String month;
				String year,date;
				date=day.getText();
				year=yer.getText();
				month=mon.getText();
				int m=Integer.parseInt(month);
				int dat=Integer.parseInt(date);
				
				date=day.getText();
				Boolean check;
				check=year.equals("2017");
				
				//checking for date errors
								if(check==false||dat>31||m>12)
				{
									fl=1;
									JOptionPane.showMessageDialog(null, "WRONG TIME OF TRAVEL","ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
					
					mon.setText(null);
					yer.setText(null);
					day.setText(null);
				}
								//checking for destination errors
		if(check1==0)
		{ 
			fl++;
			JOptionPane.showMessageDialog(null, "DESTINAION CANNOT BE SAME AS ARRIVAL","ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
		}
		if(cls1==true&&cls2==true||cls1==true&&cls3==true||cls2==true&&cls3==true)
		{ fl++;
		JOptionPane.showMessageDialog(null, "MULTIPLE CLASSES BOOKED","ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
		
		}
		if(cls1==false&&cls2==false&&cls3==false){
			fl++;
			JOptionPane.showMessageDialog(null, "NO CLASSES BOOKED","ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
		}
		
		else
		if(fl==0)
		{
		
			Billing obj2=new Billing();
			
			obj2.getAge(a1, a2, a3);
			obj2.getfinClas(cls1,cls2,cls3);
			
			obj2.getDesti( whr,fr);
			obj2.getName(n1,n2,n3);
			obj2.setVisible(true);
			dispose();
		}
			}
			
		});
		trav_sub.setBounds(115, 254, 89, 23);
		panel_3.add(trav_sub);
		
		JButton trav_reset = new JButton("RESET");
		trav_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pass1.setText(null);
				pass2.setText(null);
				pass3.setText(null);
				pass1_a.setText(null);
				pass2_a.setText(null);
				pass3_a.setText(null);
			}
		});
		trav_reset.setBounds(235, 254, 89, 23);
		panel_3.add(trav_reset);
	}
}
