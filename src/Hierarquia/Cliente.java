package Hierarquia;

import java.util.Scanner;

public class Cliente extends Pessoas {
    String Mesa;
    String Pedido;
    String Horario;
    String NomeReserva;
    int op;

    //Scanner
    Scanner LeituraTela_Cliente = new Scanner(System.in);
    
    //Atribuir Mesa
    public String Leitura_Reserva(){
        System.out.printf("Qual mesa deseja reservar: ");
        Mesa = LeituraTela_Cliente.nextLine();
        return Mesa;
    } 

    //Atribuir Data e Horário
    public String Leitura_Data(){
        System.out.printf("Horário da reserva: ");
        Horario = LeituraTela_Cliente.nextLine();
        return Horario;
    }

    public String Nome_Reserva(){
        System.out.printf("Nome: ");
        NomeReserva = LeituraTela_Cliente.nextLine();
        return NomeReserva;
    }
}

