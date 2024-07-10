package ex3.funcionario;

public class EmpregadoComissionado extends Empregado{
    //criando o elemento da classe
    private double vendas;
    private double comissao;

    //criando o construtor
    public EmpregadoComissionado(String nome, String cpf, double vendas, double comissao) {
        super(nome, cpf);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    //implementando o metodo rendimento
    @Override
    public double rendimentos() {
        return vendas * comissao;
    }
}
