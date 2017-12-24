import javax.swing.*;
public class FirstSwingExample
{
	public static void main(String args[])
	{
			JFrame f=new JFrame();	//creating new JFrame
			
			JButton b=new JButton("click");	//creating instance of JButton
			b.setBounds(130,100,100,40);	//x axis, y axis, width, height
			
			f.add(b);	//adding button to JFrame
			
			
			f.setSize(400,500);	//width=400, height=500
			f.setLayout(null);
			f.setVisible(true);
	}
}