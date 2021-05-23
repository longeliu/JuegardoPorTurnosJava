package FactoryEnemigos.Gigante;

import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;

public abstract class Gigante extends Enemigo {
    public final void templateEnemigo(Character objetivo,ArrayList<Enemigo> listaEnemigos){
        String estrategia = getEstrategia().getNombreEstrategia();
        this.setArmadura(10 + getDestreza());

        if (estrategia.equals("SUP")){
            alentarAlPueblo(listaEnemigos);
            Calculadora.ataque1(this,objetivo);
        } else {
            if (getVida()<=((10+getFuerza())/4)){
                Calculadora.ataque2(this,objetivo);
            } else
                Calculadora.ataque1(this,objetivo);
        }


    }

    private void alentarAlPueblo(ArrayList<Enemigo> listaEnemigos){
        //busca gigantes a mitad de vida y canta para curarles TODO
    }
    /*
    chekea strat
        supp
        si algun gigante > 60 se pone a cantar

    todos
    si vida > 30
    ataque 2 1 vez, si sube puede volver a usarlo
     */

    public final String getNombre() {
        return "Gigante";
     }
}
