/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projbancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author JaqsonUpf
 */
public class Conexao {

    private static Connection con = null;
    
    public Conexao() {
    }

    public static Statement getStatement() throws Exception{
        if (con == null){
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/aulapoo";
            con = DriverManager.getConnection(url,"postgres","masterkey");
        }
        return con.createStatement();
    }
    
    public static PreparedStatement getPreparedStatement(String sql) throws Exception{
        if (con == null){
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/aulapoo";
            con = DriverManager.getConnection(url,"postgres","masterkey");
        }
        return con.prepareStatement(sql);
    }    
    
}
