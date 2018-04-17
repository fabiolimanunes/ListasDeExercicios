/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Faça um programa que leia um número n e mostre na tela os n
 * primeiros números pares e depois os n primeiros números ímpares
 * @author fabio
 */
public class L03_Ex08 {
    public static void main(String[] args) {
        ArrayList <Integer> par = new ArrayList<>();
        ArrayList <Integer> impar = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++ ){
            if (i % 2 == 0){
             par.add(i);
             
            }
            else{
               impar.add(i);
                
            }
        }
        System.out.println("Números Pares" +par);
        System.out.println("Números Ímpares" +impar);
        
            
        }
        
    }
    

