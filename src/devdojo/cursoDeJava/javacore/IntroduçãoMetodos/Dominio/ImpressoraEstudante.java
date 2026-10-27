package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
