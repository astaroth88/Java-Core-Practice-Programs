import java.applet.*;
import java.awt.*;
/*<applet code="FlowApp" width=500 height=500></applet>*/
public class FlowApp extends Applet
{
	public void init()
	{
		setFont(new Font("asdf",Font.BOLD+Font.ITALIC,30));
		setBackground(Color.yellow);
		setLayout(new FlowLayout());
		for(int i=0;i<21;i++)
			add(new Button("Ok"+i));
	}
};