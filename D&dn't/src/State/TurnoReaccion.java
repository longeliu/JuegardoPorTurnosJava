package State;

class TurnoReaccion implements EstadoTurno{
    @Override
    public EstadoTurno siguienteEstado() {
        return new TurnoOFF();
    }

    @Override
    public int queTurnoSoy() {
        return 1;
    }
}
