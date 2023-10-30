package Codex_Minorproject;
// It is quiz application.
// It is written by kshitiz Ranjan.
// Participating in Hacktoberfest.
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame implements ActionListener {
    JLabel jlable;
    JRadioButton jradiobutton[] = new JRadioButton[5];
    JButton button1, button2;
    ButtonGroup buttongroup;
    int count = 0, currques = 0;

    Quiz(String str) {
        super(str);
        jlable = new JLabel();
        add(jlable);
        buttongroup = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            jradiobutton[i] = new JRadioButton();
            add(jradiobutton[i]);
            buttongroup.add(jradiobutton[i]);
        }
        button1 = new JButton("Next");
        button2 = new JButton("Submit");
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(button1);
        add(button2);
        set();
        jlable.setBounds(30, 40, 450, 20);
        jradiobutton[0].setBounds(50, 100, 100, 20);
        jradiobutton[1].setBounds(50, 125, 100, 20);
        jradiobutton[2].setBounds(50, 150, 100, 20);
        jradiobutton[3].setBounds(50, 175, 100, 20);
        button1.setBounds(120, 250, 75, 25);
        button2.setBounds(300, 250, 75, 25);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(600, 400);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (check())
                count = count + 1;
            currques++;
            if (currques == 9) {
                button1.setEnabled(false);
                button2.setText("Result");
                set();
            } else {
                set();
            }
        }
        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            currques++;
            JOptionPane.showMessageDialog(this, "Correct answers: " + count);
            System.exit(0);
        }
    }

    void set() {
        jradiobutton[4].setSelected(true);
        if (currques == 0) {
            jlable.setText("Which one is DataStructure");
            jradiobutton[0].setText("Array");
            jradiobutton[1].setText("Integer");
            jradiobutton[2].setText("String");
            jradiobutton[3].setText("Character");
        }
        if (currques == 1) {
            jlable.setText("Who is Father Of computer");
            jradiobutton[0].setText("Alexander Graham Bell");
            jradiobutton[1].setText("Charles Babbage");
            jradiobutton[2].setText("J.L Baird");
            jradiobutton[3].setText("Newton");
        }
        if (currques == 2) {
            jlable.setText("What is Brain of Computer");
            jradiobutton[0].setText("Mouse");
            jradiobutton[1].setText("Cpu");
            jradiobutton[2].setText("KeyBoard");
            jradiobutton[3].setText("Disk Drive");
        }
        if (currques == 3) {
            jlable.setText("From Which Programming Language Java Is Derived");
            jradiobutton[0].setText("C++");
            jradiobutton[1].setText("Python");
            jradiobutton[2].setText("JavaScript");
            jradiobutton[3].setText("C");
        }
        if (currques == 4) {
            jlable.setText("Java Is");
            jradiobutton[0].setText("Platform Independent");
            jradiobutton[1].setText("Platform Dependent");
            jradiobutton[2].setText("Both ");
            jradiobutton[3].setText("None of Above");
        }
        if (currques == 5) {
            jlable.setText("Which data structure uses a Last-In-First-Out (LIFO) approach?");
            jradiobutton[0].setText("Queue");
            jradiobutton[1].setText("Stack");
            jradiobutton[2].setText("Linked List");
            jradiobutton[3].setText("Array");
        }
        if (currques == 6) {
            jlable.setText("Which of the following is not a primitive data type in Java?");
            jradiobutton[0].setText("int");
            jradiobutton[1].setText("float");
            jradiobutton[2].setText("String");
            jradiobutton[3].setText("char");
        }
        if (currques == 7) {
            jlable.setText("Which keyword is used to declare a constant in Java?");
            jradiobutton[0].setText("constant");
            jradiobutton[1].setText("final");
            jradiobutton[2].setText("immutable");
            jradiobutton[3].setText("readonly");
        }
        if (currques == 8) {
            jlable.setText("Which Java keyword prevents a class from being instantiated or inherited?");
            jradiobutton[0].setText("abstract");
            jradiobutton[1].setText("sealed");
            jradiobutton[2].setText("static");
            jradiobutton[3].setText("final");
        }

        jlable.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            jradiobutton[j].setBounds(50, 80 + i, 200, 20);
    }

    boolean check() {
        if (currques == 0)
            return (jradiobutton[0].isSelected());
        if (currques == 1)
            return (jradiobutton[1].isSelected());
        if (currques == 2)
            return (jradiobutton[1].isSelected());
        if (currques == 3)
            return (jradiobutton[3].isSelected());
        if (currques == 4)
            return (jradiobutton[0].isSelected());
        if (currques == 5)
            return (jradiobutton[1].isSelected());
        if (currques == 6)
            return (jradiobutton[2].isSelected());
        if (currques == 7)
            return (jradiobutton[1].isSelected());
        if (currques == 8)
            return (jradiobutton[3].isSelected());
        return false;
    }

    public static void main(String args[]) {
        new Quiz("Java Test");
    }
}
