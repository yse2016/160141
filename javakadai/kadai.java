import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class kadai{
	public static void main (String[] args){
		kadaiman km = new kadaiman();
	}
}

class kadaiman implements ActionListener{
    JFrame frame;
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JButton button;
    JButton button2;
    JButton button3;
    JLabel label;
    JLabel label2;
    JLabel label3;
	public kadaiman(){
		frame = new JFrame("サイコロ");
		frame.setBounds(300, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();

		button = new JButton("振る");
		button.addActionListener(this);
		button.setActionCommand("button");

		button2 = new JButton("振る");
		button2.addActionListener(this);
		button2.setActionCommand("button2");

		button3 = new JButton("振る");
		button3.addActionListener(this);
		button3.setActionCommand("button3");

		label = new JLabel("振ってください"); 
		label2 = new JLabel("振ってください");
		label3 = new JLabel("振ってください");


		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(6, 2));

		con.add(panel);
		con.add(panel2);
		con.add(panel3);

		panel.add(button);
		panel.add(button2);
		panel.add(button3);

		panel2.add(label);
		panel2.add(label2);
		panel3.add(label3);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();
		int ran =  (int)(Math.random()*12+1);

        if(cmd.equals("button")){
		label.setText("出た目は"+ran+"です");
	}
	    if(cmd.equals("button2")){
	    	label2.setText("出た目は"+ran+"です");
	    }
	    if (cmd.equals("button3")) {
	    label3.setText("出た目は"+ran+"です");	    	
	    }
  }
}
