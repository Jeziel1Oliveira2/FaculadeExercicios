package ex3.funcionario;

public class EmpregadoCLT extends Empregado{
    //criando o elemento da classe
    private double salariomensal;

    //criando o construtor
    public EmpregadoCLT(String nome, String cpf, double salariomensal) {
        super(nome, cpf);
        this.salariomensal = salariomensal;
    }

    //implementando o metodo de rendimento
    @Override
    public double rendimentos() {
        return salariomensal;
    }
}
