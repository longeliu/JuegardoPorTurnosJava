package DecoratorAtaque.Mago;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Baston extends DecoratorAtack {
    public Baston(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Inteligencia";
    }

    @Override
    public int getDamage() {
        return 1;
    }

    @Override
    public String getNombre() {
        return "Ataque con baston";
    }
}
