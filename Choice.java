package project;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Choice extends JFrame implements ActionListener,ItemListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Checkbox r,r1;
	CheckboxGroup bg;
	JLabel l1;
	JButton b1,b2;
	Checkbox s1;
	Rules w;
	public Choice(String str,Rules w1)
	{
		super(str);
		this.setLayout(null);
		bg=new CheckboxGroup();
		//Toolkit t=this.getToolkit();
		//this.setSize(t.getScreenSize());
		this.setSize(980,760);
		this.setResizable(false);
		r=new Checkbox("",false,bg);
		r1=new Checkbox("",false,bg);
		ImageIcon i=new ImageIcon("slide14.JPG");
		l1=new JLabel(i);
		l1.setBounds(0,0,980,740);
		add(l1);
		r.setBounds(310,380,15,15);
		l1.add(r);
		r1.setBounds(310,460,15,15);
		l1.add(r1);
		b1=new JButton("Next");
		b1.setBounds(500,550,75,25);
		l1.add(b1);
		b1.addActionListener(this);
		r.addItemListener(this);
		r1.addItemListener(this);
		w=w1;
	}
	

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(s1==r)
			{
			Question1 q1=new Question1(" Advance Java Question Form",this);
			q1.setVisible(true);
			this.setVisible(false);
			}
			if(s1==r1)
			{
			Question2 q2=new Question2("Core Java Question Form",this);
			q2.setVisible(true);
			this.setVisible(false);
			}
		}
		
	}
	public void itemStateChanged(ItemEvent z)
	{
		if(z.getItemSelectable()==r)
	    {
			s1=r;
			
    	}
		if(z.getItemSelectable()==r1)
		{
			s1=r1;
			
	  	}

	}
/*	public static void main(String s[])
	{
		Choice c=new Choice("JAVA QUIZ");
		c.setVisible(true);
		//this.setVisible(false);
	*/}
	
