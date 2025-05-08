import java.time.LocalDate;
import java.util.Currency;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

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
        System.out.println(data + "\n" + data2 + "\n");


    }
}