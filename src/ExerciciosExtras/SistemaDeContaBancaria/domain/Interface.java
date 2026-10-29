package ExerciciosExtras.SistemaDeContaBancaria.domain;

import java.util.Scanner;


// Scanner scanner = new Scanner(System.in);

// System.out.print("Digite seu nome: ");
// String nome = scanner.nextLine();

public class Interface {
    Scanner scanner = new Scanner(System.in);

    private Account account;
    private Account checkingAccount = new Account();
    private Account savingsAccount = new Account(); 

    private byte type; 
    

    public void accountType() {
        System.out.println("Qual Tipo de conta você quer entrar?");
        System.out.println("[1] Conta Corrente | [2] Conta Poupança");
        this.type = scanner.nextByte();

        if (this.type != 1 && this.type != 2) {
            System.out.println("Resposta inválida, verifique os dados e tente novamente");
            return;
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
    }

    public void designateStarter() {
        
    }


}
