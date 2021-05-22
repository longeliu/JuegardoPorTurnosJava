package DecoratorAtaque.Enemigos.Gigante.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class RunasFuerte extends DecoratorAtack{
    
    public RunasFuerte(Ataque ataque) {
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
        return "Runas Curativas Fuertes";
    }
}