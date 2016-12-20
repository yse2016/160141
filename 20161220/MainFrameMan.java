import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan{
   public static void main(String[] args) {
   	FrameMan fm = new FrameMan();
   }
}
     //"ActionListener" を実装(imp)する
    class FrameMan implements ActionListener{
    	JFrame frame;
    	JPanel panel;
    	JLabel label;
    	JButton button;


    	public FrameMan(){
    		System.out.println("ALOHA");
    		    frame = new JFrame("FrameMan!");
    			frame.setBounds(100, 100, 300, 300);
    			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			frame.setLayout(new FlowLayout() );

                panel = new JPanel();
    			label = new JLabel("HELLO");
    			button = new JButton("ClickMe!");

    			button.addActionListener(this);

    			panel.add(label);
    			panel.add(button);
    			frame.add(panel);

    			frame.setVisible(true);
    	}
    	public void actionPerformed(ActionEvent e){
    		label.setText("ALOHA");
    	}
    }
