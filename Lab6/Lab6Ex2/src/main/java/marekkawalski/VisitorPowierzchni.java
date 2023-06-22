package marekkawalski;

import java.util.List;

public class VisitorPowierzchni implements Visitor{
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
        System.out.println(jednostka.powierzchnia);
    }

    @Override
    public void visit(final Posterunek jednostka) {
        System.out.println(jednostka.szerokosc * jednostka.dlugosc);
    }

    @Override
    public void visit(final KomendaGlowna jednostka) {
        System.out.println(jednostka.obszar);
    }

    @Override
    public void visit(final ABW jednostka) {
        System.out.println("ABW: Cala Polska");
    }
}