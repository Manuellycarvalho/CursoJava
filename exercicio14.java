import java.util.Locale;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double codigo;
        double quantidade;
        double valorCompra;


        System.out.println("Digite o código do produto: ");
        codigo = sc.nextDouble();

        System.out.println("Digite a quantidade deste produto: ");
        quantidade = sc.nextDouble();

        if (codigo == 1){
            valorCompra = 4.00 * quantidade; 
            System.out.println("Total: " + valorCompra);
        }

        else if (codigo == 2){
            valorCompra = 4.50 * quantidade;
            System.out.printf("Total: %.2f " , valorCompra);
        }

        else if (codigo == 3){
            valorCompra = 5.00 * quantidade;
            System.out.printf("Total: %.2f%n", valorCompra);
        }
        else if (codigo == 4){
            valorCompra = 2.00 * quantidade;
            System.out.printf("Total: %.2f%n", valorCompra);
        }

        else{
           valorCompra = 1.5 * quantidade;
           System.out.printf("Total %.2f%n");
        }

        

        

        sc.close();
    }
    
}
