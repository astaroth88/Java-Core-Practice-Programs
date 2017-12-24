import javax.swing.*;
import java.awt.event.*;
public class ButtonImage
{	
	ButtonImage()
	{	
		JFrame f=new JFrame("Button Example");
		JButton b1=new JButton(new ImageIcon("ok.jpg"));
		JButton b2=new JButton(new ImageIcon("cancel.jpg"));
		final JTextField tf=new JTextField();
		
		tf.setBounds(100,40,300,60);
		b1.setBounds(100,100,100,50);
		b2.setBounds(220,100,100,50);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("You Clicked OK");
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("You Clicked Cancel");
			}
		});
		
		
		f.add(b1);
		f.add(b2);
		f.add(tf);
		
		f.setSize(500,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new ButtonImage();
	}
}