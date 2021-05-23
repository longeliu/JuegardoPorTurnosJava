package Strategy.Azotamentes;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Azotamentes.DEF.Tentaculo;
import DecoratorAtaque.Enemigos.Azotamentes.DEF.TentaculoFuerte;
import DecoratorAtaque.Enemigos.Azotamentes.DEF.TentaculoMedio;
import Strategy.EstrategiaEnemigo;

public class AzotamentesEstrategiaDEF implements EstrategiaEnemigo{//Selecciona un ataque diferente para los azotamentes en funcion del mundo
    private String nombre = "DEF";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Tentaculo(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new TentaculoMedio(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new TentaculoFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
