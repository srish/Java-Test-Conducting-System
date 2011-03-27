package project;




import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;

public class JavaQuiz extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2;
	Rat r2;
	public JavaQuiz(String title,Rat r)
	{
		super(title);
		setLayout(null);
	//	Toolkit t=this.getToolkit();
		//this.setSize(t.getScreenSize());
		
	
		this.setSize(980,760);
		this.setResizable(false);
		
		//this.setTitle("Online Java Quiz!!!!");
		/*ImageIcon i=new ImageIcon("SlideA.JPG");
		l1=new JLabel(i);
		l1.setBounds(0,0,980,740);
		add(l1);*/
		ImageIcon i=new ImageIcon("SlideA.JPG");
		l1=new JLabel(i);
		l1.setBounds(0,0,980,760);
		add(l1);
		
		
		
		b1=new JButton("Login");
		b1.setBounds(400,500,100,25);
		Font fe=new Font("TIMES NEW ROMAN",Font.BOLD,20);
		b1.setFont(fe);
		
		l1.add(b1);
		b1.addActionListener(this);
		b2=new JButton("Register");
		b2.setBounds(700,500,110,25);
		Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20);
		b2.setFont(ff);
		b2.setBackground(Color.black);
		b1.setBackground(Color.black);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		l1.add(b2);
		r2=r;
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ad)
	{
		if(ad.getSource()==b1)
		{
			Login l=new Login("Login Form !!!",this);
			l.setVisible(true);
			this.setVisible(false);
		}
		if(ad.getSource()==b2)
		{
			Registration reg=new Registration("Registration Form",this);
			reg.setVisible(true);
			this.setVisible(false);
		}
	}
	
	Login r3;
	public JavaQuiz(String title,Login r4)
	{
			super(title);
		setLayout(null);
		//Toolkit t=this.getToolkit();
		//this.setSize(t.getScreenSize());
		
	
		this.setSize(980,740);
		this.setResizable(false);
		
		this.setTitle("Online Java Quiz!!!!");
		ImageIcon i=new ImageIcon("SlideA.JPG");
		l1=new JLabel(i);
		l1.setBounds(0,0,980,740);
		add(l1);
		
		
		
		b1=new JButton("Login");
		b1.setBounds(400,500,100,25);
		Font fe=new Font("TIMES NEW ROMAN",Font.BOLD,20);
		b1.setFont(fe);
		
		l1.add(b1);
		b1.addActionListener(this);
		b2=new JButton("Register");
		b2.setBounds(800,500,110,25);
		Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20);
		b2.setFont(ff);
		
		l1.add(b2);
		r3=r4;
		b2.addActionListener(this);
	}
	
	
	/*public static void main(String s[])
	{
		JavaQuiz jq=new JavaQuiz();
		jq.setVisible(true);
	}*/
}
