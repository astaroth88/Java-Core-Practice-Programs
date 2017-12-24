import java.awt.*;
class FontDemo extends Frame
{
	Label label1,label2,label3;
	Font font;
	
	FontDemo()
	{
		super("FontDemo");
		setLayout(new FlowLayout());
		
		label1=new Label("This is the default Font.");
		label1.setFont(font);
		
		font=new Font("Arial",Font.BOLD,20);
		label2=new Label("This is in Arial, Bold and size=20");
		label2.setFont(font);
		
		font=new Font("Arial",Font.BOLD+Font.ITALIC,50);
		label3=new Label("This is in Arial, Bold,Italic and size=50");		
		label3.setFont(font);
		
		add(label1);
		add(label2);
		add(label3);
		pack();
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new FontDemo();
	}
};