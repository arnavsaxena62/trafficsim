import java.awt.*;



import java.awt.*;

public class Sport extends vehicle{
    private static int generalheight = 30;
    public Sport(int lanenumber, int xcoord){
        super(lanenumber, xcoord, generalheight);
        width = 50;
        height = generalheight;
        speed = 10;
    }



    @Override
    public void paintMe(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x,y,width,height);
    }
}
