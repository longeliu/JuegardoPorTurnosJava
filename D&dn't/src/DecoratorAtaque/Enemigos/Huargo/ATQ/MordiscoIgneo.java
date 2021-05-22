package DecoratorAtaque.Enemigos.Huargo.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class MordiscoIgneo extends DecoratorAtack{
    
    public MordiscoIgneo(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 4;
    }

    @Override
    public String getNombre() {
        return "Mordisco Igneo";
    }
}