package DAO;

import model.EntidadeConexao;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.TelaCulturas;

public class CulturaDAO {

    EntidadeConexao conexao = new EntidadeConexao();

    public void GravaCultura(String NomeCultura, int UmidadeMinima,String FrequenciaAgua, String FrequenciaFertilizante,String Usuario) throws SQLException {
        try {
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "INSERT INTO culturas(nome_cultura,umidade_minima,usuario_que_adicionou,frequencia_agua,frequencia_fertilizante) VALUES('"+NomeCultura+"','"+UmidadeMinima+"','"+Usuario+"','"+FrequenciaAgua+"','"+FrequenciaFertilizante+"')";
            stmt.executeUpdate(sql);
            conexao.Conecta().close();
            new TelaCulturas().AtualizaTabela();
            JOptionPane.showMessageDialog(null,"Cultura cadastrada com sucesso!");            
        } catch (SQLException e) {
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar nova cultura"+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public DefaultTableModel AlimentaTabela() throws SQLException{
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Cultura");
        dm.addColumn("Umid. minima");
        dm.addColumn("Freq. Água");
        dm.addColumn("Freq. Fertilizante");
        String sql = "SELECT * FROM culturas";
        try{
            Statement stmt = conexao.Conecta().createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next()){
                String ID = rset.getString(1);
                String NomeCultura = rset.getString(2);
                int UmidadeMinima = rset.getInt(3);
                String FrequenciaAgua = rset.getString(5);
                String FrequenciaFertilizante = rset.getString(6);
                dm.addRow(new String[]{Integer.toString(UmidadeMinima),ID, NomeCultura,FrequenciaAgua,FrequenciaFertilizante});
            }
            conexao.Conecta().close();
            return dm;
        }catch(SQLException e){
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Erro ao popular tabela");
        }
        return null;
    }
    public void AtualizaCultura(int ID, String NomeCultura, int UmidadeMinima) throws SQLException{
        String sql = "UPDATE culturas SET nome_cultura = '"+NomeCultura+"',umidade_minima = '"+UmidadeMinima+"' WHERE id_cultura ='"+ID+"'";
        try{
            Statement stmt = conexao.Conecta().createStatement();
            stmt.execute(sql);
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Cultura atualizada com sucesso!");
        }catch(SQLException e){
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cultura\nVerifique se a mesma ja não esta cadastrada");
        }
    }
    public void DeletaCultura(int ID) throws SQLException{
        String sql = "DELETE FROM culturas where id_cultura = '"+ID+"'";
        try{
        Statement stmt = conexao.Conecta().createStatement();
        stmt.execute(sql);
        conexao.Conecta().close();
        JOptionPane.showMessageDialog(null, "Cultura deletada com sucesso!");
        }catch(SQLException e){
         conexao.Conecta().close();
         JOptionPane.showMessageDialog(null, "Erro ao deletar cultura");
        }        
    }
    public void insereAgendamento(String UsuarioQueAgendou,int id_da_cultura, int diaInicial, int mesInicial, int diaFinal, int mesFinal) throws SQLException{
        try{
            Statement stmt = this.conexao.Conecta().createStatement();
            String sql = "INSERT INTO agendamentos(id_cultura_agendada,dia_inicial,mes_inicial,dia_final,mes_final,usuario_que_agendou) "
                    + "VALUES('"+id_da_cultura+"','"+diaInicial+"','"+mesInicial+"','"+diaFinal+"','"+mesFinal+"','"+UsuarioQueAgendou+"')";
            stmt.executeUpdate(sql);
            this.conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Agendamento registrado com sucesso!");
        }catch(SQLException e){
            this.conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Falha ao agendar");
        }
    }
}
