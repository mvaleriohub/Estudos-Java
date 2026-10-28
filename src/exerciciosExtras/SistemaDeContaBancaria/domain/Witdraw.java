package exerciciosExtras.SistemaDeContaBancaria.domain;

public class Witdraw {
    public double witdraw(byte type, double balance, double witdrawalAmount) {
        float rate = 0;
        if (type == 1) {
            rate = 1.5f;
        }

        if (witdrawalAmount <= 0) {
            System.out.println("Valor Inválido. Digite um valor maior que zero.");
            return -1;
        }

        if (type == 1 && balance < witdrawalAmount + rate) {
            System.out.println("Código de Erro 51 (Saldo Insuficiente)");
            return -1;
        }

        balance -= witdrawalAmount + rate;

        System.out.println("SAQUE REALIZADO COM SUCESSO!");
        System.out.println("DETALHES DA OPERAÇÃO:");
        System.out.println("Valor do saque: R$ "+witdrawalAmount);
        System.out.println("Taxa de serviço (fixa): R$ "+rate);
        System.out.println("Valor total debitado: R$ "+(witdrawalAmount+rate));

        return balance;
    }
}
