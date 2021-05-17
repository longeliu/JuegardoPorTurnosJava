package Pruebas;
import Character.Player;

import java.time.Period;
import java.util.Scanner;

public class CreacionPersonaje {


    public void creapersonaje(Player personaje){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione su arquetipo:\n1-Guerrero\n2-Mago\n3-Pícaro");
        int seleccion=entrada.nextInt();
        switch (seleccion){
            case 1:
                System.out.println("Guerrero");
                personaje = new Player(18,10,8);
                break;
            case 2:
                System.out.println("Mago");
                personaje = new Player(8,10,18);
                break;
            case 3:
                System.out.println("Pícaro");
                personaje = new Player(10,18,8);
                break;
        }
        System.out.println(personaje.getDestreza() + " " + personaje.getFuerza() + " " + personaje.getInteligencia());
        System.out.println(personaje.getVida());
    }


}
