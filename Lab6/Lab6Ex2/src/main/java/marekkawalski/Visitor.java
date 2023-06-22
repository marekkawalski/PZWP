package marekkawalski;

import java.util.List;

public interface Visitor {
    void visit(List<JednostkaPolicji> jednostki);
    void visit(JednostkaPolicji jednostka);
    void visit(Dzielnicowy jednostka);
    void visit(Posterunek jednostka);
    void visit(KomendaGlowna jednostka);

    void visit(ABW jednostka);
}
