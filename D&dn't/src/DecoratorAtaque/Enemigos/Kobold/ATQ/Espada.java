package DecoratorAtaque.Enemigos.Kobold.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Espada extends DecoratorAtack{
    
    public Espada(Ataque ataque) {
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
        return "Espada";
    }
}
