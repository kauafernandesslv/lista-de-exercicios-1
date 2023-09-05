/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios1;
import java.util.Scanner;
/**
 *
 * @author kaua.1880
 */
public class exercicios5 {
      public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        String nome,endereco, cpf;
        System.out.print("digite o nome" );
       nome = scanner.next();
       System.out.print("digite o endereço" );
       endereco = scanner.next();
          System.out.print("digite o cpf");
          cpf = scanner.next();
          System.out.print("o seu nome " + nome + "\no seu endereço" + endereco + " \no seu cpf e " + cpf );
      }
}