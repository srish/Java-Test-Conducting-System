package project;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Rat extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton b1,b2;
	public Rat(String str)
	{
		super(str);
		this.setLayout(null);
	//	Toolkit t=this.getToolkit();
		//this.setSize(t.getScreenSize());
		
		
		this.setSize(980,760);
		this.setResizable(false);
		
		this.setTitle("Welcome to online java test conducting system!!!");
		ImageIcon i=new ImageIcon("Slide1.JPG");
		setBackground(Color.black);
		l1=new JLabel(i);
		l1.setBounds(0,0,980,760);
		add(l1);
		
		
		
		/*ImageIcon i=new ImageIcon("RAT Logo.jpg");
		l1=new JLabel(i);
		l1.setBounds(0,0,1400,730);
		add(l1);*/
		b1=new JButton("Close");
		Font f=new Font("Times New Roman",Font.BOLD,20);
		b1.setFont(f);
		b1.setBounds(400,500,100,40);
		l1.add(b1);
		b1.addActionListener(this);
		b2=new JButton("Next");
		Font ff=new Font("Times New Roman",Font.BOLD,20);
		b2.setFont(ff);
		
		b2.setBounds(750,500,80,40);
		l1.add(b2);
		b2.addActionListener(this);
			}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			this.dispose();
		}
		if(ae.getSource()==b2)
		{
			JavaQuiz k= new JavaQuiz("Online Java Quiz",this);
			k.setVisible(true);
			this.setVisible(false);
		}
	}
	public static void main(String a[])
	{
		Rat r=new Rat("Welcome to online java test conducting system!!!!");
		r.setVisible(true);
	}
	
}



