package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {
    public CarRentalService() {
    }

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Car for: " + user.getName() + user.getSurname()
                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());

//        MailService mailService = new MailService();
//        mailService.sendEmail(user);
//
//        CarRentalRepository carRentalRepository = new CarRentalRepository();
//        carRentalRepository.createCarRental(user, carRentFrom, carRentTo);

        return true;
    }
}
