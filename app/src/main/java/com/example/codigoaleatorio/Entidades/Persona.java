package com.example.codigoaleatorio.Entidades;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.concurrent.ThreadLocalRandom;

public class Persona {

    private String nombre;
    private  String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String GenerarNombre(){
        return nombre.substring(0,2);
    }
    public String GenerarApellido(){
        return apellido.substring(0,3);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public int GenerarDigitos(){
        return ThreadLocalRandom.current().nextInt(10,99);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public String MostrarInfo(){
        return "Codigo Generado : "+GenerarNombre()+GenerarApellido()+GenerarDigitos();
    }
}
