import javax.swing.*;
import java.awt.event.*;
public class PasswordFieldExample1
{
	public static void main(String args[])
	{
			JFrame f=new JFrame("Password Field Application");
						
			JLabel l1=new JLabel("Username: ");
			l1.setBounds(20,50,80,30);
			final JTextField user=new JTextField();
			user.setBounds(90,50,150,30);
			
			JLabel l2=new JLabel("Password: ");
			l2.setBounds(20,90,80,30);
			final JPasswordField pass=new JPasswordField();
			pass.setBounds(90,90,150,30);
			
			JButton b=new JButton("Login");
			b.setBounds(100,130,75,30);
			
			JLabel label=new JLabel();
			label.setBounds(80,180,300,30);
			
			f.add(user);
			f.add(pass);
			f.add(l1);
			f.add(l2);
			f.add(b);
			f.add(label);
			
			f.setSize(600,500);
			f.setLayout(null);
			f.setVisible(true);
			
			b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					String data="Username: "+user.getText();
					data+=", Password: "+ new String(pass.getPassword());
					label.setText(data);
				}
			});
	}
};