package DecoratorAtaque.Picaro;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class EspadaDentada extends DecoratorAtack {
    public EspadaDentada(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return getAtaque().getTipoataque();
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage()+2;
    }

    @Override
    public String getNombre() {
        return "Ataque con espada pesada";
    }
}
