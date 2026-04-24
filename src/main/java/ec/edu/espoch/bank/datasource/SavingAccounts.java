/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoSavingAccounts;
import ec.edu.espoch.bank.objects.SavingAccount;

/**
 *
 * @author PC-02
 */
public class SavingAccounts extends Accounts implements DaoSavingAccounts {

    public SavingAccounts(SavingAccount savingAccount) {
        if (savingAccount.getBalance() > 1000) {
            savingAccount.setState(true);
        }
    }

    @Override
    public boolean deposit(SavingAccount savingAccount, float value) {
        if (savingAccount.isState()) {
            super(deposit(savingAccount,value));
        }
        return true;
    }

    @Override
    public boolean withdraw(float value) {
        return true;
    }

    @Override
    public boolean monthlyStatement() {
        return true;
    }

    @Override
    public void print() {
    }

}
