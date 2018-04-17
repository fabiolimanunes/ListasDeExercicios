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
public class L2_Ex02 {
    
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inseria a primeira medida: ");
        a = sc.nextDouble();
        System.out.println("Insira a segunda medida: ");
        b = sc.nextDouble();
        System.out.println("Insira a terceira medida: ");
        c = sc.nextDouble();
        
        if(a<(b+c) && b <(a+c) && c<(a+b)){
        // cond. para verificar se é um triângulo
            if(a==b && b==c){
                System.out.println("Triângulo Equilátero");
            }
            else if(a==b || b==c || a==c){
                System.out.println("Triângulo Isóceles");
            }
            else{
                System.out.println("Triângulo Escaleno");
            }
    }
        else{
            System.out.println("As medidas não formam um triângulo");
        }
    
}
} 
