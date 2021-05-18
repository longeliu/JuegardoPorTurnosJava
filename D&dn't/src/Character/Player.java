package Character;

import DecoratorAtaque.*;
import DecoratorAtaque.Guerrero.Maza;
import DecoratorAtaque.Mago.Baston;
import DecoratorAtaque.Mago.SaetaDeFuego;
import DecoratorAtaque.Picaro.Espada;

import java.util.Scanner;

//crear get bonuses
public class Player implements Character{

    private int fuerza;
    private int destreza;
    private int inteligencia;
    private int vida;
    private int armadura;

    private Ataque ataque1;
    private Ataque ataque2;
    private int defensa;
    private String extra;

    public Player(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione su arquetipo:\n1-Guerrero\n2-Mago\n3-Pícaro");
        int seleccion=entrada.nextInt();
        switch (seleccion) {
            case 1 :
                guerrero();
                break;
            case 2:
                mago();
                break;
            case 3:
                picaro();
                break;
        }

    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setArmadura(int armadura) {
        this.armadura=armadura;
    }


    public void setAtaque1(Ataque ataque1) {
        this.ataque1 = ataque1;
    }

    public void setAtaque2(Ataque ataque2) {
        this.ataque2 = ataque2;
    }

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

    @Override
    public int getArmadura() {
        return 0;
    }

    @Override
    public Ataque getAtaque1() {
        return this.ataque1;
    }

    @Override
    public Ataque getAtaque2() {
        return this.ataque2;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public String getExtra() {
        return null;
    }

    private void guerrero(){
        System.out.println("Guerrero");
        this.fuerza=3;
        this.destreza=1;
        this.inteligencia=-1;
        this.vida=10+fuerza;
        this.defensa=fuerza;
        this.ataque1=new Espada(new AtaqueSinArma());
        this.ataque2=new Maza(new AtaqueSinArma());
    }

    private void mago(){
        System.out.println("Mago");
        this.fuerza=-1;
        this.destreza=1;
        this.inteligencia=3;
        this.vida=10+fuerza;
        this.defensa=fuerza;
        this.ataque1=new Baston(new AtaqueSinArma());
        this.ataque2=new SaetaDeFuego(new Baston(new AtaqueSinArma()));
    }

    private void picaro(){
        System.out.println("Pícaro");
        this.fuerza=1;
        this.destreza=3;
        this.inteligencia=-1;
        this.defensa=fuerza;
        this.ataque1=new Espada(new AtaqueSinArma());
        this.ataque2=new Maza(new AtaqueSinArma());
    }


}
