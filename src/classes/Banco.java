package classes;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre){
        this.nombre = nombre;
        this.clientes = new ArrayList<Cliente>();
    }

    public void crearCLiente(Cliente cliente){
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }


}
