package Palindrome;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class palindrome extends JFrame implements ActionListener {
    private JLabel inputLabel, resultLabel;
    private JTextField inputField;
    private JButton checkButton;

    public palindrome() {
        setTitle("Palindrome Checker");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        inputLabel = new JLabel("Enter a number:");
        resultLabel = new JLabel("");

        inputField = new JTextField(10);
        inputField.addActionListener(this);

        checkButton = new JButton("Check");
        checkButton.addActionListener(this);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panel.add(inputLabel, c);
        c.gridx = 1;
        panel.add(inputField, c);
        c.gridx = 2;
        panel.add(checkButton, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        panel.add(resultLabel, c);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton || e.getSource() == inputField) {
            String input = inputField.getText();
            boolean isPalindrome = checkPalindrome(input);
            if (isPalindrome) {
                resultLabel.setText(input + " is a palindrome number.");
            } else {
                resultLabel.setText(input + " is not a palindrome number.");
            }
        }
    }

    public boolean checkPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        new palindrome();
    }
}


