package org.example;

public class Client extends Colleague{

    String name;
    double maxPrice;

    public Client(String name, double maxPrice, Mediator mediator) {
        super(mediator);
        this.name = name;
        this.maxPrice = maxPrice;
    }

     @Override
    public void receive(final double price) {
        if(price >= maxPrice ){
            System.out.println(this.name + " says: Thats it. I am out!!!");
            getMediator().removeColleague(this);
            return;
        }
        System.out.println(this.name +  " is bidding : " + price);
    }
}
