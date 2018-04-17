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
public class Ex02 {
    
    public static void main(String[] args) {
        float f,temp;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatura: ");
        temp = sc.nextInt();
               
        f = (9 * temp + 160)/5;
        System.out.println("A temperatura em Fahrenheit é: " +f);
    }
   
}
