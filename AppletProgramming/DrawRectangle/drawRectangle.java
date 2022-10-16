import java.awt.Graphics;
import java.applet.Applet;

public class drawRectangle extends Applet{
    int x,y,a,b;
        public void init(){
            x = Integer.parseInt(getParameter("xVal"));
            y = Integer.parseInt(getParameter("yVal"));
            a = Integer.parseInt(getParameter("length"));
            b = Integer.parseInt(getParameter("breadth"));
        }
        public void paint(Graphics g){
            g.drawRect(x,y,a,b);
        }
}