package com.codecool.termlib;

import java.util.Timer;
import java.util.TimerTask;

public class Countdown {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new App(), 0, 1000);
    }
}

class App extends TimerTask {

    int countdown = 6;

    public void run() {
        countdown = countdown - 1;
        System.out.println(countdown);
        if (countdown == 0) {
          System.out.println("exit...");
          // Terminate JVM
          System.exit(0);
        }
    }
}
