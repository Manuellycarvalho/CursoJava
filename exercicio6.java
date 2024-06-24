import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1;
        int numeroDePeca1;
        double valorPeca1;
        int codigo2;
        int numeroDePeca2;
        double valorPeca2;
        double valorTotal;

        System.out.println("Digite o código da peça 1: ");
        codigo1 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        numeroDePeca1 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        valorPeca1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        codigo2 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        numeroDePeca2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        valorPeca2 = sc.nextDouble();

        valorTotal = valorPeca1 * numeroDePeca1 + valorPeca2 * numeroDePeca2;

        System.out.printf("Os códigos do produtos sao: %d e %d%n" , codigo1, codigo2);
        System.out.printf("Valor a pagar: %.2f", valorTotal);

        sc.close();
    }
    
}
