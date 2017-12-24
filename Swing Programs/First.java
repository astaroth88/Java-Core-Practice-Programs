import javax.swing.*;
public class First
{
	First()
	{
		JFrame f=new JFrame();
		JButton b=new JButton("click");
		b.setBounds(100,100,100,100);
		
		f.add(b);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new First();
	}
};