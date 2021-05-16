package FactoryEnemigos.Azotamentes;

import DecoratorAtaque.Ataque;
import FactoryEnemigos.Gigante.Gigante;

public class AzotamentesAltoBosque extends Azotamentes {
    @Override
    public Ataque ataque1() {
        return null;
    }

    @Override
    public Ataque ataque2() {
        return null;
    }

    @Override
    public int defensa() {
        return 0;
    }

    @Override
    public String extra() {
        return null;
    }
}
