import java.awt.*;
import java.awt.event.*;
/*<applet code="GripApp" width="500" height="500"></applet>*/
public class GridApp extends Frame
{	
	public GridApp()
	{
			setLayout(new GridLayout(0,3,25,15));
			setFont(new Font("asdf",Font.BOLD+Font.ITALIC,10));
			setBackground(Color.cyan);
			for(int i=0;i<18;i++)
				add(new Button("Button "+i));

	}
	public static void main(String args[])
	{
		GridApp g=new GridApp();
		g.setSize(300,300);
		g.setVisible(true);
	}
};