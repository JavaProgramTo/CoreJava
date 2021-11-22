package com.javaprogramto.programs.events;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JaveEventHandlerExample {

	public static void main(String[] args) {
		new ButtonEvent();
	}
}

class ButtonEvent extends Frame implements ActionListener {

	TextField textField;

	ButtonEvent() {

		textField = new TextField();
		textField.setText("Enter your name");
		textField.setBounds(70, 60, 180, 30);
		Button b = new Button("click me");
		b.setBounds(110, 130, 90, 40);

		b.addActionListener(this);

		add(b);
		add(textField);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		textField.setText("hello developer");
	}
}
