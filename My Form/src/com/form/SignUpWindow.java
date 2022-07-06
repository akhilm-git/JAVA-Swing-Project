package com.form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class SignUpWindow {

	private JFrame frmSignupWindow;
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField SEmailId;
	private JPasswordField SPassword;
	
	ArrayList<String> SignUpDataList=new ArrayList<>();
	
	
	

	/**
	 * Launch the application.
	 */
	public static void SignUpScreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpWindow window = new SignUpWindow();
					window.frmSignupWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public SignUpWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignupWindow = new JFrame();
		frmSignupWindow.setIconImage(Toolkit.getDefaultToolkit().getImage(SignUpWindow.class.getResource("/images/logo.png")));
		frmSignupWindow.getContentPane().setBackground(new Color(255, 245, 238));
		frmSignupWindow.getContentPane().setForeground(new Color(255, 245, 238));
		frmSignupWindow.setTitle("SignUp Window");
		frmSignupWindow.setBounds(100, 100, 569, 703);
		frmSignupWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignupWindow.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(95, 51, 351, 570);
		frmSignupWindow.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel SignUp = new JLabel("Sign Up");
		SignUp.setHorizontalAlignment(SwingConstants.CENTER);
		SignUp.setFont(new Font("Tahoma", Font.PLAIN, 22));
		SignUp.setBounds(88, 38, 171, 57);
		panel.add(SignUp);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(88, 118, 171, 45);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		FirstName = new JTextField();
		FirstName.setToolTipText("First Name");
		FirstName.setBounds(10, 11, 151, 23);
		panel_1.add(FirstName);
		FirstName.setColumns(10);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(88, 202, 171, 45);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		LastName = new JTextField();
		LastName.setToolTipText("Last Name");
		LastName.setColumns(10);
		LastName.setBounds(10, 11, 151, 23);
		panel_2.add(LastName);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(88, 286, 171, 45);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		SEmailId = new JTextField();
		SEmailId.setToolTipText("Email Id");
		SEmailId.setColumns(10);
		SEmailId.setBounds(10, 11, 151, 23);
		panel_3.add(SEmailId);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(88, 374, 171, 45);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		SPassword = new JPasswordField();
		SPassword.setToolTipText("Password");
		SPassword.setBounds(10, 11, 151, 23);
		panel_4.add(SPassword);
		
		
		JButton SignUpButton = new JButton("Sign Up");
		SignUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpDataList.add(FirstName.getText());
				SignUpDataList.add(LastName.getText());
				SignUpDataList.add(SEmailId.getText());
//				data.add(Password.getPassword().toString());
				SignUpDataList.add(SPassword.getText());
				MyDatabase.SignUpwindow(SignUpDataList);
				JOptionPane.showMessageDialog(null,"Details saved");
				
				
			}
		});
		SignUpButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SignUpButton.setBounds(118, 471, 121, 38);
		panel.add(SignUpButton);
		
//		SignUpButton.addActionListener(null)
	}

	
}
