package br.ufrpe.bcc.ip2.aulas.mvc.calculadora_swing;

/*
 *program: Adding Two Numbers Using MVC
 *author: padmanLabs.blogspot.in
 *date: 18-Aug-2012
 */

public class MVC_Model {
    //implement the logic of the program
    public int add(String x, String y) {
        System.out.println("-------- Model --------");
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int result = a + b;
        return (result);
    }

}