

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;  
import java.awt.event.FocusAdapter;  
import java.awt.event.FocusEvent;  

public class Calc extends JFrame implements ActionListener{
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	
//	private JLabel lbl;	
	private JTextField tf;
	
	private Font f;
	
	public Calc(String title) {
		
		setTitle(title);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(900, 250);
		setSize(350, 310);
				
		
		setLayout(new BorderLayout(2,5));
		panel1 = new JPanel();
//		panel1.setBackground(Color.BLUE);
		
		tf = new JTextField(32);	//글자 수
		tf.addActionListener(this);	//엔터
		tf.requestFocus();
		tf.setHorizontalAlignment(JTextField.RIGHT);	//텍스트 오른쪽 정렬
					
		tf.addActionListener(this);
		
		f = new Font("궁서체", f.BOLD, 18);
		tf.setFont(f);
		panel1.add(tf);
		add(panel1, BorderLayout.NORTH);		
		
		
		panel2 = new JPanel();	
//		panel2.setBackground(Color.YELLOW);
		panel2.setLayout(new GridLayout(1,6,2,5));
		
		JButton m1 = new JButton("MC");
		JButton m2 = new JButton("MR");
		JButton m3 = new JButton("M+");
		JButton m4 = new JButton("M-");
		JButton m5 = new JButton("MS");
		JButton m6 = new JButton("M");
		
		panel2.add(m1);
		panel2.add(m2);
		panel2.add(m3);
		panel2.add(m4);
		panel2.add(m5);
		panel2.add(m6);
		add(panel2, BorderLayout.CENTER);
		
		
		
		
		
		panel3 = new JPanel();
//		panel3.setBackground(Color.RED);
		panel3.setLayout(new GridLayout(6,4,2,7));
		
		JButton b1 = new JButton("%");
		JButton b2 = new JButton("CE");
		JButton b3 = new JButton("C");
		JButton b4 = new JButton("X");
		JButton b5 = new JButton("1/x");
		JButton b6 = new JButton("x²");
		JButton b7 = new JButton("2x");
		JButton b8 = new JButton("÷");
		JButton b9 = new JButton("7");
		JButton b10 = new JButton("8");
		JButton b11 = new JButton("9");
		JButton b12 = new JButton("×");
		JButton b13 = new JButton("4");
		JButton b14 = new JButton("5");
		JButton b15 = new JButton("6");
		JButton b16 = new JButton("－");
		JButton b17 = new JButton("1");
		JButton b18 = new JButton("2");
		JButton b19 = new JButton("3");
		JButton b20 = new JButton("＋");
		JButton b21 = new JButton("±");
		JButton b22 = new JButton("0");
		JButton b23 = new JButton(".");
		JButton b24 = new JButton("=");	
		
		panel3.add(b1);
		panel3.add(b2);
		panel3.add(b3);
		panel3.add(b4);
		panel3.add(b5);
		panel3.add(b6);
		panel3.add(b7);
		panel3.add(b8);
		panel3.add(b9);
		panel3.add(b10);
		panel3.add(b11);
		panel3.add(b12);
		panel3.add(b13);
		panel3.add(b14);
		panel3.add(b15);
		panel3.add(b16);
		panel3.add(b17);
		panel3.add(b18);
		panel3.add(b19);
		panel3.add(b20);
		panel3.add(b21);
		panel3.add(b22);
		panel3.add(b23);
		panel3.add(b24);
	
		add(panel3, BorderLayout.SOUTH);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		 if (obj == tf) {
			 tf.setText("0");
			 tf.requestFocus();
	        } 
	}
}