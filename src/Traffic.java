import javax.swing.*;
import java.awt.*;


import static java.lang.Thread.sleep;

public class Traffic {

    public static JFrame frame = new JFrame("traffic");
    Road road = new Road();
    public Traffic(){

        int HEIGHT = 600;
        int WIDTH = 800;

        frame.setSize(WIDTH,HEIGHT);
        frame.setLayout(new BorderLayout());

        frame.add(road, BorderLayout.CENTER);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Semi testSemi = new Semi(1,20);
        SUV testSUV = new SUV(1,20);
        Sport testSport = new Sport(3,20);
        road.addcar(testSemi);
        road.addcar(testSUV);
        road.addcar(testSport);
        frame.repaint();

        while (true){
            testSport.step(testSport);
            testSemi.step(testSemi);
            testSUV.step(testSUV);

            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            frame.repaint();
        }

    }

    public static void main(String[] args) {
        new Traffic();
    }
}