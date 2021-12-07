package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {

	// 이미지 파일들이 저장된 폴더와 파일 이름을 문자열 상수 (배열)로 정의
	private static final String[] IMAGES = {
			"images/flower1.jpg",
			"images/flower2.jpg",
			"images/flower3.jpg",
			"images/flower4.jpg",
			"images/flower5.jpg",
	};
	
	// 현재 application window에서 보여지는 이미지의 인덱스를 저장하는 변수
	private int index;

	private JFrame frame;
	private JLabel labelImage;
	private JButton btnPrev;
	private JButton btnNext;

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
		frame.setBounds(100, 100, 450, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// JLabel(Icon image) 생성자
		// 다형성을 이용해서, Icon 타입 객체를 전달하는 곳에 ImageIcon 객체를 전달할 수 있음.
		// AppMain05 객체가 생성될 때, 멤버 변수 index는 기본값인 0으로 초기화됨.
		labelImage = new JLabel(new ImageIcon(IMAGES[index]));
		labelImage.setBounds(12, 10, 410, 260);
		frame.getContentPane().add(labelImage);
		
		btnPrev = new JButton("<<이전");
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showPrevImage();
			}
		});
		btnPrev.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnPrev.setBounds(12, 280, 150, 60);
		frame.getContentPane().add(btnPrev);
		
		btnNext = new JButton("다음>>");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNextImage();
			}
		});
		btnNext.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnNext.setBounds(272, 280, 150, 60);
		frame.getContentPane().add(btnNext);
	}  // end initialize()

	private void showPrevImage() {
		// 현재 인덱스(index)가 0보다 크면
		if(index > 0 ) {
			index--;
			labelImage.setIcon(new ImageIcon(IMAGES[index]));
		} else {
			JOptionPane.showMessageDialog(frame, "첫번째 이미지입니다...");
		}
		
	}

	private void showNextImage() {
		// 현재 인덱스(index)가 배열의 마지막의 인덱스보다 작으면
		if(index < IMAGES.length - 1) {
			index++;  // 인덱스 증가
			// 배열에서 증가된 인덱스로 파일 이름을 찾아서 이미지 아이콘을 설정
			labelImage.setIcon(new ImageIcon(IMAGES[index]));
		} else {
			JOptionPane.showMessageDialog(frame, "마지막 이미지입니다!!");
		}
	}

}  // end class
