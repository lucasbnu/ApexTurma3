/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apex.heranca;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class caixa extends funcionario{
    @Override
    public void imprimePessoa(){
        String mensagem = "A Caixa " +nome+" tem "+
        idade + " anos Seu crachá é "+cracha+ " e o saldo em caixa é "+saldo;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public double saldo;
}
