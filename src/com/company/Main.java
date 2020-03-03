package com.company;

public class Main {

    public static void main(String[] args) {

        // No hay polimorfismo
        Decimal dec = new Decimal(5,4);
        Binario bin = new Binario(1, 2);

        // Polimorfismo, sin factory
        Operaciones op0 = new Decimal(5, 4);
        op0.sumar(5, 4);

        Operaciones op1 = new Binario(5, 4);
        op1.sumar(5, 4);

        // Utilizando factory
        Operaciones f0 = Fabrica.crearObjeto(1, 3, 4);

        System.out.println(f0.dividir(2, 3));

        System.out.println(Conversion.convertir(10, 45));

    }
}
