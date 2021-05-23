package FactoryEnemigos.Kobold;

import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;
import FactoryEnemigos.Azotamentes.Azotamentes;

import java.util.ArrayList;


public abstract class Kobold extends Enemigo {


    public final void templateEnemigo(Character objetivo,ArrayList<Enemigo> listaEnemigos){
        String estrategia = getEstrategia().getNombreEstrategia();
        this.setArmadura(10 + getDestreza());

        switch (estrategia){
            case "ATQ":
                if (getVida()<=((10+getFuerza())/2))
                    Calculadora.ataque2(this,objetivo);
                else
                    Calculadora.ataque1(this,objetivo);
                break;
            case "DEF":
                if (getVida()<=((10+getFuerza())/5)){
                    Calculadora.ataque2(this,objetivo);
                }else if (getVida()<=((10+getFuerza())/2)){
                    if (Calculadora.getDado().nextInt(2)==0){
                        Calculadora.defensa(this);
                    }else Calculadora.ataque1(this,objetivo);
                }else
                    Calculadora.ataque1(this,objetivo);
                break;

            case "SUP":
                if (buscaYcura(listaEnemigos)==0)
                    Calculadora.ataque1(this,objetivo);
                break;
        }


    }

    private int buscaYcura(ArrayList<Enemigo> listaEnemigos){
        for(int i = 0; i < listaEnemigos.size(); i++){
            if (listaEnemigos.get(i).getVida() < 10+getFuerza()/2 ) {
                Calculadora.ataque2(this, listaEnemigos.get(i));
                return 1;
            }
        }
        return 0;
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

    public final String getNombre() {
        return "Kobold";
    }

}
