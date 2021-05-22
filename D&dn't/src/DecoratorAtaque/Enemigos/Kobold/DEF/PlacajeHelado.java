package DecoratorAtaque.Enemigos.Kobold.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PlacajeHelado extends DecoratorAtack{
    
    public PlacajeHelado(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 2;
    }

    @Override
    public String getNombre() {
        return "Placaje Helado";
    }
}