/*
 Faça um programa que leia vários conjuntos de três valores reais
 e mostre para cada conjunto: sua soma, seu produto e sua média. O
 programa para quando um conjunto não entrar com seus valores em
 ordem crescente.
 */
package ListaDeExercicios03;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class L03_Ex06 {
    public static void main(String[] args) {
        int n1=1,n2=2,n3=3;
        int soma = 0;
        float produto;
        float media;
        
        
        Scanner sc = new Scanner(System.in);
        while (n1<n2 && n2<n3){
        System.out.println("Digite o 1º Número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2º Número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o 3º Número: ");
        n3 = sc.nextInt();
        if(n1<n2 && n2<n3){
        soma = n1+n2+n3;
            System.out.println("Soma: " +soma);
        produto = n1*n2*n3;
            System.out.println("Produto: " +produto);
        media = (n1+n2+n3)/3;
            System.out.println("Média: " +media);
        }
        else {
            System.out.println("Sequência Inválida");
        }
        
        
        
        
    }
    
}
}
