package devdojo.cursoDeJava.javacore.IntroduçãoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario;

    public void imprimirDados() {
        System.out.println("------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double d : this.salario) {
            System.out.println("R$ "+d);
        }
    }

    public void mediaSalario() {
        double soma = 0;
        
        for (double d : this.salario) {
            soma += d;
        }
        double media = soma / this.salario.length;

        System.out.println("-----------");
        System.out.println("O salario médio do funcionario é: R$ "+media);
    }
}
