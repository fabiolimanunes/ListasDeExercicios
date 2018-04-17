/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios02;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class L2_Ex05 {
    public static void main(String[] args) {
        float n1,n2,n3,soma,media,multiplicacao;
        int op; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextFloat();
         System.out.println("Digite o segundo número: ");
        n2 = sc.nextFloat();
         System.out.println("Digite o terceiro número: ");
        n3 = sc.nextFloat();
        
        System.out.println("ESCOLHA AS OPÇÕES");
        System.out.println("1 - Para calcular a Média dos números");
        System.out.println("2 - Para calcular a Soma dos números");
        System.out.println("3 - Para calcular a Multiplicação dos números");
        op = sc.nextInt();
       
        
        if (op == 1){
          media = (n1+n2+n3)/3;
            System.out.println("A média dos números é: " +media);
        }
        else if (op == 2){
            soma = n1+n2+n3;
            System.out.println("A soma dos números é: " +soma);
        }
        else if (op == 3 ){
            multiplicacao = n1*n2*n3;
            System.out.println("A multiplicação dos números é = " +multiplicacao);
        }
        else if ((op!=1) || (op!=2) || (op!=3)){
            System.out.println("Opção inválida!!!");
        }
    }
    
}
