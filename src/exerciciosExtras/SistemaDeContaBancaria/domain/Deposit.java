package exerciciosExtras.SistemaDeContaBancaria.domain;

public class Deposit {
    public double deposit(double depositedAmount, double balance) {
        if (depositedAmount <= 0) {
            System.out.println("VALOR INVÁLIDO PARA DEPÓSITO");
            System.out.println("O valor digitado deve ser maior que zero (R$ 0,00).");
            System.out.println("Por favor, verifique o valor e tente novamente.");

            return -1;
        }
        
        balance += depositedAmount;
        System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
        System.out.println("Valor: R$ "+depositedAmount);
        System.out.println("Saldo Total: R$ "+balance);
        System.out.println("Comprovante impresso. Obrigado!");

        return balance;
    }
}

