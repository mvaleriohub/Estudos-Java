package ExerciciosExtras.SistemaDeContaBancaria.domain;

public class Account {
    private String holder;
    private long accountNumber = 000001;
    private double balance = 0.0;

    public void deposit(double depositedAmount) {
        if (depositedAmount <= 0) {
            System.out.println("VALOR INVÁLIDO PARA DEPÓSITO");
            System.out.println("O valor digitado deve ser maior que zero (R$ 0,00).");
            System.out.println("Por favor, verifique o valor e tente novamente.");
        }
        
        this.balance += depositedAmount;
        System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
        System.out.println("Valor: R$ "+depositedAmount);
        System.out.println("Saldo Total: R$ "+balance);
        System.out.println("Comprovante impresso. Obrigado pela preferencia!");  
    }

    public void witdraw(byte type, double witdrawalAmount) {
        float rate = 0;
        if (type == 1) {
            rate = 1.5f;
        }

        if (witdrawalAmount <= 0) {
            System.out.println("Valor Inválido. Digite um valor maior que zero.");
            return;
        }

        if (type == 1 && this.balance < witdrawalAmount + rate) {
            System.out.println("Código de Erro 51 (Saldo Insuficiente)");
            return;
        }

        this.balance -= witdrawalAmount + rate;

        System.out.println("SAQUE REALIZADO COM SUCESSO!");
        System.out.println("DETALHES DA OPERAÇÃO:");
        System.out.println("Valor do saque: R$ "+witdrawalAmount);
        System.out.println("Taxa de serviço (fixa): R$ "+rate);
        System.out.println("Valor total debitado: R$ "+(witdrawalAmount+rate));
    }

    public void application(int months) {
        float yield = 0.65f / 100;
        
        double newBalance = this.balance * Math.pow((1 + yield), months);

        System.out.println("VALOR ATUALIZADO EM SUA POUPANÇA!");
        System.out.println("Seu dinheiro trabalhou por você enquanto sua conta esteve guardada.");
        System.out.println("Valor aplicado: "+this.balance);
        System.out.println("Período investido:");
        System.out.println("Taxa de rendimento aplicada:"+yield+"% ao mês");
        System.out.println("Total que rendeu: R$ "+(newBalance - this.balance));
        System.out.println("Saldo atualizado: R$ "+newBalance);

        this.balance = newBalance;
    }


    public double getBalance() {
        return this.balance;
    }
    public String getHolder() {
        return this.holder;
    }
    public long getAccountNumber() {
        return this.accountNumber;
    }
}
