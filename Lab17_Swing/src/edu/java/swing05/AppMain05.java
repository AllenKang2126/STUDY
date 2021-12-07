package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class AppMain05 {
	
	// 이미지 파일들이 저장된 폴더와 파일 이미지
	private static final String[] IMAGES = {
			
	};

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
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
		
		// JLabel(Icon image) 생성자
		// 다형성을 이용해서, Icon 타입 객체를 전달하는 곳에 ImageIcon 객체를 전달할 수 있음.
		// AppMain05 객체가 생성될 때, 멤버 변수 index는 기본값인 0으로 초기화됨.
		JLabel labelImage = new JLabel(new ImageIcon(IMAGES[index]));
		labelImage.setBounds(12, 10, 180, 120);
		frame.getContentPane().add(labelImage);
		
		JButton btnPrev = new JButton("<<이전");
		btnPrev.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnPrev.setBounds(12, 140, 150, 60);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음>>");
		btnNext.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnNext.setBounds(174, 140, 150, 60);
		frame.getContentPane().add(btnNext);
	}

}
