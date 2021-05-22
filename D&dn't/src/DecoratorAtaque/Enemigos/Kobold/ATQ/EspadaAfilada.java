package DecoratorAtaque.Enemigos.Kobold.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class EspadaAfilada extends DecoratorAtack{
    
    public EspadaAfilada(Ataque ataque) {
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
        return "Espada Afilada";
    }
}