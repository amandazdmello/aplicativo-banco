package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String clientName = "Mark Rufallo";
        String accountType = "Conta-corrente";
        double balance = 2400.00;

        System.out.println("Nome do cliente: " + clientName);
        System.out.println("Tipo da conta: " + accountType);
        System.out.println("Saldo atual: R$"+ balance);

        int option = 0;
        String menu = """
                ****Digite sua opção****
                1-Consultar valor
                2-Transferir valor
                3-Receber valor
                4-Sair""";
        Scanner entrance = new Scanner(System.in);

        while (option != 4){
            System.out.println(menu);
            option = entrance.nextInt();

        if(option==1){
            System.out.println("O seu saldo atualizado é: " + balance);
        } else if(option==2) {
            System.out.println("Qual é o valor que você deseja transferir?");
            double value = entrance.nextDouble();
            if (value>balance) {
                System.out.println("Não há saldo para realizar a transferência");
            }else{
                balance -= value;
                System.out.println("Novo saldo: "+ balance);
            }}else if(option==3) {
            System.out.println("Valor recebido ");
            double valueEntrance = entrance.nextDouble();
            balance += valueEntrance;
            System.out.println("Novo saldo "+ balance);

        }else if(option != 4){
            System.out.println("Opção inválida.");

            }

    }
}
}
