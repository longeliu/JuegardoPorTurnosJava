package FactoryEnemigos.Huargo;


import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;

public abstract class Huargo extends Enemigo{
    public final void templateEnemigo(Character objetivo, ArrayList<Enemigo> listaEnemigos){
        if (getVida()<=((10+getFuerza())/4)){
            Calculadora.ataque2(this,objetivo);
        } else
            Calculadora.ataque1(this,objetivo);
    }

    /*
        Full cara ataque 1

        si vida > 20 ataque 2

     */
    public final String getNombre() {
        return "Huargo";
    }
}
