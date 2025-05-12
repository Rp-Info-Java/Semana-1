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

    public static void Comparacao(){
        int resultado1 = 8 + 2 * 5; //saída 1: 18
        int resultado2 = (8 + 2) * 5; //saída 2: 50
        int resultado3 = 100 / 10 + 5 * 2; //saída 3: 20
        int resultado4 = 100 / (10 + 5) * 2; //saída 4: 6,6666*2, mas é int, ent 12

        System.out.println("Resultados das expressões: ");
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        System.out.println("Resultado 4: " + resultado4);

        int resultadoAlt1 = 8 + (2 * 5);
        int resultadoAlt2 = (8 + 2) * 5;
        int resultadoAlt3 = (100 / 10) + (5 * 2);
        int resultadoAlt4 = (100 / (10 + 5)) * 2;

        System.out.println("\nResultados quando há a aplicação dos parênteses para explícita ordem de avaliação: ");
        System.out.println("Resultado 1: " + resultadoAlt1);
        System.out.println("Resultado 2: " + resultadoAlt2);
        System.out.println("Resultado 3: " + resultadoAlt3);
        System.out.println("Resultado 4: " + resultadoAlt4);

        //com os parênteses aplicados desta maneira, o código fica mais legível e facilita para o desenvolvedor entender a expressão lógica
        //todavia, os resultados continuam os mesmos

        //agora, se adicionarmos parênteses arbitráriamente nas equações originais, utilizando a regra de precedência, observa-se alteração nos resultados
        //abaixo será explicitado essa lógica

        int resultadoFinal1 = (8 + 2) * 5;
        int resultadoFinal2 = (8 + 2) * 5;
        int resultadoFinal3 = (100 / (10 + 5)) * 2;
        int resultadoFinal4 = 100 / ((10 + 5) * 2);

        System.out.println("\nAdicionando parênteses arbitrariamente sem alterar a equação original: ");
        System.out.println("Resultado 1: " + resultadoFinal1);
        System.out.println("Resultado 2: " + resultadoFinal2);
        System.out.println("Resultado 3: " + resultadoFinal3);
        System.out.println("Resultado 4: " + resultadoFinal4);

        //assim, fica explícito a importância da correta análise de precedência, já que qualquer parênteses pode mudar a ordem de priorizaçãop de execução

    }

    public static void ExpressaoComplexa(){
        int resultado = 10 - 2 * 3 + 4 / 2; //previsao: 6

        System.out.println("Resultado da equação: " + resultado);

        System.out.println("Escrevendo a equação de maneira explícita: int resultadoAlt = (10 - (2*3)) + (4/2)");

        int resultadoAlt = (10 - (2*3)) + (4/2);

        System.out.println("Resultado da reescrita da operação: " + resultadoAlt);

        //a ordem em que a expressão está sendo executada é: começa com a multiplicação (2*3), depois a divisão (4/2), em seguida a subtração de 10 pelo resultado da multiplicação
        //e por fim a soma desse resultado com a divisão de 4 por 2.
    }
}
