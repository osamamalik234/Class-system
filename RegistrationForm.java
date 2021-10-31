package MyPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RegistrationForm extends JFrame implements ActionListener {

    JPanel panel;
    JLabel headingLabel, label;
    JLabel name;
    JLabel gender;
    JLabel fatherName;
    JLabel email;
    JLabel password;
    JLabel pNumber;
    JLabel city;
    JTextField txt1, txt2, txt4, txt5;
    JPasswordField txt3;
    JButton register, clear;
    JRadioButton button1, button2;
    JCheckBox cbox;
    JComboBox comboBox;

    JLabel lbl, lbl1, lbl2, lbl3, lbl4;


    Container c;

    RegistrationForm() {

        setTitle("Registration Form");
        setSize(650, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        c = getContentPane();

        c.setLayout(null);
        //c.setBackground(new Color(14, 100, 170));
        c.setBackground(Color.orange);

        Font font = new Font("Cambria", Font.PLAIN, 20);
        Font fontLbl = new Font("Cambria", Font.BOLD, 25);

        headingLabel = new JLabel("REGISTRATION FORM");
        headingLabel.setBounds(170, 10, 300, 50);
        headingLabel.setFont(fontLbl);

        name = new JLabel("Name:");
        name.setBounds(70, 60, 100, 50);
        name.setFont(font);

        txt1 = new JTextField(15);
        txt1.setBounds(300, 70, 270, 30);

        lbl = new JLabel();
        lbl.setBounds(300, 95, 270, 30);

        fatherName = new JLabel("Father's Name:");
        fatherName.setBounds(70, 130, 150, 50);
        fatherName.setFont(font);

        txt2 = new JTextField(15);
        txt2.setBounds(300, 140, 270, 30);

        lbl1 = new JLabel();
        lbl1.setBounds(300, 165, 270, 30);

        gender = new JLabel("Gender:");
        gender.setBounds(70, 200, 100, 50);
        gender.setFont(font);

        button1 = new JRadioButton("Male");
        button1.setBounds(300, 215, 80, 20);
        button1.setFocusable(false);
        button1.setOpaque(false);
        button1.setFont(font);

        button2 = new JRadioButton("Female");
        button2.setBounds(400, 215, 100, 20);
        button2.setFocusable(false);
        button2.setOpaque(false);
        button2.setFont(font);

        ButtonGroup bg = new ButtonGroup();
        bg.add(button1);
        bg.add(button2);

        password = new JLabel("Password:");
        password.setBounds(70, 270, 150, 50);
        password.setFont(font);

        txt3 = new JPasswordField(8);
        txt3.setBounds(300, 280, 270, 30);

        lbl2 = new JLabel();
        lbl2.setBounds(300, 305, 270, 30);

        pNumber = new JLabel("Phone Number:");
        pNumber.setBounds(70, 340, 170, 50);
        pNumber.setFont(font);


        txt4 = new JTextField(15);
        txt4.setBounds(300, 350, 270, 30);

        lbl3 = new JLabel();
        lbl3.setBounds(300, 375, 270, 30);

        email = new JLabel("Email:");
        email.setBounds(70, 410, 150, 50);
        email.setFont(font);

        txt5 = new JTextField();
        txt5.setBounds(300, 420, 270, 30);

        lbl4 = new JLabel();
        lbl4.setBounds(300, 445, 270, 30);

        label = new JLabel();
        label.setBounds(320, 440, 200, 30);

        city = new JLabel("City: ");
        city.setBounds(70, 480, 150, 50);
        city.setFont(font);

        String[] cityName = {"", "Hyderabad", "Karachi", "Larkana", "Sukker"};
        comboBox = new JComboBox(cityName);
        comboBox.setBounds(300, 490, 270, 30);

        cbox = new JCheckBox("I accept terms and Condition...");
        cbox.setBounds(90, 540, 270, 50);
        cbox.setFocusable(false);
        cbox.setOpaque(false);

        register = new JButton("Register");
        register.setBounds(120, 600, 120, 40);
        register.setFont(font);
        register.setFocusable(false);
        register.setBackground(Color.BLACK);
        register.setForeground(Color.WHITE);
        register.addActionListener(this);

        clear = new JButton("Clear");
        clear.setBounds(350, 600, 120, 40);
        clear.setFont(font);
        clear.setFocusable(false);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);

        try {
            c.add(headingLabel); c.add(name);
            c.add(txt1); c.add(lbl);
            c.add(fatherName); c.add(txt2);
            c.add(lbl1); c.add(gender);
            c.add(button1); c.add(button2);
            c.add(password); c.add(txt3);
            c.add(lbl2); c.add(pNumber);
            c.add(txt4); c.add(lbl3);
            c.add(email); c.add(txt4);
            c.add(lbl4); c.add(city);
            c.add(txt5); c.add(label);
            c.add(comboBox); c.add(cbox);
            c.add(register); c.add(clear);
        }
        catch (Exception e) {
        }
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

        if (cbox.isSelected()) {

            if (e.getSource() == register) {

                String name = txt1.getText();
                if (name.isEmpty()) {
                    lbl.setText("Enter user Name!");
                    lbl.setForeground(Color.RED);
                } else {
                    lbl.setText("");
                }
                String fatherName = txt2.getText();

                if (fatherName.isEmpty()) {
                    lbl1.setText("Enter Father's Name!");
                    lbl1.setForeground(Color.RED);
                } else {
                    lbl1.setText("");
                }

                String gender = "";
                if (button1.isSelected()) {
                    gender = "Male";
                }
                if (button2.isSelected()) {

                    gender = "Female";
                }

                String password = txt3.getText();

                if (password.isEmpty()) {
                    lbl2.setText("Enter Password!");
                    lbl2.setForeground(Color.RED);
                } else {
                    lbl2.setText("");
                }

                String email = txt5.getText();
                String city = (String) comboBox.getSelectedItem();

                String pNumber = txt4.getText();


                //if (!name.isEmpty() && !fatherName.isEmpty() && !password.isEmpty() && !pNumber.isEmpty() && !email.isEmpty() && !city.isEmpty()) {
                if (!pNumber.isEmpty()) {

                    lbl3.setText("");
                    if (!pNumber.matches("[0-9]+")) {
                        lbl3.setText("Please Enter only Digits");
                        lbl3.setForeground(Color.BLUE);
                    } else {
                        lbl3.setText("");
                        // lbl3.setForeground(Color.RED);
                    }
                } else {
                    lbl3.setText("Enter Number!");
                    lbl3.setForeground(Color.RED);
                }

                if (!email.isEmpty()) {

                    lbl4.setText("");
                    if (!email.contains("@")) {

                        lbl4.setText("@ is Required!");
                        lbl4.setForeground(Color.BLUE);
                    } else {
                        lbl4.setText("");
                        lbl4.setForeground(Color.RED);
                    }
                } else {
                    lbl4.setText("Enter Your Email!");
                    lbl4.setForeground(Color.RED);
                }

                if (txt1.getText().length() > 1 && txt2.getText().length() > 1 && txt3.getText().length() > 1 && txt4.getText().length() > 1 && pNumber.matches("[0-9]+") && email.contains("@")){

                    JOptionPane.showMessageDialog(null,"Name: "+name+"\n\nFather's Name: "+fatherName+"\n\nGender: "+gender+"\n\nPassword: "+password+"\n\nPhone Number: "+pNumber+"\n\nEmail: "+email+"\n\nCity: "+city);
                }
            }
        }
        else if (e.getSource() == clear) {

            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        } else {

            JOptionPane.showMessageDialog(null, "please accept terms!");
        }
    }

    public static void main(String[] args) {

        new RegistrationForm();
    }
}
