package devdojo.cursoDeJava.javacore.IntroduçãoClasses.teste;

import devdojo.cursoDeJava.javacore.IntroduçãoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Miguel";
        estudante.idade = 16;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
