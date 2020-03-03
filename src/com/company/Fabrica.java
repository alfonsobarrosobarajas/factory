package com.company;


// Fábrica de objetos
public class Fabrica {

    // Método de clase
    public static Operaciones crearObjeto(int opc, double a, double b){

        if(opc == 0){
            return new Decimal(a, b);
        } else {
            return new Binario(a, b);
        }

    }

}
