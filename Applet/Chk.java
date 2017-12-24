import java.applet.*;
import java.awt.*;
/*<applet code="Chk" width=700 height=200></applet>*/
public class Chk extends Applet
{
	public void init()
	{
		setFont(new Font("asdf",Font.BOLD,40));
		setBackground(Color.cyan);
		
		//checkbox
		Checkbox c1=new Checkbox("Java",true);
		Checkbox c2=new Checkbox("Oracle");
		Checkbox c3=new Checkbox("Advance Java");
		Checkbox c4=new Checkbox(".NET",true);
		Checkbox c5=new Checkbox("C++");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		
		//Radio Button
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox r1= new Checkbox("Male",cg,true);
		Checkbox r2= new Checkbox("Female",cg,false);
		Checkbox r3= new Checkbox("Trans",cg,true);
		Checkbox r4= new Checkbox("Other",cg,false);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		
		//Choice
		Choice c=new Choice();
		c.add("hahaha");
		c.add("hohoho");
		c.add("lol");
		c.add("rofl");
		add(c);
		
		//List
		List tt=new List(5,true);
		for(int i=65;i<75;i++)
			tt.add( (char)i+""+(char)i);
		add(tt);
	}
};