package devdojo.cursoDeJava.introducao;

public class Aula07_Arrays02 {
    public static void main(String[] args) {
        String [] names = new String[4];

        names[0] = "Miguel";
        names[1] = "Melvin";
        names[2] = "Grabriela";
        names[3] = "Valério";
        
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        names = new String[5]; // Perde completamente o espaço na memória.

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
