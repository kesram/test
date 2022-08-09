package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Mark", "Spencer");

        LocalDateTime orderFrom = LocalDateTime.of(2022, 8, 1, 12, 0);
        LocalDateTime orderTo = LocalDateTime.of(2022, 8, 1, 12, 5);

        return new OrderRequest(user, orderFrom, orderTo);
    }
}
