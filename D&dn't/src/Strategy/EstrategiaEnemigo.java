package Strategy;

import DecoratorAtaque.Ataque;

public interface EstrategiaEnemigo {
    public Ataque getAtaque2(int mundo);
    public String getNombreEstrategia();
}
