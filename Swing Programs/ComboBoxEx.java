import javax.swing.*;
import java.awt.event.*;
public class ComboBoxEx extends JFrame
{
		JFrame f;
		ComboBoxEx()
		{
				f=new JFrame("ComboBOx Example");
				final JLabel label=new JLabel();
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setSize(400,100);
				
				JButton b=new JButton("Show");
				String languages[]={"C","C++","C#","Java","PHP"};
				final JComboBox cb=new JComboBox(languages);
				
				cb.setBounds(100,120,80,30);
				b.setBounds(200,120,70,30);
				
				f.add(cb);
				f.add(label);
				f.add(b);
				f.setLayout(null);
				f.setSize(500,500);
				f.setVisible(true);
				f.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				b.addItemListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
							String data="Programming language selected: "+cb.getItemAt(cb.getSelectedIndex());
							label.setText(data);
					}
				});
		}
		public static void main(String args[])
		{
			new ComboBoxEx();
		}
};