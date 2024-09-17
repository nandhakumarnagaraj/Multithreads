import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyApp extends JFrame implements ActionListener {
	
	static int count;
	
	JTextField txt2;
	JTextArea txt3;
	JTextArea txt4;
	JTextArea txt5;
	
	JButton btn1;
		
	
	
	MyApp(String title, int width, int height)
	{
		super(title);
		setBounds(0,0,width, height);
		
		txt2= new JTextField();
		txt3= new JTextArea();
		txt4= new JTextArea();
		txt5= new JTextArea();
		
		btn1=new JButton("submit");
		
		setLayout(null);
		
		txt2.setBounds(100,90,100, 30);
		txt3.setBounds(250,50,300, 600);
		txt4.setBounds(610,50,300, 600);
		txt5.setBounds(920,50,300, 600);
		
		btn1.setBounds(100,130,100, 30);
		
		
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);
		add(btn1);
		
		btn1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		System.out.println(width);
		
		MyApp app = new MyApp("My Application",width,height);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(count==0)
		{
			ThreadOne one = new ThreadOne(this);
			one.start();
		}
		else if(count==1)
		{
			ThreadTwo two = new ThreadTwo(this);
			two.start();
		}
		
		else if(count==2)
		{
			ThreadThree three = new ThreadThree(this);
			three.start();
		}
	
		count++;
		
	}

}
