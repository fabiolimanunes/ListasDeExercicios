package ListaDeExercicios02;

import java.util.Arrays;
import java.util.InputMismatchException;
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
public class L2_Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        char ordem;
        try{
        
        System.out.println("Digite o numero 1:");
        num[0] = sc.nextInt();
        System.out.println("Digite o numero 2:");
        num[1] = sc.nextInt();
        System.out.println("Digite o numero 3:");
        num[2] = sc.nextInt();
        
        Arrays.sort(num);
        
        System.out.println("Digite 'c' para crescente e 'd' para decrescente");
        ordem = sc.next().charAt(0);
        if(ordem == 'c' || ordem == 'C'){
            System.out.println(Arrays.toString(num));
        }else if(ordem == 'd' || ordem == 'D'){
            System.out.println("[" + num[2] + ", " + num[1] + ", " + num[0] + "]");
        }else{
            System.out.println("Entrada Invalida!");
        }
        }catch(InputMismatchException e){
            System.out.println("Entrada Invalida!");
        }
    }
    
}
    
    

