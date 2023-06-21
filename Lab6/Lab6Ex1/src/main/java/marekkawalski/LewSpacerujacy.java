package marekkawalski;

public class LewSpacerujacy extends LionState {

    public LewSpacerujacy(final LionContext lionContext) {
        super(lionContext);
    }

    @Override
    public void poke() {
        System.out.println("Rzuca sie na kraty");
    }

    @Override
    public void feed() {
        System.out.println("Bierze sie do jedzenia");
        lionContext.changeState(new LewJedzacy(lionContext));
    }

    @Override
    public void sing() {
        System.out.println("Zasypia");
        lionContext.changeState(new LewSpiacy(lionContext));
    }

    @Override
    public void takeFood() {
        System.out.println("Nie ma mu czego odebrac");
    }
}
