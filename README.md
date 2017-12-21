# LCD refactor

##Solución: 
Compilar y ejecutar la clase LCDTester.java que etá en la carpeta refactor/LCD
Se hizo un refactor generando 4 Clases que tienen funcionalidades independientes y se organizaron los métodos para lograr tener una funcionalidad por clase, con el objetivo de tener un código más entendible y siguiendo buenas prácticas de patrones de diseño.
 - Lector, esta clase se encarga de leer las entradas del usuario en consola y validar que la información ingresada sea correcta.
 - Impresor, esta clase es la que se encarga de controlar la impresión de los números.
 - Numero, esta clase contine el el número (como cadena de caracteres) y genera una arreglo de Digitos
 - Digito, esta clase contiene un arreglo de lso segmentos que conforman visualmente un dígito
##Objetivo: 
Crear un programa que imprime números en estilo de una pantalla LCD 

##Entrada: 
La entrada contiene varias líneas. Cada línea contiene 2 números separados por coma. El primer número representa el tamaño de la impresión (entre 1 y 10, esta variable se llama “size”). El segundo número es el número a mostrar en la pantalla. Para terminar, se debe digitar 0,0. Esto terminará la aplicación.

##Salida: 
Imprimir los números especificados usando el caracter “-“ para los caracteres horizontales, y “|” para los verticales. Cada dígito debe ocupar exactamente size+2 columnas y 2*size + 3 filas. 

Entre cada impresión debe haber una línea blanca. 
 
Ejemplo: 
Entrada: 
2,12345 
3,67890 
0,0 
   
Salida:   
 <pre>  
   _ _  _ _        _ _
|     |    | |  | |
|  _ _| _ _| |__| |_ _
| |        |    |     |
| |_ _  _ _|    |  _ _|

 _ _ _  _ _ _   _ _ _   _ _ _   _ _ _ 
|            | |     | |     | |     |
|            | |     | |     | |     |
|_ _ _       | |_ _ _| |_ _ _| |     |
|     |      | |     |       | |     |
|     |      | |     |       | |     |
|_ _ _|      | |_ _ _|  _ _ _| |_ _ _|



