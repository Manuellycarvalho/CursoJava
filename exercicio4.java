import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int diferenca;

        System.out.println("Digite o 1º número inteiro: ");
        A = sc.nextInt();
        
        System.out.println("Digite 2º número inteiro:  ");
        B = sc.nextInt();

        System.out.println("Digite 3º número inteiro: ");
        C = sc.nextInt();

        System.out.println("Digite 4º número inteiro: ");
        D = sc.nextInt();

        diferenca = A * B - C * D;

        System.out.println("A diferença é " + diferenca);

        sc.close();
    }
    
}
