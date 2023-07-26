package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton submit, cancel;
    String formno;

    Signup3(String formno) {
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3");
        l1.setBounds(386, 25, 600, 40);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Account Details :");
        l2.setBounds(345, 60, 600, 40);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setBounds(100, 150, 200, 40);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l3);

        r1 = new JRadioButton("Savings Account");
        r1.setBounds(100, 200, 170, 30);
        r1.setForeground(Color.BLACK);
        r1.setBackground(new Color(126, 132, 204));
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350, 200, 300, 30);
        r2.setForeground(Color.BLACK);
        r2.setBackground(new Color(126, 132, 204));
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100, 240, 250, 30);
        r3.setForeground(Color.BLACK);
        r3.setBackground(new Color(126, 132, 204));
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350, 240, 300, 30);
        r4.setForeground(Color.BLACK);
        r4.setBackground(new Color(126, 132, 204));
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setBounds(100, 285, 200, 30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setBounds(100, 315, 200, 20);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setBounds(350, 285, 250, 30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l6);

        JLabel l7 = new JLabel("(It would apper on ATM card/cheque-book & statements)");
        l7.setBounds(350, 315, 400, 20);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l7);

        JLabel l8 = new JLabel("PIN :");
        l8.setBounds(100, 350, 250, 30);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setBounds(350, 350, 250, 30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setBounds(100, 375, 250, 30);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setBounds(100, 420, 200, 30);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setForeground(Color.BLACK);
        c1.setBackground(new Color(126, 132, 204));
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 455, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setForeground(Color.BLACK);
        c2.setBackground(new Color(126, 132, 204));
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 455, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setForeground(Color.BLACK);
        c3.setBackground(new Color(126, 132, 204));
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 500, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setForeground(Color.BLACK);
        c4.setBackground(new Color(126, 132, 204));
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 500, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setForeground(Color.BLACK);
        c5.setBackground(new Color(126, 132, 204));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 545, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setForeground(Color.BLACK);
        c6.setBackground(new Color(126, 132, 204));
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 545, 200, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.", true);
        c7.setForeground(Color.BLACK);
        c7.setBackground(new Color(126, 132, 204));
        c7.setFont(new Font("Raleway", Font.BOLD, 16));
        c7.setBounds(100, 620, 800, 30);
        add(c7);

        JLabel l12 = new JLabel("Form No. :");
        l12.setBounds(680, 10, 200, 30);
        l12.setForeground(Color.BLACK);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(755, 10, 200, 30);
        l13.setForeground(Color.BLACK);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l13);

        submit = new JButton("Submit");
        submit.setForeground(Color.black);
        submit.setBackground(Color.orange);
        submit.setBounds(250, 670, 100, 30);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setForeground(Color.black);
        cancel.setBackground(Color.orange);
        cancel.setBounds(420, 670, 100, 30);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(new Color(126, 132, 204));
        setLayout(null);
        setSize(850, 800);
        setLocation(450, 80);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = "";
        if ((r1.isSelected())) {
            atype = "Savings Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }
        Random random = new Random();
        long first7 = (random.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (random.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String services = " ";
        if ((c1.isSelected())) {
            services = services + "ATM Card";
        } else if (c2.isSelected()) {
            services = services + "Internet Banking";
        } else if (c3.isSelected()) {
            services = services + "Mobile Banking";
        } else if (c4.isSelected()) {
            services = services + "Email Alerts";
        } else if (c5.isSelected()) {
            services = services + "Cheque Book";
        } else if (c6.isSelected()) {
            services = services + "E-Statement";
        }

        try {
            if (e.getSource()==submit) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values( '" + formno + "','" + atype + "', '" + cardno + "', '" + pin + "', '" + services + "')";
                    String q2 = "insert into login values( '" + formno + "','" + cardno + "', '" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number :" + cardno + "\n Pin :" + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==cancel){
                System.exit(0);
                
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {

        new Signup3(" ");
    }
}

