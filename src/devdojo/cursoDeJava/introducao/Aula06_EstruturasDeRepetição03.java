package devdojo.cursoDeJava.introducao;

public class Aula06_EstruturasDeRepetição03 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            System.out.println(i);
            i++;
            if (i > 25) {
                break;
            }
        }
    }
}
