import java.util.Scanner;

public class expressoesLogicas {

    public static void Previsao(){
        int resultado1 = 10 + 5 * 2; //previsao 1: 20
        int resultado2 = (10 + 5) * 2; //previsao 2: 30
        int resultado3 = 20 / 5 + 3 * 2; //previsao 3: 10
        int resultado4 = 20 / (5 + 3) * 2; //previsao 4: 2,5*2 = 5, como é int, 4
        int resultado5 = 2 + 3 * 4 - 5; //previsao 5: 9

        System.out.println("Programa para verificar se as previsões dos cálculos das expressões lógicas estão corretas:\n");
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Resultado 4: " + resultado4);
        System.out.println("Resultado 5: " + resultado5);
    }
}
