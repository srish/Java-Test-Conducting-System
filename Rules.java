package project;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1;
	Registration obj1;
	public Rules(String title,Registration obj)
	{
		super(title);
		//Registration obj1;
		setLayout(null);
		//Toolkit t=this.getToolkit();
		//this.setSize(t.getScreenSize());
		this.setSize(980,760);
		this.setResizable(false);
		//this.setTitle("WELCOME TO LOGIN FORM !!!");
		ImageIcon i=new ImageIcon("Slide13.JPG");
		l1=new JLabel(i);
		l1.setBounds(0,0,980,760);
		add(l1);
		
		b1=new JButton("Next");
		l1.add(b1);
		b1.setBounds(850,650,80,30);
		Font f8=new Font("Times new Roman",Font.BOLD,20);
		b1.setBackground(Color.white);
		b1.setFont(f8);
		b1.addActionListener( this);
		obj1=obj;
	}
	Login ob1;
	public Rules(String title,Login ob2)
	{
		super(title);
		//Registration obj1;
		setLayout(null);
		//Toolkit t=this.getToolkit();
		//this.setSize(t.getScreenSize());
		this.setSize(980,740);
		this.setResizable(false);
		//this.setTitle("WELCOME TO LOGIN FORM !!!");
		ImageIcon i=new ImageIcon("slide13.JPG");
		l1=new JLabel(i);
		l1.setBounds(0,0,980,740);
		add(l1);
		b1=new JButton("Next");
		l1.add(b1);
		b1.setBounds(850,650,80,30);
		Font f8=new Font("Times new Roman",Font.BOLD,20);
		b1.setBackground(Color.white);
		b1.setFont(f8);
		b1.addActionListener( this);
		
		ob1=ob2;
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Choice cd=new Choice("Java Quiz",this);
			cd.setVisible(true);
			this.setVisible(false);
		}
	}
	
}