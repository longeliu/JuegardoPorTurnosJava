package FactoryEnemigos.Huargo;

import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;

public abstract class Huargo extends Enemigo{//Padre de los huargos contiene su estrategia y su nombre
    public final void templateEnemigo(Character objetivo, ArrayList<Enemigo> listaEnemigos){//esta estrategia es la mas simple usa ataque1 siempre salvo cuando este bajo de vida que usa el ataque 2
        this.setArmadura(10 + getDestreza());
        if (getVida()<=((10+getFuerza())/4)){
            Calculadora.ataque2(this,objetivo);
        } else
            Calculadora.ataque1(this,objetivo);
    }

    public final String getNombre() {
        return "Huargo";
    }
}
