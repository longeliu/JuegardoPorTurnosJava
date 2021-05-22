package DecoratorAtaque.Mago;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PalabraDeSanacion extends DecoratorAtack {
    public PalabraDeSanacion(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Inteligencia";
    }

    @Override
    public int getDamage() {
        return -2;
    }

    @Override
    public String getNombre() {
        return "Palabra de sanmación";
    }
}
