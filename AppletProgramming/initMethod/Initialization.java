import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;

public class Initialization extends Applet{
    public void init(){                         //initializing the attributes
        resize(500,500);          //resizing the window
        setBackground(Color.YELLOW);
    }
    public void paint(Graphics g){
        g.drawString("hello world!!!",50,50);
    }
}