package Character;

import DecoratorAtaque.Ataque;

public class Player implements Character{
    private int fuerza;
    private int destreza;
    private int inteligencia;

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
