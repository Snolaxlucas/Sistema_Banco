package banco;

import assets.Conta;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();

        c1.setId(123);
        c1.setNome("Maria das Dores");
        System.out.println("Olá " + c1.getNome() + "titular da conta " + c1.getId());
        System.out.print("Seu saldo atual é: "); c1.printarpolp();
        System.out.println("Quanto deseja depositar?");
        double deposito = sc.nextDouble();
        c1.depositar(deposito);
        System.out.println("Quanto deseja sacar?");
        double saque = sc.nextDouble();
        if (saque > c1.getSaldo()){
            System.out.println("Saldo insuficiente!");
        }else {
            c1.sacar(saque);
        }
        System.out.println("Seu saldo atual é: "); c1.printarpolp();
        System.out.println("Quanto deseja depositar na conta corrente?");
        double corrente = sc.nextDouble();
        c1.setSaldoCorren(corrente);
        c1.tranfer();
        System.out.println("Saldo conta polpança é: ");c1.printarpolp();
        System.out.println("Saldo conta corrente é: ");c1.printarcorren();
        sc.close();

    }
}