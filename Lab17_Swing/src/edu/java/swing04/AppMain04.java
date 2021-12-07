package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain04 {

	private JFrame frame;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JLabel labelMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
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
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		labelMessage = new JLabel("New label");
		labelMessage.setFont(new Font("D2Coding", Font.BOLD, 32));
		labelMessage.setBounds(12, 10, 410, 56);
		frame.getContentPane().add(labelMessage);

		btn1 = new JButton("익명 클래스");
		// ActionListener 객체를 익명 클래스 객체로 생성하고, 버튼에 이벤트 핸들러를 등록.
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				labelMessage.setText(e.getActionCommand());
			}
		});
		btn1.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn1.setBounds(12, 76, 170, 65);
		frame.getContentPane().add(btn1);

		btn2 = new JButton("람다표현식");
		// ActionListener 익명 클래스 객체 생성 -> 람다 표현식(Lambda expression) : (param) -> { 구현 코드
		// 작성; }
		btn2.addActionListener((e) -> {
			labelMessage.setText(e.getActionCommand());
		});
		btn2.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn2.setBounds(194, 76, 170, 65);
		frame.getContentPane().add(btn2);

		btn3 = new JButton("메서드 1");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				performText(e);
			}
		});
		btn3.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn3.setBounds(12, 148, 170, 65);
		frame.getContentPane().add(btn3);

		btn4 = new JButton("메서드 2");
		btn4.addActionListener((e) -> {performText(e);});
		btn4.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btn4.setBounds(194, 148, 170, 65);
		frame.getContentPane().add(btn4);
	}

	private void performText(ActionEvent e) {
		labelMessage.setText(e.getActionCommand());
	}
}
