import java.applet.*;
import java.awt.*;
//<applet code="Applife" height=100 width=1000></applet>
public class Applife extends Applet
{
	int count=1;
	int x=0;
	public void init()
	{	
		setBackground(Color.cyan);
		System.out.println("Initializing...");
	}
	public void start()
	{	
		System.out.println("Starting...");
	}
	public void paint(Graphics g)
	{	
		System.out.println("painting..."+count);
		g.drawString("Welcome yo",x,100);
		g.fillRect(100,120,x,40);
		if(x==1000)
			x=0;
		else
			x+=10;
		try
		{
			Thread.sleep(200);
		}catch(Exception e){}
		
		
		count++;
		repaint();
	}
	public void stop()
	{	
		System.out.println("Stopping...");
	}
	public void destroy()
	{	
		System.out.println("Destroying...");
	}
};