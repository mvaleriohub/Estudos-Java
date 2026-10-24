package devdojo.cursoDeJava.introducao;

public class Aula07_Arrays03 {
    public static void main(String[] args) {
        int [] numbers2 = {1, 2, 3, 4, 5};

        // for (int i = 0; i < numbers2.length; i++) {
        //     System.out.println(numbers2[i]);
        // }

        for (int i : numbers2) {
            System.out.println(i);
        }
    }
}
