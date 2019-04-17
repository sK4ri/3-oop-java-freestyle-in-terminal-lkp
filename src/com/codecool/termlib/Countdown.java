package com.codecool.termlib;

import java.util.Timer;
import java.util.TimerTask;

class Countdown {
    Timer timer;
    Countdown(int seconds) {
        timer = new Timer();
        timer.schedule(new ExitTimer(), seconds*1000);
    }
    class ExitTimer extends TimerTask {
        public void run() {
            System.out.println("Exit");
            System.exit(0);
        }
    }
}
