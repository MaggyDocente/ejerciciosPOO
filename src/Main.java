import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instancio objeto de la clase Scanner y guardandolo en la variable scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Decime tu nombre\n ");

        //Usando un metodo de la clase Scanner a traves de su instancia scanner.
        //El metodo next()-Lee la linea ingresada por el usuario como string- es llamado por la
        //instancia scanner.
        String nombre = scanner.next();
        System.out.printf("Hola "+nombre);

        //System.out.printf("Decime tu edad\n");

        //El metodo nextInt() lee lo ingresado por consola como un entero
        //int edad = scanner.nextInt();
        //int proximaEdad = edad+1;
        //System.out.printf("Vas a complir "+ (proximaEdad));

        //Sentencia if
        System.out.printf("Hola, ingresa tu edad: ");
        int edad = scanner.nextInt();

        if(edad<1 || edad>130){
            System.out.printf("Ingresa una edad valida");
            //edad = scanner.nextInt();
        } else if (edad>=18){
            System.out.printf("Podes pasar");
        } else {
            System.out.printf("No podes pasar");
        }
    }
}