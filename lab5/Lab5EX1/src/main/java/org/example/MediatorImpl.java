package org.example;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    private final List<Colleague> colleagues;
    public MediatorImpl() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague... colleague) {
        colleagues.addAll(List.of(colleague));
    }

    public void removeColleague(Colleague colleague) {
        colleagues.remove(colleague);
    }

    public void send(double price, Colleague originator) {
        for(Colleague colleague : colleagues) {
            if(colleague != originator) {
                colleague.receive(price);
            }
        }
    }
}

