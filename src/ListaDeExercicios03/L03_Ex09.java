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
public class L03_Ex09 {

    public static void main(String[] args) {
        int n;
        boolean primo = false;
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        //int numprimo;
        if (n == 2) {
            primo = true;
        } else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                } else {
                    primo = true;
                }
            }
        }
        if(primo){
            System.out.println("É um numero primo!");
        }else{
            System.out.println("Não é um numero primo");
        }
    }

}
