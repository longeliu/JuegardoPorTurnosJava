package Strategy;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;

public class EstrategiaATQ implements EstrategiaEnemigo{
    private String nombre = "ATQ";
    private Ataque ataque2;

    public Ataque getAtaque2(int mundo) {
        
        if (mundo == 0) {
            return (new AtaqueSinArma());    
        }
        
    }
}
