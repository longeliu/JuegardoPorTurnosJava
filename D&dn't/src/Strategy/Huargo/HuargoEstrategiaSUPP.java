package Strategy.Huargo;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Enemigos.Huargo.SUPP.Descanso;
import DecoratorAtaque.Enemigos.Huargo.SUPP.DescansoFuerte;
import DecoratorAtaque.Enemigos.Huargo.SUPP.DescansoMedio;
import Strategy.EstrategiaEnemigo;

public class HuargoEstrategiaSUPP implements EstrategiaEnemigo{
    private String nombre = "SUPP";

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new AtaqueSinArma());
        }
        else if (mundo == 1){
            return (new Descanso(new AtaqueSinArma()));
        }
        else if (mundo == 2){
            return (new DescansoMedio(new AtaqueSinArma()));
        }
        else if (mundo == 3){
            return (new DescansoFuerte(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }

    public String getNombreEstrategia(){
        return this.nombre;
    }
}
