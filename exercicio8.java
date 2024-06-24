import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double nota1;
        double nota2;
        double notaFinal;

        System.out.println("Digite a 1ª nota do aluno(a): ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a 2ª nota do aluno(a): ");
        nota2 = sc.nextDouble();

        notaFinal = nota1 + nota2;

        

        if (notaFinal > 60.00){
            System.out.println("Nota Final: " + notaFinal);
            System.out.println("Aprovado");

        }
        else if (notaFinal < 60.00){
            System.out.println("Nota Final: " + notaFinal);
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Não sei");
        }

        sc.close();
    }
    
}
