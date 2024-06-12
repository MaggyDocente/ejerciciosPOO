import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Clase Random
        Random random = new Random();

        //Metodo para devolver un entero
        //El numero de origen se incluye, el de corte no, en este caso
        //devuelve un numero del 0 (inclusive) al 99.
        int numero = random.nextInt(0,100);
        int numero2 = random.nextInt(0,100);
        int numero3 = random.nextInt(0,100);

        System.out.println((numero)+"\n");
        System.out.println((numero2)+"\n");
        System.out.println((numero3)+"\n");

        //Arrays
        //Se conocen como secuencias, porque se organizan mediante posiciones.

        //Primer opcion de instancia de Arrays
        int[] edades = new int[5];

        //Agregar elementos a mi array
        edades[0] = 5;
        edades[1] = 40;
        edades[3] = 58;
        edades[2] = random.nextInt(0,11);
        System.out.print("Los valores del array n son los siguientes: ");

        //Acceso a los elementos del Array
        System.out.print(edades[0] + ", " + edades[1] + ", " + edades[2] + ", " + edades[3] + "\n");

        //Modificar elementos del Array
        edades[3] = 65;
        System.out.print(edades[0] + ", " + edades[1] + ", " + edades[2] + ", " + edades[3] + "\n");

        //Segunda forma de instanciar un Array
        String[] nombres = {};

        //Tercera forma de instanciar un array con elementos
        Boolean[] boleanos = {Boolean.TRUE, Boolean.FALSE, Boolean.FALSE};
        System.out.print(boleanos[1]);

        int[] numerosRandom = new int[10];

        System.out.print(numerosRandom[1]);

        //Instancia de array bidimensional
        int[][] nB = new int[2][3];

        nB[0][0] = 5;

        //Instancia de array tridimensional
        String[][][] strings = new String[2][3][4];

        strings[0][1][3]="hola";

        //Recorrer con foreach
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        System.out.println("Para calcular la nota media necesito saber la ");
        System.out.println("nota de cada uno de tus exámenes.");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nota del examen no " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Tus notas son: ");
        double suma = 0;

        for (double nota : notas) { // for al estilo foreach
            System.out.print(nota + " ");
            suma += nota;
        }
        System.out.println("\nEl promedio es " + suma / 4);

        String[] clientes = {"Camila", "Florencia", " Lucas", "Marcelo"};

        for (String cliente:clientes){
            if (cliente.equals("Camila")){
                System.out.print(cliente);
            }
        }

        String nombre = "Lola";

        ArrayList<String> palabras;

        int x;
        Integer v;





    }
}