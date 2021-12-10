package edu.java.contact.ver05;

import java.awt.EventQueue;
import static edu.java.contact.menu.MainMenu.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.model.Contact;

public class ContactMain05 {
	
	private static ContactDao dao = ContactDaoImpl.getInstance();
	private static final String[] COLUMN_NAMES = { "이름", "전화번호", "이메일"};

	private JFrame frame;
	private JButton btnBackToMenu;
	private JButton btnInsertNewContact;
	private JButton btnUpdateContactInfo;
	private JButton btnDeleteContactByIndex;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tableModel;
	private JLabel labelMain;
	private JButton btnSelectAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain05 window = new ContactMain05();
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
	public ContactMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tableModel = new DefaultTableModel(null,COLUMN_NAMES);
		
		// 연락처 프로그램 메인화면 
		labelMain = new JLabel("연락처 프로그램 Ver0.6");
		labelMain.setHorizontalAlignment(SwingConstants.CENTER);
		labelMain.setFont(new Font("D2Coding", Font.BOLD, 24));
		labelMain.setBounds(12, 10, 410, 40);
		frame.getContentPane().add(labelMain);
		
		// 연락처 리스트 버튼
		btnSelectAll = new JButton("연락처 전체 리스트");
		btnSelectAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				allBtnVisibility(false);
				List<Contact> contactList = dao.select();
				Object[] rowData = contactList.toArray();
			}
		});
		btnSelectAll.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnSelectAll.setBounds(12, 60, 410, 40);
		frame.getContentPane().add(btnSelectAll);
		
		// 연락처 추가 버튼
		btnInsertNewContact = new JButton("새 연락처 추가");
		btnInsertNewContact.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InsertNewContactFrame.showInsertNewContactFrame();
				insertContact();
			}
		});
		btnInsertNewContact.setFont(new Font("D2Coding", Font.BOLD, 24));
		btnInsertNewContact.setBounds(12, 110, 410, 40);
		frame.getContentPane().add(btnInsertNewContact);
		
		// 연락처 정보 수정 버튼
		btnUpdateContactInfo = new JButton("연락처 정보 수정");
		btnUpdateContactInfo.setVisible(false);
		btnUpdateContactInfo.setFont(new Font("D2Coding", Font.BOLD, 20));
		btnUpdateContactInfo.setBounds(12, 260, 200, 40);
		frame.getContentPane().add(btnUpdateContactInfo);
		
		// 연락처 정보 삭제 버튼
		btnDeleteContactByIndex = new JButton("연락처 정보 삭제");
		btnDeleteContactByIndex.setVisible(false);
		btnDeleteContactByIndex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteContactByIndex.setFont(new Font("D2Coding", Font.BOLD, 20));
		btnDeleteContactByIndex.setBounds(222, 260, 200, 40);
		frame.getContentPane().add(btnDeleteContactByIndex);
		
		btnBackToMenu = new JButton("←메뉴로");
		btnBackToMenu.setVisible(false);
		btnBackToMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				allBtnVisibility(true);
			}
		});
		btnBackToMenu.setBounds(332, 411, 90, 40);
		frame.getContentPane().add(btnBackToMenu);
		
		// ScrollPane 연락처 목록
		scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(12, 10, 410, 240);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(tableModel);
		scrollPane.setViewportView(table);
	}

	private void insertContact() {
		
	}

	private void allBtnVisibility(boolean aFlag) {
		labelMain.setVisible(aFlag);
		btnSelectAll.setVisible(aFlag);
		btnInsertNewContact.setVisible(aFlag);

		btnUpdateContactInfo.setVisible(!aFlag);
		btnDeleteContactByIndex.setVisible(!aFlag);
		scrollPane.setVisible(!aFlag);

		btnBackToMenu.setVisible(!aFlag);
		 
	}
}
