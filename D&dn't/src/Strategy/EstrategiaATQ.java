package Strategy;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;
import DecoratorAtaque.Picaro.Espada;

public class EstrategiaATQ implements EstrategiaEnemigo{
    private String nombre = "ATQ";
    private Ataque ataque2;

    public Ataque getAtaque2(int mundo){
        if (mundo==0){
            return (new Espada(new AtaqueSinArma()));
        }
        return new AtaqueSinArma();
    }
}
