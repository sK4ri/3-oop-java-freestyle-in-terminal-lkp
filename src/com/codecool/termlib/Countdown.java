package com.codecool.termlib;

import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    Timer timer;
    public Countdown(int seconds) {
        timer = new Timer();
        timer.schedule(new ExitTimer(), seconds*1000);
    }
    class ExitTimer extends TimerTask {
        public void run() {
            System.out.println("Exit");
            System.exit(0);
        }
    }
    public static void main(String args[]) {
        new Countdown(6);
        System.out.println("Start Game!");
    }
}
