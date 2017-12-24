import java.awt.*;
import java.awt.event.*;
public class Evt2 extends Frame
{
	Choice c1,c2;
	public Evt2()
	{
		setFont(new Font("asdf",Font.BOLD,40));
		setBackground(Color.cyan);
		c1=new Choice();
		c2=new Choice();
		for(int i=1,j=65;i<10;i++,j++)
		{
			c1.add((char)j+ "");
			c2.add(i+"");
		}
		add("West",c1);
		add("East",c2);
		c1.addItemListener(new It());
		c2.addItemListener(new It());
		setSize(200,200);
		setVisible(true);
	}
	class It implements ItemListener
	{
		public void itemStateChanged(ItemEvent ev)
		{
				if(ev.getSource()==c1)
				{
					int x=c1.getSelectedIndex();
					c2.select(x);
				}
				else
				{
					c1.select(c2.getSelectedIndex());
				}
		}
	};
	public static void main(String args[])
	{
		new Evt2();
	}
}