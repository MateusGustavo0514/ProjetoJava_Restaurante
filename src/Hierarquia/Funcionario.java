package Hierarquia;

public class Funcionario extends Pessoas {
    String Cargo;

    public String LeituraCargo(){
        System.out.printf("Insira seu cargo: ");
        Cargo = leitura.next();
        return Cargo;
    }
}
