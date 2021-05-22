package DecoratorAtaque.Enemigos.Kobold.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Placaje extends DecoratorAtack{
    
    public Placaje(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 1;
    }

    @Override
    public String getNombre() {
        return "Placaje";
    }
}
