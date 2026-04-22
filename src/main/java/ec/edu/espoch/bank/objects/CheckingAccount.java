/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.objects;

/**
 *
 * @author PC-02
 */
public class CheckingAccount extends Account {

    protected float overdraft = 0;

    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }

    public float getOverdraft() {
        return overdraft;
    }

    public float getBalance() {
        return balance;
    }

    public int getNumberDeposits() {
        return numberDeposits;
    }

    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setNumberDeposits(int numberDeposits) {
        this.numberDeposits = numberDeposits;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

}
