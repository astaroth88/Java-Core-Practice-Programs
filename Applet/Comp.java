import java.awt.*;
import java.applet.*;
/* <applet code="Comp" width="650" height="650"></applet> */
public class Comp extends Applet
{
	Button b1,b2;
	Label a1,a2;
	TextField tf1,tf2;
	TextArea ta;
	
	public void init()
	{
		setFont(new Font("asdf",Font.BOLD+Font.ITALIC,35));
		setBackground(Color.blue);
		b1=new Button("Ok");
		b2=new Button();
		a1=new Label("Username: ");
		a2=new Label();
		tf1=new TextField("yoyo",15);
		tf2=new TextField(15);
		tf2.setEchoChar('*');
		ta=new TextArea(5,10);
		setComp(a1, Color.pink);
		setComp(a2, Color.pink);
		setComp(b1, Color.green);
		setComp(b2, Color.green);
		setComp(tf1, Color.yellow);
		setComp(tf2, Color.yellow);
		setComp(ta, Color.red);
	}
	void setComp(Component c,Color cc)
	{
		c.setBackground(cc);
		add(c);
	}
	public void stop()
	{
		b2.setLabel("Cancel");
		a2.setText("Password");
		System.out.println(b1.getLabel());
	}
}