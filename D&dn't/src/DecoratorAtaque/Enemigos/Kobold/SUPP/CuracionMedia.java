package DecoratorAtaque.Enemigos.Kobold.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class CuracionMedia extends DecoratorAtack{
    
    public CuracionMedia(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() - 3;
    }

    @Override
    public String getNombre() {
        return "Curacion Media";
    }
}