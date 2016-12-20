import java.awt.*;
import javax.swing.*;

public class Windowtest {
	public static void main (String[] args){
		JFrame frame = new JFrame("出す");
		JLabal labal = new JLabal("HELLO");
		JButton button = new JButton("ClickMe!");

		frame.setBounde(50, 50, 300, 300);
		frame.setDefaultCloseOperaration(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout() );

		Container ctnr = frame.getContentPane();
		ctnr.add(labal);
		ctnr.add(button);

		frame.setVisible(true);
	}
}
