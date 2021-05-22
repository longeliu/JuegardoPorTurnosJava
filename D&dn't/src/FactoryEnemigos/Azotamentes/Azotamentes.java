package FactoryEnemigos.Azotamentes;

import Calculator.Calculadora;
import DecoratorAtaque.Ataque;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;

public abstract class Azotamentes extends Enemigo {
    public final void templateEnemigo(Character objetivo,ArrayList<Enemigo> listaEnemigos){
        String estrategia = getEstrategia().getNombreEstrategia();

        switch (estrategia){
            case "ATQ":
               if (Calculadora.getDado().nextInt(2)==0){
                  Calculadora.ataque1(this, objetivo);
               }else 
                  Calculadora.ataque2(this, objetivo);
               break;
            case "DEF":
                if (getVida()<=((10+getFuerza())/4)){
                  Calculadora.defensa(this);
                }else if (getVida()<=((10+getFuerza())/1.4)){
                  Calculadora.ataque2(this,objetivo);
                }else
                  Calculadora.ataque1(this,objetivo);
                break;
            case "SUP":
               CuracionEldritch(listaEnemigos);
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
           vida < 30 full defensa
        att
           alternar ataque 1 y 2 constantemente
        todos
        si vida >15 te habla en ebreo para decirte no me mates porfi uwu
     */

   private void CuracionEldritch(ArrayList<Enemigo> listaEnemigos){
      for(int i = 0; i < listaEnemigos.size(); i++){
         if (listaEnemigos.get(i).getVida() < 10+getFuerza()/2 && listaEnemigos.get(i) instanceof Azotamentes) {
            Calculadora.ataque2(this, listaEnemigos.get(i));
            break;
         }
      }
   }   
}
