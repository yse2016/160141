import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEditor{
	public static void main (String[] args){
     TextEditorMan man = new TextEditorMan();
	}
}

class TextEditorMan implements ActionListener{
	JFrame frame;
	JTextField fileName;
	JPanel fieldPanel;
	JButton btnOpen;
	JButton btnSave;
	JTextArea textArea;
	JScrollPane scrollPane;

    public  TextEditorMan(){

	frame = new JFrame("TextEdtior");
	frame.setLocation(400, 400);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	fileName = new JTextField("ALOHA", 15);
	fieldPanel = new JPanel();
	btnOpen = new JButton("開く");
	btnOpen.addActionListener(this);
	btnOpen.setActionCommand("open");
	btnSave = new JButton("保存");
	btnSave.addActionListener(this);
	btnSave.setActionCommand("save");
	textArea =new JTextArea(10, 30);
	scrollPane = new JScrollPane(textArea);

	fieldPanel.add(fileName);
	fieldPanel.add(btnOpen);
	fieldPanel.add(btnSave);

	Container con = frame.getContentPane();
	con.setLayout(new GridLayout(2, 1));
	con.add(fieldPanel);
	con.add(scrollPane);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")){
			String textFileName = fileName.getText();

			FileReader fr;
			BufferedReader br;

			try{
				fr = new FileReader(textFileName);
				br = new BufferedReader(fr);

				String data;
				while((data = br.readLine()) != null) {
				textArea.append(data + '\n');
			}
			}catch(IOException e){
				System.out.println("IO error.");
			}
			textArea.append("開く" + '\n');
		}else if(cmd.equals("save")) {

              String textFileName = fileName.getText();

		      FileWriter fw;
		      PrintWriter pw;

            try {
			     fw = new FileWriter(textFileName);
			     pw = new PrintWriter(fw);

			String data = textArea.getText();

			pw.println(data);

            } catch(IOException e) {
			   System.out.println("IO error.");
            } Finally {
			
			try {
				fw.close();
				pw.close();
			} catch(IOException e) {
				System.out.println("IO error.");
			}
			textArea.append("保存" + '\n');
          }
         }
	}
}