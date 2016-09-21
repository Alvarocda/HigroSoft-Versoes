package DAO;

import java.sql.Connection;
import model.EntidadeConexao;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.TelaCulturas;

public class CulturaDAO extends EntidadeConexao {
    private int idCulturaAgendada,diainicial,mesinicial,anoinicial,diafinal,mesfinal,anofinal,emAndamento,freqAgua,freqFert;
    private int idCulturaAtiva,status;
    String nomeDaCulturaAtiva;
    

    public void GravaCultura(String NomeCultura, int UmidadeMinima,String FrequenciaAgua, String FrequenciaFertilizante,String Usuario) throws SQLException {
        Connection conexao = Conecta();
        try {            
            Statement stmt = conexao.createStatement();
            String sql = "INSERT INTO culturas(nome_cultura,umidade_minima,usuario_que_adicionou,frequencia_agua,frequencia_fertilizante) VALUES('"+NomeCultura+"','"+UmidadeMinima+"','"+Usuario+"','"+FrequenciaAgua+"','"+FrequenciaFertilizante+"')";
            stmt.executeUpdate(sql);
            conexao.close();
            new TelaCulturas().AtualizaTabela();
            JOptionPane.showMessageDialog(null,"Cultura cadastrada com sucesso!");            
        } catch (SQLException e) {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar nova cultura"+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public DefaultTableModel AlimentaTabela() throws SQLException{
        Connection conexao = Conecta();
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Cultura");
        dm.addColumn("Umid. minima");
        dm.addColumn("Freq. Água");
        dm.addColumn("Freq. Fertilizante");
        String sql = "SELECT * FROM culturas";
        try{
            Statement stmt = conexao.createStatement();
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next()){
                String ID = rset.getString(1);
                String NomeCultura = rset.getString(2);
                int UmidadeMinima = rset.getInt(3);
                String FrequenciaAgua = rset.getString(5);
                String FrequenciaFertilizante = rset.getString(6);
                dm.addRow(new String[]{Integer.toString(UmidadeMinima),ID, NomeCultura,FrequenciaAgua,FrequenciaFertilizante});
            }
            conexao.close();
            return dm;
        }catch(SQLException e){
            conexao.close();
            JOptionPane.showMessageDialog(null, "Erro ao popular tabela");
        }
        return null;
    }
    public void AtualizaCultura(int ID, String NomeCultura, int UmidadeMinima) throws SQLException{
        String sql = "UPDATE culturas SET nome_cultura = '"+NomeCultura+"',umidade_minima = '"+UmidadeMinima+"' WHERE id_cultura ='"+ID+"'";
        Connection conexao = Conecta();
        try{
            Statement stmt = conexao.createStatement();
            stmt.execute(sql);
            conexao.close();
            JOptionPane.showMessageDialog(null, "Cultura atualizada com sucesso!");
        }catch(SQLException e){
            conexao.close();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cultura\nVerifique se a mesma ja não esta cadastrada");
        }
    }
    public void DeletaCultura(int ID) throws SQLException{
        String sql = "DELETE FROM agendamentos where id_cultura_agendada = '"+ID+"'";
        String sql2 = "DELETE FROM culturas where id_cultura = '"+ID+"'";
        Connection conexao = Conecta();
        try{
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        stmt.execute(sql2);
        conexao.close();
        JOptionPane.showMessageDialog(null, "Cultura deletada com sucesso!");
        }catch(SQLException e){
         conexao.close();
         JOptionPane.showMessageDialog(null, "Erro ao deletar cultura");
         System.out.println(e.getMessage());
         e.printStackTrace();
        }        
    }
    public void insereAgendamento(String UsuarioQueAgendou,int id_da_cultura, int diaInicial, int mesInicial,int anoInicial, int diaFinal, int mesFinal, int anoFinal) throws SQLException{
        Connection conexao = Conecta();
        try{
            Statement stmt = conexao.createStatement();
            String sql = "INSERT INTO agendamentos(id_cultura_agendada,dia_inicial,mes_inicial,dia_final,mes_final,usuario_que_agendou,ano_inicial,ano_final) "
                    + "VALUES('"+id_da_cultura+"','"+diaInicial+"','"+mesInicial+"','"+diaFinal+"','"+mesFinal+"','"+UsuarioQueAgendou+"','"+anoInicial+"','"+anoFinal+"')";
            stmt.executeUpdate(sql);
            conexao.close();
            JOptionPane.showMessageDialog(null, "Agendamento registrado com sucesso!");
        }catch(SQLException e){
            conexao.close();
            JOptionPane.showMessageDialog(null, "Falha ao agendar");
        }
    }
    /*public void retornaCulturaAtiva()throws SQLException{
        try{
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "SELECT id_cultura_ativa,status,nome_cultura FROM culturas,culturas_ativas WHERE id_cultura_ativa = id_cultura and status = '1'";
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.next()){
                setIdCulturaAtiva(rset.getInt(1));
                setStatus(rset.getInt(2));
                setNomeDaCulturaAtiva(rset.getString(3));
            }
            conexao.Conecta().close();
            System.out.println(idCulturaAtiva+"\n"+status+"\n"+nomeDaCulturaAtiva);
        }catch(SQLException e){
            conexao.Conecta().close();
        }
    }*/
    /*public void RegistraCulturaAtiva(int id_cultura_ativa, String usuario_que_agendou)throws SQLException{
        try{
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "INSERT INTO culturas_ativas(id_cultura_ativa,usuario_que_ativou,status) VALUES('"+id_cultura_ativa+"','"+usuario_que_agendou+"','1')";
            stmt.executeUpdate(sql);
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Cultura ativada com sucesso!");
        }catch(SQLException e){
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Falha ao ativar cultura(SQL)");
            System.out.println(""+e.getMessage());
        }
    }*/
    /*public void RegistraCulturaDesativada(int id_cultura, String userQueDesativou)throws SQLException{
        try{
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "UPDATE culturas_ativas SET status ='0' WHERE id_cultura_ativa = '"+id_cultura+"'";
            stmt.execute(sql);
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Cultura desativada com sucesso!");
        }catch(SQLException e){
            conexao.Conecta().close();
            JOptionPane.showMessageDialog(null, "Falha ao desativar cultura(SQL)");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }*/

