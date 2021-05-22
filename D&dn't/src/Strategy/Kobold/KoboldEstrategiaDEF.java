package Strategy.Kobold;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Kobold.DEF.Placaje;
import DecoratorAtaque.Enemigos.Kobold.DEF.PlacajeIgneo;
import DecoratorAtaque.Enemigos.Kobold.DEF.PlacajeHelado;
import Strategy.EstrategiaEnemigo;

public class KoboldEstrategiaDEF implements EstrategiaEnemigo{
    private String nombre = "DEF";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Placaje(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new PlacajeIgneo(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new PlacajeHelado(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
