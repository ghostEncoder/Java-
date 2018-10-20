package help;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 24, 366, 196);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER A DATE WITHIN 6 MONTHS");
		lblNewLabel.setBounds(10, 59, 258, 14);
		panel.add(lblNewLabel);
		
		JTextPane txtpnTheSystemIs = new JTextPane();
		txtpnTheSystemIs.setBounds(10, 11, 296, 20);
		txtpnTheSystemIs.setText("The System is intended to book a ticket");
		panel.add(txtpnTheSystemIs);
		
		JLabel lblNewLabel_1 = new JLabel("ONLY CHOOSE A SINGLE CLASS");
		lblNewLabel_1.setBounds(10, 98, 235, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AT LEAST 1 NAME ");
		lblNewLabel_2.setBounds(10, 139, 248, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CLOSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			
			}
		});
		btnNewButton.setBounds(323, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
