package com.fivestar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

class fivestar {
	
	private Point center=new Point(200,300); //Ô²ĞÄ
	private int radius=150;                  //°ë¾¶
	double datla=Math.PI/180;        
	
	void draw( Graphics g)
	{
		g.setColor(Color.BLUE);             //ÉèÖÃÑÕÉ«
		Point [] p=new Point[5];
	    p[0]=new Point(center.x,center.y-radius);
	    p[1]=new Point (center.x+(int)(radius*Math.sin(36.0*datla)), center.y+(int)(radius*Math.cos   (36.0*datla)));
	    p[2]=new Point (center.x-(int)(radius*Math.sin(72.0*datla)), center.y-(int)(radius*Math.cos   (72.0*datla)));
	    p[3]=new Point (center.x+(int)(radius*Math.sin(72.0*datla)), center.y-(int)(radius*Math.cos   (72.0*datla)));
	    p[4 ]=new Point (center.x-(int)(radius*Math.sin(36.0*datla)), center.y+(int)(radius*Math.cos   (36.0*datla)));
		g.drawLine(p[0].x, p[0].y, p[1].x, p[1].y);
		g.drawLine(p[1].x, p[1].y, p[2].x, p[2].y);
		g.drawLine(p[2].x, p[2].y, p[3].x, p[3].y);
		g.drawLine(p[3].x, p[3].y, p[4].x, p[4].y);
		g.drawLine(p[4].x, p[4].y, p[0].x, p[0].y);
	  //  g.drawOval(center.x,center.y,radius,radius);
	}

}
