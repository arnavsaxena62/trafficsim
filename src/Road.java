import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Road extends JPanel {

    final static int numberoflanes = 4;
    public int lane_height = 600/numberoflanes;

    ArrayList<vehicle> cars = new ArrayList<>();

    public Road() {
        super();
    }

    public void addcar(vehicle v){
        cars.add(v);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());


        g.setColor(Color.white);
        for (int i = lane_height; i < getWidth(); i=i+lane_height) {
            for (int j = 0; j < getWidth(); j=j+35) {
                g.fillRect(j,i,30,2);
            }
        }
        for (vehicle car : cars) {
            car.paintMe(g);
        }
    }
}
