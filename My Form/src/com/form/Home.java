package com.form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("Home Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 443);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Welcome = new JLabel("Welcome");
		Welcome.setHorizontalAlignment(SwingConstants.CENTER);
		Welcome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Welcome.setBounds(193, 38, 205, 63);
		contentPane.add(Welcome);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(129, 152, 318, 175);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton HLogInButton = new JButton("Log In");
		HLogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInWindow nw=new LogInWindow();
				nw.LogInScreen();
			}
		});
		HLogInButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HLogInButton.setBounds(10, 74, 128, 45);
		panel.add(HLogInButton);
		
		JButton SignUpButton = new JButton("Sign Up");
		SignUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpWindow sw=new SignUpWindow();
				sw.SignUpScreen();
				}
		});
		SignUpButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SignUpButton.setBounds(180, 74, 128, 45);
		panel.add(SignUpButton);
	}

}
