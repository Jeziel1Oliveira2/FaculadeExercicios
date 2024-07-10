package ex3.funcionario;

public abstract class Empregado {
    //criando os elementos da classe
    private String nome;
    private String cpf;

    //criando o construtor
    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //criando os Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //criando o metodo de rendimento
    public abstract double rendimentos();
}
