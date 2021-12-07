package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 {

	private JFrame frame;
	private JTextField idField;
	private JPasswordField passwordField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelId = new JLabel("아이디");
		labelId.setHorizontalAlignment(SwingConstants.CENTER);
		labelId.setFont(new Font("D2Coding", Font.PLAIN, 32));
		labelId.setBounds(12, 10, 160, 70);
		frame.getContentPane().add(labelId);
		
		JLabel labelPw = new JLabel("비밀번호");
		labelPw.setHorizontalAlignment(SwingConstants.CENTER);
		labelPw.setFont(new Font("D2Coding", Font.PLAIN, 32));
		labelPw.setBounds(12, 90, 160, 70);
		frame.getContentPane().add(labelPw);
		
		idField = new JTextField();
		idField.setFont(new Font("D2Coding", Font.BOLD, 28));
		idField.setBounds(184, 10, 268, 70);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("D2Coding", Font.BOLD, 28));
		passwordField.setBounds(184, 90, 268, 70);
		frame.getContentPane().add(passwordField);
		
		JButton btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRegister();
			}
		});
		btnConfirm.setFont(new Font("바탕", Font.BOLD, 30));
		btnConfirm.setBounds(12, 170, 440, 54);
		frame.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textArea.setBounds(12, 235, 440, 186);
		frame.getContentPane().add(textArea);
	}

	private void showRegister() {
		String id = idField.getText();
		char[] pw = passwordField.getPassword();
		StringBuffer result = new StringBuffer();
		result.append("아이디 : ").append(id).append("\n").append("비밀번호 : ").append(pw);
		textArea.setText(result.toString());
		
		
	}
}
