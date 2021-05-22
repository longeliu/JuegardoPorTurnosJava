package State;

public class Estado {
    private EstadoPersonaje estadoActual;

    public Estado(){
        this.estadoActual = new PersonajeNormal();
    }

    public void siguienteEstado(){
        this.estadoActual = this.estadoActual.siguienteEstado();
    }

    public String getEstadoActual() {
        if (estadoActual.queTurnoSoy() == 0) {
            return "PersonajeNormal";
        }

        else if (estadoActual.queTurnoSoy() == 1) {
            return "PersonajeQuemado";
        }

        else if (estadoActual.queTurnoSoy() == 2) {
            return "PersonajeCongelado";
        }

        else{
            return "Error";
        }
    }
}