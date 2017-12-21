package refactor.LCD;

/**
 * Se hizo un refactor generando 4 Clases que tienen funcionalidades independientes y se organizaron los métodos para
 * lograr tener una funcionalidad por clase, con el objetivo de tener un código más entendible y siguiendo buenas prácticas
 * de patrones de diseño.
 * 1. Lector, esta clase se encarga de leer las entradas del usuario en consola y validar que la información ingresada sea correcta.
 * 2. Impresor, esta clase es la que se encarga de controlar la impresión de los números.
 * 3. Numero, esta clase contine el el número (como cadena de caracteres) y genera una arreglo de Digitos
 * 4. Digito, esta clase contiene un arreglo de lso segmentos que conforman visualmente un dígito
 */
public class LCDTester {
    public static void main(String[] args) {
        Lector pruebaLector=new Lector();
        pruebaLector.leer();
    }
}
