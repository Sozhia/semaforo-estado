package ull.dap;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chronometer implements ActionListener {
    int seconds;
    Timer timer;

    Chronometer(){
        seconds = 0;
        timer = new Timer(1000, this);
        timer.start();
    }
/*
    public int getSeconds() { return seconds; }
    public int getMinutes() { return minutes; }
    public int getHours() { return hours; }
*/
    /**
     * Invoked when an action occurs. In this case each second (1000 mlscnds)
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        seconds ++;
        System.out.println(seconds);
        if (seconds > 23)
            timer.restart();
    }

    public void restart(){
        timer.stop();
        seconds = 0;
        timer.restart();
    }

}
