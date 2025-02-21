//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//public class Binary2Hexa extends JFrame implements ActionListener {
//    JFrame frame;
//    JButton button;
//    JButton retryButton;
//    JPanel panel;
//    JLabel de2Hex;
//    JLabel hex2bi;
//    JLabel bi2Hex;
//    JLabel labelResult1;
//    JLabel labelResult2;
//    JLabel labelResult3;
//    JLabel labelResultTitle;
//    JTextField textFieldDe2Hex;
//    JTextField textFieldHex2Bi;
//    JTextField textFieldBi2Hex;
//    JTextField result1;
//    JTextField result2;
//    JTextField result3;
//
//    Binary2Hexa() {
//        // set frame
//        frame = new JFrame();
//        frame.setSize(500, 550);
//        frame.setTitle("Hex2Dec & Dec2Hex converter");
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//
//        // set label for decimal to hexadecimal
//        de2Hex = new JLabel("Input Decimal value:");
//        de2Hex.setBounds(50, 50, 200, 30);
//
//        // set label for hexadecimal to binary
//        hex2bi = new JLabel("Input Hexadecimal value:");
//        hex2bi.setBounds(50, 100, 200, 30);
//
//        // set label for binary to hexadecimal
//        bi2Hex = new JLabel("Input Binary value:");
//        bi2Hex.setBounds(50, 150, 200, 30);
//
//        // set label for result of decimal to hexadecimal
//        labelResult1 = new JLabel("Decimal to Hexadecimal: ");
//        labelResult1.setBounds(50, 300,200,30);
//
//        // set label for result of hexadecimal to binary
//        labelResult2 = new JLabel("Hexadecimal to Binary: ");
//        labelResult2.setBounds(50,350,200,30);
//
//        // set label for result of binary to hexadecimal
//        labelResult3 = new JLabel("Binary to Hexadecimal");
//        labelResult3.setBounds(50,400,200,30);
//
//        // set label for the result title
//        labelResultTitle = new JLabel("Result for the conversion");
//        labelResultTitle.setBounds(175,200,200,30);
//
//        // set textfield for decimal to hexadecimal
//        textFieldDe2Hex = new JTextField();
//        textFieldDe2Hex.setBounds(250, 50, 200, 30);
//
//        // set textfield for hexadecimal to binary
//        textFieldHex2Bi = new JTextField();
//        textFieldHex2Bi.setBounds(250, 100, 200, 30);
//
//        // set textfield for binary to hexadecimal
//        textFieldBi2Hex = new JTextField();
//        textFieldBi2Hex.setBounds(250, 150, 200, 30);
//
//        // set textfield for decimal to hexadecimal
//        result1 = new JTextField();
//        result1.setBounds(250,300,200,30);
//
//        // set textfield for hexadecimal to binary
//        result2 = new JTextField();
//        result2.setBounds(250,350,200,30);
//
//        // set textfield for binary to hexadecimal
//        result3 = new JTextField();
//        result3.setBounds(250,400,200,30);
//
//        // set button for calculate
//        button = new JButton("Calculate");
//        button.setBounds(200, 250, 100, 30);
//        button.addActionListener(this);
//
//        // set button for retry
//        retryButton = new JButton("Retry");
//        retryButton.setBounds(200,450,100,30);
//        retryButton.addActionListener(this);
//
//        // set panel
//        panel = new JPanel();
//        panel.setLayout(null);
//
//        // add everything to panel
//        panel.add(de2Hex);
//        panel.add(hex2bi);
//        panel.add(bi2Hex);
//        panel.add(textFieldDe2Hex);
//        panel.add(textFieldHex2Bi);
//        panel.add(textFieldBi2Hex);
//        panel.add(labelResult1);
//        panel.add(labelResult2);
//        panel.add(labelResult3);
//        panel.add(labelResultTitle);
//        panel.add(button);
//        panel.add(retryButton);
//        panel.add(result1);
//        panel.add(result2);
//        panel.add(result3);
//
//        // add panel to frame
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//
//        new Binary2Hexa();
//    }
//
//    // def 1: convert from decimal to hexadecimal
//    public static String decimal2Hex(int deciValue) {
//
//        StringBuilder hexa = new StringBuilder();
//        while (deciValue != 0 ) {
//            int hexDigit = deciValue % 16;
//            char hexChar;
//
//            if (hexDigit < 10) {
//                hexChar = (char) (hexDigit + '0');
//            }
//            else {
//                hexChar = (char) (hexDigit - 10 + 'A');
//            }
//            hexa.insert(0,hexChar);
//            deciValue = deciValue / 16;
//        }
//        return hexa.toString();
//
//    }
//    // def 2: convert from hexadecimal to binary
//    public static int Hexa2Binary(String hexValue) {
//        // convert hexa to decimal
//        int decimal = 0;
//        int power = 0;
//
//        for (int i = hexValue.length() - 1; i >= 0; i --) {
//            char hexDigit = hexValue.charAt(i);
//            int digitValue;
//
//            if (Character.isDigit(hexDigit)) {
//                digitValue = hexDigit - '0';
//            }
//            else {
//                digitValue = Character.toUpperCase(hexDigit) - 'A' + 10;
//            }
//
//            decimal += digitValue * Math.pow(16,power);
//            power += 1;
//        }
//
//        // decimal to binary
//        String binary = "";
//
//        if (decimal == 0) {
//            binary = "0";
//        }
//        else {
//            while (decimal != 0) {
//                int binaryDigit = decimal % 2;
//                binary = binaryDigit + binary;
//                decimal = decimal / 2;
//            }
//        }
//        return Integer.parseInt(binary);
//
//    }
//
//    // def 3: covert from binary to hexadecimal
//    public static String Binary2Hexa(String binValue) {
//        // binary to decimal
//        int decimal = 0;
//        for (char digit: binValue.toCharArray()) {
//            if (digit != '0' && digit != '1') {
//                return "binary should contain only 0 and 1";
//            }
//        }
//        StringBuilder reverseBinary = new StringBuilder(binValue).reverse();
//
//        for (int i = 0; i < reverseBinary.length(); i++) {
//            decimal += Integer.parseInt(String.valueOf(reverseBinary.charAt(i))) * Math.pow(2,i);
//        }
//        // decimal to hexadecimal
//        return decimal2Hex(decimal);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == button) {
//            String de2HexInput = textFieldDe2Hex.getText();
//            String hex2BiInput = textFieldHex2Bi.getText();
//            String bi2HexInput = textFieldBi2Hex.getText();
//
//            try {
//                // calculate the hexadecimal value
//                result1.setText(decimal2Hex(Integer.parseInt(de2HexInput)));
//                result2.setText(String.valueOf(Hexa2Binary(hex2BiInput)));
//                result3.setText(Binary2Hexa(bi2HexInput));
//            } catch (NumberFormatException ex) {
//
//                // handle when input is not a valid number
//                JOptionPane.showMessageDialog(frame,"Invalid input\nPlease enter a valid number");
//            }
//        }
//        else if (e.getSource() == retryButton) {
//
//            // reset all textfield
//            textFieldDe2Hex.setText("");
//            textFieldHex2Bi.setText("");
//            textFieldBi2Hex.setText("");
//            result1.setText("");
//            result2.setText("");
//            result3.setText("");
//        }
//    }
//}
