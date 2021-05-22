package State;

class PersonajeNormal implements EstadoPersonaje {
    @Override
    public EstadoPersonaje siguienteEstado() {
        return new PersonajeQuemado();
    }


    public EstadoPersonaje estadoCongelado(){
        return new PersonajeCongelado();
    }

    @Override
    public int queTurnoSoy() {
        return 0;
    }
}
