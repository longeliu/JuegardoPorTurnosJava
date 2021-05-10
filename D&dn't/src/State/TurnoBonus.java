package State;

class TurnoBonus implements EstadoTurno{
    @Override
    public EstadoTurno siguienteEstado() {
        return new TurnoReaccion();
    }

    @Override
    public int queTurnoSoy() {
        return 3;
    }
}
