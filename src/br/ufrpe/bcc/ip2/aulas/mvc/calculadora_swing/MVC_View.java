package br.ufrpe.bcc.ip2.aulas.mvc.calculadora_swing;

/*
 *program: Adding Two Numbers Using MVC
 *author: padmanLabs.blogspot.in
 *date: 18-Aug-2012
 */

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MVC_View extends JFrame {
    Container con;
    JButton addButton;
    JTextField textField1, textField2, textFieldresult;
    JLabel first, second, result;

    public MVC_View(MVC_Model model) {
        con = getContentPane();
        setTitle("MVC ADD");
        setLayout(new FlowLayout());
        setSize(220, 200);
        first = new JLabel("first variable");
        textField1 = new JTextField("", 10);
        second = new JLabel("second variable");
        textField2 = new JTextField("", 8);
        result = new JLabel("result");
        textFieldresult = new JTextField("", 13);
        addButton = new JButton("add");
        con.add(first);
        con.add(textField1);
        con.add(second);
        con.add(textField2);
        con.add(result);
        con.add(textFieldresult);
        con.add(addButton);
        setVisible(true);
    }
}