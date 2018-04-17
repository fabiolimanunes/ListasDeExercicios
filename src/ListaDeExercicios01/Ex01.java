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
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,soma;
        float dif,produto,media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número " );
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número " );
        n2 = sc.nextInt();
        
        soma = n1+n2;
        System.out.println("A soma dos números é: " +soma);
        
        media = soma/2;
        System.out.println("A média é: " +media);
        
        produto = n1*n2;
        System.out.println("O produto é: " +produto);
        
        dif = n1-n2;
        System.out.println("A diferença é: " +dif);
                
                
    }
    
}
