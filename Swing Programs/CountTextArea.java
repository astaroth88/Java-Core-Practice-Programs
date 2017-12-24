import javax.swing.*;
import java.awt.event.*;
public class CountTextArea implements ActionListener
{
	JLabel l1,l2;
	JTextArea area;
	JButton b;
	CountTextArea()
	{
		JFrame f=new JFrame();
		
		l1=new JLabel();
		l1.setBounds(50,25,100,30);
		l2=new JLabel();
		l2.setBounds(160,25,100,30);
		
		area=new JTextArea();
		area.setBounds(20,75,400,200);
		
		b=new JButton("Count Words: ");
		b.setBounds(100,300,140,30);
		b.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(b);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String text=area.getText();
		String words[]=text.split("\\s");
		l1.setText("Words: "+words.length);
		l2.setText("Characters: "+text.length());
	}
	public static void main(String args[])
	{
		new CountTextArea();
	}
}