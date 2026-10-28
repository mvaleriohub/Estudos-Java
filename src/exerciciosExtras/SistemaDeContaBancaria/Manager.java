package exerciciosExtras.SistemaDeContaBancaria;

import exerciciosExtras.SistemaDeContaBancaria.domain.Account;
import exerciciosExtras.SistemaDeContaBancaria.domain.Deposit;
import exerciciosExtras.SistemaDeContaBancaria.domain.Witdraw;

public class Manager {
    public static void main(String[] args) {

        Account account = new Account();
        Account checkingAccount = new Account();
        Account savingsAccount = new Account();

        Deposit deposit = new Deposit();
        Witdraw witdraw = new Witdraw();
        
        // Type of account
        byte type = 1;
        if (type == 1) {
            account = checkingAccount;
        } else {
            account = savingsAccount;
        }
        
        // define data
        double balance = account.balance;
        double witdrawalAmount = 100;
        double depositedAmount = 200;


        // make the deposit
        double depositResult = deposit.deposit(depositedAmount, balance);
        if (depositResult != -1) {
            balance = depositResult;
        }
        

        // make the witdraw
        double witdrawalResult = witdraw.witdraw(type, balance, witdrawalAmount);
        if (witdrawalResult != -1) {
            balance = witdrawalResult;
        }
    }
}
