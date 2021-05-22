package DecoratorAtaque.Mago;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.DecoratorAtack;

public class RayoAbrasador extends DecoratorAtack {
    public RayoAbrasador(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return getAtaque().getTipoataque();
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 2;
    }

    @Override
    public String getNombre() {
        return "Rayo abrasador";
    }
}
