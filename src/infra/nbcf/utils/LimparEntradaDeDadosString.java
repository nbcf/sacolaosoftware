/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra.nbcf.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author nil_b
 */
public class LimparEntradaDeDadosString {
    
 

    public static String RemoverEspacosEmBranco(String stringId) { 
         String stringlimpa;
        Pattern p = Pattern.compile("[\\s]");
        Matcher m = p.matcher(stringId);
        stringlimpa = m.replaceAll(null);

    return stringlimpa;
    }
    
    public static Boolean CriterioTamanhoString(String string, Integer tamanho) { 
      int  tamanhoMinimo = 0;
      boolean podeSalvar = false;
      tamanhoMinimo = tamanho;
      int tamanhoString = string.length();
      
      if(tamanhoString < tamanhoMinimo)
      {
          podeSalvar = false;
              JOptionPane.showMessageDialog(null, "O registro precisa ter no mínimo 3 caracteres", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
      } 
      else if (tamanhoString >= tamanhoMinimo)
      {
          podeSalvar = true;
      }
      JOptionPane.showMessageDialog(null, "O registro precisa ter no mínimo 3 caracteres", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
      
      {
    return podeSalvar;
    }
        

 
    }
    
    public Boolean CriterioSalvarString(String stringId, int caracters) { 
        int contem = Integer.parseInt(stringId);
        if(contem <= caracters){
                   JOptionPane.showMessageDialog(null, "O registro precisa ter no mínimo 3 caracteres", "Aviso do Sistema", JOptionPane.PLAIN_MESSAGE);
                   } 
        return true;
    }
}
