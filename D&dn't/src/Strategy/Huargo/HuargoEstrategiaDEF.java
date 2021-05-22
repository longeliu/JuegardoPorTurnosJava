package Strategy.Huargo;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Huargo.DEF.Placaje;
import DecoratorAtaque.Enemigos.Huargo.DEF.PlacajeHelado;
import DecoratorAtaque.Enemigos.Huargo.DEF.PlacajeIgneo;
import Strategy.EstrategiaEnemigo;

public class HuargoEstrategiaDEF implements EstrategiaEnemigo{
    private String nombre = "DEF";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Placaje(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new PlacajeHelado(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new PlacajeIgneo(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
