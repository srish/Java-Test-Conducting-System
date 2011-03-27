package project;




import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
		JLabel l;
		JLabel l1,l2;
		JTextField t1,t2;
		JButton b1,b2;
		JavaQuiz r1;
		String s3=new String();
		static{
   			try
   			{
   				Class.forName("com.mysql.jdbc.Driver");	
   			}catch(ClassNotFoundException e){}
   			
	      }
	
		public Login(String str,JavaQuiz r)
		{
			super(str);
			setLayout(null);
			//Toolkit t=this.getToolkit();
			//this.setSize(t.getScreenSize());
			
			
			this.setSize(980,760);
			this.setResizable(false);
			//this.setTitle("WELCOME TO LOGIN FORM !!!");
			ImageIcon i=new ImageIcon("SlideC.JPG");
			l=new JLabel(i);
			l.setBounds(0,0,980,760);
			l.setBackground(Color.black);
			add(l);
			t1=new JTextField(10);
			t1.setBounds(700,350,200,25);
			l.add(t1);			
	
			t2=new JPasswordField(10);
			t2.setBounds(700,465,200,25);
			l.add(t2);
			b1=new JButton("Submit");
			b1.setBounds(750,600,80,25);
			l.add(b1);
			/*b2=new JButton("SIGN UP");
			b2.setBounds(1000,650,100,50);
			l.add(b2);*/
			r1=r;
			/*b2.addActionListener(this);*/
			b1.addActionListener(this);
			b2=new JButton("Back");
			b2.setBounds(550,600,80,25);
			l.add(b2);
			b2.addActionListener(this);
			
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
			if(s1.equals(s3)||s2.equals(s3))
			{
				JOptionPane.showMessageDialog(null,"Fields cannot be left blanked","Invalid",JOptionPane.ERROR_MESSAGE);			
			
			}
			else
			{
			try
			{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetest","root","RAT");
				java.sql.Statement stmt=con.createStatement();
				ResultSet res=stmt.executeQuery("select * from logintable1");
				int flag=0;
				while(res.next())
				{
					String username=res.getString(1);
					String password=res.getString(2);
					System.out.println("testing block:-"+username +":"+password);
					if(s1.equals(username)&& s2.equals(password))
					{
					flag=1;
					break;
					}
				}
				if(flag==1)
				{
					this.setVisible(false);
					Rules lr=new Rules("Rules & Regulations !!!",this);
					lr.setVisible(true);
					}
					if(flag==0)
					{
					JOptionPane.showMessageDialog(null,"invalid user name or password","invalid",JOptionPane.ERROR_MESSAGE);
					}
				
			}
			catch(SQLException e){System.out.println(e);}
			
		}
			if(ad.getSource()==b2)
			{
				JavaQuiz z=new JavaQuiz("Online Java Quiz!!!!",this);
				z.setVisible(true);
				this.setVisible(false);
			}
			
		}
		
		
		

		}
		
		
		


}