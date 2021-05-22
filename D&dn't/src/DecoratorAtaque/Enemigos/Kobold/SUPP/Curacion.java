package DecoratorAtaque.Enemigos.Kobold.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Curacion extends DecoratorAtack{
    
    public Curacion(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() - 2;
    }

    @Override
    public String getNombre() {
        return "Curacion";
    }
}
