package Acesso_Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import Conexao.Conexao;
import Hierarquia.Cliente;

public class Cliente_Acesso {

    //Variaveis
    private int op;
    
    //SCANNERS
    private Scanner leitura_tela = new Scanner(System.in);

    

    //CADASTRO AO BANCO DE DADOS
    public void CadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO LISTA_CLIENTES (NOMECOMPLETO, CPF, IDADE, EMAIL, SENHA) VALUES(?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.Leitura_Nome());
            ps.setString(2, cliente.Leitura_CPF());
            ps.setInt(3, cliente.Leitura_Idade());
            ps.setString(4, cliente.Leitura_email());
            ps.setString(5, cliente.CriarSenha());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    //LOGIN BANCO DE DADOS
    public boolean Cliente_Login(Cliente cliente){
        
        String sql = "SELECT * FROM LISTA_CLIENTES WHERE EMAIL = ? AND SENHA = ?";
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = Conexao.getConexao();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.LogarEmail());
            ps.setString(2, cliente.LogarSenha());

            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("SEJA BEM VINDO DE VOLTA, LOGIN REALIZADO COM SUCESSO...");
                return true; // Login bem-sucedido

            } else {
                System.out.println("ERRO!!! EMAIL OU SENHA INVALIDOS...");
                return false; // Falha no login
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
    }
    
    //FAZER A RESERVAR
    public void CadastrarReserva(Cliente cliente){
        
        String sql = "INSERT INTO RESERVAS (MESA, NOME_CLIENTE, DATA_HORARIO) VALUES(?, ?, ?)"; 

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql );
            ps.setString(1, cliente.Leitura_Reserva());
            ps.setString(2, cliente.Nome_Reserva());
            LocalDateTime dataHora = cliente.Leitura_Data();
            ps.setTimestamp(3, Timestamp.valueOf(dataHora));

            ps.execute();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    //CONSULTAR A RESERVA
    private void ConsultarReserva(Cliente cliente){

        String sql = "SELECT * FROM RESERVAS WHERE MESA = ?, NOME_CLIENTE = ? AND DATA = ?";
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        
    }
}
    //FAZAR O PEDIDO


