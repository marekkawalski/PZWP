package marekkawalski;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        new Test();
    }
    List<JednostkaPolicji> jednostki;

    public Test() {
        jednostki = new ArrayList<>();
        jednostki.add(new Dzielnicowy());
        jednostki.add(new Posterunek());
        jednostki.add(new KomendaGlowna());
        jednostki.add(new ABW());

        System.out.println("====Szefowie=====");
        wypiszSzefow();
        System.out.println("====Powierzchnie=====");
        wypiszPowierzchnie();

    }

    public void wypiszSzefow() {
        System.out.println("Szefowie jednostek:");
        VisitorSzefow visitorSzefow = new VisitorSzefow();
        for (JednostkaPolicji jednostka : jednostki) {
            visitorSzefow.visit(jednostka);
        }
    }

    public void wypiszPowierzchnie() {
        VisitorPowierzchni visitorPowierzchni = new VisitorPowierzchni();
        for (JednostkaPolicji jednostka : jednostki) {
            visitorPowierzchni.visit(jednostka);
        }
    }
}

