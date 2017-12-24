import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
public class DigitalWatch implements Runnable
{
	JFrame f;
	Thread t=null;
	int h=0,m=0,s=0;
	String timeString="";
	JButton b;
	
	DigitalWatch()
	{
		f=new JFrame();
		
		t=new Thread(this);
		t.start();
		
		b=new JButton();
		b.setBounds(100,100,100,50);
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Calendar cal=Calendar.getInstance();
				h=cal.get(Calendar.HOUR_OF_DAY);
				m=cal.get(Calendar.MINUTE);
				s=cal.get(Calendar.SECOND);
				
				SimpleDateFormat formatter=new SimpleDateFormat("hh:mm:ss");
				Date date=cal.getTime();
				timeString=formatter.format(date);
				
				printTime();
				
				t.sleep(1000);
			}
		}catch(Exception e){}
	}
	public void printTime()
	{
		b.setText(timeString);
	}
	public static void main(String args[])
	{
		new DigitalWatch();
	}
}