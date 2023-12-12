/**
 Калькулятор для расчета +,-,*,/,преобразование чисел, возведение в корень, стереть значение. Из особенностей: числа могут без не целочисленные
 (разделенные точкой) и деление на ноль не допускается, калькулятор имеет UI часть.
 */
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class hard_calculator implements ActionListener{
    float number, answer;
    char operation;
    JFrame frame = new JFrame("Калькулятор");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton delete = new JButton("C");
    JButton root = new JButton("√");
    JButton transformation = new JButton("+/-");
    JButton division = new JButton("/");
    JButton multiplication = new JButton("*");
    JButton minus = new JButton("-");
    JButton plus = new JButton("+");
    JButton separator = new JButton(".");
    JButton result = new JButton("=");
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    hard_calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }
    public void prepareGUI(){
        frame.setSize(500,300);//размер экрана
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);//отображение на экране
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void addComponents(){
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.black);
        frame.add(label);
        textField.setBounds(40,50,385,40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        delete.setBounds(40,120,85,20);
        frame.add(delete);
        root.setBounds(140,120,85,20);
        frame.add(root);
        transformation.setBounds(240,120,85,20);
        frame.add(transformation);
        division.setBounds(340,120,85,20);
        division.setBackground(new Color(255, 129, 0));
        division.setForeground(Color.white);
        frame.add(division);
        multiplication.setBounds(340,150,85,20);
        multiplication.setBackground(new Color(255, 129, 0));
        multiplication.setForeground(Color.white);
        frame.add(multiplication);
        minus.setBounds(340,180,85,20);
        minus.setBackground(new Color(255, 129, 0));
        minus.setForeground(Color.white);
        frame.add(minus);
        plus.setBounds(340,210,85,20);
        plus.setBackground(new Color(255, 129, 0));
        plus.setForeground(Color.white);
        frame.add(plus);
        separator.setBounds(240,240,85,20);
        separator.setBackground(new Color(134, 132, 132));
        separator.setForeground(Color.white);
        frame.add(separator);
        result.setBounds(340,240,85,20);
        result.setBackground(new Color(255, 129, 0));
        result.setForeground(Color.white);
        frame.add(result);
        zero.setBounds(40,240,185,20);
        zero.setBackground(new Color(134, 132, 132));
        zero.setForeground(Color.white);
        frame.add(zero);
        one.setBounds(40,210,85,20);
        one.setBackground(new Color(134, 132, 132));
        one.setForeground(Color.white);
        frame.add(one);
        two.setBounds(140,210,85,20);
        two.setBackground(new Color(134, 132, 132));
        two.setForeground(Color.white);
        frame.add(two);
        three.setBounds(240,210,85,20);
        three.setBackground(new Color(134, 132, 132));
        three.setForeground(Color.white);
        frame.add(three);
        four.setBounds(40,180,85,20);
        four.setBackground(new Color(134, 132, 132));
        four.setForeground(Color.white);
        frame.add(four);
        five.setBounds(140,180,85,20);
        five.setBackground(new Color(134, 132, 132));
        five.setForeground(Color.white);
        frame.add(five);
        six.setBounds(240,180,85,20);
        six.setBackground(new Color(134, 132, 132));
        six.setForeground(Color.white);
        frame.add(six);
        seven.setBounds(40,150,85,20);
        seven.setBackground(new Color(134, 132, 132));
        seven.setForeground(Color.white);
        frame.add(seven);
        eight.setBounds(140,150,85,20);
        eight.setBackground(new Color(134, 132, 132));
        eight.setForeground(Color.white);
        frame.add(eight);
        nine.setBounds(240,150,85,20);
        nine.setBackground(new Color(134, 132, 132));
        nine.setForeground(Color.white);
        frame.add(nine);
    }
    public void addActionEvent(){
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        delete.addActionListener(this);
        root.addActionListener(this);
        transformation.addActionListener(this);
        division.addActionListener(this);
        multiplication.addActionListener(this);
        minus.addActionListener(this);
        plus.addActionListener(this);
        separator.addActionListener(this);
        result.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==delete){
            label.setText("");
            textField.setText("");
        } else if (source == zero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == one) {
            textField.setText(textField.getText() + "1");
        } else if (source == two) {
            textField.setText(textField.getText() + "2");
        } else if (source == three) {
            textField.setText(textField.getText() + "3");
        } else if (source == four) {
            textField.setText(textField.getText() + "4");
        } else if (source == five) {
            textField.setText(textField.getText() + "5");
        } else if (source == six) {
            textField.setText(textField.getText() + "6");
        } else if (source == seven) {
            textField.setText(textField.getText() + "7");
        } else if (source == eight) {
            textField.setText(textField.getText() + "8");
        } else if (source == nine) {
            textField.setText(textField.getText() + "9");
        } else if (source == separator) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == plus) {
            String str = textField.getText();
            number = Float.parseFloat(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            operation = 1;
        } else if (source == minus) {
            String str = textField.getText();
            number = Float.parseFloat(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            operation = 2;
        } else if (source == multiplication) {
            String str = textField.getText();
            number = Float.parseFloat(textField.getText());
            textField.setText("");
            label.setText(str + "*");
            operation = 3;
        } else if (source == division) {
            String str = textField.getText();
            number = Float.parseFloat(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            operation = 4;
        } else if (source == transformation) {
            number = Float.parseFloat(textField.getText());
            double transformation = (double) Math.round(number*-1);
            number = Float.parseFloat(textField.getText());
            textField.setText(Double.toString(transformation));
        } else if (source == root) {
            number = Float.parseFloat(textField.getText());
            double root = (double) Math.sqrt(number);
            textField.setText(Double.toString(root));
        } else if (source == result) {

            switch (operation) {
                case 1:
                    answer = number + Float.parseFloat(textField.getText());
                    if (Float.toString(answer).endsWith(".0")) {
                        textField.setText(Float.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Float.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Float.parseFloat(textField.getText());
                    if (Float.toString(answer).endsWith(".0")) {
                        textField.setText(Float.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Float.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Float.parseFloat(textField.getText());
                    if (Float.toString(answer).endsWith(".0")) {
                        textField.setText(Float.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Float.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    if (answer == 0) {
                        answer = number / Float.parseFloat(textField.getText());
                        textField.setText("На ноль делить нельзя, я это знаю");}
                    else {
                        answer = number / Float.parseFloat(textField.getText());
                        textField.setText(Double.toString(answer).replace(".0", ""));
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        hard_calculator calculator = new hard_calculator();

    }

}

