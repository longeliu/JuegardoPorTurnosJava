package DecoratorAtaque.Enemigos.Gigante.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Palmetazo extends DecoratorAtack{
    
    public Palmetazo(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 1;
    }

    @Override
    public String getNombre() {
        return "Palmetazo";
    }
}
