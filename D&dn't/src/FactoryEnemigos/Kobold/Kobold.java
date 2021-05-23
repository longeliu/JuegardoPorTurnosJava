package FactoryEnemigos.Kobold;

import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;


public abstract class Kobold extends Enemigo {


    public final void templateEnemigo(Character objetivo,ArrayList<Enemigo> listaEnemigos){//Padre de los gigantes contiene su estrategia y su nombre
        String estrategia = getEstrategia().getNombreEstrategia();
        this.setArmadura(10 + getDestreza());

        switch (estrategia){
            case "ATQ"://el ofensivo usa ataquw 2 cuando su vida esta por la mitad y si no utiliza ataque 1
                if (getVida()<=((10+getFuerza())/2))
                    Calculadora.ataque2(this,objetivo);
                else
                    Calculadora.ataque1(this,objetivo);
                break;
            case "DEF"://alterna entre ataque y defensa cuando su vida esta por la mitad y cuando esta apunto de morir utiliza ataque 2
                if (getVida()<=((10+getFuerza())/5)){
                    Calculadora.ataque2(this,objetivo);
                }else if (getVida()<=((10+getFuerza())/2)){
                    if (Calculadora.getDado().nextInt(2)==0){
                        Calculadora.defensa(this);
                    }else Calculadora.ataque1(this,objetivo);
                }else
                    Calculadora.ataque1(this,objetivo);
                break;

            case "SUP"://utiliza busca y cura
                if (buscaYcura(listaEnemigos)==0)
                    Calculadora.ataque1(this,objetivo);
                break;
        }


    }

    private int buscaYcura(ArrayList<Enemigo> listaEnemigos){//cura a cualquier aliado por debajo de la mitad de la vida
        for(int i = 0; i < listaEnemigos.size(); i++){
            if (listaEnemigos.get(i).getVida() < 10+getFuerza()/2 ) {
                Calculadora.ataque2(this, listaEnemigos.get(i));
                return 1;
            }
        }
        return 0;
    }

    public final String getNombre() {
        return "Kobold";
    }

}
