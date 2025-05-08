import java.time.LocalDate;
import java.util.Currency;
import java.util.Date;
import java.util.Scanner;


public class ProjetoInicio {

    public static void Aula1() {

        Integer idade = 0;
        String nome = "";
        String cidade = "2";
        double salario = 0D;
        Currency algo;
        Boolean i;
        Date data = new Date();
        LocalDate data2 = LocalDate.now();
        long numero = 0;

        System.out.println(Integer.parseInt(cidade)); //sempre usar variável maiuscula pra parse
        System.out.println(data + "\n" + data2);
    }

    public static void Exercicio1(){ //Conversao de string para int e double
        Scanner teclado = new Scanner(System.in);
        String num1 = "";
        String num2 = "";
        int numInt1;
        int numInt2;
        double numDouble1;
        double numDouble2;

        System.out.println("Insira dois números: ");
        num1 = teclado.nextLine();
        num2 = teclado.nextLine();

        //de string pra int e double
        numInt1 = Integer.parseInt(num1);
        numInt2 = Integer.parseInt(num2);

        numDouble1 = Double.parseDouble(num1);
        numDouble2 = Double.parseDouble(num2);

        System.out.println("Conversão String para int:\n" + "Número 1: " + numInt1 + "\n" + "Número 2: " + numInt2);

        System.out.println("Conversão String para double:\n" + "Número 1: " + numDouble1 + "\n" + "Número 2: " + numDouble2 + "\n");
    }

    public static void Exercicio2(){
        Scanner teclado = new Scanner(System.in);
        String palavra;
        Boolean palavraConvertida;

        System.out.println("Insira true ou false: ");
        palavra = teclado.nextLine();

        //Conversão
        palavraConvertida = Boolean.parseBoolean(palavra);

        if(palavraConvertida) {
            System.out.println("A palavra convertida é igual a true");
        }else {
            System.out.println("A palavra convertida é igual a false");
        }
    }
}
