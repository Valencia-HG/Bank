/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.objects.Account;

/**
 *
 * @author PC-02
 */
public class Accounts {

    public boolean deposit(Account account, float value) {

        float newBalance = account.getBalance() + value;
        account.getBalance();
        return true;
    }

    public boolean withdraw(Account account, float value) {
        boolean resp = false;
        if (account.getBalance() > value) {
            float newBalance = account.getBalance() - value;
            account.setBalance(newBalance);
            resp = true;
        }
        return true;
    }

    private float calculateInterest() {
        return 0.0F;
    }

    public boolean monthlyStatement() {
        return true;
    }

    public void print(Account account) {
        System.out.println("Saldo: " + account.getBalance());
        System.out.println("Numero depositos: " + account.getNumberDeposits());
        System.out.println("Numero retiros: " + account.getNumberWithdrawals());
        System.out.println("Interes anual: " + account.getAnnualInterestRate());
        System.out.println("Estado mensual: " + account.getMonthlyFee());

    }
}
