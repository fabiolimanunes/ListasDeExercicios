/*
    Faça um programa que leia vários inteiros positivos e mostre, no
    final, a soma dos números pares e a soma dos números ímpares. O
    programa para quando entrar um número maior que 1000.
 */
package ListaDeExercicios03;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class L03_Ex05 {
    public static void main(String[] args) {
        int n = 0;
        int somapar = 0 ;
        int somaimpar = 0;
        
        Scanner sc = new Scanner(System.in);
            
        while (n <= 1000){
         System.out.println("Digite o número desejado: ");
         n = sc.nextInt();
         
         if (n < 0){
            System.out.println("Número Inválido");
        }
                           
            else if (n <= 1000 && n % 2 == 0){
                somapar = somapar+n;
                            }
            else if (n <= 1000 && n %2 != 0) {
                somaimpar = somaimpar+n;
            }
         
     }
        
        System.out.println("A soma dos números pares são: " +somapar);
        System.out.println("A soma dos números impares são: " +somaimpar);
      
                       
  
    } 
    
     
}
