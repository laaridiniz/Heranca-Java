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
public class Horista extends Empregado{
    private double horas;

    public Horista(double horas, String nome, String endereco, double salario) {
        super(nome, endereco, salario);
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public void cal_Salario(){
        salario=horas*50;
    }
}
