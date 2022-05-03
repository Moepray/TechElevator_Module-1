package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class BankCustomer  implements Accountable{

        private String name;
        private String address;
        private String phoneNumber;
        private List<Accountable> accounts =  new ArrayList<>();

        /// constructor

        public BankCustomer() {
        }


        public String getName() {
            return name;
        }
        public String getAddress() {
            return address;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public List<Accountable> accounts() {
            return accounts;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAddress(String address) {
            this.address = address;

        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Object getAccounts() {

            Object[] accountArray = accounts.toArray();
            return accountArray;
        }

        @Override
        public int getBalance() {

            int totalBalance = 0;
            for ( Accountable account : accounts) {
                totalBalance += account.getBalance();
            }
            return totalBalance;
        }
        public void addAccount(Accountable newAccount) {
            this.accounts.add(newAccount);

        }
        public boolean isVip() {

            if (getBalance() >= 25000) {
                return true;
            }
            return false;
        }

    }

