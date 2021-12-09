package edu.java.swing10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain10 {

	private JFrame frame;
	private JTextField textField;
	private JButton btnInput;
	private JScrollPane scrollPane;
	private JList<String> list;  // String을 원소로 갖는 List 타입
	private DefaultListModel<String> model;  // JList의 아이템들을 관리(추가, 삭제)하는 객체

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain10 window = new AppMain10();
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
	public AppMain10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("D2Coding", Font.PLAIN, 22));
		textField.setBounds(12, 10, 300, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnInput = new JButton("입력");
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addElementToList();
			}
		});
		btnInput.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnInput.setBounds(325, 10, 97, 50);
		frame.getContentPane().add(btnInput);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteElementFromList();
			}
		});
		btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnDelete.setBounds(325, 70, 97, 50);
		frame.getContentPane().add(btnDelete);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 70, 300, 331);
		frame.getContentPane().add(scrollPane);
		
		list = new JList<String>();  // String을 원소로 갖는 JList 객체 생성
		list.setFont(new Font("D2Coding", Font.BOLD, 22));
		model = new DefaultListModel<>();  // JList의 아이템을 관리하는 DefaultListModel 객체를 생성
		list.setModel(model);  // JList에 model을 설정.
		scrollPane.setViewportView(list);
	}

	private void deleteElementFromList() {
		// TODO : JList에서 선택된 아이템의 인덱스를 찾음
		int index = list.getSelectedIndex();
		// 선택된 아이템이 없다면, 사용자에게 삭제할 아이템을 선택하라고 메시지 보여줌.
		if(index == -1) {
			JOptionPane.showMessageDialog(frame, "리스트에서 삭제할 항목을 선택하세요.");
			return;
		}
		// 선택된 아이템이 있다면, 정말로 삭제할 것인 지를 확인한 후
		int confirm = JOptionPane.showConfirmDialog(frame, "이 아이템을 삭제하시겠습니까?");
		// 사용자가 삭제하겠다고 확인하면 model에서 아이템을 삭제.
		if(confirm == JOptionPane.YES_OPTION) {
			model.remove(index);
		}
	}

	private void addElementToList() {
		// TODO : 텍스트 필드에 내용이 있는 경우에만 JList아이템이 추가되도록
		// JtextField의 내용을 읽고 JList의 모델에 아이템을 추가.
		String text = textField.getText();
		if(!text.equals("")) {
		model.addElement(text);
		} else {
			JOptionPane.showMessageDialog(frame, "내용을 입력해주세요!", "안내", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		// TODO : JList에 아이템을 추가하고 나면 텍스트 필드의 내용을 지움.
		textField.setText("");
	}
}
