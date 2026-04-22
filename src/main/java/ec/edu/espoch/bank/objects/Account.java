/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.objects;

/**
 *
 * @author PC-02
 */
public class Account {

    protected float balance;
    protected int numberDeposits = 0;
    protected int numberWithdrawals = 0;
    protected float annualInterestRate;
    protected float monthlyFee = 0;

    public Account(float balance, float annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberDeposits() {
        return numberDeposits;
    }

    public void setNumberDeposits(int numberDeposits) {
        this.numberDeposits = numberDeposits;
    }

    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    
}
