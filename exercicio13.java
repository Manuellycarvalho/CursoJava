import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Inicio;
        double Final;
        double JogoTotal;


        System.out.println("Digite a hora que o jogo começou: ");
        Inicio = sc.nextDouble();
        System.out.println("Digite a hora que o jogo terminou: ");
        Final = sc.nextDouble();


        if (Inicio < Final){
            JogoTotal = Final - Inicio;
        }
        else{
           JogoTotal = 24 - Inicio + Final;

        }

        System.out.println("O jogo durou " + JogoTotal + " Hora(s)");

        sc.close();
    }
    
}
