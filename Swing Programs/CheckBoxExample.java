import javax.swing.*;
public class CheckBoxExample
{
	CheckBoxExample()
	{
		JFrame f=new JFrame("CheckBox Example");
		JCheckBox cb1=new JCheckBox("C++");
		cb1.setBounds(100,100,80,50);
		JCheckBox cb2=new JCheckBox("Java",true);
		cb2.setBounds(100,150,80,50);
		f.add(cb1);
		f.add(cb2);
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new CheckBoxExample();
	}
}