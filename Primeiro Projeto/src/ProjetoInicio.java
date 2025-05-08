import java.time.LocalDate;
import java.util.Currency;
import java.util.Date;

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
}
