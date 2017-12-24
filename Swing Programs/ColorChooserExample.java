import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChooserExample extends JFrame implements ActionListener
{
	JButton b;
	Container c;
	ColorChooserExample()
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		b=new JButton("color");
		b.addActionListener(this);
		c.add(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		Color initialcolor=Color.red;
		Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
		c.setBackground(color);
	}
	public static void main(String args[])
	{
		ColorChooserExample ch=new ColorChooserExample();
		ch.setSize(500,500);
		ch.setVisible(true);
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}