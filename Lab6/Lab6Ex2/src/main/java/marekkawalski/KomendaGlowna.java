package marekkawalski;

import java.awt.Dimension;

public class KomendaGlowna extends JednostkaPolicji {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    String komendant = "Papala";
    Dimension obszar = new Dimension(200, 100);
}
