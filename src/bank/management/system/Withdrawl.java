package bank.management.system;

import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    TextField textField;
    JButton withdrawl, back;

    Withdrawl(String pin) {
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1950, 1000);
        add(image);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWL IS RS. 10,000");
        label1.setBounds(600, 195, 400, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 22));
        image.add(label1);

        JLabel label2 = new JLabel("Please Enter Amount");
        label2.setBounds(621, 240, 400, 35);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 18));
        image.add(label2);

        textField = new TextField();
        textField.setBounds(621, 270, 350, 30);
        textField.setBackground(new Color(209, 213, 255));
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        withdrawl = new JButton("WITHDRAWL");
        withdrawl.setForeground(Color.black);
        withdrawl.setBackground(Color.orange);
        withdrawl.setBounds(910, 442, 160, 35);
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 18));
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        back = new JButton("BACK");
        back.setForeground(Color.black);
        back.setBackground(Color.orange);
        back.setBounds(910, 495, 160, 35);
        back.setFont(new Font("Raleway", Font.BOLD, 18));
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setSize(1950, 1050);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

                if(e.getSource()==withdrawl) {
                    try {
                        String amount = textField.getText();
                        Date date = new Date();
                        if (textField.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Insert Valid Amount");
                        } else {
                            Con c = new Con();
                            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                            int balance = 0;
                            while (resultSet.next()) {
                                if (resultSet.getString("type").equals("Deposit")) {
                                    balance += Integer.parseInt(resultSet.getString("amount"));
                                } else {
                                    balance -= Integer.parseInt(resultSet.getString("amount"));
                                }
                            }
                            if (balance < Integer.parseInt(amount)) {
                                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                                return;
                            }

                            c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                            JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                            setVisible(false);
                            new main_Class(pin);

                        }
                    } catch (Exception E) {

                    }
                } else if (e.getSource()==back) {
                    setVisible(false);
                    new main_Class(pin);
                }
            }

    public static void main(String[] args) {
        new Withdrawl("");


    }
}
