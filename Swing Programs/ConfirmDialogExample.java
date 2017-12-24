import javax.swing.*;
import java.awt.event.*;
public class ConfirmDialogExample extends WindowAdapter
{
	JFrame f;
	ConfirmDialogExample()
	{
		f=new JFrame();
		f.addWindowListener(this);
		f.setSize(400,600);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
		System.out.println(a);		
		if(a==0)
		{
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	public static void main(String args[])
	{
		new ConfirmDialogExample();
	}
};