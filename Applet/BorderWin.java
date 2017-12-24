import java.awt.*;
/*<applet code="BorderWin" width=500 height=500></applet>*/
public class BorderWin extends Frame
{
	public BorderWin()
	{
		setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,30));
		setBackground(Color.cyan);
		setForeground(Color.red);
		setLayout(new BorderLayout());
		
		add("North",new Button("North 0"));
		add("South",new Button("South 0"));
		add("East",new Button("East 0"));
		add("West",new Button("West 0"));
		add("Center",new Button("Center 1"));
		add("Center",new Button("Center 2"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new BorderWin();
	}
};