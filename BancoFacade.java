//BancoFacade.java

class ContaCorrente {
    public void depositar() {
        System.out.println("Depósito realizado na conta corrente.");
    }
}

class ContaPoupanca {
    public void depositar() {
        System.out.println("Depósito realizado na conta poupança.");
    }
}

class BancoFacade {
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public BancoFacade() {
        contaCorrente = new ContaCorrente();
        contaPoupanca = new ContaPoupanca();
    }

    public void realizarDeposito() {
        contaCorrente.depositar();
        contaPoupanca.depositar();
    }
}

public class Main {
    public static void main(String[] args) {
        BancoFacade banco = new BancoFacade();
        banco.realizarDeposito();
    }
}