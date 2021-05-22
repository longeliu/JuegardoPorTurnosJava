package DecoratorAtaque.Enemigos.Azotamentes.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class RegeneracionMedio extends DecoratorAtack{
    
    public RegeneracionMedio(Ataque ataque) {
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
        return "Regeneracion Medio";
    }
}
