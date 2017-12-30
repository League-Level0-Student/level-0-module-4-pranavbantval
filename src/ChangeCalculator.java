//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String a = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int x = Integer.parseInt(a);
		// Ask the user how many dimes they have, and convert their answer
		String b = JOptionPane.showInputDialog("How many dimes do you have?");
		int y = Integer.parseInt(b);
		// Ask the user how many quarters they have, and convert their answer
		String c = JOptionPane.showInputDialog("How many quarters do you have?");
		int z = Integer.parseInt(c);
		// Calculate how much money the user has and save it in a double variable
		double money = (0.25 * z) + (0.1 * y) + (0.05 * x);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + money);

	}
}
