package ExerciciosExtras.SistemaDeContaBancaria;

import ExerciciosExtras.SistemaDeContaBancaria.domain.Account;

public class Manager {
    public static void main(String[] args) {

        Account account;
        Account checkingAccount = new Account();
        Account savingsAccount = new Account();
        
        // Type of account
        byte type = 2;
        if (type == 1) {
            account = checkingAccount;
        } else {
            account = savingsAccount;
        }
        
        // define data
        double depositedAmount = 500;
        double witdrawalAmount = 100;
        int monthsApplication = 6;


        account.deposit(depositedAmount);
        account.witdraw(type, witdrawalAmount);
        account.application(monthsApplication);
    }
}
