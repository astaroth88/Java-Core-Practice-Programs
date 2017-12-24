import javax.swing.*;
import java.awt.event.*;

public class ButtonExample
{
	public static void main(String args[])
	{	
		JFrame f=new JFrame("Button Example");
		
		final JTextField tf=new JTextField();
		tf.setBounds(50,70,150,25);
		
		JButton b=new JButton("Click here");
		b.setBounds(50,100,95,30);		//x-axis,y-axis,width,height
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					tf.setText("Welcome to Jibana");
			}
		});
		
		f.add(b);
		f.add(tf);
		
		f.setSize(500,400);					//width,height
		f.setLayout(null);
		f.setVisible(true);
	}
}