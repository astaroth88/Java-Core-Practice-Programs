import java.awt.*;
import java.awt.event.*;
public class EvtComp extends Frame
{
	Label l1;
	TextField t1,t2;
	Button b1,b2;
	public EvtComp()
	{
		setBackground(Color.cyan);
		setLayout(new BorderLayout(20,30));
		setFont(new Font("asdf",Font.BOLD+Font.ITALIC,40));
		
		l1=new Label("lolololol");
		
		t1=new TextField(10);
		t2=new TextField(10);
		
		add("East",new Label("Username:"));
		add("Center",t1);
		add("East",new Label("Password:"));
		add("Center",t2);
		
		b1=new Button("Submit");
		add("South",b1);
		b2=new Button("Clear");
		add("South",b2);
		
		b1.addActionListener(new Lis());
		b2.addActionListener(new Lis());
	}
	class Lis implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				String s1,s2;
				s1=t1.getText();
				s2=t2.getText();
				if(s1.equals(s2))
					l1.setText("Success");
				else
					l1.setText("Ewwww");
			}
			else
			{
				t1.setText("");
				t2.setText("");
			}
		}
	}
	public static void main(String args[])
	{
			EvtComp e1=new EvtComp();
			e1.setSize(500,300);
			e1.setVisible(true);
	}
}