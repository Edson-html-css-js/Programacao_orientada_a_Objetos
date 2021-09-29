import java.util.Scanner;//inportando pra ele pegar o que o usuario digitar

public class exercicio14 { 

  public static void main(String args[]) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Digite o valor de suas cartas");//o numero digitado ira pra variavel da sequencia
      int n1 = scan.nextInt();

      if(n1 <= 10){
        System.out.println("Sem duvida compre mais uma carta");
      }else if(n1 > 10 && n1 <= 15){
            System.out.println("Ha um risco, mas aconselho a comprar mais uma carta");
          }else if(n1 > 15 && n1 <= 20){
        System.out.println("Aconselho a parar de jogar");
      }else if(n1 == 21){
        System.out.println("Voce ja venceu, nao precisa comprar mais nada");
      }else if(n1 > 21){
          System.out.println("Voce perdeu!");
      }




    }


}     