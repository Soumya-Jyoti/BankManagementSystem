package bank.management.system;

import java.sql.ResultSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton button1,button2,button3,button4,button5,button6,button7;
    String pin;

    FastCash(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1950, 1000);
        add(image);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setBounds(605, 220, 600, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 24));
        image.add(label);

        button1 = new JButton("Rs. 100");
        button1.setForeground(Color.black);
        button1.setBackground(Color.orange);
        button1.setBounds(515, 328, 155, 35);
        button1.setFont(new Font("Raleway", Font.BOLD, 18));
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("Rs. 500");
        button2.setForeground(Color.black);
        button2.setBackground(Color.orange);
        button2.setBounds(860, 328, 210, 35);
        button2.setFont(new Font("Raleway", Font.BOLD, 18));
        button2.addActionListener(this);
        image.add(button2);

        button3 = new JButton("Rs. 1000");
        button3.setForeground(Color.black);
        button3.setBackground(Color.orange);
        button3.setBounds(515, 384, 155, 35);
        button3.setFont(new Font("Raleway", Font.BOLD, 18));
        button3.addActionListener(this);
        image.add(button3);

        button4 = new JButton("Rs. 2000");
        button4.setForeground(Color.black);
        button4.setBackground(Color.orange);
        button4.setBounds(860, 384, 210, 35);
        button4.setFont(new Font("Raleway", Font.BOLD, 18));
        button4.addActionListener(this);
        image.add(button4);

        button5 = new JButton("Rs. 5000");
        button5.setForeground(Color.black);
        button5.setBackground(Color.orange);
        button5.setBounds(515, 442, 155, 35);
        button5.setFont(new Font("Raleway", Font.BOLD, 18));
        button5.addActionListener(this);
        image.add(button5);

        button6 = new JButton("Rs. 10000");
        button6.setForeground(Color.black);
        button6.setBackground(Color.orange);
        button6.setBounds(860, 441, 210, 35);
        button6.setFont(new Font("Raleway", Font.BOLD, 18));
        button6.addActionListener(this);
        image.add(button6);

        button7 = new JButton("BACK");
        button7.setForeground(Color.black);
        button7.setBackground(Color.orange);
        button7.setBounds(860, 497, 210, 35);
        button7.setFont(new Font("Raleway", Font.BOLD, 18));
        button7.addActionListener(this);
        image.add(button7);


        setLayout(null);
        setSize(1950,1050);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button7) {
            setVisible(false);
            new main_Class(pin);
        } else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c = new Con();
            Date date = new Date();
            try {
                ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (resultset.next()){
                    if (resultset.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultset.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultset.getString("amount"));
                    }
                }String num = "17";

                if (e.getSource() != button7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insifficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debitted Successfully");



            }catch (Exception E) {
                E.printStackTrace();
            }

            setVisible(false);
            new main_Class(pin);
        }


    }

    public static void main(String[] args) {
        new FastCash("");
    }
}


