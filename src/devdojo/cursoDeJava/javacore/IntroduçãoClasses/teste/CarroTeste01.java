package devdojo.cursoDeJava.javacore.IntroduçãoClasses.teste;

import devdojo.cursoDeJava.javacore.IntroduçãoClasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Chevrolet";
        carro.modelo = "Onix 1.0 Flex";
        carro.ano = 2024;

        carro2.nome = "Fiat";
        carro2.modelo = "Mobi Like 1.0";
        carro2.ano = 2025;

        System.out.println("1° Carro: \nNome/Marca: "+carro.nome+" | Modelo: "+carro.modelo+" | Ano: "+carro.ano);
        System.out.println("1° Carro: \nNome/Marca: "+carro2.nome+" | Modelo: "+carro2.modelo+" | Ano: "+carro2.ano);

    }
}
