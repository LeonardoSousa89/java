package graphicinterface.main.console.panel;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Screen extends JFrame{
		private static final long serialVersionUID = 1L;
			
		private final JLabel screen1;
		private final JLabel screen2;
		
		public Screen() {
			super("COAV");
			setLayout(new FlowLayout());
			
			screen1 = new JLabel("Welcome!");
			screen1.setToolTipText("Coav tecnologies INC .");
			//screen1.setText("Coav tecnologies INC .");
			add(screen1);
			
			screen2 = new JLabel(" Get to success with us!");
			screen2.setToolTipText(" your success is here!");
			screen2.setBackground(getBackground().MAGENTA);
			screen2.isFontSet();
			add(screen2);
						
			
		}
}
