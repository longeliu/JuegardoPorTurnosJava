package DecoratorAtaque.Enemigos.Azotamentes.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Tentaculo extends DecoratorAtack{
    
    public Tentaculo(Ataque ataque) {
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
        return "Tentaculo";
    }
}
