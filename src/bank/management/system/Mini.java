package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton button;

    Mini(String pin) {
        this.pin = pin;
        getContentPane().setBackground(new Color(244, 252, 157));
        setLayout(null);
        setSize(400, 600);
        setLocation(20, 20);
        setUndecorated(true);

        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 400, 230);
        label1.setForeground(Color.black);
        label1.setFont(new Font("System", Font.BOLD, 12));
        add(label1);

        JLabel label2 = new JLabel("MINI STATEMENT");
        label2.setBounds(130, 20, 200, 20);
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Ralway", Font.BOLD, 17));
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("System", Font.BOLD, 15));
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        label4.setForeground(Color.black);
        label4.setFont(new Font("System", Font.BOLD, 15));
        add(label4);

        setVisible(true);

        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '" + pin + "'");
            while (resultSet.next()) {
                label3.setText("Card Number:  " + resultSet.getString("card_number").substring(0, 4) + "XXXXXXXX" + resultSet.getString("card_number").substring(12));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

            try {
                int balance = 0;
                Con c = new Con();
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                while (resultSet.next()) {

                    label1.setText(label1.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");

                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                label4.setText("Your Total Balance is Rs : " + balance);
            } catch (Exception E) {
                E.printStackTrace();
            }

        button = new JButton("Exit");
        button.setBounds(250,500,100, 25);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("System", Font.BOLD, 15));
        button.addActionListener(this);
        add(button);

        setVisible(true);


        }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new Mini("");

    }
}
