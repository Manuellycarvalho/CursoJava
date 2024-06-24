import java.util.Scanner;

public class Aula35 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // ======= ESTRUTURA SIMPLES ========== //

        // int x = 5;

        // System.out.println("Bom Dia");


        // if (x > 0) { // Condição Verdadeira, então ele vai executar normalmente
        //     System.out.println("Boa Tarde");
        // } 
        
        // if (x < 0){ // Condição Falsa, então ele não executar nada dentro desse bloco
        //     System.out.println("Boa Tarde");
        // }

        // System.out.println("Boa Noite");

        
       // ======== ESTRUTURA COMPOSTA =========== //

        // int hora;

        // System.out.println("Quantas horas?");
        // hora = sc.nextInt();

        // if (hora < 12){
        //     System.out.println("Bom dia");
        // }

        // else{
        //     System.out.println("Boa Tarde");
        // }


        // ========== MAIS DE UMA CONDIÇÃO ============ //
        
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("Bom dia");
        }

        // else{
        //     if (hora < 18){
        //         System.out.println("Boa Tarde");
        //     }
        //     else{
        //         System.out.println("Boa Noite");
        //     }
        // } 

        // ========== MACETE =========// 

        else if (hora < 18){  // Apenas apagou as chave e colocou o if na mesma linha do else, então isso pode ser considerado um novo bloco
                System.out.println("Boa Tarde");
            }
            else{
                System.out.println("Boa Noite");
            }

        sc.close();
    }

    
}
