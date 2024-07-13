package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 160, 1500, 735);
        panel.setBackground(new Color(109, 164, 170));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 5, 1500, 150);
        panel1.setBackground(new Color(109, 164, 170));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
        Image image = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1200, 0, 250, 250);
        panel1.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/amb.png"));
        Image image1 = i11.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1000, 30, 300, 150);
        panel1.add(label1);

        JButton btn1 = new JButton("Add New Patient");
        btn1.setBounds(30, 15, 200, 30);
//        btn1.setBackground(new Color(255, 162, 24));
//        btn1.setOpaque(true); // Ensuring the button is opaque
//        btn1.setBorderPainted(false);
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.New_Patient();
            }
        });

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30, 58, 200, 30);
//        btn2.setBackground(new Color(255, 162, 24));
//        btn2.setOpaque(true); // Ensuring the button is opaque
//        btn2.setBorderPainted(false);
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.Room();
            }
        });

        JButton btn3 = new JButton("All Employee Info");
        btn3.setBounds(270, 15, 200, 30);
//        btn3.setBackground(new Color(255, 162, 24));
//        btn3.setOpaque(true); // Ensuring the button is opaque
//        btn3.setBorderPainted(false);
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.Employee_info();
            }
        });

        JButton btn4 = new JButton("Department");
        btn4.setBounds(30, 100, 200, 30);
//        btn4.setBackground(new Color(255, 162, 24));
//        btn4.setOpaque(true); // Ensuring the button is opaque
//        btn4.setBorderPainted(false);
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.Department();
            }
        });

        JButton btn5 = new JButton("Patient Info");
        btn5.setBounds(270, 58, 200, 30);
//        btn5.setBackground(new Color(255, 162, 24));
//        btn5.setOpaque(true); // Ensuring the button is opaque
//        btn5.setBorderPainted(false);
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.All_Patient_Info();
            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270, 100, 200, 30);
//        btn6.setBackground(new Color(255, 162, 24));
//        btn6.setOpaque(true); // Ensuring the button is opaque
//        btn6.setBorderPainted(false);
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.patient_discharge();
            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(510, 15, 200, 30);
//        btn7.setBackground(new Color(255, 162, 24));
//        btn7.setOpaque(true); // Ensuring the button is opaque
//        btn7.setBorderPainted(false);
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.update_patient_details();
            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(510, 58, 200, 30);
//        btn8.setBackground(new Color(255, 162, 24));
//        btn8.setOpaque(true); // Ensuring the button is opaque
//        btn8.setBorderPainted(false);
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.Ambulance();
            }
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(510, 100, 200, 30);
//        btn9.setBackground(new Color(255, 162, 24));
//        btn9.setOpaque(true); // Ensuring the button is opaque
//        btn9.setBorderPainted(false);
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new hospital.management.system.SearchRoom();
            }
        });

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(750, 15, 200, 30);
//        btn10.setBackground(new Color(255, 162, 24));
//        btn10.setOpaque(true); // Ensuring the button is opaque
//        btn10.setBorderPainted(false);
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new hospital.management.system.Login();
            }
        });



//        setUndecorated(true);
        setSize(1950, 1090);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception();
    }
}
