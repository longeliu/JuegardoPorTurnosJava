package Character;

import DecoratorAtaque.Ataque;

public abstract class Enemigo implements Character{


    public abstract Ataque ataque1();

    public abstract Ataque ataque2();

    public abstract int defensa();

    public abstract String extra();

    public abstract void setEstrategia();
}
