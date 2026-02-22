package com.mycompany.calculadoraejemplo;


 /**
 * Clase que representa una calculadora básica capaz de realizar
 * operaciones aritméticas simples entre dos operandos.
 *
 * <p>Incluye métodos para sumar, restar, multiplicar y dividir,
 * almacenando el resultado en el atributo correspondiente.</p>
 *
 * @author Abraham Quintana
 * @version 1.0
 * @since 2026
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class Calculadora {

    /** Primer operando de la operación. */
    private double operando1;

    /** Segundo operando de la operación. */
    private double operando2;

    /** Resultado de la operación realizada. */
    private double resultado;

    /**
     * Constructor que inicializa los operandos.
     *
     * @param operando1 primer número
     * @param operando2 segundo número
     */
    public Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    //Getter y setter
    
    /** @return el primer operando */
    public double getOperando1() {
        return operando1;
    }

    /** @return el segundo operando */
    public double getOperando2() {
        return operando2;
    }

    /** @return el resultado de la última operación */
    public double getResultado() {
        return resultado;
    }


    //Métodos
    /**
     * Realiza la suma de los operandos.
     *
     * @return el resultado de la suma
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de los operandos.
     *
     * @return el resultado de la resta
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de los operandos.
     *
     * @return el resultado de la multiplicación
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de los operandos.
     *
     * @return el resultado de la división
     * @throws ArithmeticException si el segundo operando es cero
     */
    public double dividir() {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        resultado = operando1 / operando2;
        return resultado;
    }
}
