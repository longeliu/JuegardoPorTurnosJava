package DecoratorAtaque.Enemigos.Gigante.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PalmetazoFuerte extends DecoratorAtack{
    
    public PalmetazoFuerte(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 3;
    }

    @Override
    public String getNombre() {
        return "Palmetazo Fuerte";
    }
}