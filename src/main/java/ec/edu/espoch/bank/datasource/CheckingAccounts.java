/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoCheckingAccounts;

/**
 *
 * @author PC-02
 */
public class CheckingAccounts extends Accounts implements DaoCheckingAccounts {

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
