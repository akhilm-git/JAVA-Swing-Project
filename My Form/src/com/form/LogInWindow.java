package com.form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogInWindow {

	private JFrame frmLoginWindow;
	protected static JTextField LEmailId;
	protected static JPasswordField LPassword;

	/**
	 * Launch the application.
	 */
	public static void LogInScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInWindow window = new LogInWindow();
					window.frmLoginWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmLoginWindow = new JFrame();
		frmLoginWindow.getContentPane().setBackground(new Color(255, 245, 238));
		frmLoginWindow.setIconImage(Toolkit.getDefaultToolkit().getImage(LogInWindow.class.getResource("/images/logo.png")));
		frmLoginWindow.setTitle("LogIn Window");
		frmLoginWindow.setBounds(100, 100, 466, 530);
		frmLoginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginWindow.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(93, 38, 282, 421);
		frmLoginWindow.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LogIn = new JLabel("Log In");
		LogIn.setHorizontalAlignment(SwingConstants.CENTER);
		LogIn.setFont(new Font("Tahoma", Font.PLAIN, 22));
		LogIn.setBounds(54, 39, 171, 57);
		panel.add(LogIn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(54, 123, 171, 45);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		LEmailId = new JTextField();
		LEmailId.setToolTipText("Email Id");
		LEmailId.setBounds(10, 11, 151, 23);
		panel_1.add(LEmailId);
		LEmailId.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(54, 237, 171, 45);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		LPassword = new JPasswordField();
		LPassword.setToolTipText("Password");
		LPassword.setBounds(10, 11, 151, 23);
		panel_2.add(LPassword);
		
		JButton LogInButton = new JButton("Log In");
		LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MyDatabase.verify(LEmailId.getText(),LPassword.getText())) {
					JOptionPane.showMessageDialog(null, "LogIn Successful");
				}
				else {
					JOptionPane.showMessageDialog(null, "Wrong emaild and password");
				}
				
			}
		});
//		LogInButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(EmailId.getText().equals(MyDatabase.ei) && Password.getText().equals(MyDatabase.ps)) {
//					JOptionPane.showMessageDialog(null, "LogIn Successful");
//					}
//				else {
//					JOptionPane.showMessageDialog(null, "Wrong emaild and password");
//				}
//				
//			}
//		});
//		LogInButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				FinalWindow fw=new FinalWindow();
//				fw.FinalScreen();
//			}
//		});
//		LogInButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			if(EmailId.getText().equals(MyDatabase.ei) && Password.getText().equals(MyDatabase.ps)) {
//				JOptionPane.showMessageDialog(null, "LogIn Successful");
//				}
//			else {
//				JOptionPane.showMessageDialog(null, "Wrong Emaild and password");
//			}
//			}
//		});
		LogInButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LogInButton.setBounds(79, 352, 121, 38);
		panel.add(LogInButton);
	}
}
