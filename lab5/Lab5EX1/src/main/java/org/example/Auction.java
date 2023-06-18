package org.example;

public class Auction extends Colleague {

    private double price;

    public Auction(double price, Mediator mediator) {
        super(mediator);
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void receive(final double price) {

    }
}
