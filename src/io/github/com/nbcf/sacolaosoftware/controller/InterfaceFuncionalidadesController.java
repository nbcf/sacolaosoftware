/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.com.nbcf.sacolaosoftware.controller;

import infra.nbcf.utils.BehaviorJFrame;
import infra.nbcf.utils.ControleTamanhoFonte;
import infra.nbcf.utils.EstiloVisual;
import infra.nbcf.utils.ExportarJTableParaExcel;
import infra.nbcf.utils.ImportarExcelParaJtable;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nil_b
 */
public interface InterfaceFuncionalidadesController<N> {
    
    public ImportarExcelParaJtable importExcelToJtableJava( 
            String dirPadrao,
            FileNameExtensionFilter objetoFileNameExtensionFilter, 
            String tituloJFileChooser);
    
    public ExportarJTableParaExcel exportarJtable(JTable tabelaParametros);
      
      
    public BehaviorJFrame openFormCrud(JFrame jframe,int width,int heigth,String titulo);
    public BehaviorJFrame closeFormCrud(JFrame jframe);
    public EstiloVisual EstiloLookandfeel(JFrame nomeFrame);
    
       public ControleTamanhoFonte aumentarFonte(JTable jTableDadosModel, JTable jTableDadosPesquisa, Integer posicaoTamanhoFonte);

    public ControleTamanhoFonte reduzirFonte(JTable jTableDadosModel, JTable jTableDadosPesquisa, Integer posicaoTamanhoFonte); 
}
