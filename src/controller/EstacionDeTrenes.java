package controller;

import model.EquipoDeTraccion;
import model.Itinerario;
import model.Viaje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EstacionDeTrenes {
    private ArrayList<Viaje> viajes;
    private ArrayList<EquipoDeTraccion> lineaPrincipal;
    private ArrayList<EquipoDeTraccion> lineaSecundaria;

    public EstacionDeTrenes(ArrayList<Viaje> viajes, ArrayList<EquipoDeTraccion> lineaPrincipal, ArrayList<EquipoDeTraccion> lineaSecundaria) {
        this.viajes = viajes;
        this.lineaPrincipal = lineaPrincipal;
        this.lineaSecundaria = lineaSecundaria;
    }
    public void adicionarEquipoDeTraccion(EquipoDeTraccion equipo) throws Exception {
        lineaPrincipal.add(equipo);
        System.out.println("Se ha adicionado satisfactoriamente el equipo de tracción con número de identificación "+equipo.getNumeroIdentificacion()+".\n");
    }
    public void adicionarViaje(Itinerario itinerario) throws Exception{
        boolean equipoDisponible =false;
        // Ordenar la lista lineaPrincipal en orden ascendente por el atributo kilometrajeRecorrido
        Comparator<EquipoDeTraccion> porKilometraje = Comparator.comparing(EquipoDeTraccion::getKilometrajeRecorrido);
        Collections.sort(lineaPrincipal, porKilometraje);

        /*Recorrer la lista lineaPrincipal que contiene los equipos libres (estacionados, que no están asignados a viajes).
         Verificar si el equipo es capaz de tirar la cantidad de coches que exige el itinerario (mediante sentencia if)
         Si es capaz, crear el viaje con ese equipo e itinerarios e insertarlo en la lista de viajes.
         Sacar el equipo de la línea principal y ponerlo en la línea secundaria.
         Dejar de iterar.
        */
        for (EquipoDeTraccion equipo:lineaPrincipal) {
            if (equipo.cantidadMaxCoches()==itinerario.getCantidadVagones()){
                equipoDisponible = true;
                Viaje nuevoViaje = new Viaje(equipo, itinerario);
                viajes.add(nuevoViaje);
                System.out.println("El equipo adecuado para el itinerario número "+itinerario.getNumeroIdentificacion()+" ha recorrido "+equipo.getKilometrajeRecorrido()+" kilómetros.");
                lineaSecundaria.add(equipo);
                lineaPrincipal.remove(equipo);
                break;
            }
        }
        if (equipoDisponible ==false){
            System.out.println("No existen equipos disponibles para el itinerario número "+ itinerario.getNumeroIdentificacion()+".");
        }

    }
}
