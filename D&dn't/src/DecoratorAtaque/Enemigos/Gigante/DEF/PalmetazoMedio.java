package DecoratorAtaque.Enemigos.Gigante.DEF;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PalmetazoMedio extends DecoratorAtack{
    
    public PalmetazoMedio(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 2;
    }

    @Override
    public String getNombre() {
        return "Palmetazo Medio";
    }
}