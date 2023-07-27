import java.awt.*;
import java.awt.event.*;

public class AWTStudentPercentage extends Frame implements ActionListener {
    private Label[] subjectLabels;
    private TextField[] marksFields;
    private Button calculateButton;
    private Label resultLabel;

    public AWTStudentPercentage() {
        setTitle("Student Percentage Calculator");
        setLayout(new GridLayout(7, 2));
        setSize(500, 400);
        setVisible(true);
        setResizable(false);

        subjectLabels = new Label[5];
        marksFields = new TextField[5];

        for (int i = 0; i < 5; i++) {
            subjectLabels[i] = new Label("Subject " + (i + 1) + ":");
            marksFields[i] = new TextField(5);
            add(subjectLabels[i]);
            add(marksFields[i]);
        }

        calculateButton = new Button("Calculate Percentage");
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new Label("");
        resultLabel.setAlignment(Label.CENTER);
        add(resultLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            try {
                int marks = Integer.parseInt(marksFields[i].getText());
                totalMarks += marks;
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid integer marks.");
                return;
            }
        }

        double percentage = (totalMarks / 500.0) * 100.0;

        if (percentage > 50) {
            resultLabel.setText("Percentage: " + percentage + "%. :)");
        } else {
            resultLabel.setText("Percentage: " + percentage + "%. :(");
        }
    }

    public static void main(String[] args) {
        new AWTStudentPercentage();
    }
}

