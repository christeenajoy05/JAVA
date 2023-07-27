import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HouseApplet extends JApplet implements MouseListener {

    private Color doorColor = Color.BLUE;
    
    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw the house
        g.setColor(Color.BLACK);
        g.drawRect(100, 200, 200, 150); // House body
        g.drawLine(100, 200, 200, 100); // Left roof
        g.drawLine(200, 100, 300, 200); // Right roof

        // Draw the door with the current doorColor
        g.setColor(doorColor);
        g.fillRect(170, 250, 60, 100); // Door

        // Draw the windows
        g.setColor(Color.WHITE);
        g.fillRect(120, 220, 50, 50); // Window 1
        g.fillRect(230, 220, 50, 50); // Window 2
    }

    // Mouse click event handler
    public void mouseClicked(MouseEvent e) {
        if (doorColor == Color.BLUE) {
            doorColor = Color.RED;
        } else {
            doorColor = Color.BLUE;
        }
        repaint(); // Redraw the applet to reflect the new color
    }

    // Other mouse event handlers (empty for this example)
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
/*
<!DOCTYPE html>
<html>
<head>
    <title>House Applet</title>
</head>
<body>
    <applet code="HouseApplet.class" width="400" height="400">
        Your browser does not support the <code>applet</code> tag.
    </applet>
</body>
</html>
*/

