package edu.java.contact.ver05.extra;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.contact.model.Contact;
import edu.java.contact.ver05.ContactDao;
import edu.java.contact.ver05.ContactDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUpdateFrame extends JFrame {

	private JPanel contentPane;

	private Component parentComponent; // 업데이트 프레임을 보여주기 위한 부모 컴포넌트
	private int index; // 수정할 연락처의 인덱스
	private ContactDao dao;
	private ContactMain05 mainApp;

	private JTextField textEmail;
	private JTextField textPhone;
	private JTextField textName;

	/**
	 * Launch the application.
	 * 
	 * @param frame
	 */
	// Ctrl + Shift + O : 자동 import
	public static void showFrame(Component parentComponent, int index, ContactMain05 mainApp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUpdateFrame frame = new ContactUpdateFrame(parentComponent, index, mainApp);
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
	public ContactUpdateFrame(Component parentComponent, int index, ContactMain05 mainApp) {
		this.parentComponent = parentComponent;
		this.index = index;
		this.dao = ContactDaoImpl.getInstance();
		this.mainApp = mainApp;
		initialize();
		loadContactData();
	}

	public void initialize() {
		setTitle("연락처 수정");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		int x = parentComponent.getX();
		int y = parentComponent.getY();
		setBounds(x + (parentComponent.getWidth() / 8), y + (parentComponent.getHeight() / 10), 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelName = new JLabel("이름");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setFont(new Font("D2Coding", Font.PLAIN, 22));
		labelName.setBounds(12, 10, 130, 50);
		contentPane.add(labelName);

		textEmail = new JTextField();
		textEmail.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textEmail.setColumns(10);
		textEmail.setBounds(154, 130, 268, 50);
		contentPane.add(textEmail);

		JLabel labelEmail = new JLabel("이메일");
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setFont(new Font("D2Coding", Font.PLAIN, 22));
		labelEmail.setBounds(12, 130, 130, 50);
		contentPane.add(labelEmail);

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

		textName = new JTextField();
		textName.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textName.setColumns(10);
		textName.setBounds(154, 10, 268, 50);
		contentPane.add(textName);

		JButton btnUpdate = new JButton("수정 완료");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
			}
		});
		btnUpdate.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnUpdate.setBounds(12, 190, 150, 50);
		contentPane.add(btnUpdate);

		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnCancel.setBounds(174, 190, 130, 50);
		contentPane.add(btnCancel);
	} // end initialize()

	private void updateContact() {
		// 업데이트할 내용을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();

		Contact c = new Contact(name, phone, email);

		// dao를 사용해서 연락처 정보를 수정.
		int result = dao.update(index, c);
		if (result == 1) {
			// 업데이트 창 닫기
			dispose();
			
			// 성공 팝업은 메인 창 위에 띄우기
			JOptionPane.showMessageDialog(parentComponent, "연락처 정보가 수정되었습니다.");
			
			// 메인 화면에게 연락처 정보가 수정됐다고 알려줌. (JTable 변경)
//			mainApp.contactUpdateNotify(index, c);
			mainApp.contactUpdateNotify();
		}
	}

	public void loadContactData() {
		// dao를 사용해서 index 검색을 하고, 검색된 내용을 textField에 채워줌.
		Contact c = dao.select(index);
		textName.setText(c.getName());
		textPhone.setText(c.getPhone());
		textEmail.setText(c.getEmail());

	}

} // end class ContactUpdateFrame
