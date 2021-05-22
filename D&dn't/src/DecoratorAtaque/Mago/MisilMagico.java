package DecoratorAtaque.Mago;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class MisilMagico extends DecoratorAtack {
    public MisilMagico(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Inteligencia";
    }

    @Override
    public int getDamage() {
        return 3;
    }

    @Override
    public String getNombre() {
        return "Misil Mágico";
    }
}
