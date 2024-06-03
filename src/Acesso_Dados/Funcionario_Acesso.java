package Acesso_Dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Conexao.Conexao;
import Hierarquia.Funcionario;

public class Funcionario_Acesso {

    public void CadastrarFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO LISTA_FUNCIONARIOS (NOMECOMPLETO, CPF, IDADE, EMAIL, SENHA, CARGO) VALUES(?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

         try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, funcionario.Leitura_Nome());
            ps.setString(2, funcionario.Leitura_CPF());
            ps.setInt(3, funcionario.Leitura_Idade());
            ps.setString(4, funcionario.Leitura_email());
            ps.setString(5, funcionario.CriarSenha());
            ps.setString(6, funcionario.LeituraCargo());

            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }

    public boolean Funcionario_Login(Funcionario funcionario){

        String sql = "SELECT FROM LISTA_FUNCIONARIOS WHERE EMAIL = ? AND SENHA = ?";
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = Conexao.getConexao();
            ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.LogarEmail());
            ps.setString(2, funcionario.LogarSenha());

            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("DE VOLTA AO TRABALHO :) LOGIN REALIZADO COM SUCESSO...s");
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
}
