import javax.swing.*;
import javax.swing.event.*;
public class TableExample1 extends JFrame
{
		public static void main(String a[])
		{
				JFrame f=new JFrame("Table Example");
				String data[][]={{" "," "," "},{" "," "," "},{" "," "," "}};
				String column[]={"ID","NAME","SALARY"};
				
				final JTable jt= new JTable(data,column);				
				jt.setCellSelectionEnabled(true);
				ListSelectionModel select=jt.getSelectionModel();
				select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				select.addListSelectionListener(new ListSelectionListener()
				{	
					public void valueChanged(ListSelectionEvent e)
					{
							String Data=null;
							int[] row=jt.getSelectedRows();
							int[] column=jt.getSelectedColumns();
							
							for(int i=0;i<row.length;i++)
							{
								for(int j=0;j<column.length;j++)
								{
									Data=(String)jt.getValueAt(row[i],column[j]);
								}
							}
							System.out.println("Table element selected is: "+Data);
					}
				});
				JScrollPane sp=new JScrollPane(jt);
				f.add(sp);
				f.setSize(400,300);
				f.setVisible(true);
				f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
};