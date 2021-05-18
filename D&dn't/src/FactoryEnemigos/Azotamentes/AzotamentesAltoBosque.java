package FactoryEnemigos.Azotamentes;

import DecoratorAtaque.Ataque;
import DecoratorAtaque.AtaqueSinArma;

public class AzotamentesAltoBosque extends Azotamentes {
    private int fuerza=1;
    private int destreza=1;
    private int inteligencia=1;
    private int vida=10;
    private int armadura=15;
    private EstrategiaEnemigo estrategia;
    private Ataque ataque1 = new AtaqueSinArma();

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setArmadura(int armadura) {
        this.armadura=armadura;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getArmadura() {
        return armadura;
    }

    @Override
    public int getFuerza() {
        return 0;
    }

    @Override
    public int getDestreza() {
        return 0;
    }

    @Override
    public int getInteligencia() {
        return 0;
    }

    
    @Override
    public Ataque getAtaque1() {
        return this.ataque1;
    }

    @Override
    public Ataque getAtaque2() {
        return estrategia.getAtaque2(Constantes.ALTO_BOSQUE);
    }

    @Override
    public int getDefensa() {
        return fuerza;
    }

    @Override
    public String getExtra() {
       
    }

    @Override
    public void setEstrategia(EstrategiaEnemigo strat) {
        this.estrategia = strat;
    }
}
