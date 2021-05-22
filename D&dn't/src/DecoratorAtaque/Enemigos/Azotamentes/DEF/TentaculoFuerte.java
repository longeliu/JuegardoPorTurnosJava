package DecoratorAtaque.Enemigos.Azotamentes.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class TentaculoFuerte extends DecoratorAtack{
    
    public TentaculoFuerte(Ataque ataque) {
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
        return "Tentaculo Helado";
    }
}