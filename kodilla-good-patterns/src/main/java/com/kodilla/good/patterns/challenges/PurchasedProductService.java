package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PurchasedProductService implements OrderService {
    @Override
    public boolean order(User user, LocalDateTime from, LocalDateTime to) {
        return true;
    }
}
