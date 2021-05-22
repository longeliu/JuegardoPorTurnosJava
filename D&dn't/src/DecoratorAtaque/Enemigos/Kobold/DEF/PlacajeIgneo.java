package DecoratorAtaque.Enemigos.Kobold.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PlacajeIgneo extends DecoratorAtack{
    
    public PlacajeIgneo(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 3;
    }

    @Override
    public String getNombre() {
        return "Placaje Igneo";
    }
}