package io.github.com.nbcf.sacolaosoftware.controller;
//
//import java.util.ArrayList;

import infra.nbcf.dao.GenericsDAO;
import infra.nbcf.utils.ExportarJTableParaExcel;
import infra.nbcf.utils.ImportarExcelParaJtable;
import infra.nbcf.utils.LimparEntradaDeDadosString;
import io.github.com.nbcf.sacolaosoftware.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// /**
//* @author NILDO BUENO CORREIA FILHO 
// * CPF: 10333054725
// * EMAIL: nil_bueno@hotmail.com    
// * JAVA VERSION - 14
// * NETBEANS     - 12
// * 
// * Created on 23/12/2021, 03:20:27
// */

public class CategoriaController extends GenericsDAO<Categoria>  implements InterfaceDAOController{
    public  int quantRegistrosController    =   0;
    public  int quantRegPesquisaController  =   0;
    public  int quantParaPaginar            =   0;
    
    
    LimparEntradaDeDadosString            limparString   = new LimparEntradaDeDadosString();
    ImportarExcelParaJtable<Categoria>    lerCarregaPOI  = new ImportarExcelParaJtable();
    ExportarJTableParaExcel               exportarJtable = new ExportarJTableParaExcel();
    
    
    public int valorJProgressBar = 0;
    public String nomeDados;
    public String localArquivo;
    public ArrayList<Categoria> dadosCarregados = new ArrayList();

    
      @Override
    public void SalvarVerificadoDAO(String namedQuery, String parametroNome, String nomePesquisado) {
          Categoria categoria = new Categoria();
        try {
            this.SalvarVerificadoDAO(categoria, namedQuery, parametroNome, nomePesquisado);
        } catch (Exception ex) {
            Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    @Override
    public void SalvarVerificadoEmLote(String namedQuery, String parametroNome, String nomePesquisado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtualizarController(String nome) {
        Categoria categoria = new Categoria();
        categoria.setNome(nome);
        try {
            AtualizarDAO(categoria);
        } catch (Exception ex) {
            Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ExcluirController(Integer id, String nome) {   
        int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(null,"Confirma a Exclusão do Registro: "+nome+" ",
       "    PERGUNTA DO SISTEMA     ",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,botoes,botoes[0]);
        
        if (opcao ==  JOptionPane.YES_OPTION) 
        {
            RecuperarExcluirDAO(null, id);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  

    @Override
    public void ContarRegistrosController(String namedQuery) 
    {
        ContarRegistrosController(namedQuery);
         quantRegistrosController = this.quantRegistrosDAO;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List PesquisarComecaController(int qtde, int deslocamento, String namedQuery, String parametroNome, String nomePesquisado) {
        this.PesquisarComecaController(qtde, deslocamento, namedQuery, parametroNome, nomePesquisado);
        quantRegPesquisaController = quantRegistrosPesquisaDAO;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List PesquisarContemController(int qtde, int deslocamento, String namedQuery, String parametroNome, String nomePesquisado) {
        PesquisarContemController(qtde, deslocamento, namedQuery, parametroNome, nomePesquisado);
        quantRegPesquisaController = quantRegistrosPesquisaDAO;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List PesquisarTerminaComController(int qtde, int deslocamento, String namedQuery, String parametroNome, String nomePesquisado) {
        PesquisarTerminaComController(qtde, deslocamento, namedQuery, parametroNome, nomePesquisado);
        quantRegPesquisaController = quantRegistrosPesquisaDAO;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ListaTudoController(String namedQuery) {
        ListaTudoDAO(namedQuery);
       quantRegistrosController =  this.quantRegistrosDAO;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    @Override
    public void RemoverEmMassa(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
  public void RecuperarExcluirDAO(Class<Categoria> clazz, Integer id){
    ExcluirDAO(clazz, id);
    }

   
}
