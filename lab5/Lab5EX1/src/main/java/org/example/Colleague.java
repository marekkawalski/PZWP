package org.example;

    public abstract class Colleague {
        private final Mediator mediator;

        protected Colleague(Mediator mediator) {
            this.mediator = mediator;
        }

        public void send(double price) {
            mediator.send(price, this);
        }

        public Mediator getMediator() {
            return mediator;
        }

        public abstract void receive(double price);
    }
