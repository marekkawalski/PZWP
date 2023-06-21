package marekkawalski;

public class LewJedzacy extends LionState {

    public LewJedzacy(final LionContext lionContext) {
        super(lionContext);
    }

    @Override
    public void poke() {
        System.out.println("Warczy");
    }

    @Override
    public void feed() {
        System.out.println("Bierze sie do jedzenia");
        lionContext.changeState(this);
    }

    @Override
    public void sing() {
        System.out.println("Warczy");
    }

    @Override
    public void takeFood() {
        System.out.println("Odebrano mu jedzenie");
        lionContext.changeState(new LewSpacerujacy(lionContext));
    }
}
