package numeros;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Numeros {

    /**
     * @param args the command line arguments arg[0] es el primer parámetro que
     * se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;
    

    public static void main(String[] arg) {
        // TODO code application logic here
        int numeroDeDigitos = 0;
          int numeroDeVecesElDigito = 0;
        numeroDeDigitos = Integer.parseInt(arg[0]);
                        if (numeroDeDigitos <= 0) {
           System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    for (int resultadoDivision = 1; resultadoDivision <= 99999; resultadoDivision++) {
            int division = resultadoDivision;
                      int contador = 0;

                        while (division != 0) {
                  division = division / 10;
            contador++;
            }
            numeroDeVecesElDigito = contador;

            if (numeroDeVecesElDigito == numeroDeDigitos) {
                if (resultadoDivision < 4) {
                     p = true;
                             } else {
                    if (resultadoDivision % 2 == 0) {
                        p = false;
                                      } else {
                        int contador1 = 0;
                 int resultadoDivision1 = 1;
                        int limite = (resultadoDivision - 1) / 2;
                 if (limite % 2 == 0) {
                            limite--;
                        }
                        while (resultadoDivision1 <= limite) {
                            if (resultadoDivision % resultadoDivision1 == 0) {
                                contador1++;
                       }
                            resultadoDivision1 += 2;
              if (contador1 == 2) {
                                resultadoDivision1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                     p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(resultadoDivision);
                }
            }
        }
    }
}
