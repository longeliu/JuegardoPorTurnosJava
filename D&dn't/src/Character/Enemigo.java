package Character;
import Strategy.EstrategiaEnemigo;

import java.util.ArrayList;

public abstract class Enemigo implements Character{
    public static ArrayList<Enemigo> listaEnemigos;
    public abstract void setEstrategia(EstrategiaEnemigo estrategia);
    public abstract EstrategiaEnemigo getEstrategia();
    public abstract void templateEnemigo(Character objetivo);
}
