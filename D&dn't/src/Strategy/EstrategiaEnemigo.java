package Strategy;

import DecoratorAtaque.Ataque;

public interface EstrategiaEnemigo {//interfaz de las estrategias las cuales seleccionan ataque diferentes segun tipo de estrategia y enemigo

    public Ataque getAtaque2(int mundo);

    public String getNombreEstrategia();
}
