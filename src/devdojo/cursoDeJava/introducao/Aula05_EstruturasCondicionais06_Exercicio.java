package devdojo.cursoDeJava.introducao;

public class Aula05_EstruturasCondicionais06_Exercicio {
    public static void main(String[] args) {
        byte day = 2;
        switch (day) {
            case 2, 3, 4, 5, 6:
                System.out.println("Business day");
                break;
            case 1, 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid date");
        }
    }
}
