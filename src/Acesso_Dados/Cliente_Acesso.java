package Acesso_Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Conexao.Conexao;
import Hierarquia.Cliente;

public class Cliente_Acesso {

    //Variaveis
    int op;
    
    //SCANNERS
    Scanner leitura_tela = new Scanner(System.in);

    

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
        } /**finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
    
    //RESERVAR MESA
    public void CadastrarReserva(Cliente cliente){
        
        String sql = "INSERT INTO RESERVAS (MESA, NOME_CLIENTE, DATA) VALUES(?, ?, ?)"; 

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql );
            ps.setString(1, cliente.Leitura_Reserva());
            ps.setString(2, cliente.Nome_Reserva());
            ps.setString(3, cliente.Leitura_Data());

            ps.execute();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
    //FAZAR O PEDIDO


