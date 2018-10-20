package billing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
public class Billing extends JFrame {

	public JPanel contentPane;
	private JTextField p1;
	private JTextField p2;
	private JTextField p3;
	private static JTextField clsa;
	private static JTextField dest;
	private static JTextField frm;
	private JTextField a1;
	private JTextField a2;
	private JTextField a3;
	private JTextField s1;
	private static JTextField s2;
	private static JTextField s3;
	private static JTextField pers;
	private static JTextField tots;
	private static JTextField tax;
	private static  JTextField final_bill;
	private static JTextField no;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	
	 public void getName(String pas1,String pas2,String pas3)
	 {
		 int count=0,l1,l2,l3;
		String pas11,pas22,pas33;
		
		p1.setText(pas1);
		p2.setText(pas2);
		p3.setText(pas3);
		pas11=p1.getText();
		pas22=p2.getText();
		
		pas33=p3.getText();
		l1=pas11.length();
		l2=pas22.length();
				l3=pas33.length();
		if(pas22.contains("")&&pas33.contains(""))
		{
			count=1;
		}
		if(l1!=0&&l2!=0)
		{
			count=2;
		}
		if(l3!=0)
		{
			count=3;
		}
	passcount(count);
	 }
		
public static void passcount(int k)
{
	String n123;
	n123=Integer.toString(k);
	no.setText(n123);
	bil(k);
}
	 public void getDesti(String f,String d)
	 {
		 dest.setText(d);
		 frm.setText(f);
		 
	 }
	 	 public void getAge(String age1,String age2,String age3)
	 { String q1,q2,q3;
	 q1=age1;
	 q2=age2;
	 q3=age3;
		 a1.setText(q1);
	 a2.setText(q2);
	 a3.setText(q3);
	
	 }
	 public void getfinClas(boolean a,boolean b,boolean c)
	 {
		
		if(a==true)
		{
			
			clsa.setText(" ECNOMY");
		}
		else 
			if(b==true)
			{
				
				clsa.setText(" BUISNESS");
			}
			else 
				if(c==true)
				{
				clsa.setText(" FIRST");
		
	 }
		
	 }
public static void bil(int k1)
	 
	 {
	int c=0;
	String f1,g1,cl;
	f1=frm.getText();
g1=dest.getText();
cl=clsa.getText();
if(k1==2)
{
	int ran1= (int)(45*Math.random());
	String t1=Integer.toString(ran1);
	s2.setText(t1+"B");
}
if(k1==3)
{
	int ran1= (int)(45*Math.random());
	String t1=Integer.toString(ran1);
	s2.setText(t1+"B");
	int ran=(int)( 45+Math.random());
	String t=Integer.toString(ran);
	s3.setText(t+"A");
}
if(f1.contains("Mumbai")&&g1.contains("Goa")||g1.contains("Ahmedabad")||g1.contains("Delhi"))
{
	if(cl.contains(" ECNOMY"))
	{
		c=1000;
		pers.setText("1000");
	}
	if(cl.contains(" BUISNESS" ))
	{c=1500;
		pers.setText("1500");
	}
	if(cl.contains(" FIRST" ))
	{
		c=2500;
		pers.setText("2500");
	}
}
if(f1.contains("Delhi")&&g1.contains("Mumbai")||g1.contains("Ahmedabad")||g1.contains("Chennai")||g1.contains("Goa"))
{

	if(cl.contains(" ECNOMY"))
	{
		c=1500;
		pers.setText("1500");
	}
	if(cl.contains(" BUISNESS" ))
	{c=3000;
		pers.setText("3000");
	}
	if(cl.contains(" FIRST" ))
	{c=5000;
		pers.setText("5000");
	}
}
if(f1.contains("Chennai")&&g1.contains("Mumbai")||g1.contains("Ahmedabad")||g1.contains("Delhi")||g1.contains("Goa"))
{

	if(cl.contains(" ECNOMY"))
	{
		c=1530;
		pers.setText("1530");
	}
	if(cl.contains(" BUISNESS" ))
	{c=3300;
		pers.setText("3300");
	}
	if(cl.contains(" FIRST" ))
	{c=5300;
		pers.setText("5300");
	}
	if(f1.contains("Goa")&&g1.contains("Mumbai")||g1.contains("Ahmedabad")||g1.contains("Chennai")||g1.contains("Delhi"))
	{

		if(cl.contains(" ECNOMY"))
		{
			c=1300;
			pers.setText("1300");
		}
		if(cl.contains(" BUISNESS" ))
		{c=3200;
			pers.setText("3200");
		}
		if(cl.contains(" FIRST" ))
		{c=5100;
			pers.setText("5100");
		}
		
	}
}

int calc,total,totals;
calc=c*k1*18/100;
total=c*k1;
totals=calc+total;
String tot1,tot2;
tot2=Integer.toString(totals);
tot1=Integer.toString(total);
String tax1=Integer.toString(calc);
tax.setText(tax1);
tots.setText(tot1);
final_bill.setText(tot2);
	 }
	
