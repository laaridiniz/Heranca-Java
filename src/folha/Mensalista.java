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
public class Mensalista extends Empregado{
    private String cargo;

    public Mensalista(String cargo, String nome, String endereco, double salario) {
        super(nome, endereco, salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void cal_sal(){
        if(cargo.equals("Júnior")){
            salario=2500;
        }
        else if(cargo.equals("Pleno")){
            salario=3500;
    }
        else{
            salario=5500;
        }
    }
}
