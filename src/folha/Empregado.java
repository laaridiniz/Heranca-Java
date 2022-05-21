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
public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double cal_IR(){
        double aux;
        if (salario<1903){
            aux=0;
        }
        else if (salario>1903 && salario<2826){
            aux=0.075*salario;
        }
        else if(salario>2826 && salario<3751){
            aux=0.15*salario;
        }
        else{
            aux=0.275*salario;
        }
        return aux;
    }
    
    public double cal_inss(){
        if(salario<3641){
            return 0.12*salario;
        }
        else{
            return 0.14*salario;
        }
    }
    
    public void imprimir(){
        System.out.println("Nome:" + nome);
        System.out.println("Endereço:" + endereco);
        System.out.println("Salário:" + salario);
        System.out.println("Imposto de renda:" + cal_IR());
        System.out.println("INSS:" + cal_inss());
        System.out.println("-------------------------------");
    }
}
