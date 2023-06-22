package marekkawalski;

public class Dzielnicowy extends JednostkaPolicji {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    String nazwiskoDzielnicowego = "Kowalski";
    double powierzchnia = 100;
}