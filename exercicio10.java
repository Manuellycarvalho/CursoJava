import java.util.Scanner;

public class exercicio10 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int Numero;
     

        System.out.println("Digite um número inteiro");
        Numero = sc.nextInt();

       

        if (Numero % 2 ==0){
            System.out.println("É Par");
        }
        else{
            System.out.println("É Impar");
        }

        sc.close();
    }
    
}
