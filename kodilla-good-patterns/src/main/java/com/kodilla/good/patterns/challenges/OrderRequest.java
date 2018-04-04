package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime dateOfOrder;
    private String product;
    private int amount;

    public OrderRequest(User user, LocalDateTime dateOfOrder, String product, int amount) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.product = product;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
