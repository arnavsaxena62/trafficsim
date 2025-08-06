import java.awt.*;



import java.awt.*;

public class SUV extends vehicle{
    private static int generalheight = 50;
    public SUV(int lanenumber, int xcoord){
        super(lanenumber, xcoord, generalheight);
        width = 100;
        height = generalheight;
        speed = 5;
    }



    @Override
    public void paintMe(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(x,y,width,height);
    }
}
