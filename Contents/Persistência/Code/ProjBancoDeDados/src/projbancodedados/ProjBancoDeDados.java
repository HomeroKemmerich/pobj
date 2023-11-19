package projbancodedados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProjBancoDeDados {

    public static void main(String[] args) {
        //testeInserirPessoa();
        //testeAlterarPessoa();
        //testeExcluirPessoa();
        testeListarPessoa();
    }

    private static void testeInserirPessoa() {
        try {
            Pessoa p = new Pessoa(3, "Joãozinho", 8000.0);
            // definir a instrução SQL - sintaxe SQL - ? sigifica um parâmetro
            String sql = "INSERT INTO pessoa (id, nome, salario) VALUES (?,?,?)";
            // Preparar a instução SQL para executar no BD
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            // setar os parâmetros para executar - pegar dados do objeto
            pst.setInt(1, p.getId());
            pst.setString(2, p.getNome());
            pst.setDouble(3, p.getSalario());
            // agora executar no banco o SQL já com os dados. 
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void testeListarPessoa() {
        try {
            // Definir a instrução SQL
            String sql = "SELECT * FROM pessoa;";
            // Agora pegar um statemant para executar a instrução
            Statement stm = Conexao.getStatement();
            // Agora executar o SQL no Statemant e pegar o resultado - REsultSet
            ResultSet rs = stm.executeQuery(sql);
            // Agora vamos percorrer o resultset e criar a lista de objetos 
            List<Pessoa> lista = new ArrayList<>();
            while(rs.next()){
               lista.add(new Pessoa(
                       rs.getInt("id"), 
                       rs.getString("nome"), 
                       rs.getDouble("salario")));
            }
            // nesse ponto já teremos todos os objetos na lista!!!
            // podemos percorrer a lista e usar os objetos
            for(Pessoa p : lista){
                System.out.println("id: "+p.getId()+" nome: "+p.getNome()); 
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    private static void testeAlterarPessoa() {
        try {
            Pessoa p = new Pessoa(2, "Beltrano alterado", 8000.0);
            // definir a instrução SQL - sintaxe SQL - ? sigifica um parâmetro
            String sql = "UPDATE pessoa SET nome=?, salario=? WHERE id=?";
            // Preparar a instução SQL para executar no BD
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            // setar os parâmetros para executar - pegar dados do objeto
            pst.setInt(3, p.getId());
            pst.setString(1, p.getNome());
            pst.setDouble(2, p.getSalario());
            // agora executar no banco o SQL já com os dados. 
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }       
    }

    private static void testeExcluirPessoa() {
        try {
            Pessoa p = new Pessoa(3, "Joãozinho", 8000.0);
            // definir a instrução SQL - sintaxe SQL - ? sigifica um parâmetro
            String sql = "DELETE FROM pessoa WHERE id=?";
            // Preparar a instução SQL para executar no BD
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            // setar os parâmetros para executar - pegar dados do objeto
            pst.setInt(1, p.getId());
            // agora executar no banco o SQL já com os dados. 
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }        
    }
    
}
