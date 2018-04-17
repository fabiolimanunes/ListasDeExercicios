/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios02;

import java.util.Scanner;

/**
 * Fazer um algoritmo para ler três notas, imprimir a maior delas
 * e a média destas notas .
 *
 * @author fabio
 */
public class L2_Ex03 {
    public static void main(String[] args) {
        float n1,n2,n3, media,mnota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = sc.nextFloat();
        
        if(n1>n2 && n1>n3){
            System.out.println("A maior nota foi: "+n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("A maior nota foi: "+n2);
        }
        else if(n3>n2 && n3>n1){
            System.out.println("A maior nota foi: "+n3);
        }
        
        media = (n1+n2+n3)/3;
        System.out.println("A média do aluno é: " +media);
    }
    
}
