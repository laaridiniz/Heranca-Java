/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folha;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensalista m1;
        Mensalista m2;
        Horista h1;
        Horista h2;
        
        //Empregado mensalista
        m1=new Mensalista("Júnior", "João", "Rua 7 de Setembro",0.0);
        m1.cal_sal();
        m1.cal_IR();
        m1.cal_inss();
        m1.imprimir();
        
        m2=new Mensalista("Pleno", "Ana", "Rua Papagaio",0.0);
        m2.cal_sal();
        m2.cal_IR();
        m2.cal_inss();
        m2.imprimir();
        
        //Empregado horista
        h1=new Horista(100.00, "Cinthia", "Avenida Ipanema",0.0);
        h1.cal_Salario();
        h1.cal_inss();
        h1.cal_IR();
        h1.imprimir();
        
        h2=new Horista(86.00, "Vinicius", "Rua 5",0.0);
        h2.cal_Salario();
        h2.cal_inss();
        h2.cal_IR();
        h2.imprimir();
    }
    
}
