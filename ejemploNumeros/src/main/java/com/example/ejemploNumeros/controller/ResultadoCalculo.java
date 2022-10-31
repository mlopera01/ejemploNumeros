package com.example.ejemploNumeros.controller;

public class ResultadoCalculo {
    private int numeroMayor;
    private int numeroMenor;
    private int sumaNumeros;
    private int sumaPositivos;
    private int sumaNegativos;

    public ResultadoCalculo() {
    }

    public ResultadoCalculo(int numeroMayor, int numeroMenor, int sumaNumeros, int sumaPositivos, int sumaNegativos) {
        this.numeroMayor = numeroMayor;
        this.numeroMenor = numeroMenor;
        this.sumaNumeros = sumaNumeros;
        this.sumaPositivos = sumaPositivos;
        this.sumaNegativos = sumaNegativos;
    }

    public int getNumeroMayor() {
        return numeroMayor;
    }

    public int getNumeroMenor() {
        return numeroMenor;
    }

    public int getSumaNumeros() {
        return sumaNumeros;
    }

    public int getSumaPositivos() {
        return sumaPositivos;
    }

    public int getSumaNegativos() {
        return sumaNegativos;
    }

    public void setNumeroMayor(int numeroMayor) {
        this.numeroMayor = numeroMayor;
    }

    public void setNumeroMenor(int numeroMenor) {
        this.numeroMenor = numeroMenor;
    }

    public void setSumaNumeros(int sumaNumeros) {
        this.sumaNumeros = sumaNumeros;
    }

    public void setSumaPositivos(int sumaPositivos) {
        this.sumaPositivos = sumaPositivos;
    }

    public void setSumaNegativos(int sumaNegativos) {
        this.sumaNegativos = sumaNegativos;
    }
}
