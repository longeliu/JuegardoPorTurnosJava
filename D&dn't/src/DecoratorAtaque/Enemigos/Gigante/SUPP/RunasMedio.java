package DecoratorAtaque.Enemigos.Gigante.SUPP;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.DecoratorAtack;

public class RunasMedio extends DecoratorAtack{
    
    public RunasMedio(Ataque ataque) {
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
        return "Runas Curativas Medio";
    }
}
