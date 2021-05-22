package DecoratorAtaque.Enemigos.Azotamentes.ATQ;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Psiquico extends DecoratorAtack{
    
    public Psiquico(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Inteligencia";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() + 2;
    }

    @Override
    public String getNombre() {
        return "Psiquico";
    }
}
