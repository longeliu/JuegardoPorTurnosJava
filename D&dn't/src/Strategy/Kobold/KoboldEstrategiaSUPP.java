package Strategy.Kobold;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Kobold.SUPP.Curacion;
import DecoratorAtaque.Enemigos.Kobold.SUPP.CuracionFuerte;
import DecoratorAtaque.Enemigos.Kobold.SUPP.CuracionMedia;
import Strategy.EstrategiaEnemigo;

public class KoboldEstrategiaSUPP implements EstrategiaEnemigo{
    private String nombre = "SUP";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new Curacion(new AtaqueSinArma()));
        }
        else if (mundo == 1){
            return (new Curacion(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new CuracionMedia(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new CuracionFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}