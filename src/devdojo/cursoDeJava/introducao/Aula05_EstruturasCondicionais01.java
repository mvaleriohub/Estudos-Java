package devdojo.cursoDeJava.introducao;

public class Aula05_EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean autorizadoComprarBebida = age >= 18;

        if (autorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcolica");
        } else {
            System.out.println("Proibido comprar bebida alcolica por lei");
        }
    }
}
