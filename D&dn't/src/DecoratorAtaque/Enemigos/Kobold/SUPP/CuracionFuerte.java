package DecoratorAtaque.Enemigos.Kobold.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class CuracionFuerte extends DecoratorAtack{
    
    public CuracionFuerte(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() - 4;
    }

    @Override
    public String getNombre() {
        return "Curacion Fuerte";
    }
}
