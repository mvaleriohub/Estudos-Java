package devdojo.cursoDeJava.introducao;

public class aula04_Operadores {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        double result = number1 / (double) number2;
        System.out.println(result);

        int rest = 4 % 3;
        System.out.println(rest);

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        

        int bonus = 1000;
        bonus /= 2;
        System.out.println(bonus);
    }
}
