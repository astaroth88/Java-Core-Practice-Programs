import javax.swing.*;
import java.awt.event.*;
public class TextFieldExample1 implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	TextFieldExample1()
	{
		JFrame f=new JFrame();
		tf1=new JTextField();
		tf1.setBounds(50,50,200,20);
		
		tf2=new JTextField();
		tf2.setBounds(50,80,200,20);
		
		tf3=new JTextField();
		tf3.setBounds(50,110,200,20);
		tf3.setEditable(false);
		
		b1=new JButton("Add");
		b1.setBounds(50,140,80,30);
		
		b2=new JButton("Sub");
		b2.setBounds(140,140,80,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		
		f.setSize(600,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(ae.getSource()==b1)
		{
			c=a+b;
		}
		else if(ae.getSource()==b2)
		{
			c=a-b;
		}
		String result=String.valueOf(c);	//converts Integer DataType into String
		tf3.setText(result);
	}
	public static void main(String args[])
	{
		new TextFieldExample1();
	}
};
	