package devdojo.cursoDeJava.javacore.IntroduçãoClasses.teste;

import devdojo.cursoDeJava.javacore.IntroduçãoClasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Willian";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome+" | Idade: "+professor.idade+" | Sexo: "+professor.sexo);
    }
}
