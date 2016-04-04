package DAO;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.EntidadeConexao;
import view.AutenticaLogin;
import view.Principal;
import view.RegistroUsuario;

public class UsuarioDAO {
    EntidadeConexao Conexao = new EntidadeConexao();    
    public void Autenticacao(String Email, String Senha) throws SQLException {
        Statement stmt = Conexao.Conecta().createStatement();
        String sql = "SELECT * FROM usuario WHERE email ='" + Email + "' AND senha ='" + Senha + "'";
        stmt.execute(sql);
        ResultSet rs = stmt.getResultSet();
        AutenticaLogin Login = new AutenticaLogin();
        if (rs.next() == true) {                      
            new Principal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário e Senha invalida");
            new AutenticaLogin().setVisible(true);            
        }
    }
    
    public void CriaNovoUsuario(String Email, String Senha)throws SQLException {        
        try{
            Statement stmt = Conexao.Conecta().createStatement();
            String sql = "INSERT INTO usuario(email,senha) VALUES ('"+Email+"','"+Senha+"')";
            stmt.executeUpdate(sql);
            Conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Usuario registrado com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Usuario ja existente");
            Conexao.Conecta().close();
            new RegistroUsuario().setVisible(true);
        }
    }
}
