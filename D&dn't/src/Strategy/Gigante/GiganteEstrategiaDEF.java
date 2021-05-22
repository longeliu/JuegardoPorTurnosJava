package Strategy.Gigante;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Gigante.DEF.Palmetazo;
import DecoratorAtaque.Enemigos.Gigante.DEF.PalmetazoFuerte;
import DecoratorAtaque.Enemigos.Gigante.DEF.PalmetazoMedio;
import Strategy.EstrategiaEnemigo;

public class GiganteEstrategiaDEF implements EstrategiaEnemigo{
    private String nombre = "DEF";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Palmetazo(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new PalmetazoMedio(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new PalmetazoFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
