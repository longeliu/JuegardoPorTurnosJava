package DecoratorAtaque.Mago;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class SaetaDeFuego extends DecoratorAtack {
    public SaetaDeFuego(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return getAtaque().getTipoataque();
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage()+3;
    }

    @Override
    public String getNombre() {
        return "Saeta de fuego";
    }
}
