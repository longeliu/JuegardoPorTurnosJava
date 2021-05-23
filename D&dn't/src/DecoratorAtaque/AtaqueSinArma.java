package DecoratorAtaque;

public class AtaqueSinArma implements Ataque{//Ataque mas basico daño minimo

    public String getTipoataque() {
        return "Fuerza";
    }

    @Override
    public int getDamage() {
        return 1;
    }

    public String getNombre() {
        return "Ataque sin arma";
    }




}
