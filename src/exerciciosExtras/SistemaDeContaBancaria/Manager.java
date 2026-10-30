package ExerciciosExtras.SistemaDeContaBancaria;

import ExerciciosExtras.SistemaDeContaBancaria.domain.AppControler;

public class Manager {
    public static void main(String[] args) {
        AppControler appControler = new AppControler();

        while (true) {
            while (appControler.accountType() == 0) {
                System.out.println("-----------");
            }

            while (appControler.designateStarter() == 0) {
                System.out.println("-----------");
            }
            
            while (appControler.manageMethods() == 1) {
                System.out.println("========================================");
            }
        }
    }
}
