package main_screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;



import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

import details_screen.Details_screen;

import javax.swing.border.BevelBorder;

public class Main_Screen {

	private JFrame frame;
	private JTextField User;
	private JTextField Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Screen window = new Main_Screen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 100, 750, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));
		lblPassword.setBounds(324, 269, 124, 25);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblBookingLogin = new JLabel("PASSENGER LOGIN");
		lblBookingLogin.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
		lblBookingLogin.setBounds(237, 11, 279, 41);
		frame.getContentPane().add(lblBookingLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 66, 414, -4);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 50, 714, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel Log_pic = new JLabel("");
		Log_pic.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 20));
		Log_pic.setBackground(Color.WHITE);
		Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		Log_pic.setIcon((Icon) new ImageIcon(img));
		
		Log_pic.setBounds(0, 138, 300, 331);
		frame.getContentPane().add(Log_pic);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setFont(new Font("Swis721 Cn BT", Font.BOLD, 20));
		lblUserName.setBounds(324, 157, 98, 25);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblL = new JLabel("l");
		lblL.setBounds(10, 507, 714, 128);
		frame.getContentPane().add(lblL);
		
		User = new JTextField();
		
		User.setBounds(442, 154, 155, 39);
		frame.getContentPane().add(User);
		User.setColumns(10);
		
		Pass = new JTextField();
		Pass.setBounds(442, 266, 155, 34);
		frame.getContentPane().add(Pass);
		Pass.setColumns(10);
		
		JButton log_but = new JButton("LOGIN");
		log_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Username =User.getText();
				String pass=Pass.getText();
				if(Username.contains("BOOM") &&pass.contains("SAFTY") )
				{
					Details_screen obj=new Details_screen();
					JOptionPane.showMessageDialog(null, "LOGIN SUCESSFULL!","AUTHENTICATED", JOptionPane.INFORMATION_MESSAGE);
					
					obj.setVisible(true);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "WRONG CREDENTIALS","ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
					User.setText(null);
					Pass.setText(null);
				}
			}
			
		});
		log_but.setBounds(324, 371, 107, 39);
		frame.getContentPane().add(log_but);
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User.setText(null);
				Pass.setText(null);
			}
		});
		reset.setBounds(459, 371, 98, 39);
		frame.getContentPane().add(reset);
		
		JButton ext = new JButton("EXIT");
		ext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "THANK YOU FOR USING THE SYSTEM!");
				System.exit(0);
			}
		});
		ext.setBounds(589, 371, 98, 39);
		frame.getContentPane().add(ext);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		panel.setBounds(306, 100, 404, 353);
		frame.getContentPane().add(panel);
		
	}
}

