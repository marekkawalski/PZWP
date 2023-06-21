package marekkawalski;

public class LionContext implements ILion {
    private LionState lionState;
//    final int SLEEPING = 0;
//    final int EATING = 1;
//    final int WALKING = 2;
//    private int state = WALKING;

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

//    @Override
//    public void poke() {
//        if (state == SLEEPING) {
//            System.out.println("Nie reaguje");
//        } else if (state == EATING) {
//            System.out.println("Warczy");
//        } else if (state == WALKING) {
//            System.out.println("Rzuca sie na kraty");
//        }
//    }
//
//    @Override
//    public void feed() {
//        System.out.println("Bierze sie do jedzenia");
//        state = EATING;
//    }
//
//    @Override
//    public void sing() {
//        if (state == WALKING) {
//            System.out.println("Zasypia");
//            state = SLEEPING;
//        } else if (state == EATING) {
//            System.out.println("Warczy");
//        } else if (state == SLEEPING) {
//            System.out.println("Budzi sie");
//            state = WALKING;
//        }
//    }
//
//    @Override
//    public void takeFood() {
//        if (state == EATING) {
//            System.out.println("Odebrano mu jedzenie");
//            state = WALKING;
//        } else {
//            System.out.println("Nie ma mu czego odebrac");
//        }
//    }
}