import classes.Banco;
import classes.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creo un nuevo cliente
        Cliente cliente1 = new Cliente("Manuel",48965127);

        //Cree un banco
        Banco bancoProvincia = new Banco("Banco Provincia");

        //Agrege el cliente a la lista de clientes del Banco Provincia
        bancoProvincia.crearCLiente(cliente1);

        //Imprimo por consola los clientes del Banco Provincia
        System.out.print(bancoProvincia.getClientes());
    }
}