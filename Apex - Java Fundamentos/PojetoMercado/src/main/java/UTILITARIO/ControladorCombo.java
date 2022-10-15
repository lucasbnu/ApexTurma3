/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILITARIO;

import apex.DAO.ConexaoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ControladorCombo{
    private String Comando;
    private JComboBox<String> Combo;
    ControladorCombo(JComboBox Combo,String Comando){
        this.Comando = Comando;
        this.Combo = Combo;
    }
    public void carregadados(){
        ConexaoDAO con = new ConexaoDAO();
        ResultSet rs = con.retornaDados(Comando);
        try{
            while(rs.next()){
                String nome = rs.getString(0);
                String id = rs.getString(1);
                String dados = id + " - " + nome;
                Combo.addItem(dados);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados");
        }
    }

    private int pegaPrimeirosNumeros(String texto){
        int i = 0;
        String numero = "";
        while(i < texto.length()){
            if(Character.isDigit(texto.charAt(i))){
                numero += texto.charAt(i);
            }else{
                break;
            }
            i++;
        }
        return Integer.parseInt(numero);
    }
    public void selecionaItem(int id){
        for(int i=0;i<Combo.getItemCount();i++){
            if(pegaPrimeirosNumeros(Combo.getItemAt(i).toString()) == id){
                Combo.setSelectedIndex(i);
                break;
            }
        }
    }
    public void selecionaIndice(int indice){
        Combo.setSelectedIndex(indice);
    }

    public int retornaItemSelecionado(){
        return pegaPrimeirosNumeros(Combo.getSelectedItem().toString());
    }


}





