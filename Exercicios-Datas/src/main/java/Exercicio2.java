
import java.util.Calendar;


public class Exercicio2 {
    //Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados.
    //Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira.
    // Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.


    public static void main(String[] args) {

        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.set(2021, Calendar.JULY, 8, 0, 0, 0);
        long vencimento = dataVencimento.getTimeInMillis();
        System.out.printf("A data de vencimento da fatura será: " + "%tc\n", vencimento);

        dataVencimento.add(Calendar.DATE, 10);

        if (dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            dataVencimento.add(Calendar.DATE, 1);
            System.out.println("Você poderá pagar a fatura sem juros até dia: " + dataVencimento.getTime()+1);
        } else if (dataVencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            dataVencimento.add(Calendar.DATE, 2);
            System.out.println("Você poderá pagar a fatura sem juros até dia: " + dataVencimento.getTime()+2);
        }
    }
}

