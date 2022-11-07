package simplegui.console;

import javax.swing.JOptionPane;

public class SimpleDialogue2 {
	public static void main(String[] args) {
		
		try {
			System.out.println("==========================================");
			System.out.println("simple calculator");
			System.out.println("==========================================");
			
			String value1;
				value1 = JOptionPane.showInputDialog("value - 1");
			 String value2;
			 	value2 = JOptionPane.showInputDialog("value - 2");
			 String operation;
			 	operation = JOptionPane.showInputDialog("choose a option (sum : 00.0 /  div : 01.0 / mult : 02.0 / sub : 03.0 )");
			 
			 double number1 = Double.parseDouble(value1);
			 double number2 = Double.parseDouble(value2);
			 double choose  = Double.parseDouble(operation);
			 
			 double sum  = 00.0;
			 double div  = 01.0;
			 double mult = 02.0; 
			 double sub  = 03.0;
			 
			 if( choose == sum) {
				 double sumOp = number1 + number2; 
				 
				 System.out.println();
				 System.out.println("result:" + sumOp);
				 JOptionPane.showMessageDialog(null, sumOp);
			 }else if( choose == div) {
				 double divOp = number1 / number2; 
				 
				 System.out.println();
				 System.out.println("result:" + divOp);
				 JOptionPane.showMessageDialog(null, divOp);
			 }else if( choose == mult) {
				 double multOp = number1 * number2; 
				 
				 System.out.println();
				 System.out.println("result:" + multOp);
				 JOptionPane.showMessageDialog(null, multOp);
			 }else if( choose == sub) {
				 double subOp = number1 - number2; 
				 
				 System.out.println();
				 System.out.println("result:" + subOp);
				 JOptionPane.showMessageDialog(null, subOp);
			 }else {
				 System.out.println();
				 System.out.println("inválid choose input");
				 JOptionPane.showMessageDialog(null, "inválid choose input");
			 }
			 
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("thank fo use our systems!");
			JOptionPane.showMessageDialog(null, "thank fo use our systems!");
			
			System.out.println();
			System.out.println();
			
			System.out.println("system created by C.O.A.V tecnologies inc.");
				JOptionPane.showMessageDialog(null, "system created by C.O.A.V tecnologies inc.");
		
		}catch(Exception e) {
			System.out.println("system failure: \t" + e.getMessage());
		}
		
	}
}
