import java.util.Scanner;

public class exercicio9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int num1 ;

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        if (num1 < 0){
            System.out.println("O número é Negativo: ");
        }
        else {
            System.out.println("Nao Negativo");
        }
        sc.close();
    }
    
}
