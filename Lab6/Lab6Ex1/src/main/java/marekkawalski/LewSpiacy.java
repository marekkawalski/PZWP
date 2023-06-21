package marekkawalski;

public class LewSpiacy extends LionState {
    public LewSpiacy(final LionContext lionContext) {
        super(lionContext);
    }

    @Override
    public void poke() {
        System.out.println("Nie reaguje");
    }

    @Override
    public void feed() {
        System.out.println("Bierze sie do jedzenia");
        lionContext.changeState(new LewJedzacy(lionContext));
    }

    @Override
    public void sing() {
        System.out.println("Budzi sie");
        lionContext.changeState(new LewSpacerujacy(lionContext));
    }

    @Override
    public void takeFood() {
        System.out.println("Nie ma mu czego odebrac");
    }
}
