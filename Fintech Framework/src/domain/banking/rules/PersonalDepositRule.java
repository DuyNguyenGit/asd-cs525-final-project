package domain.banking.rules;

import domain.framework.entity.Account;
import domain.framework.entity.AccountEntry;
import domain.framework.entity.TransactionType;
import domain.framework.rules.BankTransactionRule;
import domain.framework.usecase.notification.subject.Subject1;

public class PersonalDepositRule implements BankTransactionRule<Account, AccountEntry> {
    private final Subject1 subject;

    public PersonalDepositRule(Subject1 notificationSubject) {
        this.subject = notificationSubject;
    }

    @Override
    public boolean matches(Account account, Double amount, String description, TransactionType transactionType) {
        return account.getCustomer().getCustomerType().equals("Person")
                && (amount > 500 || account.getBalance() < amount);
    }

    @Override
    public void apply(Account account, Double amount, String description, TransactionType transactionType) {
        this.subject.notifyObservers(transactionType, account);
    }
}
