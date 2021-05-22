package FactoryEnemigos.Azotamentes;

import Calculator.Calculadora;
import DecoratorAtaque.Ataque;
import Character.Enemigo;
import Character.Character;

public abstract class Azotamentes extends Enemigo {
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

                break;
        }

    }

    /*
        chekea strat
        supp
            si otros azotamentes >50 les cura
            si el >50 se cura
        def
           vis < 70 ataque2
           vida > 70 ataque 1
           vida > 30 full defensa
        att
           alternar ataque 1 y 2 constantemente
        todos
        si vida >15 te habla en ebreo para decirte no me mates porfi uwu
     */
}
