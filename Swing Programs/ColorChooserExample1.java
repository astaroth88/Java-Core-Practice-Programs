import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChooserExample1 extends JFrame implements ActionListener
{
	JButton b;
	JFrame f;
	JTextArea ta;
	ColorChooserExample1()
	{
		f=new JFrame("Color Chooser Example");
		
		b=new JButton("Pad Color");
		b.setBounds(240,225,100,30);
		b.addActionListener(this);
		
		ta=new JTextArea();
		ta.setBounds(20,20,400,200);
		f.add(ta);
		f.add(b);
		f.setLayout(null);
		f.setSize(700,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		Color c=JColorChooser.showDialog(this,"Choose",Color.cyan);
		ta.setBackground(c);
	}
	public static void main(String args[])
	{
		new ColorChooserExample1();
	}
}