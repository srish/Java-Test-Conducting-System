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
import java.awt.font.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


	public class Registration extends JFrame implements ActionListener
	{
		
		JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4,t5;
		JButton b1;
	   	JavaQuiz z;
	   	static{
	   			try
	   			{
	   				
	   			
			Class.forName("com.mysql.jdbc.Driver");	
	   			}catch(ClassNotFoundException e){}
	   			
		      }
		
		public Registration(String srt,JavaQuiz z1)
		{	
				super(srt);
			this.setLayout(null);
			//Toolkit t=this.getToolkit();
			//this.setSize(t.getScreenSize());
			this.setSize(980, 760);
			this.setResizable(false);
			ImageIcon i=new ImageIcon("Slide11.JPG");
			l1=new JLabel(i);
			l1.setBounds(0,0,980,760);
			add(l1);

			t1=new JTextField(15);
			t1.setBounds(700,200,230,28);
			l1.add(t1);
			t2=new JPasswordField(15);
			t2.setBounds(700,300,230,28);
			l1.add(t2);
			t3=new JPasswordField(15);
			t3.setBounds(700,400,230,28);
			l1.add(t3);
			t4=new JTextField(30);
			t4.setBounds(700,500,230,28);
			l1.add(t4);
			t5=new JTextField(30);
			t5.setBounds(700,600,230,28);
			l1.add(t5);
			b1=new JButton("Submit");
			Font fs=new Font("Times New Roman",Font.BOLD,20);
			b1.setFont(fs);
			b1.setBounds(450,650,100,25);
			l1.add(b1);
			b1.addActionListener(this);
			z=z1;
			}
		private static void forName(String string) {
			// TODO Auto-generated method stub
			
		}
		public void actionPerformed(ActionEvent ad)
		{
			if(ad.getSource()==b1)
			{
				
			String s1=t1.getText();
			String s2=t2.getText();
			System.out.println(s1+""+s2);
			try
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetest","root","RAT");
				Statement stmt=con.createStatement();
				String str="insert into logintable1 values('"+s1+"','"+s2+"')";
				System.out.println(str);
				stmt.executeUpdate(str);
				ResultSet res=stmt.executeQuery("Select * from logintable1");
				while(res.next())
				{
					System.out.println(res.getString(1)+":"+res.getString(2));
				}
				t1.setText("");
				t2.setText("");
			}
			catch(SQLException e)
			{
				
				System.out.println(e);
			}
			Rules lr=new Rules("Rules & Regulations !!!",this);
				lr.setVisible(true);
				this.setVisible(false);
		}
	
	        

		}
	
	        
	}	        
		
	
	
	
	




