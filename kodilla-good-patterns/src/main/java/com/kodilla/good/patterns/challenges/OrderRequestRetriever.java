package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Mike", "Nash");
        LocalDateTime orderDate = LocalDateTime.of(2018, 4, 4, 15, 45);
        String product = "toothbrush";
        int amount = 4;

        return new OrderRequest(user, orderDate, product, amount);
    }
}
