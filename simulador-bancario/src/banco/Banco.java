package banco;

import conta.ContaCorrente;

public class Banco {
    private String nome = "SANTANDER";
    private int numeroDaConta = 20304;
    private double saldo;

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.mostrarSaldo();
        contaCorrente.depositar(20);
        contaCorrente.mostrarSaldo();
        contaCorrente.sacar(10);
        contaCorrente.mostrarSaldo();
    }
}
