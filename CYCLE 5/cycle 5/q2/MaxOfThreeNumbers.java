import java.awt.*;
import java.awt.event.*;

public class MaxOfThreeNumbers extends Frame implements ActionListener {
    private TextField numField1, numField2, numField3;
    private Label resultLabel;

    public MaxOfThreeNumbers() {
        // Set Frame properties
        setTitle("Max of Three Numbers");
        setSize(300, 200);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Create TextFields for number input
        numField1 = new TextField(10);
        numField2 = new TextField(10);
        numField3 = new TextField(10);

        // Create Button
        Button findButton = new Button("Find Max");
        findButton.addActionListener(this);

        // Create Label for displaying the result
        resultLabel = new Label("Result will be shown here.");

        // Add components to the Frame
        add(new Label("Enter three numbers: "));
        add(numField1);
        add(numField2);
        add(numField3);
        add(findButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent ae) {
        // Get the numbers from TextFields
        int num1 = Integer.parseInt(numField1.getText());
        int num2 = Integer.parseInt(numField2.getText());
        int num3 = Integer.parseInt(numField3.getText());

        // Find the maximum of the three numbers
        int max = Math.max(Math.max(num1, num2), num3);

        // Display the result in the Label
        resultLabel.setText("Maximum: " + max);
    }

    public static void main(String[] args) {
        MaxOfThreeNumbers app = new MaxOfThreeNumbers();
        app.setVisible(true);
    }
}

