import java.awt.*;
import java.awt.event.*;

public class KeyEventHandlingDemo extends Frame implements KeyListener {
    private Label resultLabel;

    public KeyEventHandlingDemo() {
        setTitle("Key Event Handling Demo");
        setSize(400, 300);

        resultLabel = new Label("Press any key...");
        resultLabel.setAlignment(Label.CENTER);
        add(resultLabel);

        addKeyListener(this);

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        resultLabel.setText("Key Typed: " + keyChar);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        resultLabel.setText("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        resultLabel.setText("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        new KeyEventHandlingDemo();
    }
}

