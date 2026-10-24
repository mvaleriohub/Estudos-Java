package exerciciosExtras;
import java.util.Scanner;

public class SistemaDeGestãoDeNotasEscolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeDeAlunos = scanner.nextInt();
        scanner.nextLine();
        
        String [] alunos = new String[quantidadeDeAlunos]; 

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.print("Nome do "+(i+1)+"° aluno: ");
            String nome = scanner.nextLine();

            alunos[i] = nome;
        }

        System.out.print("Digite a quantidade de avaliações: ");
        int quantidadeDeAvaliacoes = scanner.nextInt();
        scanner.nextLine();

        float [][] notas = new float [quantidadeDeAlunos][(quantidadeDeAvaliacoes + 1)];

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println((i+1)+"° aluno | "+alunos[i]);

            for (int j = 0; j < quantidadeDeAvaliacoes; j++) {
                System.out.print((j+1)+"° Avaliação: ");
                float notaDoAluno = scanner.nextFloat();

                notas[i][j] = notaDoAluno;
            }            
        }

        float somaGeralDasMedias = 0;
        float maiorMedia = -1.0f;
        int linhaMaiorMedia = 0;

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            float somaDasNotas = 0;
            float media;
            String status;

            for (int j = 0; j < quantidadeDeAvaliacoes; j++) {
                somaDasNotas += notas[i][j];
            }

            media = somaDasNotas / quantidadeDeAvaliacoes;
            notas[i][quantidadeDeAvaliacoes] =  media;

            if (media > maiorMedia) {
                maiorMedia = media;
                linhaMaiorMedia = i;
            }
            
            if (media >= 7) {
                status = "Aprovado";
            } else {
                status = "Reprovado";
            }

            System.out.println("Media de "+alunos[i]+": "+notas[i][quantidadeDeAvaliacoes]+"   |   "+status);

            somaGeralDasMedias += media;
        }

        float mediaGeral = somaGeralDasMedias / quantidadeDeAlunos; 

        System.out.println("A media geral da turma é: "+mediaGeral);

        String alunoComMaiorMedia = alunos[linhaMaiorMedia];
        System.out.println(alunoComMaiorMedia+" Alcançou a maior média da turma. Com potuação de "+notas[linhaMaiorMedia][quantidadeDeAvaliacoes]);
    }
}