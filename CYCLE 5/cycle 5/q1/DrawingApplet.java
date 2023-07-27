import java.applet.Applet;
import java.awt.*;

public class DrawingApplet extends Applet {
    public void paint(Graphics g) {
        // Draw a circle
        g.setColor(Color.red);
        g.drawOval(50, 50, 100, 100);

        // Draw a rectangle
        g.setColor(Color.blue);
        g.drawRect(200, 50, 100, 50);

        // Draw a line
        g.setColor(Color.green);
        g.drawLine(50, 200, 250, 200);
    }
}
/*
<!DOCTYPE html>
<html>
<head>
    <title>Java Applet Drawing</title>
</head>
<body>
    <applet code="DrawingApplet.class" width="400" height="300"></applet>
</body>
</html>
*/
