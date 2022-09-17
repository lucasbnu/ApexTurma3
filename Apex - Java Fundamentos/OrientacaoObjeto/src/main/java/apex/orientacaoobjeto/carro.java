package apex.orientacaoobjeto;

import javax.swing.JOptionPane;

public class carro {

  public String Marca;
  public String Modelo;
  public void imprimeCarro(){
      JOptionPane.showMessageDialog(null, "você tem um carro "+Marca+" modelo "+Modelo);
  }
}