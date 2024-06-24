import java.util.Locale;
import java.util.Scanner;


public class exercicio1{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Digite o valor do comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite o preço desse terreno: ");
        double preco = sc.nextDouble();
        
        double area = largura * comprimento;

        double precoTotal = area * preco;

        System.out.printf("Area: %.2f%n " , area);
        System.out.printf("Preço: %.2f%n ", precoTotal );

        sc.close();
    }
}