public class exercicio10 {

    public static void main(String args[]){
        int a = 10;//12

        int b = ++a + 5; //18    // Pré fixado
        int c = a++ + ++b;//29
        int d = c++ - ++b;//10


        System.out.println(a);//12
        System.out.println(b);//18
        System.out.println(c);//29
        System.out.println(d);//10

      
       
    }
}

