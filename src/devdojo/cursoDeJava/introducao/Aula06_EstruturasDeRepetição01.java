package devdojo.cursoDeJava.introducao;

public class Aula06_EstruturasDeRepetição01 {
    public static void main(String[] args) {
        int count = 1;
        // while verifica se a condição é verdadeira antes de executar
        while (count <= 10) {
            System.out.println(count);
            count ++;
        }

        // do while executa o código antes de verificar a condição, depois de executar na primeira vez ele faz a condição e entra no loop while.
        do {
            System.out.println(count);
            count ++;
        } while (count <= 10);

        for (byte i=1; i<=10; i++) {
            System.out.println("For "+i);
        }
    }
}
