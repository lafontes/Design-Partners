//BancoSingleton.java

public class BancoSingleton {
    private static BancoSingleton instancia;

    private BancoSingleton() {
        // Conexão com o banco de dados
    }

    public static BancoSingleton getInstancia() {
        if (instancia == null) {
            instancia = new BancoSingleton();
        }
        return instancia;
    }

    public void realizarTransacao() {
        System.out.println("Transação realizada.");
    }
}

public class Main {
    public static void main(String[] args) {
        BancoSingleton banco = BancoSingleton.getInstancia();
        banco.realizarTransacao();
    }
}