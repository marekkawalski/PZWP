package org.example;

public class Start {

    public static void main(String[] args) {
        new Start();
    }

    public Start() {
        Mediator mediator = new MediatorImpl();
        Auction auction = new Auction(10,mediator);
        Client k1 = new Client("Adam", 40,mediator);
        Client k2 = new Client("Olek", 30,mediator);

        mediator.addColleague(k1, k2, auction);
        for (int i = 0; i < 200; i += 10) {
            auction.setPrice(i);
            mediator.send(i, auction);
        }
    }
}