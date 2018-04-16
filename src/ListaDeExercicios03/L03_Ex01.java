/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExercicios03;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class L03_Ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float valor[] = new float[15];
        float maior = 0, menor=15;
        
        for(int i = 0; i <valor.length; i++){
            System.out.println("Digite o " +(i+1)+ "º valor:");
            valor[i] = sc.nextFloat();
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
        for (int j = 0; j < valor.length; j++){
            if(valor[j] < menor){
                menor = valor[j];
            }
        }
        System.out.println("Maior Valor = " +maior);
        System.out.println("Menor Valor = " +menor);
    }
    
}
