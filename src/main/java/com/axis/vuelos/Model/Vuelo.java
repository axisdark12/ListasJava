/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.axis.vuelos.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Minder
 */
public class Vuelo {
    private String DNI;
    private String origen;
    private String destino;
    private String fecha_llegada;
    private String hora_llegada;
    private Integer num_pasajeros;
    private Date fecha_c_llegada;

    public Vuelo(String DNI, String origen, String destino, String fecha_llegada, String hora_llegada, Integer num_pasajeros) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("EEE dd MMM yyyy hh:mm");
        String date=fecha_llegada+" "+hora_llegada;
        System.out.println(date);
        this.DNI = DNI;
        this.origen = origen;
        this.destino = destino;
        this.fecha_llegada = fecha_llegada;
        this.fecha_c_llegada = format.parse(date);
        this.num_pasajeros = num_pasajeros;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(Integer num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    public Date getFecha_c_llegada() {
        return fecha_c_llegada;
    }

    public void setFecha_c_llegada(Date fecha_c_llegada) {
        this.fecha_c_llegada = fecha_c_llegada;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "DNI=" + DNI + ", origen=" + origen + ", destino=" + destino + ", num_pasajeros=" + num_pasajeros + ", fecha_c_llegada=" + fecha_c_llegada + '}';
    }
    
    
    
    
}
