/*
 Faça um programa que leia as médias finais de vários alunos de uma turma 
 e mostre a maior média, a menor média e a média aritmética da turma. 
 O programa para quando encontrar uma média negativa.

 */
package ListaDeExercicios03;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class L03_Ex07 {

    public static void main(String[] args) {
        float soma, maior, menor, md_sala, n;
        int cont = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média desejada: ");
        n = sc.nextFloat();
        menor = n;
        maior = n;
        soma = n;
        if (n >= 0) {
            ++cont;
        }
        while (n >= 0) {
            System.out.println("Digite a média desejada: ");
            n = sc.nextFloat();
            if (n < 0) {
                break;
            } else {
                if (n > maior) {
                    maior = n;
                }

                if (n < menor) {
                    menor = n;
                }
                soma += n;
                cont++;
            }
        }
        md_sala = soma / cont;
        System.out.println("-------------RESULTADO----------------");
        System.out.println("Maior Nota: "+maior);
        System.out.println("Menor Nota: "+menor);
        System.out.println("Media da Sala:"+md_sala);
    }

}
