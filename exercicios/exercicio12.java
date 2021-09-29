import java.util.Scanner;

public class exercicio12 { 

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = scan.nextInt();

        System.out.println("Digite outro numero");
        int n2 = scan.nextInt();


        if(n1 > n2){

            System.out.println(n2);
            System.out.println(n1);
        }else{

            System.out.println(n1);
            System.out.println(n2);
        }
        
        scan.close();


    } 

}