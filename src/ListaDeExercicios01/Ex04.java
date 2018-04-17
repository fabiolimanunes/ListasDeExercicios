/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios01;

import java.util.Scanner;

/**
 *
 * @author Fábio Lima Nunes
 */
public class Ex04 {
    public static void main(String[] args) {
        int a,b,a2,b2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor para B: ");
        b = sc.nextInt();
        
        System.out.println("TROCANDO OS VALORES DE A PARA B");
        a2=b;
        System.out.println("Valor trocado de A: " +b);
        b2=a;
        System.out.println("Valor trocado de B: " +a);
      
             
        
        
    }
}
