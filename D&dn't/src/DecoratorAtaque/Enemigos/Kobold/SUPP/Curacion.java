package DecoratorAtaque.Enemigos.Kobold.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Curacion extends DecoratorAtack{
    
    public Curacion(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Inteligencia";
    }

    @Override
    public int getDamage() {
        return -3;
    }

    @Override
    public String getNombre() {
        return "Curacion";
    }
}
