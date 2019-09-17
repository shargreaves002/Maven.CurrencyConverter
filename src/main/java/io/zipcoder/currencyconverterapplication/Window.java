package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import static io.zipcoder.currencyconverterapplication.CurrencyConverter.convert;
import static io.zipcoder.currencyconverterapplication.CurrencyType.*;

public class Window extends JFrame implements WindowListener, ActionListener {

    private JComboBox<String> choice1;
    private JComboBox<String> choice2;
    private JTextField money;
    private JTextField answer;

    Window (String title) {
        super(title);
        addWindowListener(this);
        setSize(450, 489);
        setResizable(false);
        setLocationRelativeTo(null);

        String[] choices = {"AustralianDollar",
                            "CanadianDollar",
                            "ChineseYR",
                            "Euro",
                            "Franc",
                            "Pound",
                            "Ringgit",
                            "SingaporeDollar",
                            "UniversalCurrency",
                            "USDollar",
                            "Yen"};
        choice1 = new JComboBox<>(choices);
        choice2 = new JComboBox<>(choices);
        choice1.setMaximumSize( choice1.getPreferredSize() );
        choice2.setMaximumSize( choice2.getPreferredSize() );
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(choice1);
        panel.add(choice2);
        money = new JTextField();
        panel.add(money);
        JButton button = new JButton("Calculate");
        button.addActionListener(this);
        panel.add(button);
        answer = new JTextField();
        answer.setEditable(false);
        panel.add(answer);
        add(panel);
    }

    //If user closes the window, exit the program
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }
    //filler to make the class concrete
    public void actionPerformed(ActionEvent e) {
        int from = choice1.getSelectedIndex();
        ConvertibleCurrency from2;
        int to = choice2.getSelectedIndex();
        CurrencyType to2;
        String x = money.getText();
        switch (from){
            /*case (0):
                from2 = new AustralianDollar();
                break;*/
            case (1):
                from2 = new CanadianDollar();
                break;
            case (2):
                from2 = new ChineseYR();
                break;
            case (3):
                from2 = new Euro();
                break;
            case (4):
                from2 = new Franc();
                break;
            case (5):
                from2 = new Pound();
                break;
            case (6):
                from2 = new Ringgit();
                break;
            case (7):
                from2 = new Rupee();
                break;
            case (8):
                from2 = new SingaporeDollar();
                break;
            case (9):
                from2 = new UniversalCurrency();
                break;
            case (10):
                from2 = new USDollar();
                break;
            case (11):
                from2 = new Yen();
                break;
            default:
                from2 = new AustralianDollar();
        }
        switch (to){
            /*case (0):
                to2 = AUSTRALIAN_DOLLAR;
                break;*/
            case (1):
                to2 = CANADIAN_DOLLAR;
                break;
            case (2):
                to2 = CHINESE_YR;
                break;
            case (3):
                to2 = EURO;
                break;
            case (4):
                to2 = FRANC;
                break;
            case (5):
                to2 = POUND;
                break;
            case (6):
                to2 = RINGGIT;
                break;
            case (7):
                to2 = RUPEE;
                break;
            case (8):
                to2 = SINGAPORE_DOLLAR;
                break;
            case (9):
                to2 = UNIVERSAL_CURRENCY;
                break;
            case (10):
                to2 = US_DOLLAR;
                break;
            case (11):
                to2 = YEN;
                break;
            default:
                to2 = AUSTRALIAN_DOLLAR;
        }
        try {
            double rounded = Math.round(convert(Double.valueOf(x), from2, to2) * 100) / 100.00;
            String answerText = Double.toString(rounded);
            answer.setText(answerText);
        } catch (Exception f) {
            answer.setText("Cannot convert, please enter a number.");
        }
    }
    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}
