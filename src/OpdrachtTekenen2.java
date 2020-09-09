import java.awt.*;
import java.applet.*;

public class OpdrachtTekenen2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 100, 60);
        g.drawLine(100, 60, 150, 120);
        g.drawLine(150, 120, 50, 120);
        g.drawRect(50,120,100,80);
        g.drawLine(50,160,70,160);
        g.drawLine(70,160,70,200);
        g.drawRoundRect(90,150,50,25,10,10);
        g.drawRoundRect(90,85,20,20,10,10);
    }
}