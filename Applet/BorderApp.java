import java.awt.*;
import java.applet.*;
/*<applet code="BorderApp" width=500 height=500></applet>*/
public class BorderApp extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout(15,25));	//BorderLayout( 15, 20) here, 15->horizontal gap and 20->vertical gap
		setFont(new Font("Arial",Font.BOLD,50));
		setBackground(Color.cyan);
		add("North",new Button("North"));
		add("South",new Button("South"));
		add("East",new Button("East"));
		add("West",new Button("West"));
		add("Center",new Button("Center"));
		setSize(600,600);
		setVisible(true);
	}
}