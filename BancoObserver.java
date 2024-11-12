//Banco.java, Cliente.java

import java.util.ArrayList;
import java.util.List;

interface Observador {
    void notificar(String mensagem);
}

class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + " recebeu notificação: " + mensagem);
    }
}

class Banco {
    private List<Observador> clientes = new ArrayList<>();

    public void adicionarCliente(Observador cliente) {
        clientes.add(cliente);
    }

    public void enviarNotificacao(String mensagem) {
        for (Observador cliente : clientes) {
            cliente.notificar(mensagem);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        banco.enviarNotificacao("A taxa de juros foi alterada.");
    }
}