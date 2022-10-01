/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apex.exerciciocontasbancarias;

/**
 *
 * @author lucas
 */
public class contaCorrente extends conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return this.saldo * 0.10;
    }
    
}
