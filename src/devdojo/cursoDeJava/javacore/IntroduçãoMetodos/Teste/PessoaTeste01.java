package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Teste;

import devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Miguel");
        pessoa.setIdade(-1);

        pessoa.imprimir();
    }
}
