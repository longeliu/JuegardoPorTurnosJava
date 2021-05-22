package DecoratorAtaque.Enemigos.Huargo.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class DescansoMedio extends DecoratorAtack{
    
    public DescansoMedio(Ataque ataque) {
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
        return "Descanso Medio";
    }
}
