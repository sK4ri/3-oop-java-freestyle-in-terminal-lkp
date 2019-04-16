import java.awt.*;
import java.awt.event.*;

public class KeyListener {
  int arrowDirection;
  public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_UP){
        arrowDirection = 1;
        System.out.println(arrowDirection);
    }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
        arrowDirection = 2;
        System.out.println(arrowDirection);
    }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
        arrowDirection = 3;
        System.out.println(arrowDirection);
    }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
        arrowDirection = 4;
        System.out.println(arrowDirection);
    }
  }

  public static void main(String[] args) {
       new KeyListener();
  }
}
