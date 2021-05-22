package DecoratorAtaque.Enemigos.Azotamentes.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PsiquicoMedio extends DecoratorAtack{
    
    public PsiquicoMedio(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Inteligencia";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 3;
    }

    @Override
    public String getNombre() {
        return "Psiquico Medio";
    }
}