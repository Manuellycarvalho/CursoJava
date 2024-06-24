import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double numero;

        double horaTrabalhada;

        double valorHora;

        double salario;

        System.out.println("Digite seu número: ");
        numero = sc.nextDouble();

        System.out.println("Digite as horas trabalhadas");
        horaTrabalhada = sc.nextDouble();

        System.out.println("Digite quanto recebe por horas trabalhadas: ");
        valorHora = sc.nextDouble();

        salario = horaTrabalhada * valorHora;

        System.out.printf("Número: %.0f%n " , numero);
        System.out.printf("Salário: %.2f%n " , salario);



         
        sc. close();
    }
    
}
