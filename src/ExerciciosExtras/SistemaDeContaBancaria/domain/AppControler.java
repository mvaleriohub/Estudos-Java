package ExerciciosExtras.SistemaDeContaBancaria.domain;

import java.util.Scanner;

public class AppControler {
    Scanner scanner = new Scanner(System.in);

    private Account account;
    private Account checkingAccount = new Account();
    private Account savingsAccount = new Account();

    private byte type; // 1 = checking | 2 = savings
    

    public byte accountType() {
        System.out.println("Qual Tipo de conta você quer entrar?");
        System.out.println("[1] Conta Corrente | [2] Conta Poupança");
        this.type = scanner.nextByte();
        scanner.nextLine();

        if (this.type != 1 && this.type != 2) {
            System.out.println("Resposta inválida, verifique os dados e tente novamente");
            return 0;
        }

        if (this.type == 1) {
            System.out.println("Entrando na sua conta corrente...");
            this.account = this.checkingAccount;
        }
        if (this.type == 2) {
            System.out.println("Entrando na sua conta poupança...");
            this.account = this.savingsAccount;
        }
        System.out.println("---------------------------");
        return 1;
    }

    public byte designateStarter() {
        if (account.getHolder() != null) {
            return 1;
        }

        System.out.print("Digite o nome do usuario: ");
        String holder = scanner.nextLine();

        if (holder == null || holder.trim().isEmpty()) {
            System.out.println("Erro: o nome de titular não pode estar vazio");
            return 0;
        }

        if (holder.length() < 4) {
            System.out.println("Erro: O nome de titular tem menos que 4 caracteres");
            return 0;
        }

        if (holder.length() > 15) {
            System.out.println("Erro: O nome de titular tem mais de 15 caracteres");
            return 0;
        }

        this.account.setHolder(holder);
        return 1;
    }

    public byte manageMethods() {
    System.out.println("Bem vindo ao banco Master");
    System.out.println("conta: " + account.getAccountNumber());
    System.out.println("titular: " + account.getHolder());
    System.out.println("---------");
    System.out.println("Saldo: " + account.getBalance());
    System.out.println("");
    System.out.print("[1] Sacar [2] Depositar [0] Sair ");
    
    if (this.type == 2) {
        System.out.println(" [3] Aplicar para rendimento");
    } else {
        System.out.println("");
    }

    System.out.println("");
    System.out.print("Escolha uma opção: ");
    byte option = scanner.nextByte();
    scanner.nextLine();

    if (option == 0) {
        System.out.println("Saindo da conta atual...");
        return 0;
    }
    
    if (option == 1) {
        System.out.print("Digite o valor do saque: ");
        double withdrawalAmount = scanner.nextDouble();
        scanner.nextLine();
        account.witdraw(this.type, withdrawalAmount);
        return 1;
    }
    
    if (option == 2) {
        System.out.print("Digite o valor do depósito: ");
        double depositedAmount = scanner.nextDouble();
        scanner.nextLine();
        account.deposit(depositedAmount);
        return 1;
    }
    
    if (option == 3 && this.type == 2) {
        System.out.print("Digite a quantidade de meses para a aplicação: ");
        int monthsApplication = scanner.nextInt();
        scanner.nextLine();
        account.application(monthsApplication);
        return 1;
    }

    System.out.println("Erro: Opção inválida!");
    return 1;
}

}
