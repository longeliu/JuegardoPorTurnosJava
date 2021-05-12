package DecoratorAtaque;

public class Espada extends DecoratorAtack{
    public Espada(Ataque ataque){
        super(ataque);
    }

    @Override
    public int getPrecision() {
        return 0;
    }

    @Override
    public int getDamage() {
        return 0;
    }
}
