/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anabe
 * @version V1.0 Clase que a través de dos métodos obtiene el valor absoluto de
 * un númeor y su raíz cuadrada
 */
public class MiniCalculadora {

    /**
     *
     * @param num Este valor nos sirve como entrada para calcular su valor
     * absoluto
     * @return Devuelve el valor absoluto del número pasado como argumento
     */
    public static double valorAbsoluto(double num) {
        return Math.abs(num);
    }

    /**
     *
     * @param num Este valor nos sirve como entrada para calcular la raíz
     * caudrada
     * @return Devuelve el valor de la raíz cuadrada del número pasado como
     * argumento
     */
    public static double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamamos a las funciones con dos ejemplos

        double num = 7;
        System.out.println("El valor absoluto es " + num + " : " + valorAbsoluto(num));
        System.out.println("La raíz cuadrada de " + num + " : " + raizCuadrada(num));
        System.out.println("Cambio realizadoo");
    }

}
