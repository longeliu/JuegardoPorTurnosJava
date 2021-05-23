package DecoratorAtaque.Picaro;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Cegar extends DecoratorAtack {
    public Cegar(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Destreza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage();
    }

    @Override
    public String getNombre() {
        return "Cegar";
    }
}
