import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class lacosRepeticao {
    public static void ContRegressiva() {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite um número inteiro positivo: ");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.println("Número inválido! Por favor, insira um número inteiro positivo!\n");
            }
        } while (num < 0);
        System.out.println();
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void Notas() {
        Scanner teclado = new Scanner(System.in);
        double num = 0, soma = 0, media = 0;
        int cont = 0;

        while (num > 10 || num != -1) {
            System.out.println("Digite uma nota entre 0 e 10 (ou -1 para sair): ");
            num = teclado.nextDouble();

            if (num > 10 || num < -1) {
                System.out.println("O número informado está fora do escopo solicitado! Por favor, informe um número entre 0 e 10 (ou -1 para sair)\n");
            }

            if (num >= 0 && num <= 10) {
                soma += num;
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("Média das notas: " + Math.round(media * 100.0) / 100.0); //pequena gambiarra para arredondar o valor decimal
    }

    public static void Menu() {
        Scanner teclado = new Scanner(System.in);
        Date dataHora = new Date();
        int num;

        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHora);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHora);

        do {
            System.out.println("""
                    Menu:
                    1 - Exibir mensagem de boas-vindas
                    2 - Exibir data e hora atual
                    0 - Sair
                    """);
            System.out.println("Escolha uma opção: "); //print fora do de cima para evitar espaços desnecessários no console na hora de informar o número
            num = teclado.nextInt();

            if (num < 0 || num > 2) {
                System.out.println("A opção de menu selecionada é inválida! Por favor, insira uma opção de menu válida.\n");
            } else if (num == 1) {
                System.out.println("Bem-vindo ao sistema!\n");
            } else if (num == 2) {
                System.out.println("Data de hoje: " + data + "\nHorário atual: " + hora + "\n");
            }
        } while (num != 0);
    }

    public static void Tabuada() {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite um número para ver sua tabuada (1-10): ");
            num = teclado.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Não há tabuada para o número informado! Por favor, insira um número entre 1 e 10 para ver sua tabuada.\n");
            }

        } while (num < 1 || num > 10);

        System.out.println(); //apenas para pular linha do número selecionado
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void jogoAdivivinha() {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        int tentativa = 10;
        int numRand, cont = 0, guess = 0;
        String jogoNovo = "", guessString = "";
        boolean tratamento = true;

        numRand = r.nextInt(100) + 1;

        while (tentativa > 0 && guess != numRand || tratamento) {
            try {
                System.out.println("Tente adivinhar o número gerado pelo computador! Você tem " + tentativa + " tentativas. Boa Sorte!\n");
                System.out.println("Digite seu palpite (1-100): ");
                guessString = teclado.nextLine();
                guess = Integer.parseInt(guessString);
                tentativa--;
                cont++;

                if (guess == numRand) {
                    System.out.println("Bem demais padrin!\n" + "Usou só " + cont + " tentativa(s)!\n");
                    System.out.println("O número secreto era: " + numRand);

                    System.out.println("Deseja jogar novamente?: ");
                    jogoNovo = teclado.nextLine();

                    tratamento = (jogoNovo.equals("sim") || jogoNovo.equals("SIM") || jogoNovo.equals("s") || jogoNovo.equals("S"));
                    if (tratamento) {
                        tentativa = 5;
                        cont = 0;
                        guess = 0;
                        numRand = r.nextInt(10) + 1;
                        System.out.println("Reiniciando o jogo. Você tem " + tentativa + " tentativas.\n");
                    } else {
                        System.out.println("Até mais!\n");
                    }
                } else {
                    if (guess > numRand) {
                        System.out.println("O palpite é maior do que o número secreto!\n");
                    } else {
                        System.out.println("O palpite é menor do que o número secreto!\n");
                    }
                }

                if (tentativa == 0 && (guess != numRand)) {
                    System.out.println("Você esgotou todas as suas tentativas!\n");
                    System.out.println("O número secreto era: " + numRand);


                    System.out.println("Deseja jogar novamente?: ");
                    jogoNovo = teclado.nextLine();

                    tratamento = (jogoNovo.equals("sim") || jogoNovo.equals("SIM") || jogoNovo.equals("s") || jogoNovo.equals("S"));
                    if (tratamento) {
                        tentativa = 5;
                        cont = 0;
                        guess = 0;
                        numRand = r.nextInt(10) + 1;
                        System.out.println("Reiniciando o jogo. Você tem " + tentativa + " tentativas.\n");
                    } else {
                        System.out.println("Até mais!\n");
                    }
                }
            }catch(NumberFormatException e){
                System.out.println("Entrada inválida! Digite apenas números entre 1 e 100.");
            } catch(RuntimeException e){
                throw new RuntimeException(e);
            }
        }
    }
}
