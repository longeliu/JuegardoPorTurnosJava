package DecoratorAtaque.Enemigos.Gigante.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class PatadaMedio extends DecoratorAtack{
    
    public PatadaMedio(Ataque ataque) {
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
        return "Patada Medio";
    }
}