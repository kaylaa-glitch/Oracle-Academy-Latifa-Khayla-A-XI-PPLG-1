import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {
    Font font;
    Color darkGrayColor;
    Color grayColor;
    Color backgroundColor;

    public void init() {
        font = new Font("Arial", Font.ITALIC, 18);
        darkGrayColor = Color.darkGray;
        backgroundColor = Color.white;
        grayColor = Color.gray;
        setBackground(backgroundColor);
    }

    public void paint(Graphics graph) {
        graph.setFont(font);
        graph.setColor(Color.black);
        graph.drawString("Draw Shapes", 90, 20);
        graph.setColor(grayColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        graph.setColor(darkGrayColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        graph.setColor(Color.lightGray);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }
}