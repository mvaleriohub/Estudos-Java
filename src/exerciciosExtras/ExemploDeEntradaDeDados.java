package ExerciciosExtras;
import java.util.Scanner;

public class ExemploDeEntradaDeDados {   
    public static void main(String[] args) {
        // 2. Cria o Scanner para ler a entrada do terminal
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // 3. Lê o texto digitado (como o input() do Python)

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        // Exibe o resultado
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        // 4. É uma boa prática fechar o scanner no final
        scanner.close();
    }
}
