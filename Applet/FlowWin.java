import java.awt.*;
/*<applet code="FlowWin" width=500 height=500></applet>*/
public class FlowWin extends Frame
{
	public FlowWin()
	{
		setFont(new Font("asdf",Font.BOLD+Font.ITALIC,30));
		setBackground(Color.red);
		setForeground(Color.black);
		setLayout(new FlowLayout());
		
		for(int i=0;i<21;i++)
		add(new Button(" Ok "+i));
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new FlowWin();
	}
};