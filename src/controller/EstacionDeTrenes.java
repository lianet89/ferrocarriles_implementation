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
    }
    public void adicionarViaje(Itinerario itinerario) throws Exception{
        boolean equipoDisponble=false;
        // Ordenar la lista lineaPrincipal en orden asc por el atributo kilometrajeRecorrido
        Comparator<EquipoDeTraccion> porKilometraje = Comparator.comparing(EquipoDeTraccion::getKilometrajeRecorrido);
        Collections.sort(lineaPrincipal, porKilometraje);

        /*Recorrer la lista lineaPrincipal que contiene los equipos libres (estacionados, que no están asignados a viajes).
         Verificar que el equipo es capaz de tirar la cantidad de coches que exige el itinerario (mediante sentencia if)
         Si cumple con el requisito, crear el viaje con ese equipo, actualizar las listas y dejar de iterar
        */
        for (EquipoDeTraccion equipo:lineaPrincipal) {
            if (equipo.cantidadMaxCoches()==itinerario.getCantidadVagones()){
                equipoDisponble = true;
                Viaje nuevoViaje = new Viaje(equipo, itinerario);       //crear el viaje
                viajes.add(nuevoViaje);             //insertar el viaje en la lista de viajes
                System.out.println("El equipo adecuado para el itinerario número "+itinerario.getNumeroIdentificacion()+" ha recorrido: "+equipo.getKilometrajeRecorrido()+" kilómetros");
                lineaSecundaria.add(equipo);       //adicionar el equipo a la linea secundaria
                lineaPrincipal.remove(equipo);     //eliminar el equipo de la linea principal
                break;
            }
        }
        if (equipoDisponble==false){
            System.out.println("No existen equipos disponibles para el itinerario número "+ itinerario.getNumeroIdentificacion());
        }

    }
}
