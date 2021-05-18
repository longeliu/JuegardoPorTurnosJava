package Character;

import DecoratorAtaque.Ataque;
import Strategy.EstrategiaEnemigo;

public abstract class Enemigo implements Character{


    public abstract void setEstrategia(EstrategiaEnemigo estrategia);
}
