import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panel1;
    private JButton s7_btn;
    private JButton s4_btn;
    private JButton s1_btn;
    private JButton s0_btn;
    private JButton s2_btn;
    private JButton s8_btn;
    private JButton esit_btn;
    private JButton s5_btn;
    private JButton sil_btn;
    private JButton s3_btn;
    private JButton s9_btn;
    private JButton s6_btn;
    private JButton kare_btn;
    private JButton mod_btn;
    private JButton nokta_btn;
    private JButton Del_btn;
    private JButton eksi_btn;
    private JButton arti_btn;
    private JButton carpi_btn;
    private JButton bolu_btn;
    private JTextPane main_textPane;
    private JButton sin_btn;
    private JButton cos_btn;
    private JButton log_btn;
    private JButton tan_btn;
    private JButton cotan_btn;
    private JButton kokal_btn;
    private JButton usAl_btn;
    private JButton pi_btn;
    private JButton e_btn;
    private JButton ln_btn;


    double firstNumber, secondNumber, result;
    String operation;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setTitle("Bilimsel Hesap Makinesi");
        frame.setContentPane(new Calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    public void getTextAndEmpty(){
        try {
            firstNumber = Double.parseDouble(main_textPane.getText().replace(",","."));
            main_textPane.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(main_textPane,"Yanlış Tuşlama");
        }
    }
    public Calculator() {

        s9_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s9_btn.getText();
                main_textPane.setText(number);
            }
        });
        s8_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s8_btn.getText();
                main_textPane.setText(number);
            }
        });
        s7_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s7_btn.getText();
                main_textPane.setText(number);
            }
        });
        s6_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s6_btn.getText();
                main_textPane.setText(number);
            }
        });
        s5_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s5_btn.getText();
                main_textPane.setText(number);
            }
        });
        s4_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s4_btn.getText();
                main_textPane.setText(number);
            }
        });
        s3_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s3_btn.getText();
                main_textPane.setText(number);
            }
        });
        s2_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s2_btn.getText();
                main_textPane.setText(number);
            }
        });
        s1_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s1_btn.getText();
                main_textPane.setText(number);
            }
        });
        s0_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + s0_btn.getText();
                main_textPane.setText(number);
            }
        });
        nokta_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = main_textPane.getText() + nokta_btn.getText();
                main_textPane.setText(number);
            }
        });
        sil_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                main_textPane.setText(null);
            }
        });
        Del_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String backspace = null;

                if(main_textPane.getText().length() > 0)
                {
                    StringBuilder s = new StringBuilder(main_textPane.getText());
                    s.deleteCharAt(main_textPane.getText().length() - 1);
                    backspace = s.toString();
                    main_textPane.setText(backspace);
                }
            }
        });
        arti_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation = Operations.plus;
                getTextAndEmpty();
            }
        });
        kare_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation = Operations.kare;
                getTextAndEmpty();
            }
        });
        eksi_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                operation = Operations.reduce;
                getTextAndEmpty();
            }
        });
        carpi_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                operation = Operations.multi;
                getTextAndEmpty();
            }
        });
        bolu_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                getTextAndEmpty();
                operation = Operations.div;
            }
        });
        sin_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.sin;
            }
        });
        tan_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.tan;
            }
        });
        cos_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.cos;
            }
        });
        cotan_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.cotan;
            }
        });
        log_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.log;
            }
        });
        ln_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.ln;
            }
        });
        kokal_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.kokal;
            }
        });
        usAl_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.usAl;
            }
        });
        e_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.e;
            }
        });
        pi_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.pi;
            }
        });
        mod_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTextAndEmpty();
                operation = Operations.mod;
            }
        });
        Del_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                getTextAndEmpty();
                operation = Operations.mod;
            }
        });
        esit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String answer;

                secondNumber = Double.parseDouble(main_textPane.getText());
                if(operation.equals(Operations.plus))
                {
                    result = OperationCalculator.arti(firstNumber,secondNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);
                }
                else if(operation.equals(Operations.reduce))
                {
                    result = OperationCalculator.eksi(firstNumber,secondNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);
                }
                else if (operation.equals(Operations.multi))
                {
                    result = OperationCalculator.carpi(firstNumber,secondNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);
                }
                else if(operation.equals(Operations.div))
                {
                    result = OperationCalculator.bolu(firstNumber,secondNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);
                }
                else if(operation.equals(Operations.mod))
                {
                    result = OperationCalculator.mod(firstNumber,secondNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);
                }
                else if(operation.equals(Operations.usAl))
                {
                    result = OperationCalculator.usAl(firstNumber,secondNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);
                }

                else if (operation.equals(Operations.sin))
                {
                    result = OperationCalculator.sin(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.cos))
                {
                result = OperationCalculator.cos(firstNumber);
                answer = String.format("%.2f", result);
                main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.tan))
                {
                    result = OperationCalculator.tan(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.cotan))
                {
                    result = OperationCalculator.cotan(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.log))
                {
                    result = OperationCalculator.log(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.ln))
                {
                    result = OperationCalculator.ln(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.kokal))
                {
                    result = OperationCalculator.kokal(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.e))
                {
                    result = OperationCalculator.e(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }
                else if (operation.equals(Operations.pi))
                {
                    result = OperationCalculator.pi(firstNumber);
                    answer = String.format("%.2f", result);
                    main_textPane.setText(answer);

                }

            }
        });
    }
}

