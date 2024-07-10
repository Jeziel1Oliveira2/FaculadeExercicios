package ex2.contaUser;

public class Conta {
    //criando os elemntos
    private String numero;
    private String nomeTitular;
    private double saldo = 0;

    //criando o construtor
    public Conta(String numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    //criando os Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //criando os metodos para depositar e sacar
    public void depositarDinheiro(double valor){
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
        }
    }

    public void sacarDinheiro(double valor){
        this.saldo -= valor;
    }

    //criando o metodo toString
    @Override
    public String toString(){
        return "Conta" + numero + "\nNome: " + nomeTitular + "\nSaldo: " + saldo;
    }
}
