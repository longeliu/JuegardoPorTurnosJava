package Strategy.Gigante;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Gigante.SUPP.Runas;
import DecoratorAtaque.Enemigos.Gigante.SUPP.RunasFuerte;
import DecoratorAtaque.Enemigos.Gigante.SUPP.RunasMedio;
import Strategy.EstrategiaEnemigo;

public class GiganteEstrategiaSUPP implements EstrategiaEnemigo{
    private String nombre = "SUPP";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Runas(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new RunasMedio(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new RunasFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
