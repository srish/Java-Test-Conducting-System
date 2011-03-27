package project;



import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


	public class AboutUs extends JFrame implements ActionListener
	{
		JLabel l1,l2;
		JCheckBox c1,c2; 
		JButton b1;
		DemoJWindow djw1;
		public AboutUs(String s,DemoJWindow djw2)
		{
			super(s);
			this.setLayout(null);
			//Toolkit t=this.getToolkit();
			//this.setSize(t.getScreenSize());
			this.setSize(980,740);
			this.setResizable(false);
			//this.setTitle("WELCOME TO LOGIN FORM !!!");
			ImageIcon i=new ImageIcon("Slide20.JPG");
			l1=new JLabel(i);
			/*Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20)* ;
			l1.setFont(ff);*/
			l1.setBounds(0,0,980,740);
			add(l1);
			b1=new JButton("Close");
			Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20);
			l1.setFont(ff);
			b1.setBounds(430,630,75,30);
			add(b1);
			b1.addActionListener(this);
			djw1=djw2;
			
		
		}
		DemoJWindow1 djw3;
		public AboutUs(String s,DemoJWindow1 djw4)
		{
			super(s);
			this.setLayout(null);
			//Toolkit t=this.getToolkit();
			//this.setSize(t.getScreenSize());
			this.setSize(980,740);
			this.setResizable(false);
			//this.setTitle("WELCOME TO LOGIN FORM !!!");
			ImageIcon i=new ImageIcon("Slide12.JPG");
			l1=new JLabel(i);
			/*Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20);
			l1.setFont(ff);*/
			l1.setBounds(0,0,980,740);
			add(l1);
			b1=new JButton("Close");
			Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20);
			l1.setFont(ff);
			b1.setBounds(430,630,75,30);
			add(b1);
			djw3=djw4;
			b1.addActionListener(this);
		
		}
		DemoJWindow2 djw5;
		public AboutUs(String s,DemoJWindow2 djw6)
		{
			super(s);
			this.setLayout(null);
			//Toolkit t=this.getToolkit();
			//this.setSize(t.getScreenSize());
			this.setSize(980,740);
			this.setResizable(false);
			//this.setTitle("WELCOME TO LOGIN FORM !!!");
			ImageIcon i=new ImageIcon("Slide20.JPG");
			l1=new JLabel(i);
			/*Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20);
			l1.setFont(ff);*/
			l1.setBounds(0,0,980,740);
			add(l1);
			b1=new JButton("Close");
			Font ff=new Font("TIMES NEW ROMAN",Font.BOLD,20);
			l1.setFont(ff);
			b1.setBounds(430,630,75,30);
			add(b1);
			djw5=djw6;
			b1.addActionListener(this);
		
		}
		public void actionPerformed(ActionEvent aed)
		{
			if(aed.getSource()==b1)
			{
				this.dispose();
			}
		}
	
	
		
	}
			


