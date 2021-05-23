package DecoratorAtaque.Guerrero;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Empujon extends DecoratorAtack{
    public Empujon(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage();
    }

    @Override
    public String getNombre() {
        return "Empujon";
    }
}
