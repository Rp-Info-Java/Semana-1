import java.sql.SQLOutput;
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

    public static void MenuOps(){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, opcao = 0;
        double div;

        do {
                System.out.println("""
                        Escolha uma operação:
                        1. Soma
                        2. Subtração
                        3. Multiplicação
                        4. Divisão
                        """);
                System.out.println("Opção: ");
                opcao = teclado.nextInt();

                if(opcao < 1 || opcao > 4){
                    System.out.println("Opção inválida, digite uma opção válida (1 - 4)!\n");
                }

        }while (opcao < 1 || opcao > 4) ;

            System.out.println("Digite o primeiro número: ");
            num1 = teclado.nextInt();

            System.out.println("Digite o segundo número: ");
            num2 = teclado.nextInt();

            div = (double) num1 / (double) num2;

            switch (opcao) {
                case 1:
                    System.out.println("Resultado da Soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado da Subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado da Multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Resultado da Divisão: " + div);
                    break;
            }
    }
}

