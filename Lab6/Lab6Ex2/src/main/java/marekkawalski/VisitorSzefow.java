package marekkawalski;

import java.util.List;

public class VisitorSzefow implements Visitor{
    @Override
    public void visit(final List<JednostkaPolicji> jednostki) {
        jednostki.forEach(jednostkaPolicji -> jednostkaPolicji.accept(this));
    }

    @Override
    public void visit(final JednostkaPolicji jednostka) {
        jednostka.accept(this);
    }

    @Override
    public void visit(final Dzielnicowy jednostka) {
        System.out.println("Dzielnicowy: " + jednostka.nazwiskoDzielnicowego);
    }

    @Override
    public void visit(final Posterunek jednostka) {
        System.out.println("Posterunek: " + jednostka.nazwiskoKomendanta);
    }

    @Override
    public void visit(final KomendaGlowna jednostka) {
        System.out.println("KG: " + jednostka.komendant);
    }

    @Override
    public void visit(final ABW jednostka) {
        System.out.println("ABW: Nazwisko jest tajne!");
    }
}