import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textFieldats;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
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
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(245, 255, 250));
		textField_1.setBounds(42, 31, 144, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(245, 255, 250));
		textField_2.setBounds(249, 31, 144, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSudeti = new JButton("Sud\u0117ti");
		btnSudeti.setBackground(SystemColor.activeCaption);
		btnSudeti.setForeground(new Color(0, 128, 0));
		btnSudeti.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSudeti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ats;
				try {
					num1=Integer.parseInt(textField_1.getText());
					num2=Integer.parseInt(textField_2.getText());
					ats=num1+num2;
					textFieldats.setText(Integer.toString(ats));
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Kaþkà blogai ávedëte...");
				}
			}
		});
		btnSudeti.setBounds(80, 82, 129, 43);
		frame.getContentPane().add(btnSudeti);
		
		JButton btnAtimti = new JButton("Atimti");
		btnAtimti.setBackground(SystemColor.activeCaption);
		btnAtimti.setForeground(new Color(0, 128, 0));
		btnAtimti.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAtimti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ats;
				try {
					num1=Integer.parseInt(textField_1.getText());
					num2=Integer.parseInt(textField_2.getText());
					ats=num1-num2;
					textFieldats.setText(Integer.toString(ats));
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Kaþkà blogai ávedëte...");
				}
			}
		});
		btnAtimti.setBounds(230, 82, 129, 43);
		frame.getContentPane().add(btnAtimti);
		
		textFieldats = new JTextField();
		textFieldats.setBackground(new Color(245, 255, 250));
		textFieldats.setForeground(new Color(220, 20, 60));
		textFieldats.setBounds(217, 159, 109, 20);
		frame.getContentPane().add(textFieldats);
		textFieldats.setColumns(10);
		
		JLabel lblAtsakymas = new JLabel("Atsakymas:");
		lblAtsakymas.setForeground(new Color(128, 0, 0));
		lblAtsakymas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAtsakymas.setBounds(117, 162, 90, 17);
		frame.getContentPane().add(lblAtsakymas);
	}
}
