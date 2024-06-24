import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor1;
        double area;

        System.out.println("Digite o valor do raio do circulo: ");
        valor1 = sc.nextDouble();

        area =3.14159 * Math.pow(valor1, 2);

        System.out.printf("A área do circulo é: %.4f%n " , area);

        sc.close();
    }
    
}
