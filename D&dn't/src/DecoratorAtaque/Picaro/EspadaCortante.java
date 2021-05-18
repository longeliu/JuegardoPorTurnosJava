package DecoratorAtaque.Picaro;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class EspadaCortante extends DecoratorAtack {
    public EspadaCortante(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return getAtaque().getTipoataque();
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage()+2;
    }

    @Override
    public String getNombre() {
        return "Ataque con espada cortante";
    }
}
