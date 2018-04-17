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
public class Ex03 {
    public static void main(String[] args) {
        float raio,altura;
        double volume;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o raio ");
        raio = sc.nextFloat();
        System.out.println("");
        System.out.println("Digite a altura ");
        altura = sc.nextFloat();
        
        volume = 3.14159 * raio * raio * altura;
        System.out.println("O volume é: " +volume);
        
        
    }
}
