package eg.edu.alexu.csd.oop.db;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;

public class gui extends JFrame {
	public gui() {
		getContentPane().setLayout(null);
		this.setTitle("CALCULATOR");
		this.setSize(589, 428);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	
		
		
		JButton btnRun = new JButton("run");
		btnRun.setBounds(512, 24, 59, 25);
		getContentPane().add(btnRun);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(27, 24, 457, 232);
		getContentPane().add(textPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(37, 280, 447, 100);
		getContentPane().add(lblNewLabel);
		
	
	}
	
}
