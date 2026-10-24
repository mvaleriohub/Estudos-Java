package devdojo.cursoDeJava.introducao;

public class Aula08_ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[5];

        for (int[] is : arrayInt) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println("\n--");
        }

        int [][] arrayInt2 = {{0}, {1, 1}, {2, 2, 2}};

        for (int[] is : arrayInt2) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println("\n--");
        }
    }
    
}
