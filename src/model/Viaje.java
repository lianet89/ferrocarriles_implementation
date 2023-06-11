package model;

public class Viaje {
    EquipoDeTraccion equipoDeTraccion;
    Itinerario itinerario;

    public Viaje(EquipoDeTraccion equipoDeTraccion, Itinerario itinerario) {
        this.equipoDeTraccion = equipoDeTraccion;
        this.itinerario = itinerario;
    }

    public EquipoDeTraccion getEquipoDeTraccion() {
        return equipoDeTraccion;
    }

    public void setEquipoDeTraccion(EquipoDeTraccion equipoDeTraccion) {
        this.equipoDeTraccion = equipoDeTraccion;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
}
