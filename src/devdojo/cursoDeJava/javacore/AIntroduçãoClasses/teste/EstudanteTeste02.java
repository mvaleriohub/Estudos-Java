package devdojo.cursoDeJava.javacore.AIntroduçãoClasses.teste;

import devdojo.cursoDeJava.javacore.AIntroduçãoClasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Miguel";
        estudante.idade = 16;
        estudante.sexo = 'M';

        estudante2.nome = "Gabriela";
        estudante2.idade = 16;
        estudante2.sexo = 'F';
        
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("--------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
