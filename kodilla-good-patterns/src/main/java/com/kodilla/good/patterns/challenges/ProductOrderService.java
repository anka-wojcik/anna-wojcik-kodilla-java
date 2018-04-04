package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final LocalDateTime dateOfOrder, final String product, final int amount) {
        System.out.println("Ordering: " + product + ", amount: " + amount + ", for: " + user.getName() + user.getSurname());
        return true;
    }
}