	public Billing() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 950, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 122, 470, 503);
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BASIC INFO");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(156, 16, 179, 31);
		panel.add(lblNewLabel_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(106, 45, 244, 2);
		panel.add(separator_2);
		
		JLabel lblPassenger_1 = new JLabel("PASSENGER 3");
		lblPassenger_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblPassenger_1.setBounds(49, 251, 67, 14);
		panel.add(lblPassenger_1);
		
		JLabel lblPassenger_2 = new JLabel("CLASS");
		lblPassenger_2.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblPassenger_2.setBounds(47, 309, 31, 14);
		panel.add(lblPassenger_2);
		
		JLabel lblPassenger_3 = new JLabel("DESTINATION");
		lblPassenger_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblPassenger_3.setBounds(46, 361, 69, 15);
		panel.add(lblPassenger_3);
		
		JLabel lblFrom = new JLabel("FROM");
		lblFrom.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblFrom.setBounds(50, 420, 29, 14);
		panel.add(lblFrom);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblName.setBounds(178, 70, 46, 14);
		panel.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblAge.setBounds(289, 70, 46, 14);
		panel.add(lblAge);
		
		JLabel lblPassenger = new JLabel("PASSENGER 2");
		lblPassenger.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblPassenger.setBounds(49, 183, 67, 14);
		panel.add(lblPassenger);
		
		JLabel lblNewLabel_4 = new JLabel("SEAT NO");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(381, 70, 46, 14);
		panel.add(lblNewLabel_4);
		
		p1 = new JTextField();
		p1.setColumns(10);
		p1.setBounds(161, 122, 86, 20);
		panel.add(p1);
		
		
		p2 = new JTextField();
		p2.setColumns(10);
		p2.setBounds(161, 181, 86, 20);
		panel.add(p2);
		
		p3 = new JTextField();
		p3.setColumns(10);
		p3.setBounds(161, 249, 86, 20);
		panel.add(p3);
		
		clsa = new JTextField();
		clsa.setColumns(10);
		clsa.setBounds(150, 307, 97, 16);
		panel.add(clsa);
		
		dest = new JTextField();
		dest.setColumns(10);
		dest.setBounds(150, 359, 97, 20);
		panel.add(dest);
		
		frm = new JTextField();
		frm.setColumns(10);
		frm.setBounds(150, 418, 97, 20);
		panel.add(frm);
		
		JLabel lblPassenger_4 = new JLabel("PASSENGER 1");
		lblPassenger_4.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblPassenger_4.setBounds(49, 124, 67, 14);
		panel.add(lblPassenger_4);
		
		a1 = new JTextField();
		a1.setColumns(10);
		a1.setBounds(264, 122, 86, 20);
		panel.add(a1);
		
		a2 = new JTextField();
		a2.setColumns(10);
		a2.setBounds(264, 181, 86, 20);
		panel.add(a2);
		
		a3 = new JTextField();
		a3.setColumns(10);
		a3.setBounds(264, 249, 86, 20);
		panel.add(a3);
		
		s1 = new JTextField();
		
				int ran2=(int)(45*Math.random());
				String t2=Integer.toString(ran2);
				s1.setText(t2+"C");
		
		s1.setColumns(10);
		s1.setBounds(362, 122, 86, 20);
		panel.add(s1);
		
		s2 = new JTextField();
		
		
		
				
			
		
		s2.setColumns(10);
		s2.setBounds(362, 181, 86, 20);
		panel.add(s2);
		
		s3 = new JTextField();
		
				
				
			
		
		s3.setColumns(10);
		s3.setBounds(362, 249, 86, 20);
		panel.add(s3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(31, 284, 417, 2);
		panel.add(separator_3);
		
		JLabel lblNewLabel = new JLabel("          TICKET MEMO");
		lblNewLabel.setBounds(320, -16, 287, 73);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 26));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(157, 40, 535, 2);
		contentPane.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(490, 122, 392, 503);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("COST");
		lblNewLabel_1.setBounds(166, 28, 55, 31);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 23));
		panel_1.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(70, 58, 254, 2);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("COST PER SEAT");
		lblNewLabel_3.setBounds(52, 158, 76, 15);
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblTotalSeatCost = new JLabel("TOTAL SEAT COST");
		lblTotalSeatCost.setBounds(52, 253, 90, 15);
		lblTotalSeatCost.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		panel_1.add(lblTotalSeatCost);
		
		JLabel lblTax = new JLabel("TAX (GST)");
		lblTax.setBounds(60, 323, 47, 15);
		lblTax.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		panel_1.add(lblTax);
		
		pers = new JTextField();
		pers.setBounds(177, 156, 86, 20);
		pers.setColumns(10);
		panel_1.add(pers);
		
		tots = new JTextField();
		tots.setBounds(177, 251, 86, 20);
		tots.setColumns(10);
		
		panel_1.add(tots);
		
		tax = new JTextField();
		tax.setBounds(177, 321, 86, 20);
		tax.setColumns(10);
		panel_1.add(tax);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(70, 367, 283, 2);
		panel_1.add(separator_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(57, 414, 296, 60);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setBounds(31, 22, 41, 20);
		panel_2.add(lblTotal);
		lblTotal.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
		
		final_bill = new JTextField();
		final_bill.setBounds(161, 20, 86, 20);
		panel_2.add(final_bill);
		final_bill.setColumns(10);
		
		JLabel lblNoOfPassengers = new JLabel("NO OF PASSENGERS");
		lblNoOfPassengers.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		lblNoOfPassengers.setBounds(52, 209, 99, 15);
		panel_1.add(lblNoOfPassengers);
		
		no = new JTextField();
		no.setColumns(10);
		no.setBounds(177, 207, 86, 20);
		panel_1.add(no);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "HAVE A SAFE TRIP!");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(592, 660, 236, 40);
		contentPane.add(btnNewButton);
		
		
	}
}
