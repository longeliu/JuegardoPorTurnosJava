package Calculator;
import  Character.Character;

import java.util.Random;

public class Calculadora {
    private static Calculadora instancia = null;
    private static final Random dado = new Random();


    public static Random getDado(){//Devuelve el dado para hacer llamadas a random en todo el proyecto
        return dado;
    }

    public static Calculadora instance(){
        if (instancia==null){
            instancia = new Calculadora();
        }
        return  instancia;
    }

    public static void ataque1(Character atacante, Character defensor){
        int base = dado.nextInt(21);
        int aImpactar = base+calculoImpacto(atacante.getAtaque1().getTipoataque(),atacante);//Suma random 20 con la estadistica del ataque con calculoImpacto() en aImpactar

        if (base==20){//si el random es 20 es un critico por lo que siempre impacta y hace daño doble
            defensor.setVida(defensor.getVida()-((atacante.getAtaque1().getDamage()*2)+calculoImpacto(atacante.getAtaque1().getTipoataque(),atacante)));
            System.out.println("CRITICO");
        } else if (aImpactar>=defensor.getArmadura()){//si aImpactar es mayor que la armadura del objetivo impacta
            defensor.setVida(defensor.getVida()-(atacante.getAtaque1().getDamage()+calculoImpacto(atacante.getAtaque1().getTipoataque(),atacante)));
            System.out.println(atacante.getNombre() + " ha usado " + atacante.getAtaque1().getNombre() + " haciendo " + (atacante.getAtaque1().getDamage()+calculoImpacto(atacante.getAtaque1().getTipoataque(),atacante)) + " de daño.");
        }else {//si es menor falla
            System.out.println(atacante.getAtaque1().getNombre() + " ha fallado.");
        }

    }

    public static void ataque2(Character atacante, Character defensor){//misma funcionalidad que el anterior pero con el ataque 2
        int base = dado.nextInt(21);
        int aImpactar = base+calculoImpacto(atacante.getAtaque2().getTipoataque(),atacante);

        if (base==20){
            defensor.setVida(defensor.getVida()-((atacante.getAtaque2().getDamage()*2)+calculoImpacto(atacante.getAtaque2().getTipoataque(),atacante)));
            System.out.println("CRITICO");
        } else if (aImpactar>=defensor.getArmadura()){
            defensor.setVida(defensor.getVida()-(atacante.getAtaque2().getDamage()+calculoImpacto(atacante.getAtaque2().getTipoataque(),atacante)));
            System.out.println(atacante.getNombre() + " ha usado " + atacante.getAtaque2().getNombre() + " haciendo " + (atacante.getAtaque2().getDamage()+calculoImpacto(atacante.getAtaque2().getTipoataque(),atacante)) + " de daño.");
        }else {
            System.out.println(atacante.getAtaque2().getNombre() + " ha fallado.");
        }

    }



    public static void defensa(Character atacante){//aumenta tu armadura en funcion de tu defensa, la cual vuelve a su nivel base al comienzo de tu siguiente turno(de eso se encargan otras clases)
        atacante.setArmadura(atacante.getArmadura() + atacante.getDefensa());
    }

    private static int calculoImpacto(String tipoAtaque,Character personaje){//Dependiendo del tipo de ataque aplica dicho bonus del atacante
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