    /*public void retornaInformacoesDoAgendamento()throws SQLException{
        try{
            
            Statement stmt = conexao.Conecta().createStatement();
            String sql = "SELECT id_cultura_agendada,dia_inicial,mes_inicial,ano_inicial,dia_final,mes_final,ano_final,em_andamento,frequencia_agua,frequencia_fertilizante FROM agendamentos,culturas WHERE em_adamento= '1' and id_cultura_agendada = id_cultura";
            ResultSet rset = stmt.executeQuery(sql);
            while(rset.first()){
                idCulturaAgendada = rset.getInt(1);
                diainicial        = rset.getInt(2);
                mesinicial        = rset.getInt(3);
                anoinicial        = rset.getInt(4);
                diafinal          = rset.getInt(5);
                mesfinal          = rset.getInt(6);
                anofinal          = rset.getInt(7);
                emAndamento       = rset.getInt(8);
                freqAgua          = rset.getInt(9);
                freqFert          = rset.getInt(10);
            }
            conexao.Conecta().close();
        }catch(SQLException e){
            conexao.Conecta().close();
        }
    }*/
    

    public int getFreqAgua() {
        return freqAgua;
    }

    public void setFreqAgua(int freqAgua) {
        this.freqAgua = freqAgua;
    }

    public int getFreqFert() {
        return freqFert;
    }

    public void setFreqFert(int freqFert) {
        this.freqFert = freqFert;
    }

    public int getIdCulturaAtiva() {
        return idCulturaAtiva;
    }

    public void setIdCulturaAtiva(int idCulturaAtiva) {
        this.idCulturaAtiva = idCulturaAtiva;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNomeDaCulturaAtiva() {
        return nomeDaCulturaAtiva;
    }

    public void setNomeDaCulturaAtiva(String nomeDaCulturaAtiva) {
        this.nomeDaCulturaAtiva = nomeDaCulturaAtiva;
    }
    
    public int getIdCulturaAgendada() {
        return idCulturaAgendada;
    }

    public void setIdCulturaAgendada(int idCulturaAgendada) {
        this.idCulturaAgendada = idCulturaAgendada;
    }

    public int getDiainicial() {
        return diainicial;
    }

    public void setDiainicial(int diainicial) {
        this.diainicial = diainicial;
    }

    public int getMesinicial() {
        return mesinicial;
    }

    public void setMesinicial(int mesinicial) {
        this.mesinicial = mesinicial;
    }

    public int getAnoinicial() {
        return anoinicial;
    }

    public void setAnoinicial(int anoinicial) {
        this.anoinicial = anoinicial;
    }

    public int getDiafinal() {
        return diafinal;
    }

    public void setDiafinal(int diafinal) {
        this.diafinal = diafinal;
    }

    public int getMesfinal() {
        return mesfinal;
    }

    public void setMesfinal(int mesfinal) {
        this.mesfinal = mesfinal;
    }

    public int getAnofinal() {
        return anofinal;
    }

    public void setAnofinal(int anofinal) {
        this.anofinal = anofinal;
    }

    public int getEmAndamento() {
        return emAndamento;
    }

    public void setEmAndamento(int emAndamento) {
        this.emAndamento = emAndamento;
    }

    
}
