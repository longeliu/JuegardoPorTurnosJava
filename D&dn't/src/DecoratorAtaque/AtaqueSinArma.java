package DecoratorAtaque;

public class AtaqueSinArma implements Ataque{
    @Override
    public int getPrecision() {
        return 20;
    }

    @Override
    public int getDamage() {
        return 1;
    }
}
