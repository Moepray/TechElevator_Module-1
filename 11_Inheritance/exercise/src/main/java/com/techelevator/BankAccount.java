package com.techelevator;

public class BankAccount {

    private String accountNumber;
    protected int balance;
    private String accountHolderName;




    public BankAccount (String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount (String accountHolderName, String accountNumber,
                        int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }


    public int deposit(int amtToDeposit) {
        balance += amtToDeposit;
        return balance;
    }

    public int withdraw(int amtToWithdraw) {
        balance -= amtToWithdraw;
        return balance;
    }


}