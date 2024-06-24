import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Digite um número inteiro: ");
        valor1 = sc.nextInt();
        System.out.println("Digite um outro número: ");
        valor2 = sc.nextInt();

    

        if ((valor1+valor2) % 2 == 0){
            System.out.println("É multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
    
}
