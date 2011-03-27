package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class DemoJWindow2 extends JFrame implements ActionListener
{
	
	JLabel l1,l2,l3,l4,l5;
	Question1 ob5;
	JButton b1;
	JTextField t1,t2,t3;
	public DemoJWindow2(String title,Question1 obj6)
	{
		super(title);
		this.setLayout(null);
		this.setSize(650,650);
		this.setResizable(false);
		
		//setLayout(null);
		//setBounds(350,200,600,400);
		System.out.println("next window");
		ImageIcon i=new ImageIcon("fail.jpg");
		l1=new JLabel(i);
		l1.setBounds(150,80,150,150);
		
		add(l1);
		
		l2=new JLabel("JAVA QUIZ!!!");
		l2.setForeground(Color.blue);
		Font fn=new Font("Times New Roman",Font.ITALIC,35);
		l2.setFont(fn);
		l2.setBounds(150,0,200,50);
		add(l2);
		l3=new JLabel("Your Score :-");
		l3.setForeground(Color.blue);
		Font fn2=new Font("Times New Roman",Font.ITALIC,35);
		l3.setFont(fn2);
		l3.setBounds(100,250,250,50);
		add(l3);
		t1=new JTextField(10);
		t1.setBounds(380,270,100,25);
		add(t1);
	    t1.setText(""+obj6.marks);
	    l4=new JLabel("Correct Answers :-");
		l4.setForeground(Color.blue);
		Font fn3=new Font("Times New Roman",Font.ITALIC,35);
		l4.setFont(fn3);
		l4.setBounds(100,350,300,50);
		add(l4);
		t2=new JTextField(10);
		t2.setBounds(380,360,100,25);
		add(t2);
	    t2.setText(""+obj6.correct);
	    l5=new JLabel("Wrong Answers :-");
		l5.setForeground(Color.blue);
		Font fn4=new Font("Times New Roman",Font.ITALIC,35);
		l5.setFont(fn4);
		l5.setBounds(100,450,300,50);
		add(l5);
		t3=new JTextField(10);
		t3.setBounds(380,470,100,25);
		add(t3);
	    t3.setText(""+obj6.wrong);
	    b1=new JButton("Next");
		b1.setForeground(Color.blue);
		Font fn45=new Font("Times New Roman",Font.ITALIC,35);
		b1.setFont(fn45);
		b1.setBounds(280,530,100,50);
		add(b1);
	b1.addActionListener(this);
	
		ob5=obj6;
	}
	Question2 ob7;
	public DemoJWindow2(String title,Question2 ob8)
	{
		super(title);
		this.setLayout(null);
		this.setSize(650,650);
		this.setResizable(false);
		
		//setLayout(null);
		//setBounds(350,200,600,400);
		System.out.println("next window");
		ImageIcon i=new ImageIcon("fail.jpg");
		l1=new JLabel(i);
		l1.setBounds(150,80,150,150);
		
		add(l1);
		
		l2=new JLabel("JAVA QUIZ!!!");
		l2.setForeground(Color.blue);
		Font fn=new Font("Times New Roman",Font.ITALIC,35);
		l2.setFont(fn);
		l2.setBounds(150,0,200,50);
		add(l2);
		l3=new JLabel("Your Score :-");
		l3.setForeground(Color.blue);
		Font fn2=new Font("Times New Roman",Font.ITALIC,35);
		l3.setFont(fn2);
		l3.setBounds(100,250,250,50);
		add(l3);
		t1=new JTextField(10);
		t1.setBounds(380,270,100,25);
		add(t1);
	    t1.setText(""+ob8.marks);
	    l4=new JLabel("Correct Answers :-");
		l4.setForeground(Color.blue);
		Font fn3=new Font("Times New Roman",Font.ITALIC,35);
		l4.setFont(fn3);
		l4.setBounds(100,350,300,50);
		add(l4);
		t2=new JTextField(10);
		t2.setBounds(380,360,100,25);
		add(t2);
	    t2.setText(""+ob8.correct);
	    l5=new JLabel("Wrong Answers :-");
		l5.setForeground(Color.blue);
		Font fn4=new Font("Times New Roman",Font.ITALIC,35);
		l5.setFont(fn4);
		l5.setBounds(100,450,300,50);
		add(l5);
		t3=new JTextField(10);
		t3.setBounds(380,470,100,25);
		add(t3);
	    t3.setText(""+ob8.wrong);
	    b1=new JButton("Next");
		b1.setForeground(Color.blue);
		Font fn45=new Font("Times New Roman",Font.ITALIC,35);
		b1.setFont(fn45);
		b1.setBounds(280,530,100,50);
		add(b1);
		b1.addActionListener(this);
		ob7=ob8;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			AboutUs ad=new AboutUs("AboutUs Form",this);
			ad.setVisible(true);
			this.setVisible(false);
		}
	}

}

	
	

