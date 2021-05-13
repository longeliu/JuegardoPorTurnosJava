package DecoratorAtaque;

public abstract class DecoratorAtack implements Ataque{
    private Ataque ataque;

    public DecoratorAtack(Ataque ataque){
        setAtaque(ataque);
    }

    protected Ataque getAtaque() {
        return ataque;
    }

    protected void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }
}
