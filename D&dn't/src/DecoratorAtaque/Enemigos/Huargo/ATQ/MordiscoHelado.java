package DecoratorAtaque.Enemigos.Huargo.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class MordiscoHelado extends DecoratorAtack{
    
    public MordiscoHelado(Ataque ataque) {
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
        return "Mordisco Helado";
    }
}