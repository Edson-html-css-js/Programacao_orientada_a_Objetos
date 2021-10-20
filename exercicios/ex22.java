// Um posto de saúde da zona sul de São Paulo,
//  irá vacinar 15 pessoas com a vacina para COVID 19,
//   e o coordenador do posto de saúde deseja saber a média aritmética da idade das pessoas que estão se vacinando,
//    para efeito de pesquisa. 
// Faça um programa que pergunte a idade de cada pessoa que está se vacinando, 
// calcule a média aritmética da idade de todos os vacinados,
//  e mostre na tela a soma das idades, bem como a média.


// *** Desafio, informe qual é a maior idade que foi digitada.


import java.util.Scanner;
public class ex22 {

    public static void main(String[] args) {

        final int QTD = 15;

        Scanner scan = new Scanner(System.in);

        double[] notas; // Declaração
        notas = new double[QTD];  // Inicialização


        for (int i = 0; i < QTD; i++) { 
            System.out.println("Digite a sua idade! ");
            notas[i] = scan.nextDouble();
        }

        // Tecnica da Soma
        double soma = 0;
        for (int i = 0; i < QTD; i++) { 
            soma = soma + notas[i];
        }

        double maiorNota = 0.0;
        for(int i = 0;i < QTD; i++ ) {

            if(maiorNota < notas[i]){
                maiorNota = notas[i];
            }
        }

        // double soma = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        double media = soma / QTD;

        System.out.println("Soma da idades ==> " + soma);
        System.out.println("Media das idades ==> " + media);
        System.out.println("A maior nota foi  ==> " + maiorNota);
    }
    
}