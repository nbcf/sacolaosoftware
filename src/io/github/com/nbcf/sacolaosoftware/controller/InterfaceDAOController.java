/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.com.nbcf.sacolaosoftware.controller;

import java.util.List;

/**
 *
 * @author nil_b
 */
public interface InterfaceDAOController {
    
    public void  SalvarVerificadoDAO( String namedQuery, String parametroNome, String nomePesquisado);
    
    public void SalvarVerificadoEmLote(String namedQuery,
                                       String parametroNome,
                                       String nomePesquisado);
    
    public void AtualizarController( String nome);
    
    public void ExcluirController(Integer id, String nome);
    
     public void RemoverEmMassa(Integer id);
    
    public void ContarRegistrosController(String namedQuery);
    
    public List PesquisarComecaController(int qtde,
                                          int deslocamento, 
                                          String namedQuery,
                                          String parametroNome,
                                          String nomePesquisado);
    
    public List PesquisarContemController(int qtde,
                                          int deslocamento,
                                          String namedQuery,
                                          String parametroNome,
                                          String nomePesquisado);
    
    public List PesquisarTerminaComController(int qtde,
                                              int deslocamento,
                                              String namedQuery,
                                              String parametroNome,
                                              String nomePesquisado);
    
public void ListaTudoController( String namedQuery);
    
}
