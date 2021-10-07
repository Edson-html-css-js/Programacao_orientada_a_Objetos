import java.util.Scanner;


public class ex17 { 

    public static void main(String args[]) { 

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas 10 notas anuais abaixo!");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();
        int n7 = scan.nextInt();
        int n8 = scan.nextInt();
        int n9 = scan.nextInt();
        int n10 = scan.nextInt();
    
        int somatoria = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
        
        int media = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10 / 10;
        
         System.out.println("A somatoria de suas notas e = " + somatoria);
         System.out.println("A media de suas notas e = " + media);


        

        
    }

}