package Strategy.Kobold;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Kobold.ATQ.Espada;
import DecoratorAtaque.Enemigos.Kobold.ATQ.EspadaAfilada;
import DecoratorAtaque.Enemigos.Kobold.ATQ.EspadaMagica;
import Strategy.EstrategiaEnemigo;

public class KoboldEstrategiaATQ implements EstrategiaEnemigo{
    private String nombre = "ATQ";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Espada(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new EspadaAfilada(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new EspadaMagica(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}

