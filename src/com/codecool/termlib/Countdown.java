package com.codecool.termlib;

import java.util.Timer;
import java.util.TimerTask;

class Countdown {
    Timer timer;
    Countdown(int seconds) {
        timer = new Timer();
        timer.schedule(new ExitTimer(), seconds*1000);
        System.out.println("Time left: " + seconds);
    }
    class ExitTimer extends TimerTask {
        public void run() {
            System.out.println("\n Time is up!");
            System.exit(0);
        }
    }
}
