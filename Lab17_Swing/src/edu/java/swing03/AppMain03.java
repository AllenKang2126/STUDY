package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain03 {

	private JFrame frame;
	private JTextField textInput1;
	private JTextField textInput2;
	private JTextField textAnswer;
	private JButton btnSum;
	private JButton btnSubtract;
	private JButton btnMultiply;
	private JButton btnDivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		class Arithmetic {
			private double result;
			private double x;
			private double y;

			public Arithmetic(double x, double y) {
				this.x = x;
				this.y = y;
			}

			public void ArithmeticMultiply() {
				try {
					result = x * y;
					textAnswer.setText(x + " x " + y + " = " + result);
				} catch (NumberFormatException ex) {
					textAnswer.setText("Number1 또는 Number2는 숫자를 입력하세요...");
				}
			}

			public void ArithmeticDivide() { // 더 줄이는 방법을 모르겠습니다...
				try {
					result = x / y;
					textAnswer.setText(x + " / " + y + " = " + result);
				} catch (NumberFormatException ex) {
					textAnswer.setText("Number1 또는 Number2는 숫자를 입력하세요...");
				}
			}

		}
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label1 = new JLabel("Number 1");
		label1.setFont(new Font("D2Coding", Font.PLAIN, 30));
		label1.setBounds(12, 10, 139, 58);
		frame.getContentPane().add(label1);

		JLabel label2 = new JLabel("Number 2");
		label2.setFont(new Font("D2Coding", Font.PLAIN, 30));
		label2.setBounds(12, 78, 139, 58);
		frame.getContentPane().add(label2);

		textInput1 = new JTextField();
		textInput1.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textInput1.setBounds(163, 10, 409, 58);
		frame.getContentPane().add(textInput1);
		textInput1.setColumns(10);

		textInput2 = new JTextField();
		textInput2.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textInput2.setColumns(10);
		textInput2.setBounds(163, 78, 409, 58);
		frame.getContentPane().add(textInput2);

		btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// + 버튼이 할 일을 작성
				// textNumber1, textNumber2에 입력된 문자열을 숫자(double)로 변환.
				// 두 숫자의 덧셈 결과를 textResult에 씀.
				try {
					String s1 = textInput1.getText();
					double x = Double.parseDouble(s1);
					double y = Double.parseDouble(textInput2.getText());
					double result = x + y;
					textAnswer.setText(x + " + " + y + " = " + result);
				} catch (NumberFormatException ex) {
					textAnswer.setText("Number1 또는 Number2는 숫자를 입력하세요...");
				}
			}
		});
		btnSum.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnSum.setBounds(12, 154, 85, 45);
		frame.getContentPane().add(btnSum);

		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// - 버튼이 할 일을 작성
				try {
					double x = Double.parseDouble(textInput1.getText());
					double y = Double.parseDouble(textInput2.getText());
					double result = x - y;
					textAnswer.setText(x + " - " + y + " = " + result);
				} catch (NumberFormatException ex) {
					textAnswer.setText("Number1 또는 Number2는 숫자를 입력하세요...");
				}
			}
		});
		btnSubtract.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnSubtract.setBounds(112, 154, 85, 45);
		frame.getContentPane().add(btnSubtract);

		btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// parameter ActionEvent e : 이벤트를 발생시킨 객체에 대한 정보를 가지고 있는 클래스.
				// actionPerformed 메서드에 전달된 argument e를 메서드에 전달.
				performCalculation(e);
//				Arithmetic a1 = new Arithmetic(Double.parseDouble(textInput1.getText()), Double.parseDouble(textInput2.getText()));
//				a1.ArithmeticMultiply();
			}
		});
		btnMultiply.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnMultiply.setBounds(212, 154, 85, 45);
		frame.getContentPane().add(btnMultiply);

		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				performCalculation(e);
//				Arithmetic a1 = new Arithmetic(Double.parseDouble(textInput1.getText()),
//						Double.parseDouble(textInput2.getText()));
//				a1.ArithmeticDivide();
			}
		});
		btnDivide.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnDivide.setBounds(312, 154, 85, 45);
		frame.getContentPane().add(btnDivide);

		textAnswer = new JTextField();
		textAnswer.setFont(new Font("D2Coding", Font.PLAIN, 25));
		textAnswer.setBounds(12, 204, 560, 47);
		frame.getContentPane().add(textAnswer);
		textAnswer.setColumns(10);

	} // end initialize()

	// 바깥 클래스(outer class, enclosing class)에서 정의한 메서드는 inner class에서도 사용 가능!
	private void performCalculation(ActionEvent e) {
		try {
			// JTextField에 있는 문자열을 읽어서 숫자로 변환
			double x = Double.parseDouble(textInput1.getText());
			double y = Double.parseDouble(textInput2.getText());

			// 이벤트가 발생한 버튼에 따라서 서로 다른 계산을 수행하고 결과를 문자열로 작성
			Object source = e.getSource();
			String resultMessage = "";
			if(source == btnMultiply) {
				resultMessage = x + " x " + y + " = " + (x * y);
			} else if (source == btnDivide) {
				resultMessage = x + " / " + y + " = " + (x /+ y);
			}
			// 결과 메세지를 JtextField에 출력
			textAnswer.setText(resultMessage);
			
		} catch (NumberFormatException ex) {
			textAnswer.setText("Number 1 또는 Number 2 는 숫자로 입력해야 합니다...");
		}

	}

} // end class AppMain03
