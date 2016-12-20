import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan2{
   public static void main(String[] args) {
   	FrameMan fm = new FrameMan();
   }
}
     //"ActionListener" を実装(imp)する
    class FrameMan implements ActionListener{
    	JFrame frame;
    	JPanel panel1;
        JPanel panel2;
    	JLabel label;
    	JButton button;
        JTextField textfield;


    	public FrameMan(){
    		System.out.println("ALOHA");
    		    frame = new JFrame("FrameMan!");
    			frame.setBounds(100, 100, 300, 300);
    			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			frame.setLayout(new BorderLayout() );
    			

                panel1 = new JPanel();
                panel2 = new JPanel();
    			label = new JLabel("HELLO");
    			button = new JButton("ClickMe!");
    			textfield = new JTextField(10);

    			button.addActionListener(this);

                panel1.add(textfield);
    			panel1.add(label);
    			panel2.add(button);
                frame.add(panel1, BorderLayout.NORTH);
    			frame.add(panel2, BorderLayout.CENTER);

    			frame.setVisible(true);
    	}
    	public void actionPerformed(ActionEvent e){
    		String data = textfield.getText();
    		label.setText(data);
    	}
    }
