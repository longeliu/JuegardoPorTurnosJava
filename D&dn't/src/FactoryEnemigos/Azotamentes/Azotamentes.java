package FactoryEnemigos.Azotamentes;

import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;

public abstract class Azotamentes extends Enemigo {//Padre de los azotamentes contiene su estrategia y su nombre

    public final void templateEnemigo(Character objetivo,ArrayList<Enemigo> listaEnemigos){
        String estrategia = getEstrategia().getNombreEstrategia();
        this.setArmadura(10 + getDestreza());

        switch (estrategia){
            case "ATQ"://los ofensivos alternan entre el ataque 1 y el 2 constantemente
               if (Calculadora.getDado().nextInt(2)==0){
                  Calculadora.ataque1(this, objetivo);
               }else 
                  Calculadora.ataque2(this, objetivo);
               break;
            case "DEF"://los defensivos seleccionan su ataque en funcion de su vida y cuando les queda poca se defienden
                if (getVida()<=((10+getFuerza())/4)){
                  Calculadora.defensa(this);
                }else if (getVida()<=((10+getFuerza())/1.4)){
                  Calculadora.ataque2(this,objetivo);
                }else
                  Calculadora.ataque1(this,objetivo);
                break;
            case "SUP"://los soporte utilizan curacion eldrich
               CuracionEldritch(listaEnemigos);
               break;
        }

    }

   private void CuracionEldritch(ArrayList<Enemigo> listaEnemigos){//si otros azotamentes o el tienen menos de la mitad de la vida les cura
      for(int i = 0; i < listaEnemigos.size(); i++){
         if (listaEnemigos.get(i).getVida() < 10+getFuerza()/2 && listaEnemigos.get(i) instanceof Azotamentes) {
            Calculadora.ataque2(this, listaEnemigos.get(i));
            break;
         }
      }
   }   

   public final String getNombre() {
      return "Azotamentes";
   }
}
