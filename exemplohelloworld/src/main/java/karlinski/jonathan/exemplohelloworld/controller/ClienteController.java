package karlinski.jonathan.exemplohelloworld.controller;

import karlinski.jonathan.exemplohelloworld.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Jonathan Karlinski
 * @since 15/04/20
 * @version 1.0
 */
@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public Cliente getClients() {

        Cliente cliente = new Cliente();
        cliente.setNome("Marcio");

        return cliente;
    }

    @GetMapping("/clientes")
    public ArrayList<Cliente> getClient() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marcio");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Claudio");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        return clientes;
    }
}
