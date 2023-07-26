package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAdhaar;
    JRadioButton s1, s2, e1, e2;
    JButton next;
    String formno;

    Signup2(String formno) {

        super("APPLICATION FROM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(396, 30, 600, 40);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(345, 60, 600, 40);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setBounds(100, 150, 100, 30);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(126, 132, 204));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setForeground(Color.black);
        comboBox.setBounds(350, 150, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Catagory :");
        l4.setBounds(100, 200, 100, 30);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l4);

        String catagory[] = {"General", "OBC", "SC", "ST", "Others"};
        comboBox2 = new JComboBox(catagory);
        comboBox2.setBackground(new Color(126, 132, 204));
        comboBox2.setForeground(Color.black);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 200, 320, 30);
        add(comboBox2);

        JLabel l6 = new JLabel("Educational :");
        l6.setBounds(100, 250, 150, 30);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l6);

        String educational[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctorate", "Above"};
        comboBox3 = new JComboBox(educational);
        comboBox3.setBackground(new Color(126, 132, 204));
        comboBox3.setForeground(Color.black);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 250, 320, 30);
        add(comboBox3);

        JLabel l7 = new JLabel("Occupation :");
        l7.setBounds(100, 300, 150, 30);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox4 = new JComboBox(occupation);
        comboBox4.setBackground(new Color(126, 132, 204));
        comboBox4.setForeground(Color.black);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 300, 320, 30);
        add(comboBox4);

        JLabel l14 = new JLabel("Annual Income :");
        l14.setBounds(100, 350, 200, 30);
        l14.setForeground(Color.BLACK);
        l14.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l14);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox5 = new JComboBox(income);
        comboBox5.setBackground(new Color(126, 132, 204));
        comboBox5.setForeground(Color.black);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 350, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No. :");
        l8.setBounds(100, 400, 150, 30);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l8);

        textPan = new JTextField();
        textPan.setBounds(350, 400, 320, 30);
        textPan.setForeground(Color.BLACK);
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textPan);

        JLabel l9 = new JLabel("Adhaar No. :");
        l9.setBounds(100, 450, 150, 30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l9);

        textAdhaar = new JTextField();
        textAdhaar.setBounds(350, 450, 320, 30);
        textAdhaar.setForeground(Color.BLACK);
        textAdhaar.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textAdhaar);

        JLabel l10 = new JLabel("Senior Citizen(60+) :");
        l10.setBounds(100, 500, 200, 30);
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l10);

        s1 = new JRadioButton("Yes");
        s1.setBounds(350, 500, 110, 30);
        s1.setForeground(Color.BLACK);
        s1.setBackground(new Color(126, 132, 204));
        s1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(s1);

        s2 = new JRadioButton("No");
        s2.setBounds(495, 500, 110, 30);
        s2.setForeground(Color.BLACK);
        s2.setBackground(new Color(126, 132, 204));
        s2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(s2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(s1);
        buttonGroup.add(s2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setBounds(100, 550, 200, 30);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBounds(350, 550, 110, 30);
        e1.setForeground(Color.BLACK);
        e1.setBackground(new Color(126, 132, 204));
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBounds(495, 550, 110, 30);
        e2.setForeground(Color.BLACK);
        e2.setBackground(new Color(126, 132, 204));
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(e2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);


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

        next = new JButton("Next");
        next.setForeground(Color.black);
        next.setBackground(Color.orange);
        next.setBounds(570, 620, 100, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(126, 132, 204));
        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String edu = (String) comboBox3.getSelectedItem();
        String occ = (String) comboBox4.getSelectedItem();
        String inc = (String) comboBox4.getSelectedItem();


        String pan = textPan.getText();
        String adhaar = textAdhaar.getText();

        String scitizen = " ";
        if ((s1.isSelected())) {
            scitizen = "Yes";
        } else if (s2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if ((e1.isSelected())) {
            eAccount = "Yes";
        } else if (e2.isSelected()) {
            eAccount = "No";
        }

        try{
            if (textPan.getText().equals("") || textAdhaar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Con c1 = new Con();
                String q = "insert into signuptwo values( '" + formno + "','" + rel + "', '" + cat + "', '" + edu + "', '" + occ + "', '" + inc + "', '" + pan + "', '" + adhaar + "', '" + scitizen + "', '" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
;            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");

    }
}

