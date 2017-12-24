import javax.swing.*;
import java.awt.event.*;
public class FoodOrder extends JFrame implements ActionListener
{
	JLabel l;
	JCheckBox cb1,cb2,cb3;
	JButton b;
	FoodOrder()
	{
		l=new JLabel("Food Ordering System");
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setSize(300,120);	// component.setSize(width, y-axis)
		cb1=new JCheckBox("Pizza @100");
		cb1.setBounds(100,150,120,30);
		cb2=new JCheckBox("Pakhalo @50");
		cb2.setBounds(100,180,120,30);
		cb3=new JCheckBox("Puri @30");
		cb3.setBounds(100,210,120,30);
		
		b=new JButton("Order");
		b.setBounds(120,250,80,30);
		b.addActionListener(this);
		
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent a)
	{
		float amount=0;
		String msg="";
		if(cb1.isSelected())
		{
			amount+=100;
			msg="Pizza:100\n";
		}
		if(cb2.isSelected())
		{
			amount+=30;
			msg+="Pakhalo: 50\n";
		}
		if(cb3.isSelected())
		{
			amount+=10;
			msg+="Puri: 30\n";
		}
		msg+="........................\n";
		JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
	}
	public static void main(String args[])
	{
		new FoodOrder();
	}
};