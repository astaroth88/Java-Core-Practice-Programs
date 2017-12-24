import javax.swing.*;
public class OptionPaneExample1
{
		JFrame f;
		OptionPaneExample1()
		{
			f=new JFrame();
			JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE); 
		}
		public static void main(String args[])
		{
			new OptionPaneExample1();
		}
};