package Character;

import DecoratorAtaque.Ataque;

public class Player implements Character{
    private int fuerza;
    private int destreza;
    private int inteligencia;
    private int vida;

    public int getFuerza() {
        return fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVida() {
        return vida;
    }

    public Player(int fuerza, int destreza, int inteligencia){
        this.fuerza=fuerza;
        this.destreza=destreza;
        this.inteligencia=inteligencia;
        this.vida=10+((fuerza-10)/2);
    }

    @Override
    public Ataque ataque1() {
        return null;
    }

    @Override
    public Ataque ataque2() {
        return null;
    }

    @Override
    public int defensa() {
        return 0;
    }

    @Override
    public String extra() {
        return null;
    }
}
