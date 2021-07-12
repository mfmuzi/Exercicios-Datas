import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Exercicio1 {
    //Descubra o TimeInMillis do dia em que você nasceu.
    // Converta em um objeto Date.
    // Verifique se ele é anterior ou posterior a 15 de maio de 2010.

    public static void main (String [] args){

        //encontrar o número epoch

        Calendar data = Calendar.getInstance();
        data.set(1989, Calendar.AUGUST, 4, 20,30,0);
        long niver = data.getTimeInMillis();
        System.out.println(niver);

        //epoch 618276600623

        //Converter em objeto Date

        Date meuNiver = new Date(618276600623L);
        System.out.println(meuNiver);
        // Fri Aug 04 20:30:00 BRT 1989

        Instant instant = meuNiver.toInstant();
        System.out.println(instant);
        // 1989-08-04T23:30:00.623Z

        //comparar com 15 de maio de 2010

        Calendar outraData = Calendar.getInstance();
        outraData.set(2010, Calendar.MAY, 15,0,0,0);
        long novaData = outraData.getTimeInMillis();
        System.out.println(novaData);

        //epoch 1276644600711


        Date dataComparar = new Date(1276644600711L);

        int compareCase1 = dataComparar.compareTo(meuNiver); //4 de agosto de 1989 -> 15 de maio de 2010

        int compareCase2 = meuNiver.compareTo(dataComparar); //15 de maio de 2010 -> 4 de agosto de 1989


        System.out.println(compareCase1); // 1

        System.out.println(compareCase2); // -1


    }
}
