package FactoryEnemigos.Kobold;

import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;


public abstract class Kobold extends Enemigo {


    public final void templateEnemigo(Character objetivo){
        String estrategia = getEstrategia().getNombreEstrategia();

        switch (estrategia){
            case "ATQ":
                if (getVida()<=((10+getFuerza())/2))
                    Calculadora.ataque2(this,objetivo);
                else
                    Calculadora.ataque1(this,objetivo);
                break;
            case "DEF":
                if (getVida()<=((10+getFuerza())/2)){
                    if (Calculadora.getDado().nextInt(2)==0){
                        Calculadora.defensa(this);
                    }else Calculadora.ataque1(this,objetivo);
                }else if (getVida()<=((10+getFuerza())/5)){
                    Calculadora.ataque2(this,objetivo);
                }else
                    Calculadora.ataque1(this,objetivo);
                break;
            case "SUP":
                if (buscaYcura(listaEnemigos)==0)
                    Calculadora.ataque1(this,objetivo);
                break;
        }

    }

    private int buscaYcura(ArrayList<Enemigo> listaCharacter){
        //busca al mas herido y lo cura
        //si no cura devuelve 0
        return 1;
    }


    /*
        chekea strat
            supp
            chekea otros si >50 les cura
            si vida>50 cura
            deff

            si vida >50 alterna entre ataque y defensa
            si vida >10 ataque 2
            att
            usa ataque 2

     */


}
