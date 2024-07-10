package ex1.gerente;

import ex1.funcionario.Funcionario;

public class Gerente extends Funcionario {
    //criando o elemento de departamento
    private String departamento;

    //craindo o construtor
    public Gerente(String nome, String cpf, double salario,String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    //craidno o getter e setter
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * 1.2;
    }
}
