package com.fivestar;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyFrame extends Frame {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
           MyFrame mf=new MyFrame();
           mf.lunch();
	}

	void lunch()                  
	{
        this.setTitle("五角星");   
		this.setSize(400, 300);
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		this.setVisible(true);
		
	}

    public void paint(Graphics g)        //画五角星
    { 
    	super.paint(g);        
    	fivestar f=new fivestar();
    	f.draw(g);
    }
	
}
