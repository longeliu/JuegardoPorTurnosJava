package DecoratorAtaque;

public class Maza extends DecoratorAtack{

    public Maza(Ataque ataque) {
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
