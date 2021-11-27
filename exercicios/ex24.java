import java.util.Scanner;

public class ex24 { 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

         int[] pontuacoes = new int[10];

            for (int i = 0; i < pontuacoes.length; i++){

                System.out.println("Digite um numero ");
                pontuacoes[i] = entrada.nextInt();
            }

            //Imprimir o vetor na tela
        for (int i = 0; i < pontuacoes.length; i++) { 

            System.out.print(pontuacoes[i] + "   ");
        }


              // Imprime o vetor
        System.out.println("Vetor");
        for (int i = 0; i < pontuacoes.length; i++) { 
            System.out.println( pontuacoes[i] );
        }


       // Ordenando vetores
        for (int j = 0; j < pontuacoes.length; j++){ 
            for (int i = 0; i < pontuacoes.length - 1; i++ ) {
                if (pontuacoes[i] >= pontuacoes[i + 1]) { 
                    

                    int temp = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[i + 1];
                    pontuacoes[i + 1] = temp;
                }
            }
     
            }
        // Imprime o vetor
        System.out.println("Vetor Ordenado");
        for (int i = 0; i < pontuacoes.length; i++) { 
            System.out.println( pontuacoes[i] );
        }





        
    }
}