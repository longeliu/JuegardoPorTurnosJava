package DecoratorAtaque.Enemigos.Huargo.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Descanso extends DecoratorAtack{
    
    public Descanso(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() - 2;
    }

    @Override
    public String getNombre() {
        return "Descanso";
    }
}
