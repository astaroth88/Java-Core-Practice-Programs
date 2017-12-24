import javax.swing.*;
import java.awt.event.*;
public class CheckBoxExample1
{
	CheckBoxExample1()
	{
		JFrame f=new JFrame("CheckBox Example");
		
		final JLabel label1=new JLabel();
		label1.setBounds(60,20,200,30);
		final JLabel label2=new JLabel();
		label2.setBounds(60,50,200,30);
		
		JCheckBox cb1=new JCheckBox("C++");
		cb1.setBounds(150,100,80,50);
		JCheckBox cb2=new JCheckBox("Java");
		cb2.setBounds(150,150,80,50);
		
		f.add(cb1);
		f.add(cb2);
		f.add(label1);
		f.add(label2);
		
		cb1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				label1.setText("C++ CheckBox: "+ (ie.getStateChange()==1?"checked":"unchecked"));
			}
		});
		cb2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				label2.setText("Java CheckBox: "+ (ie.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		f.setSize(600,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
			new CheckBoxExample1();
	}
}
