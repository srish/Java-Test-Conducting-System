package project;




import javax.swing.*;

import bin.Question;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.*;
import java.awt.event.*;
public class Question2  extends JFrame implements ActionListener,ItemListener
{
	Question q;
JLabel l1,l2,l3,l4,l5,l6,l7;
JButton b1,b2,b3;
JTextField t1;
JPasswordField t2;
Checkbox r,r1,r2,r3;
CheckboxGroup bg;
int s1;
int k;
int correct=0;
int wrong=0;

static int count;
static int marks;
static
{
	marks=0;
}

static
{
count=1;	
}
static{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException e){}
		
}
Choice ch3;
public Question2(String title,Choice ch4)
{
	
	super(title);
	this.setLayout(null);
	//Toolkit t=this.getToolkit();
	bg=new CheckboxGroup();
	//this.setSize(t.getScreenSize());
	this.setSize(980,740);
	this.setResizable(false);
	q=new Question();
	r=new Checkbox("A",false,bg);
	r1=new Checkbox("B",false,bg);
	r2=new Checkbox("C",false,bg);
	r3=new Checkbox("D",false,bg);
	
	
	ImageIcon i=new ImageIcon("Slide21.JPG");
	l7=new JLabel(i);
	l7.setBounds(0,0,980,740);
	add(l7);
	l1=new JLabel(" ");
	Font f1=new Font("TIMES NEW ROMAN",Font.BOLD,25);
	l1.setFont(f1);
	l1.setForeground(Color.white);
	l1.setBounds(10,0,70,50);
	l7.add(l1);
	l2=new JLabel("  ");
	Font f12=new Font("TIMES NEW ROMAN",Font.BOLD,22);
	l2.setFont(f12);
	l2.setForeground(Color.white);
	l2.setBounds(50,0,1200,50);
	
	l7.add(l2);
	
	
	l3=new JLabel("  ");
	r.setBounds(30,172, 30, 15);
	l7.add(r);
	Font f13=new Font("TIMES NEW ROMAN",Font.BOLD,25);
	l3.setFont(f13);
	l3.setForeground(Color.white);
	l3.setBounds(80,150,1200,50);
	l7.add(l3);
	
	
	l4=new JLabel("  ");
	r1.setBounds(30,272, 30, 15);
	l7.add(r1);
	Font f14=new Font("TIMES NEW ROMAN",Font.BOLD,25);
	l4.setFont(f14);
	l4.setForeground(Color.white);
	l4.setBounds(80,250,1200,50);
	l7.add(l4);
	
	
	
	l5=new JLabel("  ");
	r2.setBounds(30,372, 30, 15);
	l7.add(r2);
	Font f15=new Font("TIMES NEW ROMAN",Font.BOLD,25);
	l5.setFont(f15);
	l5.setForeground(Color.white);
	l5.setBounds(80,350,1200,50);
	l7.add(l5);
	
	
	l6=new JLabel("  ");
	r3.setBounds(30,472, 30, 15);
	l7.add(r3);
	Font f16=new Font("TIMES NEW ROMAN",Font.BOLD,25);
	l6.setFont(f16);
	l6.setForeground(Color.white);
	l6.setBounds(80,450,1200,50);
	l7.add(l6);
	
	
    b1=new JButton("->");
    
	Font f17=new Font("TIMES NEW ROMAN",Font.BOLD,25);
	b1.setFont(f17);
    
	b1.setForeground(Color.black);
	b1.setBounds(700,500,80,30);
	l7.add(b1);
	b2=new JButton("<-");
    
	Font f18=new Font("TIMES NEW ROMAN",Font.BOLD,25);
	b2.setFont(f18);
    
	b2.setForeground(Color.black);
	b2.setBounds(500,500,80,30);
	l7.add(b2);
	
	b3=new JButton("Submit");
    
	Font f19=new Font("TIMES NEW ROMAN",Font.BOLD,20);
	b3.setFont(f19);
    
	b3.setForeground(Color.black);
	b3.setBounds(600,600,110,30);
	l7.add(b3);
	b1.addActionListener(this);
  b3.addActionListener(this);
  r.addItemListener(this);
  r1.addItemListener(this);
  r2.addItemListener(this);
  r3.addItemListener(this);
  
	ch3=ch4;

}
public void actionPerformed(ActionEvent arg0) 
{
	if(arg0.getSource()==b1)
	{
	try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinenewest","root","rat");
			Statement stmt=con.createStatement();
			String str="select * from corejava where sno="+count;
			System.out.println(count +":"+str);
			ResultSet res=stmt.executeQuery(str);
			while(res.next())
			{
				q.Ques=res.getString(1);
				q.Qnum=res.getString(2);
				q.op1=res.getString(3);
				q.op2=res.getString(4);
				q.op3=res.getString(5);
				q.op4=res.getString(6);
				q.ca=res.getString(7);
				l1.setText(q.Qnum);
				l2.setText(q.Ques);
				l3.setText(q.op1);
				l4.setText(q.op2);
				l5.setText(q.op3);
				l6.setText(q.op4);
				count++;
				k=Integer.parseInt(q.ca);
				if(s1==k)
				{
					marks=marks+5;
					correct++;
					System.out.println(marks+" " + s1);
				}
				else
				{
					marks=marks-2;
					wrong++;
					System.out.println(marks+" "+ s1);
				}
				System.out.println("Marks : "+marks);
				System.out.println("Correct : "+correct);
				System.out.println("wrong : "+wrong);
			}
		}
		catch(SQLException e){System.out.println(e);}
	}
	
	if(arg0.getSource()==b3)
	{
		if(marks>=80)
		{
			System.out.println("testing block 1:-"+marks);
			DemoJWindow d1=new DemoJWindow("SCORE ",this);
			d1.setVisible(true);
			this.setVisible(false);
		}else if(marks<80&&marks>=60)
			{
			System.out.println("testing block 2:-"+marks);	
			DemoJWindow1 d2=new DemoJWindow1("",this);
				d2.setVisible(true);
				this.setVisible(false);
			}else if(marks<60)
				{
				System.out.println("testing block 3:-"+marks);
				DemoJWindow2 d3=new DemoJWindow2("",this);
					d3.setVisible(true);
					this.setVisible(false);
				System.out.println("Testing block 4");	
				}
	}
		
	if(arg0.getSource()==b2)
	{
		try
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinenewest","root","rat");
				Statement stmt=con.createStatement();
				String str="select * from adjava where sno="+count;
				System.out.println(count +":"+str);
				ResultSet res=stmt.executeQuery(str);
				while(res.next())
				{
					q.Ques=res.getString(1);
					q.Qnum=res.getString(2);
					q.op1=res.getString(3);
					q.op2=res.getString(4);
					q.op3=res.getString(5);
					q.op4=res.getString(6);
					q.ca=res.getString(7);
					l1.setText(q.Qnum);
					l2.setText(q.Ques);
					l3.setText(q.op1);
					l4.setText(q.op2);
					l5.setText(q.op3);
					l6.setText(q.op4);
					count--;
					k=Integer.parseInt(q.ca);
					if(s1==k)
					{
						marks=marks+5;
						correct++;
						System.out.println(marks+" " + s1);
					}
					else
					{
						marks=marks-2;
						wrong++;
						System.out.println(marks+" "+ s1);
					}
					System.out.println("Marks : "+marks);
					System.out.println("Correct : "+correct);
					System.out.println("wrong : "+wrong);
				}
			}
			catch(SQLException e){System.out.println(e);}
		}
	

	



	if(count==21)
	{
	JOptionPane.showMessageDialog(null,"Click Submit button to see the result","Error Message",JOptionPane.ERROR_MESSAGE);
	}
}
public void itemStateChanged(ItemEvent z)
{
	if(z.getItemSelectable()==r)
    	
	{
		s1=1;

	}
	if(z.getItemSelectable()==r1)

	{
	 s1=2;
  	}
	if(z.getItemSelectable()==r2)		   

	{
	 s1=3;
	}
	if(z.getItemSelectable()==r3)
	{
	 s1=4;
	}

	
}





}

