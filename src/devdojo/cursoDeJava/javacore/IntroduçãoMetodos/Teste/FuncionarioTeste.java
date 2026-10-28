package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Teste;

import devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Miguel";
        funcionario.idade = 21;
        funcionario.salario  = new double[] {2000, 3500, 7800};

        funcionario.imprimirDados();
        funcionario.mediaSalario();
    }
}
