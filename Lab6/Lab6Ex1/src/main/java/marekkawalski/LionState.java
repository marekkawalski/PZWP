package marekkawalski;

public abstract class LionState implements ILion{
    protected LionContext lionContext;

    protected LionState(LionContext lionContext){
       this.lionContext = lionContext;
    }

}