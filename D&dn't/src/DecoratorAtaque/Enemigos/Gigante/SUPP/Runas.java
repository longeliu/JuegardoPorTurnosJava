package DecoratorAtaque.Enemigos.Gigante.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;
public class Runas extends DecoratorAtack{
    
    public Runas(Ataque ataque) {
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
        return "Runas Curativas";
    }
}
