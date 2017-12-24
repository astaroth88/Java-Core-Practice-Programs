import javax.swing.*;
import java.awt.event.*;
public class MenuExample1 implements ActionListener
{
	JFrame f;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea ta;
	MenuExample1()
	{
		f=new JFrame();
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		selectAll=new JMenuItem("Select All");
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
		mb=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		help=new JMenu("Help");
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		
		ta=new JTextArea();
		ta.setBounds(5,5,300,400);
		
		f.setJMenuBar(mb);
		f.add(ta);
		f.setLayout(null);
		f.setSize(600,450);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cut)
			ta.cut();
		if(e.getSource()==copy)
			ta.copy();
		if(e.getSource()==paste)
			ta.paste();
		if(e.getSource()==selectAll)
			ta.selectAll();
	}
	public static void main(String args[])
	{
		new MenuExample1();
	}
};