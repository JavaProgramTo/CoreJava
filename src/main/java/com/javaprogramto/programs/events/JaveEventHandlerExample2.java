package com.javaprogramto.programs.events;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JaveEventHandlerExample2 {

	public static void main(String[] args) {
		new ButtonEvent();
	}
}

class ButtonEvent extends Frame {

	TextField textField;

	ButtonEvent() {

		textField = new TextField();
		textField.setText("Enter your name");
		textField.setBounds(70, 60, 180, 30);
		Button b = new Button("click me");
		b.setBounds(110, 130, 90, 40);

		b.addActionListener(new ActionEventListner(this));

		add(b);
		add(textField);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

}

class ActionEventListner implements ActionListener {

	ButtonEvent buttonEvent;

	public ActionEventListner(ButtonEvent buttonEvent) {
		this.buttonEvent = buttonEvent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		buttonEvent.textField.setText("hello developer");

	}
}