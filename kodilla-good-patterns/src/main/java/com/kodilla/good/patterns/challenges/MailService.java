package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Thank You for transaction! Product will be delivered soon");
    }
}
