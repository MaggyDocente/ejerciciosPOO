import java.util.ArrayList; //Se importo ArrayList de su paquete java.util
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Instanciar un ArrayList, en este caso nombres que es un ArrayList de Strings
        //(Recordemos que tanto ArrayList como array no permiter guardar elementos de distinto tipo
        ArrayList<String> nombres = new ArrayList<String>();

        //Agrego un elemento al final de la lista
        nombres.add("Macarena");

        //Agrego el elemento "Matias" al ArrayList nombres, en la posicion 1
        nombres.add(1,"Matias");

        //Mediante el metodo get(), traigo el elemento que esta en la posicion 0(lo indico por parametro),
        //en nombres y lo imprimo.
        System.out.print(nombres.get(0));

        //Cambio el valor de la posicion 0(Macarena) por Claudia
        nombres.set(0,"Claudia");

        System.out.print(nombres.get(0));

        //Agregar "Roberto" al final de nombres
        nombres.add("Roberto");

        //Elimino al elemento 0 de nombres, en este caso es "Claudia" y el elemento siguien pasa a tener su posicion
        //(no lo reemplaza, solo se "mueven" todos los elementos)
        nombres.remove(0);

        //Roberto ahora es la posicion 0
        System.out.print(nombres.get(0));

        //Imprimo la cantidad de elementos del ArrayList "nombres" por pantalla por medio del metodo size()
        System.out.print(nombres.size());

        //Reviso si existe Macarena en mi lista
        System.out.print(nombres.contains("Mararena"));

        //Verifico si mi lista esta vacia
        boolean vacia = nombres.isEmpty();

        System.out.print(vacia);

        //Recibe como parametro una funcion lambda donde indico la logica a aplicar por cada
        //elemento de mi ArrayList
        nombres.forEach(nombre -> {//nombre es donde se va a guardar el elemento que toque en esa iteracion
            //Imprime el nombre actual (el que toca en esa iteracion)
            System.out.print("EL nombre es: " + nombre);

            //Le pide al usuario que ingrese un nombre por el que va a reemplazarse el actual
            System.out.print("Ingrese el nuevo nombre");
            String nuevoNombre = scanner.nextLine();

            //Por medio del metodo indexOf() obtiene el indice del nombre actual, ya que lo necesito
            //para hacer el cambio por medio del metodo set()
            int index = nombres.indexOf(nombre);

            //Cambio el elemendo en la posicion index(es el que obtuve anteriormente) por el nombre
            //ingresado por el usuario
            nombres.set(index, nuevoNombre);
        });

        //Utilizo lo retornado por sumar() para trabajar, en primer lugar imprimiendolo por consola y en segundo lugar
        //para crear otra variable

        System.out.print(sumar(5,8));

        int otroResultado = sumar(5,8) + 10;

        //Llamo a la funcion imprimirNombre en su version con parametros
        imprimirNombre("Manuel");

        //Llamo a la funcion imprimir nombre en su version sin parametros
        imprimirNombre();

    }

    //Funcion con retorno, al usar return dejo disponible a+b(en este caso) para ser utilizado a la hora de llamar a sumar()
    public static int sumar(int a, int b) {
        return a+b;
    }

    //Funcion imprimirNombre ingresandolo por parametro o ingresandolo por consola
    //Sobrecarga: ambas pueden llamarse igual pero tienen parametros distintos (una tiene y la otra no)

    public static void imprimirNombre(String nombre) {
        System.out.println("El nombre es: " + nombre);
    }

    public static void imprimirNombre() {
        String nombre = scanner.next();
        System.out.println("El nombre es: " + nombre);
    }
}