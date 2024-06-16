package Hierarquia;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente extends Pessoas {
    private String Mesa;
    private String Pedido;
    private LocalDateTime DataHoraReserva;
    private String NomeReserva;
    private int op;

    //Scanner
    private Scanner LeituraTela_Cliente = new Scanner(System.in);
    
    //Atribuir Mesa
    public String Leitura_Reserva(){
        System.out.printf("Qual mesa deseja reservar: ");
        Mesa = LeituraTela_Cliente.nextLine();
        return Mesa;
    } 

    //Atribuir Data e Horário
    public LocalDateTime Leitura_Data(){
        System.out.printf("Data e horário da reserva (formato: ano-mes-dia hora:minutos): ");
        String dataHora = LeituraTela_Cliente.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DataHoraReserva = LocalDateTime.parse(dataHora, formatter);
        return DataHoraReserva;
    }

    public String Nome_Reserva(){
        System.out.printf("Nome: ");
        NomeReserva = LeituraTela_Cliente.nextLine();
        return NomeReserva;
    }
}

