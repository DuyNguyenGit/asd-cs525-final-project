package domain.banking;

import domain.banking.rules.CompanyDepositRule;
import domain.banking.rules.CompanyWithdrawRule;
import domain.banking.rules.PersonalDepositRule;
import domain.banking.rules.PersonalWithdrawRule;
import domain.framework.entity.Account;
import domain.framework.entity.AccountEntry;
import domain.framework.rules.Rule;
import domain.framework.usecase.notification.subject.Subject1;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionRules {
    public static List<Rule<Account, AccountEntry>> getDepositRules(Subject1 notificationSubject) {
        List<Rule<Account, AccountEntry>> rules = new ArrayList<>();
        rules.add(new CompanyDepositRule(notificationSubject));
        rules.add(new PersonalDepositRule(notificationSubject));
        return rules;
    }
    public static List<Rule<Account, AccountEntry>> getWithdrawRules(Subject1 notificationSubject) {
        List<Rule<Account, AccountEntry>> rules = new ArrayList<>();
        rules.add(new CompanyWithdrawRule(notificationSubject));
        rules.add(new PersonalWithdrawRule(notificationSubject));
        return rules;
    }
}
