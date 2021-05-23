package Character;
import Strategy.EstrategiaEnemigo;

import java.util.ArrayList;

public abstract class Enemigo implements Character{//Clase abstracta padre de los enemigos que añade, lo necesario para implementarles la estrategia y su template

    public abstract void setEstrategia(EstrategiaEnemigo estrategia);
    public abstract EstrategiaEnemigo getEstrategia();
    public abstract void templateEnemigo(Character objetivo,ArrayList<Enemigo> listaEnemigos);
    public abstract String getNombre();
}
