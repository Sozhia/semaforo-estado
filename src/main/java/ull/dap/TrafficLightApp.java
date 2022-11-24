package ull.dap;

import javax.swing.*;
import java.awt.event.*;

import static java.lang.Thread.sleep;

public class TrafficLightApp extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel timerValue;

    Chronometer chronometer;
    private TrafficLight trafficLight;

    public TrafficLightApp() {
        this.setSize(720,480);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setVisible(true);

        chronometer = new Chronometer();
        trafficLight = new TrafficLight();
        trafficLight.onStart();
        System.out.println(trafficLight.state.getState());
        do{
            // timerValue.setText(String.valueOf(chronometer.seconds));
            trafficLightCycle();
        }while(true);

/*
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

*/
    }

    private void onOK() {
        // add your code here


    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void trafficLightCycle(){
       if (chronometer.seconds == (10 | 13 | 20 | 23)) {
           trafficLight.changeState();
           System.out.println(trafficLight.state.getState());
        }
    }
}
