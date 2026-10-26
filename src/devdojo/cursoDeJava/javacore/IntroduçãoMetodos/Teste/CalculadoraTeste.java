package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Teste;

import devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.soma(10, 20);
        calculadora.subtracao(10, 20);
        calculadora.multiplicacao(10, 20);
        calculadora.divisao(10, 20);
    }
}
