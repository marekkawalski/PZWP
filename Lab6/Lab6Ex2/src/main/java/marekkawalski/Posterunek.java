package marekkawalski;

public class Posterunek extends JednostkaPolicji {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    String nazwiskoKomendanta = "Adamski";
    int dlugosc = 10;
    int szerokosc = 20;
}
