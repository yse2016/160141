import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
	AlohaWindowMan man = new AlohaWindowMan();
  }
}

class AlohaWindowMan implements ActionLitemer{
	JFrame frame;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JTextField textField;

	public AlohaWindowMan(){

		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnOpen = new JButton("ファイル名");
		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");
		btnSave = new JButton("保存");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");
		textField.setText = new JTextField("ALOHA", 20);
	
		panel = new JPanel();
		panel.add(textField);
		panel.add(btnOpen);
		panel.add(btnSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);

		frame.setVisible(true);
	}
public void actionPerformed(ActionEvent ae){
	String cmd = ae.getActionCommand();
		if(cmd equals("open")) {
			textField.setText("open");
		}else if(cmd equals("save")){
			textField.setText("Save");
		}
	}
 }


