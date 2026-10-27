package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Teste;

import devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTeste2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divisao2(20, 2);
        System.out.println(resultado);
    }
}
