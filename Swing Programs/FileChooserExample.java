import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class FileChooserExample extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file;
	JMenuItem open;
	JTextArea ta;
	FileChooserExample()
	{
			open=new JMenuItem("Open File");
			open.addActionListener(this);
			file=new JMenu("File");
			file.add(open);
			mb= new JMenuBar();
			mb.setBounds(0,0,800,20);
			mb.add(file);
			ta=new JTextArea(1500,1500);
			ta.setBounds(0,20,400,400);
			add(mb);
			add(ta);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==open)
		{
			JFileChooser fc=new JFileChooser();
			int i=fc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION)
			{
				File f=fc.getSelectedFile();
				String filepath=f.getPath();
				try
				{
					BufferedReader br=new BufferedReader(new FileReader(filepath));
					String s1="",s2="";
					while((s1=br.readLine())!=null)
					{
						s2+=s1+"\n";
					}
					ta.setText(s2);
					br.close();
				}catch(Exception ex){ex.printStackTrace();}
			}
		}
	}
	public static void main(String args[])
	{
		FileChooserExample yo=new FileChooserExample();
		yo.setSize(500,500);
		yo.setLayout(null);
		yo.setVisible(true);
		yo.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
};