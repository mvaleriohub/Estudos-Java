package devdojo.cursoDeJava.introducao;

public class Aula06_EstruturasDeRepetição05 {
    public static void main(String[] args) {
        for (byte i=1;i<100;i++) {
            System.out.println("A contagem está igual a: "+i);

            if (i>60) {
                continue;
            }

            System.out.println("Este numero é irrelevante");
        }
        
    }
}
