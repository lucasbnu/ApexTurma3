package SA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class geraSQL {
    private String Aspa = "'";
    Connection Conn;
    
        public geraSQL(){
        try {
            String textoConexao = "jdbc:mysql://localhost:3306/mercado?user=root&password=";
            Conn = DriverManager.getConnection(textoConexao);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public String getValorAspas(Campo Campo) {

        if (Campo.tipo == String.class || Campo.tipo == Character.class) {
            return Aspa + Campo.valor().toString() + Aspa;
        } else {
            return Campo.valor().toString();
        }
    }

    public boolean Insert(Tabela table) {
        String sql = "INSERT INTO " + table.nome + " (";
        for (Campo Campo : table.campos) {
            if (Campo.chavePrimaria) {
                continue;
            }
            sql += Campo.nome + ",";
        }
        sql = sql.substring(0, sql.length() - 1);
        sql += ") VALUES (";
        for (Campo Campo : table.campos) {
            if (Campo.chavePrimaria) {
                continue;
            }
            sql += getValorAspas(Campo) + ",";
        }
        sql = sql.substring(0, sql.length() - 1);
        sql += ")";
        try {
            Statement stmt = Conn.createStatement();
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Update(Tabela table) {
        String sql = "UPDATE " + table.nome + " SET ";
        for (Campo Campo : table.campos) {
            if (Campo.chavePrimaria) {
                continue;
            }
            sql += Campo.nome + "=" + getValorAspas(Campo) + ",";
        }
        sql = sql.substring(0, sql.length() - 1);
        sql += " WHERE ";
        for (Campo Campo : table.campos) {
            if (Campo.chavePrimaria) {
                sql += Campo.nome + "=" + getValorAspas(Campo) + " AND ";
            }
        }
        sql = sql.substring(0, sql.length() - 5);
        try {
            Statement stmt = Conn.createStatement();
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Delete(Tabela table) {
        String sql = "DELETE FROM " + table.nome + " WHERE ";
        for (Campo Campo : table.campos) {
            if (Campo.chavePrimaria) {
                sql += Campo.nome + "=" + getValorAspas(Campo) + " AND ";
            }
        }
        sql = sql.substring(0, sql.length() - 5);
        try {
            Statement stmt = Conn.createStatement();
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String returnCamposWithAlias(Tabela table) {
        String sql = "";
        for (Campo Campo : table.campos) {
            sql += table.nome + "." + Campo.nome + " AS " + table.nome + "_" + Campo.nome + ",";
        }
        sql = sql.substring(0, sql.length() - 1);
        return sql;
    }

    public ResultSet Select(Tabela table) {
        String sql = "SELECT " + returnCamposWithAlias(table) + " FROM " + table.nome;
        try {
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
