package Character;
import Strategy.EstrategiaEnemigo;

public abstract class Enemigo implements Character{
    public abstract void setEstrategia(EstrategiaEnemigo estrategia);
    public abstract EstrategiaEnemigo getEstrategia();
}
