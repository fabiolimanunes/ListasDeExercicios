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
public class Ex05 {
    public static void main(String[] args) {
        int n1,n2;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        n1 = sc.nextInt();
        n2=n1*n1;
        
        System.out.println("O quadrado de " + n1 + " = " + n2);
    }
    
}
