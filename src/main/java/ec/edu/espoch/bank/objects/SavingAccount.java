/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.objects;

/**
 *
 * @author PC-02
 */
public class SavingAccount extends Account {

    protected boolean state = false;

    public SavingAccount(boolean state, float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
        this.state = state;
    }

    public boolean isState() {
        return state;
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

    public void setState(boolean state) {
        this.state = state;
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
