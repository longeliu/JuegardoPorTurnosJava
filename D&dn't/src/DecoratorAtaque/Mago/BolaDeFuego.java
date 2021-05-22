package DecoratorAtaque.Mago;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class BolaDeFuego extends DecoratorAtack {
    
    public BolaDeFuego(Ataque ataque) {
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
        return "Bola de fuego";
    }
}
