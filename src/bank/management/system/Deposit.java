package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton deposit, back;
    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1950, 1000);
        add(image);

        JLabel label1 = new JLabel("ENTER YOUR DEPOSIT AMOUNT");
        label1.setBounds(621, 220, 400, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 22));
        image.add(label1);

        textField = new TextField();
        textField.setBounds(621, 270, 350, 30);
        textField.setBackground(new Color(209, 213, 255));
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        deposit = new JButton("DEPOSIT");
        deposit.setForeground(Color.black);
        deposit.setBackground(Color.orange);
        deposit.setBounds(936, 442, 125, 35);
        deposit.setFont(new Font("Raleway", Font.BOLD, 18));
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("BACK");
        back.setForeground(Color.black);
        back.setBackground(Color.orange);
        back.setBounds(936, 495, 125, 35);
        back.setFont(new Font("Raleway", Font.BOLD, 18));
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setSize(1950,1050);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==deposit) {
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the valid amount");
                }else {
                   Con c = new Con();
                    String q = ("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    c.statement.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "RS. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource()==back) {
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
}
