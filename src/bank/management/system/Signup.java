package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4, r5;
    JButton next;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FROM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 95, 600, 30);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100, 190, 100, 30);
        labelName.setForeground(Color.BLACK);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300, 190, 400, 30);
        textName.setForeground(Color.BLACK);
        textName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textName);

        JLabel labelFname = new JLabel("Father's Name :");
        labelFname.setBounds(100, 240, 200, 30);
        labelFname.setForeground(Color.BLACK);
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelFname);

        textFname = new JTextField();
        textFname.setBounds(300, 240, 400, 30);
        textFname.setForeground(Color.BLACK);
        textFname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setBounds(100, 290, 200, 30);
        DOB.setForeground(Color.BLACK);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 290, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setBounds(100, 340, 200, 30);
        labelG.setForeground(Color.BLACK);
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBounds(300, 340, 110, 30);
        r1.setForeground(Color.BLACK);
        r1.setBackground(new Color(126, 132, 204));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(445, 340, 110, 30);
        r2.setForeground(Color.BLACK);
        r2.setBackground(new Color(126, 132, 204));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r2);

        r3 = new JRadioButton("Others");
        r3.setBounds(590, 340, 110, 30);
        r3.setForeground(Color.BLACK);
        r3.setBackground(new Color(126, 132, 204));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setBounds(100, 390, 400, 30);
        labelEmail.setForeground(Color.BLACK);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 390, 400, 30);
        textEmail.setForeground(Color.BLACK);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setBounds(100, 440, 400, 30);
        labelMs.setForeground(Color.BLACK);
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelMs);

        r4 = new JRadioButton("Married ");
        r4.setBounds(300, 440, 110, 30);
        r4.setForeground(Color.BLACK);
        r4.setBackground(new Color(126, 132, 204));
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r4);

        r5 = new JRadioButton("Unmarried");
        r5.setBounds(445, 440, 150, 30);
        r5.setForeground(Color.BLACK);
        r5.setBackground(new Color(126, 132, 204));
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r5);

        ButtonGroup buttonMs = new ButtonGroup();
        buttonMs.add(r4);
        buttonMs.add(r5);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setBounds(100, 490, 400, 30);
        labelAdd.setForeground(Color.BLACK);
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300, 490, 400, 30);
        textAdd.setForeground(Color.BLACK);
        textAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(100, 540, 200, 30);
        labelCity.setForeground(Color.BLACK);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300, 540, 190, 30);
        textCity.setForeground(Color.BLACK);
        textCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textCity);

        JLabel labelPin = new JLabel("PIN :");
        labelPin.setBounds(500, 540, 150, 30);
        labelPin.setForeground(Color.BLACK);
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(550, 540, 150, 30);
        textPin.setForeground(Color.BLACK);
        textPin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setBounds(100, 590, 400, 30);
        labelState.setForeground(Color.BLACK);
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelState);

        textState = new JTextField();
        textState.setBounds(300, 590, 400, 30);
        textState.setForeground(Color.BLACK);
        textState.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textState);

        next = new JButton("Next");
        next.setForeground(Color.black);
        next.setBackground(Color.orange);
        next.setBounds(620, 650, 80, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(126, 132, 204));
        setLayout(null);
        setSize(850,800);
        setLocation(360, 40);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r2.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = null;
        if (r4.isSelected()) {
            marital = "Married";
        } else if (r5.isSelected()) {
            marital = "Unmarried";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String Pin = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Con con1 = new Con();
                String q = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + DOB + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + Pin + "', '" + state + "' )";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
        public static void main(String[] args) {
            new Signup();
        }

    }
