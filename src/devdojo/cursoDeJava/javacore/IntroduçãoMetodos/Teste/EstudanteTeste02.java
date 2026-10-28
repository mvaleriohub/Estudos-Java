package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Teste;

import devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Miguel";
        estudante1.idade = 16;
        estudante1.sexo = 'M';

        estudante2.nome = "Gabriela";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
