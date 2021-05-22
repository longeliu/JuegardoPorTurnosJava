package Strategy.Azotamentes;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Azotamentes.ATQ.Psiquico;
import DecoratorAtaque.Enemigos.Azotamentes.ATQ.PsiquicoFuerte;
import DecoratorAtaque.Enemigos.Azotamentes.ATQ.PsiquicoMedio;
import Strategy.EstrategiaEnemigo;

public class AzotamentesEstrategiaATQ implements EstrategiaEnemigo{
    private String nombre = "ATQ";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Psiquico(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new PsiquicoMedio(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new PsiquicoFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
