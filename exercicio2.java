import java.util.Scanner;

import javax.swing.text.Style;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma;

        System.out.println("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um outro número inteiro: ");
        int num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("A soma desse resulta nesse valor: " + soma);

        



        sc.close();
    }
    
}
