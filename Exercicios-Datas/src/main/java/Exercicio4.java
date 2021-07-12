import java.time.LocalDateTime;


public class Exercicio4 {
    //adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00.


   public static void main (String [] args){


        LocalDateTime passado = LocalDateTime.of(2010, 5, 15, 10, 0, 0);

        System.out.println(passado);

        LocalDateTime futuro = passado.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);
    }

}