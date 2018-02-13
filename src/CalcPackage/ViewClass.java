package CalcPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ViewClass extends JFrame {





	private JPanel contentPane;
	public JTextField CalTextField;
	ControllerClass	c;
	public JButton add;
	public JButton subtract;
	public JButton divide;
	public JButton multiply;
	public JButton mod;
	public JButton sqrt;
	public JButton equal;

	public void addController(ControllerClass c) {
		this.c=c;
	}
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ViewClass() {
		setTitle("       Calculator");
		setResizable(false);
		setForeground(Color.BLACK);
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 291);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CalTextField = new JTextField();
		CalTextField.setBackground(Color.WHITE);
		CalTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		CalTextField.setText("0");
		CalTextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		CalTextField.setBounds(21, 21, 218, 31);
		contentPane.add(CalTextField);
		CalTextField.setColumns(10);
		
		 divide = new JButton("/");
		 divide.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		c.actionPerformed(e);
		 	}
		 });
		divide.setBackground(Color.PINK);
		divide.setBounds(21, 63, 47, 31);
		contentPane.add(divide);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"8");	
			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setBackground(Color.PINK);
		btn8.setBounds(78, 99, 47, 31);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"9");	
			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setBackground(Color.PINK);
		btn9.setBounds(135, 99, 47, 31);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"4");	
			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setBackground(Color.PINK);
		btn4.setBounds(21, 133, 47, 31);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"5");	
			}
		});
		btn5.setForeground(Color.BLACK);
		btn5.setBackground(Color.PINK);
		btn5.setBounds(78, 133, 47, 31);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"6");	
			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setBackground(Color.PINK);
		btn6.setBounds(135, 133, 47, 31);
		contentPane.add(btn6);
		
		 add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.actionPerformed(e);
			}
		});
		add.setForeground(Color.BLACK);
		add.setBackground(Color.PINK);
		add.setBounds(192, 64, 47, 29);
		contentPane.add(add);
		
		subtract = new JButton("-");
		subtract.setForeground(Color.BLACK);
		subtract.setBackground(Color.PINK);
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.actionPerformed(e);
			}
		});
		subtract.setBounds(192, 99, 47, 31);
		contentPane.add(subtract);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"1");	
			}
		});
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(Color.PINK);
		btn1.setBounds(21, 167, 47, 31);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"2");	
			}
		});
		btn2.setForeground(Color.BLACK);
		btn2.setBackground(Color.PINK);
		btn2.setBounds(78, 167, 47, 31);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"3");	
			}
		});
		btn3.setForeground(Color.BLACK);
		btn3.setBackground(Color.PINK);
		btn3.setBounds(135, 167, 47, 31);
		contentPane.add(btn3);
		
		 equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.actionPerformed(e);
			}
		});
		equal.setForeground(Color.BLACK);
		equal.setBackground(Color.PINK);
		equal.setBounds(192, 167, 47, 66);
		contentPane.add(equal);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"0");	
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setBackground(Color.PINK);
		btn0.setBounds(21, 203, 104, 30);
		contentPane.add(btn0);
		
		 multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.actionPerformed(e);
			}
		});
		multiply.setForeground(Color.BLACK);
		multiply.setBackground(Color.PINK);
		multiply.setBounds(192, 133, 47, 31);
		contentPane.add(multiply);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText(CalTextField.getText()+"7");			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setBackground(Color.PINK);
		btn7.setBounds(21, 99, 47, 31);
		contentPane.add(btn7);
		
		 mod = new JButton("Mod");
		 mod.setFont(new Font("Tahoma", Font.PLAIN, 7));
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.actionPerformed(e);	
			}
		});
		mod.setForeground(Color.BLACK);
		mod.setBackground(Color.PINK);
		mod.setBounds(78, 63, 47, 31);
		contentPane.add(mod);
		
		 sqrt = new JButton("\u221A");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.actionPerformed(e);
			}
		});
		sqrt.setForeground(Color.BLACK);
		sqrt.setBackground(Color.PINK);
		sqrt.setBounds(135, 63, 47, 31);
		contentPane.add(sqrt);
		
		JButton delete = new JButton('\u2190'+"");

		delete.setBounds(78, 203, 104, 30);
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CalTextField.setText("0");	
			}
		});
		delete.setForeground(Color.BLACK);
		delete.setBackground(Color.PINK);
		delete.setBounds(135, 203, 47, 30);
		contentPane.add(delete);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 268, 262);
		contentPane.add(panel);
	}
}


