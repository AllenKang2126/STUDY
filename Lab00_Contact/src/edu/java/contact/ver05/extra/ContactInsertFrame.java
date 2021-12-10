package edu.java.contact.ver05.extra;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.contact.model.Contact;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactInsertFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	
	private Component parentComponent;  // 부모 컴포넌트 참조값을 저장하기 위한 변수
	private ContactMain05 mainApp;  // 메인 화면(ContactMain05) 객체의 참조값을 저장하기 위한 변수

	/**
	 * Launch the application.
	 */
	public static void showFrame(Component parentComponent, ContactMain05 mainApp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactInsertFrame frame = new ContactInsertFrame(parentComponent, mainApp);
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
	public ContactInsertFrame(Component parentComponent, ContactMain05 mainApp) {
		this.parentComponent = parentComponent;
		this.mainApp = mainApp;
		initialize();
	}

	public void initialize() {
		setTitle("새 연락처 추가");  // JFrame의 타이틀
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // JFrame의 닫기 동작 설정
		
		// JFrame이 뜨는 위치 설정
		int x = parentComponent.getX();  // 부모 컴포넌트의 x 좌표
		int y = parentComponent.getY();  // 부모 컴포넌트의 y 좌표
		setBounds(x + (parentComponent.getWidth()/8), y + (parentComponent.getHeight()/10), 450, 320);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelName = new JLabel("이름");
		labelName.setFont(new Font("D2Coding", Font.PLAIN, 22));
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setBounds(12, 10, 130, 50);
		contentPane.add(labelName);

		textName = new JTextField();
		textName.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textName.setBounds(154, 10, 268, 50);
		contentPane.add(textName);
		textName.setColumns(10);

		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setHorizontalAlignment(SwingConstants.CENTER);
		labelPhone.setFont(new Font("D2Coding", Font.PLAIN, 22));
		labelPhone.setBounds(12, 70, 130, 50);
		contentPane.add(labelPhone);

		textPhone = new JTextField();
		textPhone.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textPhone.setColumns(10);
		textPhone.setBounds(154, 70, 268, 50);
		contentPane.add(textPhone);

		JLabel labelEmail = new JLabel("이메일");
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setFont(new Font("D2Coding", Font.PLAIN, 22));
		labelEmail.setBounds(12, 130, 130, 50);
		contentPane.add(labelEmail);

		textEmail = new JTextField();
		textEmail.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textEmail.setColumns(10);
		textEmail.setBounds(154, 130, 268, 50);
		contentPane.add(textEmail);

		JButton btnInsert = new JButton("추가");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertContact();
			}
		});
		btnInsert.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnInsert.setBounds(12, 190, 130, 50);
		contentPane.add(btnInsert);

		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnCancel.setBounds(154, 190, 130, 50);
		contentPane.add(btnCancel);
	}

	private void insertContact() {
		// JTextField에서 이름, 전화번호, 이메일을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
		// 창 닫기
		dispose();
		
		// 추가할 연락처 정보를 ContactMain 클래스의 메서드를 호출하면서 argument로 전달.
		Contact c = new Contact(name, phone, email);
		mainApp.insertConcat(c);
	}
}
