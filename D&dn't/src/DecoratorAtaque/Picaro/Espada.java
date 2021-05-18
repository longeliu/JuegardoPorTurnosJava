package DecoratorAtaque.Picaro;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class Espada extends DecoratorAtack {

    public Espada(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Destreza";
    }

    @Override
    public int getDamage() {
        return 3;
    }

    @Override
    public String getNombre() {
        return "Ataque con Espada";
    }
}
