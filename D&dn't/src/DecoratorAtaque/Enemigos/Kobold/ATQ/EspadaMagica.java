package DecoratorAtaque.Enemigos.Kobold.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class EspadaMagica extends DecoratorAtack{
    
    public EspadaMagica(Ataque ataque) {
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
        return "Espada Magica";
    }
}