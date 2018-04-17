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
 * @author fabio
 */
public class L03_Ex10 {
    public static void main(String[] args) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> np = new ArrayList<>();
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        
        for (int i = 1; i < n; i++){
            int cont =0;
            
            for(int j = 1; j<= i; j++){
                
                if(i%j == 0)
                    cont++;
            }
            
            if(cont == 2){
                    p.add(i);
                    }
            else{
                np.add(i);
            }
        }
        System.out.println("Números Primos: " + p);
        
    }
    
    
}
