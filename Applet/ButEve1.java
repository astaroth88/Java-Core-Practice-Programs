import java.awt.*;
import java.awt.event.*;
public class ButEve1 extends Frame{
	Button b1;
	TextField tf;
	int count=0;
	public ButEve1()
	{
		setFont(new Font("asdf",Font.BOLD,20));
		setBackground(Color.cyan);
		b1=new Button("ok");
		tf=new TextField(10);
		b1.addActionListener(new Lis());
		add("North",tf);
		add("Center",b1);
	}
	class Lis implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			count++;
			tf.setText("Button is clicked "+ count);
			System.out.println("Button is clicked "+count);
		}
	};
	public static void main(String args[])
	{
		ButEve1  ev=new ButEve1();
		ev.setSize(300,300);
		ev.setVisible(true);
	}
}