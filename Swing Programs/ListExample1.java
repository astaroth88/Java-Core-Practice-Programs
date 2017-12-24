import javax.swing.*;
import java.awt.event.*;
public class ListExample1 extends JFrame
{
		ListExample1()
		{
			JFrame f=new JFrame();
			final JLabel label=new JLabel();
			label.setSize(500,300);
			JButton b=new JButton("Show");
			b.setBounds(150,300,70,30);
			
			final DefaultListModel<String> m1=new DefaultListModel<>();
			m1.addElement("C");
			m1.addElement("C++");
			m1.addElement("Java");
			m1.addElement("PHP");
			
			final JList<String> list1=new JList<>(m1);
			list1.setBounds(100,150,80,90);
			
			final DefaultListModel<String> m2=new DefaultListModel<>();
			m2.addElement("Turbo C++");
			m2.addElement("Struts");
			m2.addElement("Gel");
			m2.addElement("YII");
			m2.addElement("Spring");
			
			final JList<String> list2=new JList<>(m2);
			list2.setBounds(200,150,80,90);
			
			f.add(list1);
			f.add(list2);
			f.add(b);
			f.add(label);
			
			f.setSize(600,500);
			f.setLayout(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(EXIT_ON_CLOSE);
			b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					String data="";
					if(list1.getSelectedIndex()!=-1)
					{
						data="Programming language Selected: "+list1.getSelectedValue()+";";
						label.setText(data);
					}
					if(list2.getSelectedIndex()!=-1)
					{
						data+=" FrameWork Selected: ";
						for(Object framework:list2.getSelectedValues())
						{
							data+=","+framework;
						}
					}
					label.setText(data+";");
				}
			});
		}
		public static void main(String args[])
		{
			new ListExample1();
		}
};