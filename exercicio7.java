import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A;
        double B;
        double C;
        double triangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;


        System.out.println("Digite o 1º número decimal:  ");
        A = sc.nextDouble();
        System.out.println("Digite o 2º número decimal: ");
        B = sc.nextDouble();
        System.out.println("Digite o 3º número decimal: ");
        C = sc.nextDouble();

        triangulo = (A * C)/2;
        circulo = 3.14159 * Math.pow(C, 2);
        trapezio = (C*(A + B))/2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;



        System.out.printf("Triângulo: %.3f%n ", triangulo);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado:  %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n ", retangulo);

        sc.close();
    }
    
}
