import javax.swing.*;
public class TableExample extends JFrame
{
		JFrame f;
		TableExample()
		{
				f=new JFrame();
				String data[][]={{"101","Amit","670000"},{"102","Jay","730000"},{"201","Abhi","480000"}};
				String column[]={"ID","NAME","SALARY"};
				JTable jt=new JTable(data,column);	//table data,table column
				jt.setBounds(50,50,200,300);
				JScrollPane sp=new JScrollPane(jt);
				f.add(sp);
				f.setSize(600,300);
				f.setVisible(true);
				f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		public static void main(String args[])
		{
			new TableExample();
		}
}