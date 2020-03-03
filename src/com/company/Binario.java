package com.company;

public class Binario implements Operaciones {

    private double a;
    private double b;

    public Binario(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double sumar(double a, double b) {
        return (a + b) / 2;
    }

    @Override
    public double restar(double a, double b) {
        return (a - b) / 2;
    }

    @Override
    public double multiplicar(double a, double b) {
        return (a * b) * 2;
    }

    @Override
    public double dividir(double a, double b) {
        return (a / b) / 2;
    }
}
