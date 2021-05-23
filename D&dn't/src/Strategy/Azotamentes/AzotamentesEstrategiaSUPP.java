package Strategy.Azotamentes;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Azotamentes.SUPP.Regeneracion;
import DecoratorAtaque.Enemigos.Azotamentes.SUPP.RegeneracionFuerte;
import DecoratorAtaque.Enemigos.Azotamentes.SUPP.RegeneracionMedio;
import Strategy.EstrategiaEnemigo;

public class AzotamentesEstrategiaSUPP implements EstrategiaEnemigo{//Selecciona un ataque diferente para los azotamentes en funcion del mundo
    private String nombre = "SUPP";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Regeneracion(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new RegeneracionMedio(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new RegeneracionFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
