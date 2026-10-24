package devdojo.cursoDeJava.introducao;

public class Aula05_EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 20;
        String category;

        if (age <  15) {
            category = "Categoria infantil";
        } else if (age >= 15 && age < 18) {
            category = "Categoria Juvenil";
        } else {
            category = "Categoria Adulta";
        }

        System.out.println(category);
    }
}
