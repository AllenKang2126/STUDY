package edu.java.contact.ver05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertNewContactFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void showInsertNewContactFrame() {
		InsertNewContactFrame frame = new InsertNewContactFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public InsertNewContactFrame() {
		initialize();
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelName = new JLabel("이름");
		labelName.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setBounds(12, 10, 130, 40);
		contentPane.add(labelName);
		
		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setHorizontalAlignment(SwingConstants.CENTER);
		labelPhone.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelPhone.setBounds(12, 60, 130, 40);
		contentPane.add(labelPhone);
		
		JLabel labelEmail = new JLabel("이름");
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelEmail.setBounds(12, 110, 130, 40);
		contentPane.add(labelEmail);
		
		textName = new JTextField();
		textName.setFont(new Font("D2Coding", Font.PLAIN, 20));
		textName.setBounds(154, 10, 268, 40);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("D2Coding", Font.PLAIN, 20));
		textPhone.setColumns(10);
		textPhone.setBounds(154, 60, 268, 40);
		contentPane.add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("D2Coding", Font.PLAIN, 20));
		textEmail.setColumns(10);
		textEmail.setBounds(154, 110, 268, 40);
		contentPane.add(textEmail);
		
		JButton btnInsertContact = new JButton("연락처 추가");
		btnInsertContact.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnInsertContact.setFont(new Font("D2Coding", Font.BOLD, 30));
		btnInsertContact.setBounds(12, 160, 268, 40);
		contentPane.add(btnInsertContact);
	}

}
