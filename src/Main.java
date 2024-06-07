import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Los bucles siempre tienen que tener 4 elementos principales,
        //La condicion previa: int i=1
        //La condicion de corte: i<11
        //El cambio de la condicion: i++ (le suma 1 en cada iteracion)
        //Las sentencias a ejecutar en cada iteracion

        for (int i=1; i<11; i++){
            //Analiza la condicion inicial (si no se cumple, sale del bucle)
            //Entra en el bucle
            //Sentencias que se van a ejecutar en cada iteracion
            System.out.println(i);
            //Realiza en cambio en la condicion inicial (i++)
        }

        //Mismo contador hasta 10 pero con While
        //Condicion inicial
        int i = 1;

        //While
        //Condicion de corte dentro de los ()
        while (i<11){
            System.out.println(i);
            //Cambio de condicion
            i++;
        }

        //Condicion inicial
        Boolean repetir = Boolean.TRUE;

        //Condicion de corte (cuando repetir sea falso, de dejara de ejecutar)
        while (repetir) {
            System.out.printf("Decime tu edad\n");
            Integer edad = scanner.nextInt();
            if (18<edad){
                //Cambio condicion
                repetir=Boolean.FALSE;
            }
        }

        System.out.printf("Sos mayor de edad. Bienvenido");

        //Do While
        //Condicion inicial
        int i = 1;

        do {
            System.out.println(i);

            //Cambio de condicion
            i++;

            //Condicion de corte (i<11)
        } while (i < 11);

        //Mayor de edad con do-while
        //Condicion inicial
        int edad;
        do {
            System.out.printf("Decime tu edad\n");

            //Cambio de condicion
            edad = scanner.nextInt();

            //Condicion de corte (edad<18)
        } while (edad<18);

    }
}