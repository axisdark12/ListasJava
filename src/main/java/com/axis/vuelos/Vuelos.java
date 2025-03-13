/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.axis.vuelos;

import com.axis.vuelos.Model.Vuelo;
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author Minder
 */
public class Vuelos {

    
    public static void main(String[] args) throws ParseException {
    
        List<Vuelo> llegadas = new ArrayList<>();
     
        llegadas.add(new Vuelo("AAL 933", "New York", "Santiago","Lun 29 Ago 2021","05:39", 62));
        llegadas.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago","2021-08-31","04:45", 47));
        llegadas.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago","2021-08-30","16:00", 52));
        llegadas.add(new Vuelo("DAL 147", "Atlanta", "Santiago","2021-08-29","13:22", 59));
        llegadas.add(new Vuelo("AVA 241", "Bogota", "Santiago","2021-08-31","14:05", 25));
        llegadas.add(new Vuelo("AMX 10", "Mexico City", "Santiago","2021-08-31","05:20", 29));
        llegadas.add(new Vuelo("IBE 6833", "Londres", "Santiago","2021-08-30","08:45", 55));
        llegadas.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago","2021-08-29","07:41", 51));
        llegadas.add(new Vuelo("SKU 803", "Lima", "Santiago","2021-08-30","10:35", 48));
        llegadas.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago","2021-08-29","09:14", 59));
        llegadas.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago","2021-08-31","08:33", 31));
        llegadas.add(new Vuelo("CMP 111", "Panama City", "Santiago","2021-08-31","15:15", 29));
        llegadas.add(new Vuelo("LAT 705", "Madrid", "Santiago","2021-08-30","08:14", 47));
        llegadas.add(new Vuelo("AAL 957", "Miami", "Santiago","2021-08-29","22:53", 60));
        llegadas.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago","2021-08-31","09:57", 32));
        llegadas.add(new Vuelo("LAT 1283", "Cancún", "Santiago","2021-08-31","04:00", 35));
        llegadas.add(new Vuelo("LAT 579", "Barcelona", "Santiago","2021-08-29","07:45", 61));
        llegadas.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago","2021-08-30","07:12", 58));
        llegadas.add(new Vuelo("LAT 501", "París", "Santiago","2021-08-29","18:29", 49));
        llegadas.add(new Vuelo("LAT 405", "Montevideo", "Santiago","2021-08-30","15:45", 39));
        
        llegadas.sort((v1, v2) -> v2.getFecha_c_llegada().compareTo(v1.getFecha_c_llegada()));
        
        llegadas.forEach(System.out::println);
        Vuelo ultimoVuelo = llegadas.get(0);
        System.out.println("El último vuelo en llegar es " + ultimoVuelo.getDestino() + ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getFecha_c_llegada());
        
        llegadas.sort((v1, v2) -> Integer.valueOf(v2.getNum_pasajeros()).compareTo(v1.getNum_pasajeros()));
        Vuelo vueloNenorNumero = new LinkedList<>(llegadas).peekLast();
        System.out.println("El vuelo con menor número de pasajeros es " + vueloNenorNumero.getDestino()+ ": " + vueloNenorNumero.getOrigen()+ ", con " + vueloNenorNumero.getNum_pasajeros()+ " pasajeros.");  
    }
}