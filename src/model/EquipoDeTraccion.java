package model;

public abstract class EquipoDeTraccion {
    protected int numeroIdentificacion;
    protected int kilometrajeRecorrido;
    protected int potenciaMotor;

    public EquipoDeTraccion() {
    }

    public EquipoDeTraccion(int numeroIdentificacion, int kilometrajeRecorrido, int potenciaMotor) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.kilometrajeRecorrido = kilometrajeRecorrido;
        this.potenciaMotor = potenciaMotor;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getKilometrajeRecorrido() {
        return kilometrajeRecorrido;
    }

    public void setKilometrajeRecorrido(int kilometrajeRecorrido) {
        this.kilometrajeRecorrido = kilometrajeRecorrido;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public abstract int cantidadMaxCoches();
}
