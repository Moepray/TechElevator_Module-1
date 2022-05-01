package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String AccountNumber,
                           int balance) {
        super(accountHolderName, AccountNumber, balance);
    }



    @Override

    public int withdraw(int amtToWithdraw) {
        int currentBalance = this.getBalance();
        int remainingBalance = currentBalance - amtToWithdraw;

        if (remainingBalance <= -100) {
            return currentBalance;
        } else if (remainingBalance < 0 && remainingBalance > - 100) {
            super.withdraw(amtToWithdraw + 10);
        } else {
            super.withdraw(amtToWithdraw);
        }
        return getBalance();
    }

}
		
		