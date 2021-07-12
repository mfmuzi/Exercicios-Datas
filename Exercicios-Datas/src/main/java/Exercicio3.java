import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio3 {
    //Converta a data atual no formato DD/MM/YYYY HH:MM:SS:MMM
    // cuidado com a pegadinha das letras maúsculas

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // 14/07/2019

    }
}
