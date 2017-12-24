import javax.swing.*;
public class PasswordFieldExample
{
		public static void main(String args[])
		{
				JFrame f=new JFrame("Password Field Example");
				JPasswordField pass=new JPasswordField();
				
				JLabel l1=new JLabel("Password: ");
				l1.setBounds(50,100,70,30);
				pass.setBounds(120,100,150,30);
				
				f.add(pass);
				f.add(l1);
				
				f.setSize(500,400);
				f.setLayout(null);
				f.setVisible(true);
		}
}