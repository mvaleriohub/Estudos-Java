package exerciciosExtras.SistemaDeContaBancaria.domain;

public class Application {
    public double application(double balance, int months) {
        float yield = 0.65f;
        
        double newBalance = balance * Math.pow((1 + yield), months);

        System.out.println("VALOR ATUALIZADO EM SUA POUPANÇA!");
        System.out.println("Seu dinheiro trabalhou por você enquanto sua conta esteve guardada.");
        System.out.println("Período investido:");
        System.out.println("Taxa de rendimento aplicada:"+yield+"% ao mês");
        System.out.println("Total que rendeu: R$ "+(newBalance - balance));
        System.out.println("Saldo atualizado: R$ "+newBalance);


        return newBalance;
    }
}
