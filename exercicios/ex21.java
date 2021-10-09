import java.util.Scanner;


public class ex21 { 

    public static void main(String args[]) { 

        Scanner scan = new Scanner(System.in);
        System.out.println("digite o raio do cilindro!");
        int n1 = scan.nextInt();

        System.out.println("digite o altura do cilindro!");
        int n2 = scan.nextInt();
    
        function recebeRaio(raio){

                raio = raio / 2;

        }
       
        function recebeArea(area){
                 area = area * 2 + raio;

        }
        
            System.out.println(" area do circulo " + recebeRaio(n1));

            System.out.println(" volume do cilindro " + recebeArea(n2));


    }    

        
    

}