package marekkawalski;

public abstract class JednostkaPolicji {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}