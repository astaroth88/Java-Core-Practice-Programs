import javax.swing.*;
public class Simple
{
	JFrame f;
	Simple()
	{
		f=new JFrame();	//creating instance of JFrame
		
		JButton b=new JButton("click");	//creating instance of JButton
		b.setBounds(130,100,100,40);
		
		f.add(b);	//adding button in JFrame
		
		f.setSize(400,500);	//width=400,height=500
		f.setLayout(null);		//using no layout managers
		f.setVisible(true);		//making the frame visible
	}
	public static void main(String args[])
	{
		new Simple();
	}
}