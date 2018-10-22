package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JTextField numberBox;
    private JButton clickedButton;

    public ButtonListener(JButton button, JTextField textField) {
        this.clickedButton = button;
        this.numberBox = textField;
    }

    // every ActionListener has to implement this method
    @Override
    public void actionPerformed(ActionEvent e) {
        String clickedText = this.clickedButton.getText();
        boolean isOperation = clickedText.equals("*") || clickedText.equals("/") || clickedText.equals("+") || clickedText.equals("-");

        String currentText = numberBox.getText();
        boolean containsOperation = currentText.contains("*") || currentText.contains("/") || currentText.contains("+") || currentText.contains("-");

        if (clickedText.equals("=") || (isOperation && containsOperation)) {
            double result = calculate(numberBox.getText());
            if (isOperation) {
                numberBox.setText(String.valueOf(result) + " " + clickedText + " ");
            } else {
                numberBox.setText(String.valueOf(result));
            }
        } else {
            String space = (isOperation) ? " " : "";

            numberBox.setText(numberBox.getText() + space + clickedText + space);
        }
    }

    private double calculate(String query) {
        query = query.replace(" ", "");
        double var1, var2;
        String operator = "\\+";
        if (query.contains("*")) {
            operator = "\\*";
        } else if (query.contains("/")) {
            operator = "/";
        } else if (query.contains("+")) {
            operator = "\\+";
        } else if (query.contains("-")) {
            operator = "-";
        }

        var1 = Double.parseDouble(query.split(operator)[0]);
        var2 = Double.parseDouble(query.split(operator)[1]);

        if (query.contains("*")) {
            return var1 * var2;
        } else if (query.contains("/")) {
            return var1 / var2;
        } else if (query.contains("+")) {
            return var1 + var2;
        } else if (query.contains("-")) {
            return var1 - var2;
        }
        return 0;
    }
}
