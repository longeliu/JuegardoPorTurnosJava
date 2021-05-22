package DecoratorAtaque.Enemigos.Azotamentes.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class RegeneracionFuerte extends DecoratorAtack{
    
    public RegeneracionFuerte(Ataque ataque) {
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
        return "Regeneracion Fuerte";
    }
}