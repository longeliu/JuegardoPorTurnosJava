package State;

public class Estado {

    private EstadoPersonaje estadoActual;

    public Estado(){
        this.estadoActual = new PersonajeNormal();
    }

    public void siguienteEstado(){
        this.estadoActual = this.estadoActual.siguienteEstado();
    }

    public EstadoPersonaje getEstadoActual(){
        return estadoActual;
    }
}