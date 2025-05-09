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

        System.out.println("Soma dos números int: " + numInt1 + "+" + numInt2 + "= " + (numInt1 + numInt2));
        System.out.println("Subtração dos números int: " + numInt1 + "-" + numInt2 + "= " + (numInt1 - numInt2));
        System.out.println("Multiplicação dos números int: " + numInt1 + "*" + numInt2 + "= " + (numInt1 * numInt2));
        System.out.println("Divisão dos números int: " + numInt1 + "/" + numInt2 + "= " + (numInt1 / numInt2) + "\n");

        System.out.println("|------------------------------------------------------------|\n");

        System.out.println("Soma dos números double: " + numDouble1 + "+" + numDouble2 + "= " + (numDouble1 + numDouble2));
        System.out.println("Subtração dos números double: " + numDouble1 + "-" + numDouble2 + "= " + (numDouble1 - numDouble2));
        System.out.println("Multiplicação dos números double: " + numDouble1 + "*" + numDouble2 + "= " + (numDouble1 * numDouble2));
        System.out.println("Divisão dos números double: " + numDouble1 + "/" + numDouble2 + "= " + (numDouble1 / numDouble2));
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

    public static void Exercicio3(){
        Scanner teclado = new Scanner(System.in);
        String palavra;

        System.out.println("Insira uma palavra: ");
        palavra = teclado.nextLine();

        for(int i = 0; i < palavra.length(); i++){
            System.out.println("Extração do caractere " + i + ": " + palavra.charAt(i));
        }
    }

    public static void Exercicio4(){
        Scanner teclado = new Scanner(System.in);
        double numDouble = 21.5;
        double aux = 0D;

        int numInt = (int)numDouble;
        int resto;

        aux = numDouble*10;
        resto = (int)aux%10;

        System.out.println("Dígito double: " + numDouble + "\n" + "Dígito double convertido para int: " + numInt + "\nParte decimal do dígito: " + resto);
    }

    public static void Exercicio5(){
        String palavra = "abc";
        double palavraConvert;

        try {
            palavraConvert = Double.parseDouble(palavra);
        }catch (Exception e){
            System.err.println("Erro: " + e + "\nA conversão para Double não pode ser realizada pois espera uma String contendo números, e recebe uma String contendo letras! Tente uma nova conversão.");
        }
    }

    public static void CalculadoraIMC(){
        Scanner teclado = new Scanner(System.in);
        String pesoString, alturaString;
        double peso, altura, IMC;
        String classificacao = "";

        System.out.println("Caluladora de IMC\n" + "Por favor, informe seu peso (em kg): ");
        pesoString = teclado.nextLine();
        System.out.println("Agora, informe sua altura (em metros): ");
        alturaString = teclado.nextLine();

        peso = Double.parseDouble(pesoString);
        altura = Double.parseDouble(alturaString);

        IMC = peso/(altura*altura);

        System.out.println("\nTabela de IMC");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-25s %20s %20s%n", "IMC", "Classificação", "   Risco de Comorbidade");
        System.out.println("-------------------------------------------------------------------------");

        System.out.printf("%-25s %20s %20s%n", "Inferior a 18,5", "Baixo peso", "Baixo");
        System.out.printf("%-25s %20s %20s%n", "18,5 a 24,9", "Normal", "Normal");
        System.out.printf("%-25s %20s %20s%n", "25 a 29,9", "Sobrepeso", "Aumentado");
        System.out.printf("%-25s %20s %20s%n", "30 a 34,9", "Obesidade", "Moderado");
        System.out.printf("%-25s %20s %20s%n", "35 a 39,9", "Obesidade Severa", "Grave");
        System.out.printf("%-25s %20s %20s%n", "Superior a 40", "Obesidade Mórbida", "Muito Grave");
        System.out.println("--------------------------------------------------------------------------\n");

        if(IMC<18.5){
            classificacao = "Baixo peso";
        } else if (IMC>=18.5 && IMC <= 24.9) {
            classificacao = "Normal";
        }else if (IMC>=25 && IMC <= 29.9) {
            classificacao = "Sobrepeso";
        }else if (IMC>=30 && IMC <= 34.9) {
            classificacao = "Obesidade";
        }else if (IMC>=35 && IMC <= 39.9) {
            classificacao = "Obesidade Severa";
        }else if (IMC>=40) {
            classificacao = "Obesidade Mórbida";
        }

        System.out.println("Calculando o IMC: IMC = peso / (altura * altura)\n");
        System.out.printf("Seu IMC: %.2f%nSua Classificação: %s%n", IMC, classificacao);

    }

    public static void Variaveis(){
        Scanner teclado = new Scanner(System.in);
        String nome = "", estudante = "";
        int idade;
        double altura;

        System.out.println("Coleta de dados\n" + "Informe seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Agora, informe sua idade: ");
        idade = teclado.nextInt();
        teclado.nextLine(); //para limpar o buffer

        System.out.println("Por favor, informe sua altura em metros (escreva com vírgula): ");
        altura = teclado.nextDouble();
        teclado.nextLine(); //limpando o buffer

        System.out.println("Você é estudante?");
        estudante = teclado.nextLine();

        System.out.println("\nImprimindo informações do usuário");
        System.out.println("--------------------------------------");
        System.out.println("Nome do usuário: " + nome + "\nIdade: " + idade + " anos" + "\nAltura: " + altura + "(m)" + "\nÉ estudante? Resposta: " + estudante);

    }

    public static void VarOperations(){
        int num1 = 22, num2 = -4;

        System.out.println("Cálculos simples com números inteiros\n" + "Número 1: " + num1 + "\nNúmero 2: " + num2);
        System.out.println("\nSoma dos números: " + (num1+num2));
        System.out.println("Subtração dos números: " + (num1 - num2));
        System.out.println("Multiplicação dos números: " + (num1 * num2));
        System.out.println("Divisão dos números (apenas o valor inteiro da divisão é apresentado): " + (num1 / num2));
    }

    public static void StringManipulation(){
        String palavra = "Veritas lux mea";

        System.out.println("String escolhida: " + palavra);
        System.out.println("String com letras minúsculas: " + palavra.toLowerCase());
        System.out.println("String com letras maiúsculas: " + palavra.toUpperCase());
        System.out.println("Número de caracteres da String: " + palavra.length());
    }
}
