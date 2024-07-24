/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dio.java.contabanco;

import java.util.Scanner;

/**
 *
 * @author joaos
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome!");
        String nome = ler.nextLine();
        
        System.out.println("Digite o número da conta!");
        int numero = ler.nextInt();
        
        System.out.println("Digite a Agência!");
        String ag = ler.nextLine();
        
        System.out.println("Digite o saldo!");
        double saldo = ler.nextDouble();
        
        ContaBanco conta = new ContaBanco(numero,nome, ag, saldo);
        System.out.println("Olá " + conta.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta" + conta.getNumero() + "e seu saldo" + conta.getSaldo() + "já está disponível para saque");
    }
}
