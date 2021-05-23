package FactoryEnemigos.Gigante;

import Calculator.Calculadora;
import Character.Enemigo;
import Character.Character;

import java.util.ArrayList;

public abstract class Gigante extends Enemigo {//Padre de los gigantes contiene su estrategia y su nombre
    public final void templateEnemigo(Character objetivo,ArrayList<Enemigo> listaEnemigos){
        String estrategia = getEstrategia().getNombreEstrategia();
        this.setArmadura(10 + getDestreza());

        if (estrategia.equals("SUP")){//el soporte utiliza alentar al pueblo y ademas ataca
            alentarAlPueblo(listaEnemigos);
            Calculadora.ataque1(this,objetivo);
        } else {// el resto si su vida baja de 1/4 usa ataque 2 si no utiliza ataque 1
            if (getVida()<=((10+getFuerza())/4)){
                Calculadora.ataque2(this,objetivo);
            } else
                Calculadora.ataque1(this,objetivo);
        }


    }

    private void alentarAlPueblo(ArrayList<Enemigo> listaEnemigos){//busca a cualquier gigante a mitad de vida y le cura
        for(int i = 0; i < listaEnemigos.size(); i++){
            if (listaEnemigos.get(i).getVida() < 10+getFuerza()/2 && listaEnemigos.get(i) instanceof Gigante) {
                Calculadora.ataque2(this, listaEnemigos.get(i));
            }
        }
    }


    public final String getNombre() {
        return "Gigante";
     }
}
