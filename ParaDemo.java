package project; 

import java.applet.*;
import java.awt.*;
/*
 <applet code="ParamDemo" width=300 height=80>
 <param name=fontName value=Bold>
 <param name=fontSize value=14>
 <param name=leading value=2>
 <param name=accountEnabled value=true>
 </Applet> 
 */
public class ParaDemo extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String fontName;
	int fontSize;
	float leading;
	boolean active;
	
	public void start(){
		String param;
		fontName=getParameter("fontName");
		if(fontName==null)
			fontName="Not Found";
		
		param=getParameter("fontSize");
		try{
			if(param!=null)
				fontSize=Integer.parseInt(param);
			else
				fontSize=0;	
		}
		catch(NumberFormatException e){
			fontSize=-1;
		}
	param=getParameter("leading");
	try{
			if(param!=null)
				leading=Float.valueOf(param).floatValue();
		
			else
				leading=0;
		}catch(NumberFormatException e){
			leading =-1;
	}
	param = getParameter("accountEnabled");
	if(param!=null)
		active=Boolean.valueOf(param).booleanValue();
}
/*	public void init()
	{
		setBackground(Color.cyan);
	}*/
	public void paint(Graphics g)
	{
		g.drawString("Font name : "+fontName , 10, 20);
		g.drawString("Font size : "+fontSize , 10, 40);
		g.drawString("leading : "+leading , 10, 60);
		g.drawString("Account active : "+active , 10, 80);
	}
	}


		

