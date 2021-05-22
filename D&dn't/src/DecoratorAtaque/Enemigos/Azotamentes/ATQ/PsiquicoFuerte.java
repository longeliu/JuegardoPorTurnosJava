package DecoratorAtaque.Enemigos.Azotamentes.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PsiquicoFuerte extends DecoratorAtack{
    
    public PsiquicoFuerte(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Inteligencia";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 4;
    }

    @Override
    public String getNombre() {
        return "Psiquico Fuerte";
    }
}