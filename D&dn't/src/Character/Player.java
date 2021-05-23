package Character;

import DecoratorAtaque.*;
import DecoratorAtaque.Guerrero.Empujon;
import DecoratorAtaque.Guerrero.Maza;
import DecoratorAtaque.Mago.Baston;
import DecoratorAtaque.Mago.SaetaDeFuego;
import DecoratorAtaque.Picaro.Cegar;
import DecoratorAtaque.Picaro.Espada;
import State.Estado;

import java.util.Scanner;

public class Player implements Character{

    private int fuerza;
    private int destreza;
    private int inteligencia;
    private int vida;
    private int armadura;

    private Ataque ataque1;
    private Ataque ataque2;
    private int defensa;
    private Estado estado;

    public Player(){ //Constructor para seleccionar clase (diferentes estadisticas)
        this.estado = new Estado();
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
        return this.armadura;
    }

    public String getNombre(){
        return "Jugador";
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

    public Estado getEstado() {
        return estado;
    }

    private void guerrero(){//Clase que destaca por su fuerza
        System.out.println("Guerrero");
        this.fuerza=4;
        this.destreza=2;
        this.inteligencia=1;
        this.vida=10+fuerza;
        this.defensa=fuerza;
        this.armadura=10+destreza;
        this.ataque1=new Empujon(new AtaqueSinArma());
        this.ataque2=new Maza(new AtaqueSinArma());

    }

    private void mago(){//Clase que destaca por su inteligencia
        System.out.println("Mago");
        this.fuerza=1;
        this.destreza=2;
        this.inteligencia=4;
        this.vida=10+fuerza;
        this.defensa=fuerza;
        this.armadura=10+destreza;
        this.ataque1=new SaetaDeFuego(new AtaqueSinArma());
        this.ataque2=new Baston(new Baston(new AtaqueSinArma()));
    }

    private void picaro(){//Clase que destaca por su destreza
        System.out.println("Pícaro");
        this.fuerza=2;
        this.destreza=4;
        this.inteligencia=1;
        this.armadura=10+destreza;
        this.defensa=fuerza;
        this.ataque1=new Cegar(new AtaqueSinArma());
        this.ataque2=new Espada(new AtaqueSinArma());
    }


}
