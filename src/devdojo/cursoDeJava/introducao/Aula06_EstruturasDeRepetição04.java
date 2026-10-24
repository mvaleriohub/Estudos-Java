package devdojo.cursoDeJava.introducao;

public class Aula06_EstruturasDeRepetição04 {
    public static void main(String[] args) {
        double carValue = 75990;
        double installmentAmount = carValue;
        int installments = 1;

        while (installmentAmount > 1000) {
            installments ++;
            installmentAmount = carValue / installments;
            System.out.println("O valor do carro é:"+carValue+". O valor da parcela é: "+installmentAmount+". Será necessario essa quantidade de parcelas: "+installments);
        }
    }
}
