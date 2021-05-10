package State;

public class Turno{
    private EstadoTurno estadoActual;

    public Turno(){
        this.estadoActual = new TurnoAccion();
    }

    public void siguienteEstado(){
        this.estadoActual = this.estadoActual.siguienteEstado();
    }

    public String getEstadoActual() {
        if (estadoActual.queTurnoSoy() == 0) {
            return "TurnoAccion";
        }

        else if (estadoActual.queTurnoSoy() == 1) {
            return "TurnoBonus";
        }

        else if (estadoActual.queTurnoSoy() == 2) {
            return "TurnoReaccion";
        }

        else if (estadoActual.queTurnoSoy() == 3) {
            return "TurnoOFF";
        }
        else{
            return "Error";
        }
    }
}