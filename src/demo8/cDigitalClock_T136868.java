/**
 * 
 */
package demo8;

import javax.swing.JFrame;


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.text.*;

public class cDigitalClock_T136868 extends JFrame {
	JLabel time;

	cDigitalClock_T136868() {
		setSize(300, 300);
		setTitle("T136868- dong ho dien tu abc");
		setLocation(150, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());

		time = new JLabel("");
		time.setFont(new Font("SansSerif", Font.BOLD, 60));
		time.setForeground(Color.RED);
		add(time);
		new Thread(new Runnable() {
			public void run() {
				try {
					updateTime();
				} catch (Exception ie) {
				}
			}
		}).start();
	}

	public void updateTime() {
		try {
			while (true) {
				time.setText(new SimpleDateFormat("hh:mm:ss ")
						.format(new java.util.Date()));
				Thread.currentThread().sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Exception in Thread Sleep : " + e);
		}
	}

	public static void main(String[] args) {
		JFrame obj = new cDigitalClock_T136868();
		obj.setVisible(true);
	}
}