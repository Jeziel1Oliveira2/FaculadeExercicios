package ex3.funcionario;

public class EmpregadoHorista extends Empregado{
    //criando os elementos da classe
    private double horasSemanais;
    private double salarioPorHora;

    //criando o construtor
    public EmpregadoHorista(String nome, String cpf, double horasSemanais, double salarioPorHora) {
        super(nome, cpf);
        this.horasSemanais = horasSemanais;
        this.salarioPorHora = salarioPorHora;
    }

    //implementando o metodo  rendimento
    @Override
    public double rendimentos() {
        if (this.horasSemanais > 40) {
            return 40 * this.salarioPorHora + (this.horasSemanais - 40) * (this.salarioPorHora * 1.5);
        } else {
            return this.horasSemanais * this.salarioPorHora;
        }
    }
}
