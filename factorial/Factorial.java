/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int valorParaLaMultiplicacion;
                    int resultado;

            valorParaLaMultiplicacion = 8;

       int variableDeLaMultiplicacion;
        if (valorParaLaMultiplicacion == 0) {
     resultado = 1;
           } else {
                resultado = 1;
                for (variableDeLaMultiplicacion = valorParaLaMultiplicacion; variableDeLaMultiplicacion >= 1; variableDeLaMultiplicacion--) {
             resultado = resultado * variableDeLaMultiplicacion;
            }
        }

   System.out.println(resultado);

    }

}
