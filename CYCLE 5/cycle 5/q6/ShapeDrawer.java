import java.awt.*;
import java.awt.event.*;

public class ShapeDrawer extends Frame implements ItemListener {
    private Choice shapeChoice;

    private String selectedShape = "";

    public ShapeDrawer() {
        setTitle("Shape Drawer");
        setSize(500, 500);

        shapeChoice = new Choice();
        shapeChoice.add("Select Shape");
        shapeChoice.add("Rectangle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.addItemListener(this);

        add(shapeChoice, BorderLayout.NORTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        selectedShape = shapeChoice.getSelectedItem();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int width = 100;
        int height = 150;

        if (selectedShape.equals("Rectangle")) {
            g.setColor(Color.RED);
            g.fillRect(200, 200, width, height);
        } else if (selectedShape.equals("Triangle")) {
            int[] xPoints = {300, 200, 400};
            int[] yPoints = {200, 300, 300};
            g.setColor(Color.BLUE);
            g.fillPolygon(xPoints, yPoints, 3);
        } else if (selectedShape.equals("Square")) {
            g.setColor(Color.GREEN);
            g.fillRect(200, 200, width, width);
        } else if (selectedShape.equals("Circle")) {
            g.setColor(Color.ORANGE);
            g.fillOval(200, 200, 100, 100); 
        }
    }

    public static void main(String[] args) {
        new ShapeDrawer();
    }
}

