package com.mycompany.calculadoraejemplo;

/**
 *
 * @author Abraham Quintana
 * @version 1.0
 * @since 2026
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

//este comentario modifica el main para un 2º commit

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 5);
        
        System.out.println("Suma: " + calc.sumar());
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());
        System.out.println("División: " + calc.dividir());
    }
}
