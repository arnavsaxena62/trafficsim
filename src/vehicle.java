import java.awt.*;

public class vehicle {

    int HEIGHT = Traffic.frame.getWidth();
    int WIDTH = Traffic.frame.getWidth();
    int numberoflanes = Road.numberoflanes;


    int x;
    int y;
    int width;
    int height;
    int speed;
    int lane;

    int lane_height = 600/ numberoflanes;

    public vehicle(int lanenumber, int xcoord, int width){
        y = laneToY(lanenumber, width);
        x = xcoord;
        lane = lanenumber;
    }

    public int laneToY(int lane, int vehicleWidth) {
        int laneY = (lane - 1) * lane_height;
        int vehicleY = laneY + (lane_height - vehicleWidth) / 2;
        return vehicleY;
    }

    public void step(vehicle v){
        if (v.x > WIDTH - v.width){
            v.x = 0;
            if (lane<numberoflanes){
                v.lane = v.lane + 1;
            } else {
                v.lane = 1;
            }
        } else{
            v.x = v.x + v.speed;
        }
    }


    public void paintMe(Graphics g){

    }
}
