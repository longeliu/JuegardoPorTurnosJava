package DecoratorAtaque.Enemigos.Gigante.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PatadaFuerte extends DecoratorAtack{
    
    public PatadaFuerte(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 4;
    }

    @Override
    public String getNombre() {
        return "Patada Fuerte";
    }
}