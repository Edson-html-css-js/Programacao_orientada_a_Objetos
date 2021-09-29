import java.util.Scanner;

public class exercicio13 { 

  public static void main(String args[]) {

      Scanner scan = new Scanner(System.in);
      System.out.println("Digite um numero");
      int n1 = scan.nextInt();

      System.out.println("Digite outro numero");
      int n2 = scan.nextInt();

      System.out.println("Digite outro numero");
      int n3 = scan.nextInt();

      if (n1 < n2 && n2 < n3) {
          System.out.println("A ordem crescente ==> " + n1 + n2 + n3);
        }
        if (n2 < n1 && n1 < n3) {
          System.out.println("A ordem crescente: " + n2 + n1 + n3);
        }

        if (n3 < n2 && n1 > n2) {
          System.out.println("A ordem crescente: " + n3 + n2 + n1);
        }
          if (n3 < n1 && n1 < n2) {
          System.out.println("A ordem crescente: " + n3 + "-" + "-" + n1 + "-" + n2);
        }




  }

}