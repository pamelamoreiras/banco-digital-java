package com.bancodigital.dio.entity;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Pamela");

        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupança(cliente1);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
