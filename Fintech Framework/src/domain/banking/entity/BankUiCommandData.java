package domain.banking.entity;

import domain.banking.entity.accounts.AccountType;
import domain.framework.entity.Customer;

public class BankUiCommandData {
    private String accountNumber;
    private Customer customer;
    private AccountType accountType;
    private double amount;

    public BankUiCommandData(String accountNumber, Customer customer, AccountType accountType, double amount) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.accountType = accountType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
