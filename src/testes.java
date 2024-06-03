import java.util.Calendar;


public class testes {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Data e Hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Dia do mês: "+c.get(Calendar.DAY_OF_MONTH));
    }
}
