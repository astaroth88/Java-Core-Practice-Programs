import java.awt.*;
public class FirstApp extends Frame
{
	public FirstApp()
	{
		//super("RAM");
		//setBackground(Color.cyan);
		
		Button b1=new Button("OK");
		b1.setBackground(Color.yellow);
		
		add(b1);
		
		setFont(new Font("asdf",Font.BOLD+Font.ITALIC,40));
		setSize(400,250);
		setLocation(100,150);
		setVisible(true);
		setTitle("Sam");
	}
	public static void main(String args[])
	{
		new FirstApp();
	}
};