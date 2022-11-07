package system.main;

import javax.swing.JOptionPane;

import system.main.find.Query;

public class PrincipalQuery {
	public static void main(String[] args) {
		int resp = 0;
		JOptionPane.showMessageDialog(null, "Query System:");
		System.out.println("Query System:");
		System.out.println();
		JOptionPane.showMessageDialog(null, "welcome to the system!");
		System.out.println("welcome to the system!");
		System.out.println();
		System.out.println();
		String choose = JOptionPane.showInputDialog("choose [1 to yes] or [0 to no]");
		System.out.println("choose [1 to yes] or [0 to no]");
		int choice = Integer.parseInt(choose);
		
		if(choice != resp) {
			Query qr = new Query();
			qr.queryItems();
			JOptionPane.showMessageDialog(null,qr);
		}
	}
}
