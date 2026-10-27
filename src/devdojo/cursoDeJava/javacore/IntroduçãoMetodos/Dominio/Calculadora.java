package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio;

public class Calculadora {

    public void soma(float numero1, float numero2) {
        System.out.println(numero1 + numero2);
    }
    public void subtracao(float numero1, float numero2) {
        System.out.println(numero1 - numero2);
    }
    public void multiplicacao(float numero1, float numero2) {
        System.out.println(numero1 * numero2);
    }
    public void divisao(float numero1, float numero2) {
        System.out.println(numero1 / numero2);
    }

    public double divisao2(double numero1, double numero2) {
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        }
        return numero1 / numero2;
    }

    public void alterarDoidNumeros(int num1, int num2) {
        
    }

}
