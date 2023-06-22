package marekkawalski;

public class ABW extends JednostkaPolicji {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    int obszar;
}
