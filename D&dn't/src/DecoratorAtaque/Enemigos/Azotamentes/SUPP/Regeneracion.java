package DecoratorAtaque.Enemigos.Azotamentes.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;
public class Regeneracion extends DecoratorAtack{
    
    public Regeneracion(Ataque ataque) {
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
        return "Regeneracion";
    }
}
