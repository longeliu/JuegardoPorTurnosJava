package DecoratorAtaque.Enemigos.Huargo.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class DescansoFuerte extends DecoratorAtack{
    
    public DescansoFuerte(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return getAtaque().getDamage() - 4;
    }

    @Override
    public String getNombre() {
        return "Descanso Fuerte";
    }
}