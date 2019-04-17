package com.codecool.termlib;

import java.awt.*;  
import java.awt.event.*;  
    public class Input extends Frame implements Input{  
        Label l;  
        TextArea area;  
        Input(){     
            l=new Label();  
            l.setBounds(20,50,100,20);  
            area=new TextArea();  
            area.setBounds(20,80,300, 300);  
            area.addKeyListener(this);  
              
            add(l);add(area);  
            setSize(400,400);  
            setLayout(null);  
            setVisible(true); 
        }   
        public void keyReleased(KeyEvent e) {  
            l.setText("Key Released");  
        }  
        public void keyTyped(KeyEvent e) {  
            l.setText("Key Typed");  
        }  
	public void keyPressed (KeyEvent e) {
        int c = e.getKeyCode ();
		int y = 0;
		int x = 0;
        if (c==KeyEvent.VK_UP) {                
            y--;   
        } else if(c==KeyEvent.VK_DOWN) {                
            y++;   
        } else if(c==KeyEvent.VK_LEFT) {                
            x--;   
        } else if(c==KeyEvent.VK_RIGHT) {                
            x++;   
        }
        System.out.println (x);
	System.out.println (y); 
    	}  
      
        public static void main(String[] args) {  
            new Input();  
        }
} 

