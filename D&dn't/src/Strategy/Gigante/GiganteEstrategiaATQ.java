package Strategy.Gigante;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Gigante.ATQ.Patada;
import DecoratorAtaque.Enemigos.Gigante.ATQ.PatadaFuerte;
import DecoratorAtaque.Enemigos.Gigante.ATQ.PatadaMedio;
import Strategy.EstrategiaEnemigo;

public class GiganteEstrategiaATQ implements EstrategiaEnemigo{
    private String nombre = "ATQ";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Patada(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new PatadaMedio(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new PatadaFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
