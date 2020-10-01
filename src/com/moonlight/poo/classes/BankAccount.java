package com.moonlight.poo.classes;

/**
 *
 * @author Mark_Zamudio
 */

public class BankAccount {
    private String accountNumber;
    private String titular;
    private double balance;
    
    public BankAccount() {
        accountNumber = "Sin definir";
        titular = "Sin definir";
    }
    
    public BankAccount(String accountNumber, String titular, double balance) {
        this.accountNumber = accountNumber;
        this.titular = titular;
        this.balance = balance;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        
        return false;
    }
    
    public boolean withdrawals(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return "No.Cuenta: " + this.accountNumber + "\n" +
                "Titular: " + this.titular + "\n" +
                "Saldo actual: " + this.balance;
    }
}
