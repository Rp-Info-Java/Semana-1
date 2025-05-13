import java.util.Scanner;

public class lacosRepeticao {
    public static void ContRegressiva(){
        Scanner teclado = new Scanner(System.in);
        int num;

        do{
            System.out.println("Digite um número inteiro positivo: ");
            num = teclado.nextInt();

            if(num < 0){
                System.out.println("Número inválido! Por favor, insira um número inteiro positivo!\n");
            }
        }while(num < 0);
        System.out.println();
        for(int i=num; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void Notas(){
        Scanner teclado = new Scanner(System.in);
        double num = 0, soma = 0, media = 0;
        int cont = 0;

        while(num != -1){
            do{
                System.out.println("Digite uma nota entre 0 e 10 (ou -1 para sair): ");
                num = teclado.nextDouble();

                if(num > 10 || num < -1){
                    System.out.println("O número informado está fora do escopo solicitado! Por favor, informe um número entre 0 e 10 (ou -1 para sair)\n");
                }
            }while(num > 10 || num < -1);

            if(num > 0){
                soma += num;
                cont++;
            }
        }
        media = soma/cont;
        System.out.println("Média das notas: " + Math.round(media*100.0)/100.0); //pequena gambiarra para arredondar o valor decimal
    }
}
