package FactoryEnemigos.Kobold;

import DecoratorAtaque.Ataque;
import FactoryEnemigos.Huargo.Huargo;

public class KoboldAltoBosque extends Kobold {
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
