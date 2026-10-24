package devdojo.cursoDeJava.introducao;

public class Aula05_EstruturasCondicionais04_Exercicio {
    public static void main(String[] args) {
        double annualIncome = 70000;
        double aplicableRate = 0.0970;

        double rateForBlock1 = 34712;
        double rateForBlock2 = 68507;

        double feePayable = 0;
        double remainingMoney = 0;

        if (annualIncome > 0 && annualIncome < rateForBlock1) {
            feePayable = annualIncome * aplicableRate;
        } else if (annualIncome > 0 && annualIncome >= rateForBlock1) {
            feePayable = rateForBlock1 * aplicableRate;
            remainingMoney = annualIncome - rateForBlock1;
        }

        if (annualIncome <= rateForBlock2 && annualIncome >= rateForBlock1) {
            aplicableRate = 0.3735;
            feePayable += remainingMoney * aplicableRate;
        } else if (annualIncome > rateForBlock2) {
            aplicableRate = 0.3735;
            feePayable += (rateForBlock2 - rateForBlock1) * aplicableRate;
            remainingMoney = annualIncome - rateForBlock2;
        }

        if (annualIncome > rateForBlock2) {
            aplicableRate = 0.4950;
            feePayable += remainingMoney * aplicableRate;
        }

        String result;
        if (annualIncome > 0) {
            result = String.format("Bem vindo ao sistema fiscal neerlandês de 2020. Sua renda anual é EUR %.2f. A taxa fiscal aplicavel correspondente a sua renda é de %.2f%%. Então a taxa que você deve pagar é igual a EUR %.2f", 
                    annualIncome, (aplicableRate * 100), feePayable);
        } else {
            result = "Renda invalida (Menor que zero, não elegivel para o sistema fiscal).";
        }

        System.out.println(result);
    }
}
