package conta;

public class Conta {
    private int numeroDaConta = 20304;
    private double saldo;

    public void depositar(int valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        } else {
            System.out.println("Seu valor esta abaixo do seu saldo");
        }

    }
    public void sacar(int valorDeSaque) {}
    public void mostrarSaldo() {}

}
