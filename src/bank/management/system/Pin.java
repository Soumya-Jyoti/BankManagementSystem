package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {


    JButton b1,b2;
    JPasswordField p1, p2;
    String pin;
    Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1950, 1000);
        add(image);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setBounds(688, 220, 600, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 22));
        image.add(label1);

        JLabel label2 = new JLabel("NEW PIN :");
        label2.setBounds(520, 280, 400, 35);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 22));
        image.add(label2);

        p1 = new JPasswordField();
        p1.setBounds(760, 280, 200, 30);
        p1.setBackground(new Color(209, 213, 255));
        p1.setForeground(Color.BLACK);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(p1);

        JLabel label3 = new JLabel("Re-Enter NEW PIN :");
        label3.setBounds(520, 315, 400, 35);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 22));
        image.add(label3);

        p2 = new JPasswordField();
        p2.setBounds(760, 315, 200, 30);
        p2.setBackground(new Color(209, 213, 255));
        p2.setForeground(Color.BLACK);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(p2);

        b1 = new JButton("CHANGE");
        b1.setForeground(Color.black);
        b1.setBackground(Color.orange);
        b1.setBounds(936, 442, 125, 35);
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setForeground(Color.black);
        b2.setBackground(Color.orange);
        b2.setBounds(936, 495, 125, 35);
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.addActionListener(this);
        image.add(b2);


        setLayout(null);
        setSize(1950, 1050);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            if (e.getSource()==b1) {
                if (pin1.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (pin1.equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update bank set pin = '" + pin1 + "' where pin = '" + pin + "'";
                String q2 = "update login set pin = '" + pin1 + "' where pin = '" + pin + "'";
                String q3 = "update signupthree set pin = '" + pin1 + "' where pin = '" + pin + "'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN Change Succcessfully");
                setVisible(false);
                new main_Class(pin);

            } else if (e.getSource()==b2) {
                new main_Class(pin);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
