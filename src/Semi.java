import java.awt.*;

public class Semi extends vehicle{
    private static int generalheight = 120;
    public Semi(int lanenumber, int xcoord){
        super(lanenumber, xcoord, generalheight);
        width = 120;
        height = generalheight;
        speed = 3;
    }



    @Override
    public void paintMe(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x,y,width,height);
    }
}
