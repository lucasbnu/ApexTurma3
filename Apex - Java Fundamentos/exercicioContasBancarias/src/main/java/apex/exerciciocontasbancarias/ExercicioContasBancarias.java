/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apex.exerciciocontasbancarias;

/**
 *
 * @author lucas
 */
public class ExercicioContasBancarias {

    public static void main(String[] args) {
        contaPoupanca contaPoup = new contaPoupanca();
        contaCorrente contaCorre = new contaCorrente();
        contaPoup.deposita(125);
        contaPoup.deposita(195.75);
        contaPoup.deposita(25.60);
        System.out.println(contaPoup.Extrato());
        contaPoup.saca(26.85);
        System.out.println(contaPoup.Extrato());
        
        contaCorre.deposita(1125);
        contaCorre.deposita(3195.75);
        contaCorre.deposita(525.60);
        System.out.println(contaCorre.Extrato());
        
        contaCorre.saca(contaCorre.calculaTributos());
        System.out.println(contaCorre.Extrato());
    }
}
