package conta;

public class ContaCorrente extends Conta {
    private int numeroDaConta = 4227;
    private int saldo = 0;

    public ContaCorrente() {
    }

    public void depositar(int valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        } else {
            System.out.println("Seu valor esta abaixo do seu saldo");
        }

    }

    public void sacar(int valorDeSaque) {
        if (valorDeSaque > this.saldo) {
            System.out.println("Saldo insufisiente");
        } else {
            valorDeSaque = this.saldo - valorDeSaque;
            System.out.println("Voce sacou " + valorDeSaque);
        }

        this.saldo = valorDeSaque;
    }

    public void mostrarSaldo() {
        if (this.saldo <= 0) {
            System.out.println("Saldo inicial: " + this.saldo);
        } else {
            System.out.println("Saldo atual: " + this.saldo);
        }
    }

    public int getSaldo() {
        return this.saldo;
    }

}

