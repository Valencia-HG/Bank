/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoSavingAccounts;

/**
 *
 * @author PC-02
 */
public class SavingAccounts extends Accounts implements DaoSavingAccounts {

    @Override
    public boolean deposit(float value) {
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
