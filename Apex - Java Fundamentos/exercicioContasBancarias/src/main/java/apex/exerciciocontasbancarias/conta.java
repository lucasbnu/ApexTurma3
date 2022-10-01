/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apex.exerciciocontasbancarias;

/**
 *
 * @author lucas
 */
public class conta {
    protected double saldo;
    
    public double Extrato(){
        return this.saldo;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        this.saldo -= valor;
    }
}

