import java.util.Scanner;


public class Condicionais {

    public static void VerificacaoNum(){
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = teclado.nextInt();

        if(num > 0){
            System.out.println("O número informado é positivo.");
        }else if (num < 0){
            System.out.println("O número informado é negativo.");
        } else {
            System.out.println("O número informado é zero.");
        }
    }

}
