import javax.swing.*;
public class InputDialogExample
{
		JFrame f;
		InputDialogExample()
		{
				f=new JFrame();
				String name=JOptionPane.showInputDialog(f,"Enter Name");
		}
		public static void main(String args[])
		{
			new InputDialogExample();
		}
};