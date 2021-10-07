import java.util.Scanner;


public class ex15 { 

    public static void main(String args[]) { 

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = scan.nextInt();
    
        
       
        for (int i=0; i <= 10; i++)
        {
            System.out.println("tabuada "+ n1 + " x " + i + " = "  + n1 * i);
        }

        
    }

}