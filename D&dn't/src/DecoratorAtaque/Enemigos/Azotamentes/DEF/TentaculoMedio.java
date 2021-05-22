package DecoratorAtaque.Enemigos.Azotamentes.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class TentaculoMedio extends DecoratorAtack{
    
    public TentaculoMedio(Ataque ataque) {
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
        return "Tentaculo Medio";
    }
}