package ListaDeExercicios02;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class L2_Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n1;       
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número desejado");
        n1 = sc.nextInt();
        
        if(n1 < 0){
            System.out.println("Número negativo");
        }
        else if(n1 >= 0){
            System.out.println("Número positivo");
        }
        if (n1 % 2 == 0){
            System.out.println("Número Par");
            }
        else if (n1 % 2 != 0){
            System.out.println("Número Ímpar");
        }
            
       
    }
    
}
