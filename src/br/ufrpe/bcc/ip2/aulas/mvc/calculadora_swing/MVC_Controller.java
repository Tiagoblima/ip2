package br.ufrpe.bcc.ip2.aulas.mvc.calculadora_swing;

/*
 *program: Adding Two Numbers Using MVC
 *author: padmanLabs.blogspot.in
 *date: 18-Aug-2012
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVC_Controller implements ActionListener {
    MVC_Model model;
    MVC_View view;

    public MVC_Controller(MVC_View v, MVC_Model m) {
        model = m;
        view = v;
        actionListenerMeth(this);//add action listener to the Button
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        try {
            System.out.println("-------- Controller --------");
            //retrieve the input from View
            String a = view.textField1.getText();
            String b = view.textField2.getText();

            //call add method
            int result = model.add(a, b);

            //display result in View(UI)
            view.textFieldresult.setText("" + result);
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void actionListenerMeth(ActionListener ae) {
        view.addButton.addActionListener(ae);
    }


}