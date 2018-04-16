/*
 *Escreva um algoritmo que gera números entre 1000 e 1999 e mostra
 *aqueles que divididos por 11 dão resto 5.
 */
package ListaDeExercicios03;

/**
 *
 * @author fabio.nunes
 */
public class L03_Ex04 {
    public static void main(String[] args) {
        for (int i = 1000; i<=1999; i++ ){
            
            if(i % 11 == 5){
                System.out.println(i);
            }
            
        }
    }
}
