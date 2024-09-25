package domain.creditcard.entity;

import domain.framework.entity.Customer;

import java.time.LocalDate;

public record NewCreditAccountCommandData(String accountNumber,
                                          Customer customer,
                                          CreditCardType creditCardType,
                                          LocalDate expiredDate) {
}
