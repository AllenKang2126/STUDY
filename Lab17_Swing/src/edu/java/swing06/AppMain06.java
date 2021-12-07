package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain06 {

	private JFrame frame;
	private JTextField textEmail;
	private JTextField textPhone;
	private JTextField textName;
	private JButton btnInput;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
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
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelName = new JLabel("이름");
		labelName.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelName.setBounds(12, 10, 130, 50);
		frame.getContentPane().add(labelName);
		
		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelPhone.setBounds(12, 70, 130, 50);
		frame.getContentPane().add(labelPhone);
		
		JLabel labelEmail = new JLabel("E-mail");
		labelEmail.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelEmail.setBounds(12, 130, 130, 50);
		frame.getContentPane().add(labelEmail);
		
		textName = new JTextField();
		textName.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textName.setBounds(154, 10, 298, 50);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textPhone.setColumns(10);
		textPhone.setBounds(154, 70, 298, 50);
		frame.getContentPane().add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textEmail.setColumns(10);
		textEmail.setBounds(154, 130, 298, 50);
		frame.getContentPane().add(textEmail);
		
		btnInput = new JButton("입력");
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showInfo();
			}
		});
		btnInput.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnInput.setBounds(12, 190, 440, 40);
		frame.getContentPane().add(btnInput);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 22));
		textArea.setBounds(12, 240, 440, 111);
		frame.getContentPane().add(textArea);
	}  // end initialize()

	private void showInfo() {
		// 3개의 JTextField에서 이름, 전화번호, 이메일을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
//		String message = "이름 : " + name + "\n" + "전화번호 : " + phone + "\n" + "이메일 : " + email;
		StringBuffer message = new StringBuffer();  // StringBuffer 객체 생성
		message.append("이름 : ").append(name).append("\n")
		.append("전화번호 : ").append(phone).append("\n")
		.append("이메일 : ").append(email);
		
		
		textArea.setText(message.toString());
		
		// 3개의 JTextField의 내용을 모두 지움.
		ClearAllTextField();
	}

	private void ClearAllTextField() {
		textName.setText("");
		textPhone.setText("");
		textEmail.setText("");
	}
	
}  // end class()
