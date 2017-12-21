package refactor.LCD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lector {
    static final String CADENA_FINAL = "0,0";
    private String textoNumero;
    private int size;
    private int espacio;
    private List<String> listaComando;

    public Lector(){
        //Se inicializan los valores del Impresor de números
        this.textoNumero="0";
        this.size=1;
        this.espacio=1;
        this.listaComando = new ArrayList<>();
    }

    /**
     * Este método lee hasta que el usuario ingresa e valor 0,0
     */
    public void leer(){

        // Establece los segmentos de cada numero
        List<String> listaComando = new ArrayList<>();
        String comando;

        try {

            try (Scanner lector = new Scanner(System.in)) {

                System.out.print("Espacio entre Digitos (0 a 5): ");
                comando = lector.next();

                // Valida si es un numero
                if (this.isNumeric(comando)) {
                    this.espacio = Integer.parseInt(comando);

                    // se valida que el espaciado este entre 0 y 5
                    if (this.espacio < 0 || this.espacio > 5) {
                        throw new IllegalArgumentException("El espacio entre "
                                + "digitos debe estar entre 0 y 5");
                    }

                } else {
                    throw new IllegalArgumentException("Cadena " + comando
                            + " no es un entero");
                }

                do {
                    System.out.print("Entrada: ");
                    comando = lector.next();
                    if (!comando.equalsIgnoreCase(CADENA_FINAL)) {
                        listaComando.add(comando);
                    }
                } while (!comando.equalsIgnoreCase(CADENA_FINAL));
            }

            imprimirComandos(listaComando.iterator());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    /**
     * Este método revisa que todos los comandos cumplan con los requerimientos e imprime los números
     * @param iterator un iterador del String de comandos
     */
    private void imprimirComandos(Iterator<String> iterator){

        while (iterator.hasNext()) {
            try {
                String comando = iterator.next();
                if (!comando.contains(",")) {
                    throw new IllegalArgumentException("Cadena " + comando
                            + " no contiene caracter ,");
                }
                //Se hace el split de la cadena
                String[] parametros =comando.split(",");
                //Valida la cantidad de parametros
                if(parametros.length>2)
                {
                    throw new IllegalArgumentException("Cadena " + comando
                            + " contiene mas caracter ,");
                }

                //Valida la cantidad de parametros
                if(parametros.length<2)
                {
                    throw new IllegalArgumentException("Cadena " + comando
                            + " no contiene los parametros requeridos");
                }

                //Valida que el parametro size sea un numerico
                if(isNumeric(parametros[0]))
                {
                    this.size = Integer.parseInt(parametros[0]);

                    // se valida que el size este entre 1 y 10
                    if(this.size <1 || this.size >10)
                    {
                        throw new IllegalArgumentException("El parametro size ["+this.size
                                + "] debe estar entre 1 y 10");
                    }
                }
                else
                {
                    throw new IllegalArgumentException("Parametro Size [" + parametros[0]
                            + "] no es un numero");
                }


                if (isNumeric(parametros[1])){
                    this.textoNumero=parametros[1];
                }else{
                    throw new IllegalArgumentException("Parametro Numero [" + parametros[1]
                            + "] no es un numero");
                }
                //Si todas las condiciones se cumplen se genera un objeto Impresor para imprimir el número
                Impresor impresorLCD = new Impresor(this.textoNumero, this.size,this.espacio);
                impresorLCD.imprimirMatriz();
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }




        /**
         *
         * Metodo encargado de validar si una cadena es numerica
         *
         * @param cadena Cadena
         */

    static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}

