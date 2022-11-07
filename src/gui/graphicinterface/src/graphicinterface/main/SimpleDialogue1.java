package graphicinterface.main;

import javax.swing.JOptionPane;

public class SimpleDialogue1 {
	public static void main(String [] args) {
		
	JOptionPane.showMessageDialog(null, "welcome to the system!");
	String entrada;
		entrada = JOptionPane.showInputDialog("who you're?");
	String nova_entrada;
		nova_entrada = JOptionPane.showInputDialog("what's old you're?");
	System.out.println(entrada + "," + nova_entrada);
	JOptionPane.showMessageDialog(null, "name:" + entrada +  "," +"age:" + nova_entrada);
	JOptionPane.showMessageDialog(null, "thanks for using our systems!");
	JOptionPane.showMessageDialog(null, "system development by COAV tecnologies INC .");
	}
}
