import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ComboBoxExample extends JFrame
{
		JFrame f;
		ComboBoxExample()
		{
				f=new JFrame("ComboBox Example");
				String country[]={"India","Australia","U.S.A","England","New Zealand"};
				JComboBox cb=new JComboBox(country);
				cb.setBounds(50,50,100,30);
				f.add(cb);
				f.setLayout(null);
				f.setSize(500,500);
				f.setVisible(true);
				f.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
		public static void main(String args[])
		{
				new ComboBoxExample();
		}
};