package marekkawalski;

public class LionContext implements ILion {
    private LionState lionState;

    public LionContext(){
        this.lionState = new LewSpacerujacy(this);
    }
    public void changeState(LionState lionState) {
        this.lionState = lionState;
    }

    @Override
    public void poke() {
        lionState.poke();
    }

    @Override
    public void feed() {
        lionState.feed();
    }

    @Override
    public void sing() {
        lionState.sing();
    }

    @Override
    public void takeFood() {
        lionState.takeFood();
    }
}

