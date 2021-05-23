package Strategy.Huargo;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Huargo.ATQ.Mordisco;
import DecoratorAtaque.Enemigos.Huargo.ATQ.MordiscoHelado;
import DecoratorAtaque.Enemigos.Huargo.ATQ.MordiscoIgneo;
import Strategy.EstrategiaEnemigo;

public class HuargoEstrategiaATQ implements EstrategiaEnemigo{//Selecciona un ataque diferente para los huargos en funcion del mundo
    private String nombre = "ATQ";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Mordisco(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new MordiscoIgneo(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new MordiscoHelado(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
