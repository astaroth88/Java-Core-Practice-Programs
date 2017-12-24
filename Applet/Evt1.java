import java.awt.*;
import java.awt.event.*;
public class Evt1 extends Frame
{
	Choice c1; Choice c2;
	TextField ta;
	Label la;
	public Evt1()
	{
		ta=new TextField(50);
		la=new Label("What's your Sexual Orientation");
		c1=new Choice();
		c2=new Choice();
		
		setBackground(Color.blue);
		setFont(new Font("Asdf",Font.BOLD,25));
		
		
		c1.add("Straight");
		c1.add("Gay");
		c1.add("Bi");
		c1.add("Trans");
		c1.add("Intersex");
		c1.add("Asexual");
		
		c2.add("Born Male");
		c2.add("Born Female");
		c2.add("Born Weird");
		
		add("North",la);
		add("Center",c1);
		
		add("South",ta);
		
		c1.addItemListener(new Lis());
		c2.addItemListener(new Lis());
		
		setSize(350,350);
		setVisible(true);
	}
	class Lis implements ItemListener
	{
		public void itemStateChanged(ItemEvent ev)
		{
			if(ev.getSource()==c1)
			{
				if(c1.getSelectedIndex()==0)
				{
					ta.setText("You are the common lot");
				}
				else if(c1.getSelectedIndex()==1)
				{
					ta.setText("HA! GAYYYYYY");
				}
				else if(c1.getSelectedIndex()==2)
				{
					ta.setText("Swinging around all day long");
				}
				else if(c1.getSelectedIndex()==3)
				{
					ta.setText("I love Everyone ;) how you doin?");
				}
				else if(c1.getSelectedIndex()==4)
				{
					ta.setText("You got it all mixed up :P");
				}
				else
				{
					ta.setText("You are Asexual. :o");
				}
			}
			else
			{
				
			}
		}
	}
	public static void main(String args[])
	{
		//try{
			Evt1 e=new Evt1();
		//}catch(Exception e){ }
	}
}