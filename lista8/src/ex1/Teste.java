package ex1;

import ex1.funcionario.Funcionario;
import ex1.gerente.Gerente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        //criando o arraylist
        ArrayList<Funcionario> listaFuncionarioEmopresa  = new ArrayList();
        //Criando dois funcionarios
        Funcionario fun1 = new Funcionario("João", "12345678901", 3000.00);
        Funcionario fun2 = new Funcionario("Marcio", "10987654321", 3500.00);
        //adcionando os funcionarios
        listaFuncionarioEmopresa.add(fun1);
        listaFuncionarioEmopresa.add(fun2);
        //Criando um ex1.testes.gerente
        Gerente gerente = new Gerente("André", "11223344556", 5000.00, "Produtos");

        //Imprimindo as informações do ex1.testes.gerente
        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Salário: R$" + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento() + "\n");

        //iniciando o contador
        int contadorFundiconario = 1;
        //Imprimindo informações dos funcionários
        for (Funcionario funcionariosEmpresa : listaFuncionarioEmopresa){
            System.out.println("Funcionário " + contadorFundiconario + ":");
            System.out.println("Nome: " + funcionariosEmpresa.getNome());
            System.out.println("CPF: " + funcionariosEmpresa.getCpf());
            System.out.println("Salário: R$" + funcionariosEmpresa.getSalario() + "\n");
            contadorFundiconario++;
        }
    }
}
