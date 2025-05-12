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

    public static void ClassificaNota(){
        Scanner teclado = new Scanner(System.in);
        int num;

        do{
            System.out.println("Digite a nota a ser classificada (0 a 100): ");
            num = teclado.nextInt();

            if(num >= 90 && num <= 100){
                System.out.println("Classificação da nota: A");
            }else if(num >= 80 && num <= 89){
                System.out.println("Classificação da nota: B");
            }else if(num >= 70 && num <= 79){
                System.out.println("Classificaçãao da nota: C");
            }else if(num >= 60 && num <= 69){
                System.out.println("Classificação da nota: D");
            }else if (num < 60){
                System.out.println("Classificação da nota: F");
            }else{
                System.out.println("A nota inserida não é válida, digite novamente uma nota entre 0 e 100!\n");
            }

        }while (num > 100);
    }
}
