package org.example;

public interface Mediator {
    void send(double price, Colleague colleague);
    void addColleague(Colleague... colleague);
    void removeColleague(Colleague colleague);
}
