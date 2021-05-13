package Character;

import DecoratorAtaque.Ataque;

public interface Character {
    public Ataque ataque1();
    public Ataque ataque2();
    public int defensa();
    public String extra();
}
