package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1950, 1000);
        add(image);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(585, 220, 600, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 28));
        image.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.black);
        b1.setBackground(Color.orange);
        b1.setBounds(515, 328, 155, 35);
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("CASH WITHDRAW");
        b2.setForeground(Color.black);
        b2.setBackground(Color.orange);
        b2.setBounds(860, 328, 210, 35);
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.black);
        b3.setBackground(Color.orange);
        b3.setBounds(515, 384, 155, 35);
        b3.setFont(new Font("Raleway", Font.BOLD, 18));
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.black);
        b4.setBackground(Color.orange);
        b4.setBounds(860, 384, 210, 35);
        b4.setFont(new Font("Raleway", Font.BOLD, 18));
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.black);
        b5.setBackground(Color.orange);
        b5.setBounds(515, 442, 155, 35);
        b5.setFont(new Font("Raleway", Font.BOLD, 18));
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.black);
        b6.setBackground(Color.orange);
        b6.setBounds(860, 441, 210, 35);
        b6.setFont(new Font("Raleway", Font.BOLD, 18));
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.black);
        b7.setBackground(Color.orange);
        b7.setBounds(860, 497, 210, 35);
        b7.setFont(new Font("Raleway", Font.BOLD, 18));
        b7.addActionListener(this);
        image.add(b7);


        setLayout(null);
        setSize(1950,1050);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Deposit(pin);
            setVisible(false);

        } else if (e.getSource() == b2) {
            new Withdrawl(pin);
            setVisible(false);

        } else if (e.getSource() == b3) {
            new FastCash(pin);
            setVisible(false);

        } else if (e.getSource() == b4) {
            new Mini(pin);

        } else if (e.getSource() == b5) {
            new Pin(pin);
            setVisible(false);

        } else if (e.getSource() == b6) {
            new BalanceEnquiry(pin);
            setVisible(false);

        } else if (e.getSource() == b7) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}

