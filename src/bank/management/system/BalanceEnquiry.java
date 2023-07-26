package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label1, label2;
    JButton b1;


    BalanceEnquiry(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1950, 1000);
        add(image);

        label1 = new JLabel("Your Current Balance is : ");
        label1.setBounds(665, 220, 600, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 24));
        image.add(label1);

        label2 = new JLabel();
        label2.setBounds(741, 270, 400, 35);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 22));
        image.add(label2);

        b1 = new JButton("Back");
        b1.setForeground(Color.black);
        b1.setBackground(Color.orange);
        b1.setBounds(910, 442, 160, 35);
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.addActionListener(this);
        image.add(b1);

        int balance = 0;
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));

                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText("Rs."+balance);



        setLayout(null);
        setSize(1950, 1050);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       setVisible(false);
       new main_Class(pin);

    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
