import javax.swing.*;
public class TextAreaExample
{
		TextAreaExample()
		{
			JFrame f=new JFrame();
			JTextArea area=new JTextArea("Welcome to Javatpoint");
			area.setBounds(50,50,100,100);
			f.add(area);
			f.setSize(400,400);
			f.setLayout(null);
			f.setVisible(true);
		}
		public static void main(String args[])
		{
			new TextAreaExample();
		}
}