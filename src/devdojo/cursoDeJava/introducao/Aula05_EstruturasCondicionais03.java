package devdojo.cursoDeJava.introducao;

public class Aula05_EstruturasCondicionais03 {
    public static void main(String[] args) {
        double wage = 3000;
        String mensagemDoar = "Vou doar 500 reais pro Miguel lindão!";
        String mensagemNaoDoar = "Não tenho condições para doar agora. Mas um dia terei!";

        String Resultado = (wage >= 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(Resultado);
    }
}
