package ex2.contaUser;

public class ContaCorrente extends Conta{
    //criando o elemento
    private double limite;

    //criando o construtor
    public ContaCorrente(String numero, String nome, double saldo, double limite) {
        super(numero, nome, saldo);
        this.limite = limite;
    }

    //criando o Getter e Setter
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //pegando os metodods Override
    @Override
    public void sacarDinheiro(double valor) {
        if (valor < this.getSaldo() + limite){
            super.setSaldo((this.getSaldo() + limite) - valor);
        } else{
            System.out.println("Não é possivel sacar dinheiro, pois ele ultrapassa o que voce tem na conta");
        }
    }

    @Override
    public String toString(){
        return "Conta Corrente: " + super.toString() + "\nLimite: " + limite;
    }
}
