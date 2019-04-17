package com.codecool.termlib;

import java.awt.*;
import java.awt.event.*;

public class Input extends Frame implements KeyListener {
    Label l;
    TextArea area;

    // helper window
    Input() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }
    // keypress checking
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_UP) {
            returnRed();
        } else if (c == KeyEvent.VK_DOWN) {
            returnGreen();
        } else if (c == KeyEvent.VK_LEFT) {
            returnMagenta();
        } else if (c == KeyEvent.VK_RIGHT) {
            returnBlue();
        }
    }

    String returnRed() {return "31";}
    String returnGreen() {return "32";}
    String returnBlue() {return "34";}
    String returnMagenta() {return "35";}
}

