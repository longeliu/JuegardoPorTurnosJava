package Calculator;
import  Character.Character;

import java.util.Random;

public class Calculadora {
    private static Calculadora instancia = null;
    private static final Random dado = new Random();



    public static Calculadora instance(){
        if (instancia==null){
            instancia = new Calculadora();
        }
        return  instancia;
    }

    public static void ataque1(Character atacante, Character defensor){
        int base = dado.nextInt(21);
        int aImpactar = base+calculoImpacto(atacante.getAtaque1().getTipoataque(),atacante);

        if (base==20){
            defensor.setVida(defensor.getVida()-((atacante.getAtaque1().getDamage()*2)+calculoImpacto(atacante.getAtaque1().getTipoataque(),atacante)));
            System.out.println("CRITICO");
        } else if (aImpactar>=defensor.getArmadura()){
            defensor.setVida(defensor.getVida()-(atacante.getAtaque1().getDamage()+calculoImpacto(atacante.getAtaque1().getTipoataque(),atacante)));
            System.out.println("Impacto.");
        }else {
            System.out.println(atacante.getAtaque1().getNombre() + " ha fallado.");
        }

    }

    public static void ataque2(Character atacante, Character defensor){
        int base = dado.nextInt(21);
        int aImpactar = base+calculoImpacto(atacante.getAtaque2().getTipoataque(),atacante);

        if (base==20){
            defensor.setVida(defensor.getVida()-((atacante.getAtaque2().getDamage()*2)+calculoImpacto(atacante.getAtaque2().getTipoataque(),atacante)));
            System.out.println("CRITICO");
        } else if (aImpactar>=defensor.getArmadura()){
            defensor.setVida(defensor.getVida()-(atacante.getAtaque2().getDamage()+calculoImpacto(atacante.getAtaque2().getTipoataque(),atacante)));
            System.out.println("Impacto.");
        }else {
            System.out.println(atacante.getAtaque2().getNombre() + " ha fallado.");
        }

    }



    public void defensa(Character atacante){
        atacante.setArmadura(atacante.getArmadura()+ atacante.getDefensa());
    }

    private static int calculoImpacto(String tipoAtaque,Character personaje){
        switch (tipoAtaque) {
            case "Fuerza":
                return personaje.getFuerza();
            case "Destreza":
                return personaje.getDestreza();
            case "Inteligencia":
                return personaje.getInteligencia();
            default:
                System.out.println("Tipo de ataque no encontrado");
                return 0;
        }
    }

}
