package FactoryEnemigos.Gigante;

import DecoratorAtaque.Ataque;

public abstract class Gigante {
    public abstract Ataque ataque1();
    public abstract Ataque ataque2();
    public abstract int defensa();
    public abstract String extra();
}
