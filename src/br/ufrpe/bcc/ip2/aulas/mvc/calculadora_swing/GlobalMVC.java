package br.ufrpe.bcc.ip2.aulas.mvc.calculadora_swing;

/*
 *program: Adding Two Numbers Using MVC
 *author: padmanLabs.blogspot.in
 *date: 18-Aug-2012
 */
class GlobalMVC {
    public static void main(String args[]) {
        MVC_Model m = new MVC_Model();
        MVC_View v = new MVC_View(m);
        new MVC_Controller(v, m);

    }
}