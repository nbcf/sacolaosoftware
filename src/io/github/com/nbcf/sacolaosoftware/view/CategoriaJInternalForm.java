/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.com.nbcf.sacolaosoftware.view;

import infra.nbcf.tablemodel.CategoriaTableModel;
import infra.nbcf.utils.ControleTamanhoFonte;
import infra.nbcf.utils.ExportarJTableParaExcel;
import infra.nbcf.utils.ImportarExcelParaJtable;
import infra.nbcf.utils.LimparEntradaDeDadosString;
import io.github.com.nbcf.sacolaosoftware.controller.CategoriaController;
import io.github.com.nbcf.sacolaosoftware.model.Categoria;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author nil_b
 */
public class CategoriaJInternalForm extends javax.swing.JInternalFrame {

        ControleTamanhoFonte controleFonte = new ControleTamanhoFonte();
   CategoriaController                controller         =  new CategoriaController();
    ImportarExcelParaJtable<Categoria>         lerCarregaPOI   = new ImportarExcelParaJtable();
    ExportarJTableParaExcel     exportarJtable = new ExportarJTableParaExcel();
  //  BehaviorJFrame              formulario      = new BehaviorJFrame();
    LimparEntradaDeDadosString    limparString = new LimparEntradaDeDadosString();
    List<Categoria>          listaCatArray      = new ArrayList();
    ArrayList<Categoria>     carregador         = new ArrayList();
    ArrayList<Categoria>     carregadorConfirma = new ArrayList();
    private List<Categoria>  valores            = new ArrayList();
    
    
    public FileNameExtensionFilter PegaobjetoFileNameExtensionFilter;
    public String           pegaDirPadrao;
    public String           parametroCodigoAlfabeto = null;
    public String           parametroASCDESC        = null; 
    public JProgressBar     barraDeProgresso;


    public boolean          estadoBotaoDesbloqueio = false; 
    public boolean          edicaoDaPesquisa = false;    
    
    public boolean          estadoBotaoDesbloqueioPesquisa = false; 
    public boolean          edicaoDaPesquisaPesquisa = false;  
    
    public String           switchSalvarFlag = "vazio" ;
    
    public static int       paginaAtual             = 0;
    public static int       paginar                 = 0;
    public static int       deslocado               = 0;
    public static int       ultimaPagina            = 0;
  //  public int              posicaoTamanhoFonte     = 1;
    public static int       deslocamento1;
    public static int       fimDePagina             = 0;
    public static boolean   finalPaginaBol          = false;
    public static boolean   inicioPaginaBol         = true;
    public static int       resultado               = 0;
    public static int       totalPaginas            = 0;
    public static int       memoria                 = 1;
    public JDialog      jDialogBarraDeProgresso2;
    public JDialog      jDialogBarraDeProgresso;  
    public JProgressBar jProgressBar1;
//    public JLabel UjLabelTotalPaginas;
//public JLabel jLabelTotalPaginasPesquisa;
    
 //public static DefaultTableModel model;
    public static   String name = "";
    public static  String gender = "";
    public static   String programmingLanguage = "";
    public static   String Subject = "";
 //public static   String selectedImagePath = "";
    public static   String excelImagePath = "";
    
    public static int       paginaAtualPesquisa             = 0;
    public static int       paginarPesquisa                 = 0;
    public static int       deslocadoPesquisa               = 0;
    public static int       ultimaPaginaPesquisa            = 0;
    public int              posicaoTamanhoFontePesquisa     = 1;
    public static int       deslocamento1Pesquisa;
    public static int       fimDePaginaPesquisa             = 0;
    public static boolean   finalPaginaBolPesquisa          = false;
    public static boolean   inicioPaginaBolPesquisa         = true;
    public static int       resultadoPesquisa               = 0;
    public static int       totalPaginasPesquisa            = 0;
    public static int       memoriaPesquisa                 = 1;
    
    
    
    private static CategoriaJInternalForm  categoriaJInternalForm;
    public static CategoriaJInternalForm getUECategoriaJInternalForm(){
       if(categoriaJInternalForm == null){
            categoriaJInternalForm = new CategoriaJInternalForm();
            }
            return categoriaJInternalForm;
       }
    
           public int posicaoTamanhoFonte = 1;
    
           
       public CategoriaJInternalForm() {
        initComponents();
   
      carregarEstadoPadrao("CarregaPadraoIDTodosUltimos", 0, "cartaoExibeJpanelJTableModel");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jdlSalvar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jProgressBarSalvar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jdlDeletar = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPopupMenuDeletarEmMassa = new javax.swing.JPopupMenu();
        jmItemConfirmarExclusaoEmMassa = new javax.swing.JMenuItem();
        jmItemEditarJanela = new javax.swing.JMenuItem();
        buttonGroupPesquisar = new javax.swing.ButtonGroup();
        buttonGroupDefinicoesPesquisa = new javax.swing.ButtonGroup();
        FormularioEditDialog = new javax.swing.JDialog();
        jl_codigoFormulario = new javax.swing.JLabel();
        jbtSalvar = new javax.swing.JButton();
        jtfCodFormulario = new javax.swing.JTextField();
        jtfNomeFormulario = new javax.swing.JTextField();
        jl_nomeFormulario = new javax.swing.JLabel();
        jbtCancelar = new javax.swing.JButton();
        jPopupMenuJTablePesquisa = new javax.swing.JPopupMenu();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItemExcluirMassa = new javax.swing.JMenuItem();
        JPanelMenuCrud = new javax.swing.JPanel();
        JToolBarMenuCrud = new javax.swing.JToolBar();
        jbtNovo = new javax.swing.JButton();
        jbtSalvarFormulario = new javax.swing.JButton();
        jbtAtualizar = new javax.swing.JButton();
        jbtPesquisar = new javax.swing.JToggleButton();
        jbtEditar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtAbrirSalvarLote = new javax.swing.JButton();
        jbtImpressao = new javax.swing.JButton();
        jbtConfig = new javax.swing.JToggleButton();
        JpCPesquisarFormulario = new javax.swing.JPanel();
        JpanelMenuPesquisar = new javax.swing.JPanel();
        JpanelMetodoBusca = new javax.swing.JPanel();
        jRadioTerminaCom = new javax.swing.JRadioButton();
        jRadioComecaCom = new javax.swing.JRadioButton();
        jRadioContem = new javax.swing.JRadioButton();
        jLabelPequisar = new javax.swing.JLabel();
        jtextCampoPesquisa = new javax.swing.JTextField();
        jbtLimparPesquisa = new javax.swing.JButton();
        jbtFecharPesquisa = new javax.swing.JButton();
        jPanelCentralJtable = new javax.swing.JPanel();
        jPanelTableDadosModel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDadosModel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jbtExportarPesquisa = new javax.swing.JButton();
        jPanelSalvarLotes = new javax.swing.JPanel();
        jScrollPaneListagemDadosArquivo = new javax.swing.JScrollPane();
        JtableListagemDadosArquivo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jbtLocalizarArquivo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jbtConfirmarDadoCarregados = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jbtCancelarSalvarLote = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanelTableDadosPesquisa = new javax.swing.JPanel();
        jScrollPanejPanelTableDadosPesquisa = new javax.swing.JScrollPane();
        jTableDadosPesquisa = new javax.swing.JTable();
        jPaneljToolBarLateralJTablePesquisa = new javax.swing.JPanel();
        jToolBarLateralJTablePesquisa = new javax.swing.JToolBar();
        jSeparatorjToolBarLateralJTablePesquisa = new javax.swing.JToolBar.Separator();
        jbtDesbloquearDelecao = new javax.swing.JToggleButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jbtExportarResultadoJtablePesquisa = new javax.swing.JButton();
        jPanelFormularioCadEdit = new javax.swing.JPanel();
        jl_Id = new javax.swing.JLabel();
        jtf_Id = new javax.swing.JTextField();
        jl_Nome = new javax.swing.JLabel();
        jtf_Nome = new javax.swing.JTextField();
        jPanelPreNavegador = new javax.swing.JPanel();
        jToolBarPreNavegador = new javax.swing.JToolBar();
        jlObjetosEncontrados = new javax.swing.JLabel();
        jLabelContagem = new javax.swing.JLabel();
        JpCNavegador = new javax.swing.JPanel();
        jPanelNavegadorPagina = new javax.swing.JPanel();
        jbtInicioPagina = new javax.swing.JButton();
        jbtUmaPaginaEsquerda = new javax.swing.JButton();
        espacoJLabelNavegadorPagina = new javax.swing.JLabel();
        JlPaginaAtual = new javax.swing.JLabel();
        JlPgDe = new javax.swing.JLabel();
        JlBarra = new javax.swing.JLabel();
        jLabelTotalPaginas = new javax.swing.JLabel();
        JlRegistrosEncontrados = new javax.swing.JLabel();
        jLNumeroLinhas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtUmaPaginaDireita = new javax.swing.JButton();
        jbtFimPagina = new javax.swing.JButton();
        jPanelNavegadorPesquisa = new javax.swing.JPanel();
        jbtInicioPaginaPesquisa = new javax.swing.JButton();
        jbtUmaPaginaEsquerdaPesquisa = new javax.swing.JButton();
        espacoJLabelNavegadorPaginaPesquisa = new javax.swing.JLabel();
        JlPaginaAtualPesquisa = new javax.swing.JLabel();
        JlPgDePesquisa = new javax.swing.JLabel();
        JlBarraPesquisa = new javax.swing.JLabel();
        jLabelTotalPaginasPesquisar = new javax.swing.JLabel();
        JlRegistrosEncontradosPesquisa = new javax.swing.JLabel();
        jLNumeroLinhasPesquisar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtUmaPaginaDireitaPesquisa = new javax.swing.JButton();
        jbtFimPaginaPesquisa = new javax.swing.JButton();
        jPanelConfiguracao = new javax.swing.JPanel();
        jListarQuantidadePorPagina = new javax.swing.JLabel();
        jcbQuantidadePorPagina = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        JlabelEspacoBotoesFonte = new javax.swing.JLabel();
        jrdOrdenarPrimeiros = new javax.swing.JRadioButton();
        jrdOrdernarUltimos = new javax.swing.JRadioButton();
        jLabelEpacoEntreIndexOrdenado = new javax.swing.JLabel();
        jLabelOrdenado = new javax.swing.JLabel();
        jcbTipoOrdem = new javax.swing.JComboBox<>();
        jLabelEspacoAntesFonte = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        jbtAumentaFonte = new javax.swing.JButton();
        jbtReduzFonte = new javax.swing.JButton();

        jdlSalvar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jdlSalvar.setAlwaysOnTop(true);
        jdlSalvar.setBackground(new java.awt.Color(153, 153, 153));
        jdlSalvar.setUndecorated(true);

        jProgressBarSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBarSalvar.setForeground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("....");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBarSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jProgressBarSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdlSalvarLayout = new javax.swing.GroupLayout(jdlSalvar.getContentPane());
        jdlSalvar.getContentPane().setLayout(jdlSalvarLayout);
        jdlSalvarLayout.setHorizontalGroup(
            jdlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdlSalvarLayout.setVerticalGroup(
            jdlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jdlDeletar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jdlDeletar.setUndecorated(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("....");

        jProgressBar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jdlDeletarLayout = new javax.swing.GroupLayout(jdlDeletar.getContentPane());
        jdlDeletar.getContentPane().setLayout(jdlDeletarLayout);
        jdlDeletarLayout.setHorizontalGroup(
            jdlDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdlDeletarLayout.setVerticalGroup(
            jdlDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdlDeletarLayout.createSequentialGroup()
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jmItemConfirmarExclusaoEmMassa.setText("Excluir Lista Selecionada");
        jmItemConfirmarExclusaoEmMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemConfirmarExclusaoEmMassaActionPerformed(evt);
            }
        });
        jPopupMenuDeletarEmMassa.add(jmItemConfirmarExclusaoEmMassa);

        jmItemEditarJanela.setText("jMenuItem2");
        jmItemEditarJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemEditarJanelaActionPerformed(evt);
            }
        });
        jPopupMenuDeletarEmMassa.add(jmItemEditarJanela);

        FormularioEditDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jl_codigoFormulario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_codigoFormulario.setText("Codigo:");

        jbtSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtSalvar.setText("Confirmar");

        jtfCodFormulario.setEditable(false);
        jtfCodFormulario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtfNomeFormulario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jl_nomeFormulario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_nomeFormulario.setText("Nome:");

        jbtCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtCancelar.setText("Cancelar");

        javax.swing.GroupLayout FormularioEditDialogLayout = new javax.swing.GroupLayout(FormularioEditDialog.getContentPane());
        FormularioEditDialog.getContentPane().setLayout(FormularioEditDialogLayout);
        FormularioEditDialogLayout.setHorizontalGroup(
            FormularioEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioEditDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtSalvar)
                .addContainerGap())
            .addGroup(FormularioEditDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_codigoFormulario)
                    .addComponent(jl_nomeFormulario))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(FormularioEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNomeFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );
        FormularioEditDialogLayout.setVerticalGroup(
            FormularioEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioEditDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_codigoFormulario)
                    .addComponent(jtfCodFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormularioEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nomeFormulario))
                .addGap(18, 37, Short.MAX_VALUE)
                .addGroup(FormularioEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSalvar)
                    .addComponent(jbtCancelar))
                .addContainerGap())
        );

        jMenuItemEditar.setText("Editar");
        jPopupMenuJTablePesquisa.add(jMenuItemEditar);

        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jPopupMenuJTablePesquisa.add(jMenuItemExcluir);

        jMenuItemExcluirMassa.setText("Confirmar Exclusão de Selecionados");
        jPopupMenuJTablePesquisa.add(jMenuItemExcluirMassa);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        JPanelMenuCrud.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JPanelMenuCrud.setLayout(new java.awt.GridBagLayout());

        JToolBarMenuCrud.setBackground(new java.awt.Color(153, 153, 153));
        JToolBarMenuCrud.setFloatable(false);
        JToolBarMenuCrud.setRollover(true);

        jbtNovo.setBackground(new java.awt.Color(153, 153, 153));
        jbtNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/adicionar.png"))); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.setToolTipText("Novo Registro");
        jbtNovo.setFocusable(false);
        jbtNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtNovo.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtNovo.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtNovo.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtNovo);

        jbtSalvarFormulario.setBackground(new java.awt.Color(153, 153, 153));
        jbtSalvarFormulario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtSalvarFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/salvar.png"))); // NOI18N
        jbtSalvarFormulario.setText("Salvar");
        jbtSalvarFormulario.setToolTipText("Salvar Registro");
        jbtSalvarFormulario.setFocusable(false);
        jbtSalvarFormulario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtSalvarFormulario.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtSalvarFormulario.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtSalvarFormulario.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtSalvarFormulario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtSalvarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarFormularioActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtSalvarFormulario);

        jbtAtualizar.setBackground(new java.awt.Color(153, 153, 153));
        jbtAtualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/atualizar.png"))); // NOI18N
        jbtAtualizar.setText("F3");
        jbtAtualizar.setToolTipText("Atualizar");
        jbtAtualizar.setFocusable(false);
        jbtAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtAtualizar.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtAtualizar.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtAtualizar.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtualizarActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtAtualizar);

        jbtPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        jbtPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/mail_find.png"))); // NOI18N
        jbtPesquisar.setText("F4");
        jbtPesquisar.setToolTipText("Modo Pesquisa");
        jbtPesquisar.setFocusable(false);
        jbtPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtPesquisar.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtPesquisar.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtPesquisar.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtPesquisar);

        jbtEditar.setBackground(new java.awt.Color(153, 153, 153));
        jbtEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/editar.png"))); // NOI18N
        jbtEditar.setText("F5");
        jbtEditar.setToolTipText("Editar");
        jbtEditar.setFocusable(false);
        jbtEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtEditar.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtEditar.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtEditar.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtEditar);

        jbtExcluir.setBackground(new java.awt.Color(153, 153, 153));
        jbtExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/excluir.png"))); // NOI18N
        jbtExcluir.setText("F7");
        jbtExcluir.setToolTipText("Excluir Registro");
        jbtExcluir.setFocusable(false);
        jbtExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtExcluir.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtExcluir.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtExcluir.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtExcluir);

        jbtAbrirSalvarLote.setBackground(new java.awt.Color(153, 153, 153));
        jbtAbrirSalvarLote.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtAbrirSalvarLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/setaAzulAbaixo.png"))); // NOI18N
        jbtAbrirSalvarLote.setText("F8");
        jbtAbrirSalvarLote.setToolTipText("Importar A partir de Planilha");
        jbtAbrirSalvarLote.setFocusable(false);
        jbtAbrirSalvarLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtAbrirSalvarLote.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtAbrirSalvarLote.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtAbrirSalvarLote.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtAbrirSalvarLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtAbrirSalvarLote.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jbtAbrirSalvarLoteComponentResized(evt);
            }
        });
        jbtAbrirSalvarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAbrirSalvarLoteActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtAbrirSalvarLote);

        jbtImpressao.setBackground(new java.awt.Color(153, 153, 153));
        jbtImpressao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtImpressao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/PhotoPrint.png"))); // NOI18N
        jbtImpressao.setText("F9");
        jbtImpressao.setToolTipText("Imprimir e Exportar Dados");
        jbtImpressao.setFocusable(false);
        jbtImpressao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtImpressao.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtImpressao.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtImpressao.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtImpressao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtImpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtImpressaoActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtImpressao);

        jbtConfig.setBackground(new java.awt.Color(153, 153, 153));
        jbtConfig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/configuracoes.png"))); // NOI18N
        jbtConfig.setText("F12");
        jbtConfig.setToolTipText("Configurações e Acessibilidade");
        jbtConfig.setFocusCycleRoot(true);
        jbtConfig.setFocusable(false);
        jbtConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtConfig.setMaximumSize(new java.awt.Dimension(100, 60));
        jbtConfig.setMinimumSize(new java.awt.Dimension(100, 60));
        jbtConfig.setPreferredSize(new java.awt.Dimension(100, 60));
        jbtConfig.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfigActionPerformed(evt);
            }
        });
        JToolBarMenuCrud.add(jbtConfig);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        JPanelMenuCrud.add(JToolBarMenuCrud, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(JPanelMenuCrud, gridBagConstraints);

        JpCPesquisarFormulario.setLayout(new java.awt.CardLayout());

        JpanelMenuPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulário de Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jRadioTerminaCom.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioTerminaCom.setText("Termina");
        jRadioTerminaCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTerminaComActionPerformed(evt);
            }
        });

        jRadioComecaCom.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioComecaCom.setText("Começa");
        jRadioComecaCom.setMaximumSize(new java.awt.Dimension(111, 27));
        jRadioComecaCom.setMinimumSize(new java.awt.Dimension(111, 27));
        jRadioComecaCom.setPreferredSize(new java.awt.Dimension(111, 27));
        jRadioComecaCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioComecaComActionPerformed(evt);
            }
        });

        jRadioContem.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioContem.setText("Contém");
        jRadioContem.setMaximumSize(new java.awt.Dimension(111, 27));
        jRadioContem.setMinimumSize(new java.awt.Dimension(111, 27));
        jRadioContem.setPreferredSize(new java.awt.Dimension(111, 27));
        jRadioContem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioContemActionPerformed(evt);
            }
        });

        jLabelPequisar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabelPequisar.setText("Busca:");

        jtextCampoPesquisa.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jtextCampoPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtextCampoPesquisaFocusLost(evt);
            }
        });
        jtextCampoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextCampoPesquisaActionPerformed(evt);
            }
        });
        jtextCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtextCampoPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout JpanelMetodoBuscaLayout = new javax.swing.GroupLayout(JpanelMetodoBusca);
        JpanelMetodoBusca.setLayout(JpanelMetodoBuscaLayout);
        JpanelMetodoBuscaLayout.setHorizontalGroup(
            JpanelMetodoBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelMetodoBuscaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPequisar)
                .addGap(18, 18, 18)
                .addComponent(jtextCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioComecaCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioContem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioTerminaCom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        JpanelMetodoBuscaLayout.setVerticalGroup(
            JpanelMetodoBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelMetodoBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelMetodoBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioComecaCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioContem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioTerminaCom)
                    .addComponent(jLabelPequisar)
                    .addComponent(jtextCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jbtLimparPesquisa.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtLimparPesquisa.setText("Limpar");
        jbtLimparPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimparPesquisaActionPerformed(evt);
            }
        });

        jbtFecharPesquisa.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtFecharPesquisa.setText("Fechar");
        jbtFecharPesquisa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jbtFecharPesquisaComponentResized(evt);
            }
        });
        jbtFecharPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFecharPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelMenuPesquisarLayout = new javax.swing.GroupLayout(JpanelMenuPesquisar);
        JpanelMenuPesquisar.setLayout(JpanelMenuPesquisarLayout);
        JpanelMenuPesquisarLayout.setHorizontalGroup(
            JpanelMenuPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelMenuPesquisarLayout.createSequentialGroup()
                .addComponent(JpanelMetodoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelMenuPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtFecharPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtLimparPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelMenuPesquisarLayout.setVerticalGroup(
            JpanelMenuPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelMenuPesquisarLayout.createSequentialGroup()
                .addGroup(JpanelMenuPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JpanelMenuPesquisarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(JpanelMetodoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelMenuPesquisarLayout.createSequentialGroup()
                        .addComponent(jbtFecharPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtLimparPesquisa)))
                .addContainerGap())
        );

        JpCPesquisarFormulario.add(JpanelMenuPesquisar, "cartaoExibeJpanelMenuPesquisar");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(JpCPesquisarFormulario, gridBagConstraints);

        jPanelCentralJtable.setLayout(new java.awt.CardLayout());

        jPanelTableDadosModel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelTableDadosModel.setLayout(new java.awt.GridBagLayout());

        jTableDadosModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableDadosModel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableDadosModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDadosModelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDadosModel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanelTableDadosModel.add(jScrollPane1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jToolBar2.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.setFloatable(false);
        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.setRollover(true);
        jToolBar2.add(jSeparator5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/encrypted.png"))); // NOI18N
        jButton1.setToolTipText("Desbloquear Deleção Multipla");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);
        jToolBar2.add(jSeparator4);

        jbtExportarPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        jbtExportarPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtExportarPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/Excel-icon.png"))); // NOI18N
        jbtExportarPesquisa.setToolTipText("Exportar Para Planilha");
        jbtExportarPesquisa.setFocusable(false);
        jbtExportarPesquisa.setMaximumSize(new java.awt.Dimension(25, 25));
        jbtExportarPesquisa.setMinimumSize(new java.awt.Dimension(25, 25));
        jbtExportarPesquisa.setPreferredSize(new java.awt.Dimension(25, 25));
        jbtExportarPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExportarPesquisaActionPerformed(evt);
            }
        });
        jToolBar2.add(jbtExportarPesquisa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 2.0;
        jPanel2.add(jToolBar2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 2.0;
        jPanelTableDadosModel.add(jPanel2, gridBagConstraints);

        jPanelCentralJtable.add(jPanelTableDadosModel, "cartaoExibeJpanelJTableModel");

        jPanelSalvarLotes.setLayout(new java.awt.GridBagLayout());

        JtableListagemDadosArquivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JtableListagemDadosArquivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JtableListagemDadosArquivo.setRowHeight(18);
        JtableListagemDadosArquivo.setSelectionBackground(new java.awt.Color(0, 102, 204));
        JtableListagemDadosArquivo.setSelectionForeground(new java.awt.Color(204, 255, 255));
        JtableListagemDadosArquivo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JtableListagemDadosArquivo.getTableHeader().setResizingAllowed(false);
        JtableListagemDadosArquivo.getTableHeader().setReorderingAllowed(false);
        jScrollPaneListagemDadosArquivo.setViewportView(JtableListagemDadosArquivo);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelSalvarLotes.add(jScrollPaneListagemDadosArquivo, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jbtLocalizarArquivo.setBackground(new java.awt.Color(204, 204, 204));
        jbtLocalizarArquivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtLocalizarArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/lupinha.png"))); // NOI18N
        jbtLocalizarArquivo.setFocusable(false);
        jbtLocalizarArquivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtLocalizarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLocalizarArquivoActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtLocalizarArquivo);
        jToolBar1.add(jSeparator1);

        jbtConfirmarDadoCarregados.setBackground(new java.awt.Color(204, 204, 204));
        jbtConfirmarDadoCarregados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtConfirmarDadoCarregados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/button_ok.png"))); // NOI18N
        jbtConfirmarDadoCarregados.setFocusable(false);
        jbtConfirmarDadoCarregados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtConfirmarDadoCarregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmarDadoCarregadosActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtConfirmarDadoCarregados);
        jToolBar1.add(jSeparator2);

        jbtCancelarSalvarLote.setBackground(new java.awt.Color(204, 204, 204));
        jbtCancelarSalvarLote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtCancelarSalvarLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/xvermelho.png"))); // NOI18N
        jbtCancelarSalvarLote.setFocusable(false);
        jbtCancelarSalvarLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtCancelarSalvarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarSalvarLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtCancelarSalvarLote);
        jToolBar1.add(jSeparator3);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/encrypted.png"))); // NOI18N
        jToggleButton1.setToolTipText("");
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 2.0;
        jPanel1.add(jToolBar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelSalvarLotes.add(jPanel1, gridBagConstraints);

        jPanelCentralJtable.add(jPanelSalvarLotes, "cartaoExibeJpanelJtableSalvarLotes");

        jPanelTableDadosPesquisa.setLayout(new java.awt.GridBagLayout());

        jTableDadosPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableDadosPesquisa.setToolTipText("Clique duas vezes para Editar");
        jTableDadosPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDadosPesquisaMouseClicked(evt);
            }
        });
        jScrollPanejPanelTableDadosPesquisa.setViewportView(jTableDadosPesquisa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelTableDadosPesquisa.add(jScrollPanejPanelTableDadosPesquisa, gridBagConstraints);

        jPaneljToolBarLateralJTablePesquisa.setLayout(new java.awt.GridBagLayout());

        jToolBarLateralJTablePesquisa.setBackground(new java.awt.Color(204, 204, 204));
        jToolBarLateralJTablePesquisa.setFloatable(false);
        jToolBarLateralJTablePesquisa.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBarLateralJTablePesquisa.setRollover(true);
        jToolBarLateralJTablePesquisa.add(jSeparatorjToolBarLateralJTablePesquisa);

        jbtDesbloquearDelecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/encrypted.png"))); // NOI18N
        jbtDesbloquearDelecao.setToolTipText("Desbloquear Deleção Multipla");
        jbtDesbloquearDelecao.setFocusable(false);
        jbtDesbloquearDelecao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtDesbloquearDelecao.setMaximumSize(new java.awt.Dimension(25, 25));
        jbtDesbloquearDelecao.setMinimumSize(new java.awt.Dimension(25, 25));
        jbtDesbloquearDelecao.setPreferredSize(new java.awt.Dimension(25, 25));
        jbtDesbloquearDelecao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtDesbloquearDelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDesbloquearDelecaoActionPerformed(evt);
            }
        });
        jToolBarLateralJTablePesquisa.add(jbtDesbloquearDelecao);
        jToolBarLateralJTablePesquisa.add(jSeparator7);

        jbtExportarResultadoJtablePesquisa.setBackground(new java.awt.Color(204, 204, 204));
        jbtExportarResultadoJtablePesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtExportarResultadoJtablePesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/Excel-icon.png"))); // NOI18N
        jbtExportarResultadoJtablePesquisa.setToolTipText("Exportar Para Planilha");
        jbtExportarResultadoJtablePesquisa.setFocusable(false);
        jbtExportarResultadoJtablePesquisa.setMaximumSize(new java.awt.Dimension(25, 25));
        jbtExportarResultadoJtablePesquisa.setMinimumSize(new java.awt.Dimension(25, 25));
        jbtExportarResultadoJtablePesquisa.setPreferredSize(new java.awt.Dimension(25, 25));
        jbtExportarResultadoJtablePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExportarResultadoJtablePesquisaActionPerformed(evt);
            }
        });
        jToolBarLateralJTablePesquisa.add(jbtExportarResultadoJtablePesquisa);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 2.0;
        jPaneljToolBarLateralJTablePesquisa.add(jToolBarLateralJTablePesquisa, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 2.0;
        jPanelTableDadosPesquisa.add(jPaneljToolBarLateralJTablePesquisa, gridBagConstraints);

        jPanelCentralJtable.add(jPanelTableDadosPesquisa, "cartaoExibeTableDadosPesquisa");

        jl_Id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_Id.setText("Código:");

        jtf_Id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jl_Nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_Nome.setText("Nome:");

        jtf_Nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelFormularioCadEditLayout = new javax.swing.GroupLayout(jPanelFormularioCadEdit);
        jPanelFormularioCadEdit.setLayout(jPanelFormularioCadEditLayout);
        jPanelFormularioCadEditLayout.setHorizontalGroup(
            jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioCadEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Id)
                    .addComponent(jl_Nome))
                .addGap(48, 48, 48)
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormularioCadEditLayout.setVerticalGroup(
            jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioCadEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Id)
                    .addComponent(jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nome)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jPanelCentralJtable.add(jPanelFormularioCadEdit, "cartaojPanelFormularioCadEdit");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        getContentPane().add(jPanelCentralJtable, gridBagConstraints);

        jPanelPreNavegador.setLayout(new java.awt.GridBagLayout());

        jToolBarPreNavegador.setBackground(new java.awt.Color(204, 204, 204));
        jToolBarPreNavegador.setFloatable(false);
        jToolBarPreNavegador.setRollover(true);

        jlObjetosEncontrados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlObjetosEncontrados.setText("Objetos Encontrados: ");
        jToolBarPreNavegador.add(jlObjetosEncontrados);

        jLabelContagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelContagem.setText("0");
        jToolBarPreNavegador.add(jLabelContagem);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanelPreNavegador.add(jToolBarPreNavegador, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanelPreNavegador, gridBagConstraints);

        JpCNavegador.setBackground(new java.awt.Color(204, 204, 204));
        JpCNavegador.setLayout(new java.awt.CardLayout());

        jPanelNavegadorPagina.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jbtInicioPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/2leftarrow.png"))); // NOI18N
        jbtInicioPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInicioPaginaActionPerformed(evt);
            }
        });
        jPanelNavegadorPagina.add(jbtInicioPagina);

        jbtUmaPaginaEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/1leftarrow.png"))); // NOI18N
        jbtUmaPaginaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUmaPaginaEsquerdaActionPerformed(evt);
            }
        });
        jPanelNavegadorPagina.add(jbtUmaPaginaEsquerda);

        espacoJLabelNavegadorPagina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        espacoJLabelNavegadorPagina.setText("    ");
        jPanelNavegadorPagina.add(espacoJLabelNavegadorPagina);

        JlPaginaAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlPaginaAtual.setText("Pagina: ");
        jPanelNavegadorPagina.add(JlPaginaAtual);

        JlPgDe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlPgDe.setText("0");
        jPanelNavegadorPagina.add(JlPgDe);

        JlBarra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlBarra.setText("/");
        jPanelNavegadorPagina.add(JlBarra);

        jLabelTotalPaginas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotalPaginas.setText("0");
        jPanelNavegadorPagina.add(jLabelTotalPaginas);

        JlRegistrosEncontrados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlRegistrosEncontrados.setText("  Registros Encontrados:");
        jPanelNavegadorPagina.add(JlRegistrosEncontrados);

        jLNumeroLinhas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNumeroLinhas.setText("   0");
        jPanelNavegadorPagina.add(jLNumeroLinhas);

        jLabel3.setText("  ");
        jPanelNavegadorPagina.add(jLabel3);

        jbtUmaPaginaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/1rightarrow.png"))); // NOI18N
        jbtUmaPaginaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUmaPaginaDireitaActionPerformed(evt);
            }
        });
        jPanelNavegadorPagina.add(jbtUmaPaginaDireita);

        jbtFimPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/2rightarrow.png"))); // NOI18N
        jbtFimPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFimPaginaActionPerformed(evt);
            }
        });
        jPanelNavegadorPagina.add(jbtFimPagina);

        JpCNavegador.add(jPanelNavegadorPagina, "card3");

        jPanelNavegadorPesquisa.setMinimumSize(new java.awt.Dimension(448, 25));
        jPanelNavegadorPesquisa.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jbtInicioPaginaPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/2leftarrow.png"))); // NOI18N
        jbtInicioPaginaPesquisa.setFocusable(false);
        jbtInicioPaginaPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtInicioPaginaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInicioPaginaPesquisaActionPerformed(evt);
            }
        });
        jPanelNavegadorPesquisa.add(jbtInicioPaginaPesquisa);

        jbtUmaPaginaEsquerdaPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/1leftarrow.png"))); // NOI18N
        jbtUmaPaginaEsquerdaPesquisa.setFocusable(false);
        jbtUmaPaginaEsquerdaPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtUmaPaginaEsquerdaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUmaPaginaEsquerdaPesquisaActionPerformed(evt);
            }
        });
        jPanelNavegadorPesquisa.add(jbtUmaPaginaEsquerdaPesquisa);

        espacoJLabelNavegadorPaginaPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        espacoJLabelNavegadorPaginaPesquisa.setText("    ");
        jPanelNavegadorPesquisa.add(espacoJLabelNavegadorPaginaPesquisa);

        JlPaginaAtualPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlPaginaAtualPesquisa.setText("Pagina: ");
        jPanelNavegadorPesquisa.add(JlPaginaAtualPesquisa);

        JlPgDePesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlPgDePesquisa.setText("0");
        JlPgDePesquisa.setMaximumSize(new java.awt.Dimension(8, 19));
        JlPgDePesquisa.setMinimumSize(new java.awt.Dimension(8, 19));
        JlPgDePesquisa.setPreferredSize(new java.awt.Dimension(8, 19));
        jPanelNavegadorPesquisa.add(JlPgDePesquisa);

        JlBarraPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlBarraPesquisa.setText("/");
        jPanelNavegadorPesquisa.add(JlBarraPesquisa);

        jLabelTotalPaginasPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotalPaginasPesquisar.setText("0");
        jPanelNavegadorPesquisa.add(jLabelTotalPaginasPesquisar);

        JlRegistrosEncontradosPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlRegistrosEncontradosPesquisa.setText("  Registros Encontrados:");
        jPanelNavegadorPesquisa.add(JlRegistrosEncontradosPesquisa);

        jLNumeroLinhasPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNumeroLinhasPesquisar.setText("   0");
        jPanelNavegadorPesquisa.add(jLNumeroLinhasPesquisar);

        jLabel5.setText("  ");
        jPanelNavegadorPesquisa.add(jLabel5);

        jbtUmaPaginaDireitaPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/1rightarrow.png"))); // NOI18N
        jbtUmaPaginaDireitaPesquisa.setFocusable(false);
        jbtUmaPaginaDireitaPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtUmaPaginaDireitaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUmaPaginaDireitaPesquisaActionPerformed(evt);
            }
        });
        jPanelNavegadorPesquisa.add(jbtUmaPaginaDireitaPesquisa);

        jbtFimPaginaPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/2rightarrow.png"))); // NOI18N
        jbtFimPaginaPesquisa.setFocusable(false);
        jbtFimPaginaPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtFimPaginaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFimPaginaPesquisaActionPerformed(evt);
            }
        });
        jPanelNavegadorPesquisa.add(jbtFimPaginaPesquisa);

        JpCNavegador.add(jPanelNavegadorPesquisa, "card2");

        jPanelConfiguracao.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jListarQuantidadePorPagina.setBackground(new java.awt.Color(204, 204, 204));
        jListarQuantidadePorPagina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListarQuantidadePorPagina.setText("Paginar:");
        jListarQuantidadePorPagina.setToolTipText("");
        jPanelConfiguracao.add(jListarQuantidadePorPagina);

        jcbQuantidadePorPagina.setBackground(new java.awt.Color(204, 204, 204));
        jcbQuantidadePorPagina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbQuantidadePorPagina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "30", "50", "100", "Todos" }));
        jcbQuantidadePorPagina.setMinimumSize(new java.awt.Dimension(70, 25));
        jcbQuantidadePorPagina.setPreferredSize(new java.awt.Dimension(70, 25));
        jcbQuantidadePorPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbQuantidadePorPaginaActionPerformed(evt);
            }
        });
        jPanelConfiguracao.add(jcbQuantidadePorPagina);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("     ");
        jPanelConfiguracao.add(jLabel4);

        JlabelEspacoBotoesFonte.setBackground(new java.awt.Color(204, 204, 204));
        JlabelEspacoBotoesFonte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlabelEspacoBotoesFonte.setText("Indexar");
        jPanelConfiguracao.add(JlabelEspacoBotoesFonte);

        jrdOrdenarPrimeiros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrdOrdenarPrimeiros.setText("Primeiros Registros");
        jrdOrdenarPrimeiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdOrdenarPrimeirosActionPerformed(evt);
            }
        });
        jPanelConfiguracao.add(jrdOrdenarPrimeiros);

        jrdOrdernarUltimos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrdOrdernarUltimos.setText("Ultimos Registros");
        jrdOrdernarUltimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdOrdernarUltimosActionPerformed(evt);
            }
        });
        jPanelConfiguracao.add(jrdOrdernarUltimos);

        jLabelEpacoEntreIndexOrdenado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEpacoEntreIndexOrdenado.setText("     ");
        jPanelConfiguracao.add(jLabelEpacoEntreIndexOrdenado);

        jLabelOrdenado.setBackground(new java.awt.Color(204, 204, 204));
        jLabelOrdenado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelOrdenado.setText("Ordenando:");
        jPanelConfiguracao.add(jLabelOrdenado);

        jcbTipoOrdem.setBackground(new java.awt.Color(204, 204, 204));
        jcbTipoOrdem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jcbTipoOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Alfabeto" }));
        jcbTipoOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoOrdemActionPerformed(evt);
            }
        });
        jPanelConfiguracao.add(jcbTipoOrdem);

        jLabelEspacoAntesFonte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEspacoAntesFonte.setText("     ");
        jPanelConfiguracao.add(jLabelEspacoAntesFonte);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jbtAumentaFonte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtAumentaFonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/fontsizeup.png"))); // NOI18N
        jbtAumentaFonte.setText("Aumentar Fonte");
        jbtAumentaFonte.setToolTipText("Aumentar Fonte");
        jbtAumentaFonte.setFocusable(false);
        jbtAumentaFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAumentaFonteActionPerformed(evt);
            }
        });
        jToolBar3.add(jbtAumentaFonte);

        jbtReduzFonte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtReduzFonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/fontsizedown.png"))); // NOI18N
        jbtReduzFonte.setText("Reduzir Fonte");
        jbtReduzFonte.setToolTipText("Reduzir Fonte");
        jbtReduzFonte.setFocusable(false);
        jbtReduzFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtReduzFonteActionPerformed(evt);
            }
        });
        jToolBar3.add(jbtReduzFonte);

        jPanelConfiguracao.add(jToolBar3);

        JpCNavegador.add(jPanelConfiguracao, "card4");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        getContentPane().add(JpCNavegador, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        ComportamentoNovoRegistro();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarFormularioActionPerformed
        ComportamentoSalvarRegistro();

        switchSalvar();
    }//GEN-LAST:event_jbtSalvarFormularioActionPerformed

    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
       ComportamentoAtualizar();
       carregarEstadoPadrao("CarregaPadraoIDTodosUltimos", 0, "cartaoExibeJpanelJTableModel");
    }//GEN-LAST:event_jbtAtualizarActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        ComportamentoPesquisar();
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
        ComportamentoEditar();
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        ExcluirRegistro();
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtAbrirSalvarLoteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jbtAbrirSalvarLoteComponentResized

    }//GEN-LAST:event_jbtAbrirSalvarLoteComponentResized

    private void jbtAbrirSalvarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAbrirSalvarLoteActionPerformed
        ComportamentoSalvarLotes();
    }//GEN-LAST:event_jbtAbrirSalvarLoteActionPerformed

    private void jbtImpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtImpressaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtImpressaoActionPerformed

    private void jbtConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfigActionPerformed
        ConfiguracaoAcessibilidade();
    }//GEN-LAST:event_jbtConfigActionPerformed

    private void jRadioTerminaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTerminaComActionPerformed
        puxarparametro(0,"Sim");
    }//GEN-LAST:event_jRadioTerminaComActionPerformed

    private void jRadioComecaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioComecaComActionPerformed
        puxarparametro(0,"Sim");
    }//GEN-LAST:event_jRadioComecaComActionPerformed

    private void jRadioContemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioContemActionPerformed
        puxarparametro(0,"Sim");
    }//GEN-LAST:event_jRadioContemActionPerformed

    private void jtextCampoPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextCampoPesquisaFocusLost
        puxarparametro(0, "Sim");
    }//GEN-LAST:event_jtextCampoPesquisaFocusLost

    private void jtextCampoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextCampoPesquisaActionPerformed

    }//GEN-LAST:event_jtextCampoPesquisaActionPerformed

    private void jtextCampoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextCampoPesquisaKeyPressed

    }//GEN-LAST:event_jtextCampoPesquisaKeyPressed

    private void jbtLimparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparPesquisaActionPerformed

    }//GEN-LAST:event_jbtLimparPesquisaActionPerformed

    private void jbtFecharPesquisaComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jbtFecharPesquisaComponentResized

    }//GEN-LAST:event_jbtFecharPesquisaComponentResized

    private void jbtFecharPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFecharPesquisaActionPerformed

        fecharPesquisaBotaoInterno();
    }//GEN-LAST:event_jbtFecharPesquisaActionPerformed

    private void jTableDadosModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosModelMouseClicked
        if (evt.getClickCount() == 1) {
            ClicarLista();

        } else if (evt.getClickCount() == 2) {
            duploClick();
        }
    }//GEN-LAST:event_jTableDadosModelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        desbloqueiaDelecaoMultipla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtExportarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExportarPesquisaActionPerformed
        exportarExcel();
    }//GEN-LAST:event_jbtExportarPesquisaActionPerformed

    private void jbtLocalizarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLocalizarArquivoActionPerformed
        FileNameExtensionFilter filtoDeNomesDeExtensaoDeArquivos = new FileNameExtensionFilter("Arquivo tipo Planilha", "xls", "xlsx", "xlsm");
        CarregarListaSalvaEmLote("C:\\",filtoDeNomesDeExtensaoDeArquivos,"Selecione Um Arquivo do Tipo: xls, xlsx, xlsm","Dados Encontrados");
    }//GEN-LAST:event_jbtLocalizarArquivoActionPerformed

    private void jbtConfirmarDadoCarregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmarDadoCarregadosActionPerformed

        ConfirmarDadosCarregados();
        new SalvarLotesThread().start();
    }//GEN-LAST:event_jbtConfirmarDadoCarregadosActionPerformed

    private void jbtCancelarSalvarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarSalvarLoteActionPerformed
        ComportamentoAtualizar();
    }//GEN-LAST:event_jbtCancelarSalvarLoteActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTableDadosPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosPesquisaMouseClicked
        clicarJTablePesquisa();

        if (evt.getClickCount() == 2) {
            ClicarListaPesquisa();

        }

        if (evt.getClickCount() == 1) {
            ClicarListaPesquisa();

        } else if (evt.getClickCount() == 2) {
            duploClickPesquisa();
        }
    }//GEN-LAST:event_jTableDadosPesquisaMouseClicked

    private void jbtDesbloquearDelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDesbloquearDelecaoActionPerformed
        desbloqueiaDelecaoMultiplaPesquisa();
    }//GEN-LAST:event_jbtDesbloquearDelecaoActionPerformed

    private void jbtExportarResultadoJtablePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExportarResultadoJtablePesquisaActionPerformed
        exportarExcelPesquisa();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtExportarResultadoJtablePesquisaActionPerformed

    private void jbtInicioPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInicioPaginaActionPerformed
        inicioPagina();
    }//GEN-LAST:event_jbtInicioPaginaActionPerformed

    private void jbtUmaPaginaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaEsquerdaActionPerformed
        descontar();
    }//GEN-LAST:event_jbtUmaPaginaEsquerdaActionPerformed

    private void jbtUmaPaginaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaDireitaActionPerformed
        somar();
    }//GEN-LAST:event_jbtUmaPaginaDireitaActionPerformed

    private void jbtFimPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFimPaginaActionPerformed
        finalDaPagina();
    }//GEN-LAST:event_jbtFimPaginaActionPerformed

    private void jbtInicioPaginaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInicioPaginaPesquisaActionPerformed
        inicioPaginaPesquisa();
    }//GEN-LAST:event_jbtInicioPaginaPesquisaActionPerformed

    private void jbtUmaPaginaEsquerdaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaEsquerdaPesquisaActionPerformed
        descontarPesquisar();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtUmaPaginaEsquerdaPesquisaActionPerformed

    private void jbtUmaPaginaDireitaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaDireitaPesquisaActionPerformed
        somarPesquisa();
    }//GEN-LAST:event_jbtUmaPaginaDireitaPesquisaActionPerformed

    private void jbtFimPaginaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFimPaginaPesquisaActionPerformed
        finalDaPaginaPesquisa();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtFimPaginaPesquisaActionPerformed

    private void jcbQuantidadePorPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbQuantidadePorPaginaActionPerformed
        puxarparametro(0,"Sim");
    }//GEN-LAST:event_jcbQuantidadePorPaginaActionPerformed

    private void jrdOrdenarPrimeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdOrdenarPrimeirosActionPerformed
        puxarparametro(0,"Sim");
    }//GEN-LAST:event_jrdOrdenarPrimeirosActionPerformed

    private void jrdOrdernarUltimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdOrdernarUltimosActionPerformed
        puxarparametro(0,"Sim");
    }//GEN-LAST:event_jrdOrdernarUltimosActionPerformed

    private void jcbTipoOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoOrdemActionPerformed
        puxarparametro(0,"Sim");
    }//GEN-LAST:event_jcbTipoOrdemActionPerformed

    private void jbtAumentaFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAumentaFonteActionPerformed
        aumentarFonte();
    }//GEN-LAST:event_jbtAumentaFonteActionPerformed

    private void jbtReduzFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtReduzFonteActionPerformed
        reduzirFonte();
    }//GEN-LAST:event_jbtReduzFonteActionPerformed

    private void jmItemConfirmarExclusaoEmMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemConfirmarExclusaoEmMassaActionPerformed

        excluirEmMassa();
        new ExcluirEmMassaThread().start();
    }//GEN-LAST:event_jmItemConfirmarExclusaoEmMassaActionPerformed

    private void jmItemEditarJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemEditarJanelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmItemEditarJanelaActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog FormularioEditDialog;
    private javax.swing.JPanel JPanelMenuCrud;
    private javax.swing.JToolBar JToolBarMenuCrud;
    private javax.swing.JLabel JlBarra;
    private javax.swing.JLabel JlBarraPesquisa;
    private javax.swing.JLabel JlPaginaAtual;
    private javax.swing.JLabel JlPaginaAtualPesquisa;
    private javax.swing.JLabel JlPgDe;
    private javax.swing.JLabel JlPgDePesquisa;
    private javax.swing.JLabel JlRegistrosEncontrados;
    private javax.swing.JLabel JlRegistrosEncontradosPesquisa;
    private javax.swing.JLabel JlabelEspacoBotoesFonte;
    private javax.swing.JPanel JpCNavegador;
    private javax.swing.JPanel JpCPesquisarFormulario;
    private javax.swing.JPanel JpanelMenuPesquisar;
    private javax.swing.JPanel JpanelMetodoBusca;
    private javax.swing.JTable JtableListagemDadosArquivo;
    private javax.swing.ButtonGroup buttonGroupDefinicoesPesquisa;
    private javax.swing.ButtonGroup buttonGroupPesquisar;
    private javax.swing.JLabel espacoJLabelNavegadorPagina;
    private javax.swing.JLabel espacoJLabelNavegadorPaginaPesquisa;
    private javax.swing.JToggleButton jButton1;
    private javax.swing.JLabel jLNumeroLinhas;
    private javax.swing.JLabel jLNumeroLinhasPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContagem;
    private javax.swing.JLabel jLabelEpacoEntreIndexOrdenado;
    private javax.swing.JLabel jLabelEspacoAntesFonte;
    private javax.swing.JLabel jLabelOrdenado;
    private javax.swing.JLabel jLabelPequisar;
    private javax.swing.JLabel jLabelTotalPaginas;
    private javax.swing.JLabel jLabelTotalPaginasPesquisar;
    private javax.swing.JLabel jListarQuantidadePorPagina;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemExcluirMassa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCentralJtable;
    private javax.swing.JPanel jPanelConfiguracao;
    private javax.swing.JPanel jPanelFormularioCadEdit;
    private javax.swing.JPanel jPanelNavegadorPagina;
    private javax.swing.JPanel jPanelNavegadorPesquisa;
    private javax.swing.JPanel jPanelPreNavegador;
    private javax.swing.JPanel jPanelSalvarLotes;
    private javax.swing.JPanel jPanelTableDadosModel;
    private javax.swing.JPanel jPanelTableDadosPesquisa;
    private javax.swing.JPanel jPaneljToolBarLateralJTablePesquisa;
    private javax.swing.JPopupMenu jPopupMenuDeletarEmMassa;
    private javax.swing.JPopupMenu jPopupMenuJTablePesquisa;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBarSalvar;
    private javax.swing.JRadioButton jRadioComecaCom;
    private javax.swing.JRadioButton jRadioContem;
    private javax.swing.JRadioButton jRadioTerminaCom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneListagemDadosArquivo;
    private javax.swing.JScrollPane jScrollPanejPanelTableDadosPesquisa;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparatorjToolBarLateralJTablePesquisa;
    private javax.swing.JTable jTableDadosModel;
    private javax.swing.JTable jTableDadosPesquisa;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBarLateralJTablePesquisa;
    private javax.swing.JToolBar jToolBarPreNavegador;
    private javax.swing.JButton jbtAbrirSalvarLote;
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtAumentaFonte;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtCancelarSalvarLote;
    private javax.swing.JToggleButton jbtConfig;
    private javax.swing.JButton jbtConfirmarDadoCarregados;
    private javax.swing.JToggleButton jbtDesbloquearDelecao;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtExportarPesquisa;
    private javax.swing.JButton jbtExportarResultadoJtablePesquisa;
    private javax.swing.JButton jbtFecharPesquisa;
    private javax.swing.JButton jbtFimPagina;
    private javax.swing.JButton jbtFimPaginaPesquisa;
    private javax.swing.JButton jbtImpressao;
    private javax.swing.JButton jbtInicioPagina;
    private javax.swing.JButton jbtInicioPaginaPesquisa;
    private javax.swing.JButton jbtLimparPesquisa;
    private javax.swing.JButton jbtLocalizarArquivo;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JToggleButton jbtPesquisar;
    private javax.swing.JButton jbtReduzFonte;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JButton jbtSalvarFormulario;
    private javax.swing.JButton jbtUmaPaginaDireita;
    private javax.swing.JButton jbtUmaPaginaDireitaPesquisa;
    private javax.swing.JButton jbtUmaPaginaEsquerda;
    private javax.swing.JButton jbtUmaPaginaEsquerdaPesquisa;
    private javax.swing.JComboBox<String> jcbQuantidadePorPagina;
    private javax.swing.JComboBox<String> jcbTipoOrdem;
    private javax.swing.JDialog jdlDeletar;
    private javax.swing.JDialog jdlSalvar;
    private javax.swing.JLabel jlObjetosEncontrados;
    private javax.swing.JLabel jl_Id;
    private javax.swing.JLabel jl_Nome;
    private javax.swing.JLabel jl_codigoFormulario;
    private javax.swing.JLabel jl_nomeFormulario;
    private javax.swing.JMenuItem jmItemConfirmarExclusaoEmMassa;
    private javax.swing.JMenuItem jmItemEditarJanela;
    private javax.swing.JRadioButton jrdOrdenarPrimeiros;
    private javax.swing.JRadioButton jrdOrdernarUltimos;
    private javax.swing.JTextField jtextCampoPesquisa;
    private javax.swing.JTextField jtfCodFormulario;
    private javax.swing.JTextField jtfNomeFormulario;
    private javax.swing.JTextField jtf_Id;
    private javax.swing.JTextField jtf_Nome;
    // End of variables declaration//GEN-END:variables


    
 public void carregarEstadoPadrao( String pesquisa, int deslocalmentoPagina, String cartao){
    jcbQuantidadePorPagina.setEnabled(true);
    jcbQuantidadePorPagina.setSelectedIndex(0);
    jrdOrdernarUltimos.setSelected(true);
    jcbTipoOrdem.setSelectedIndex(0);
    resetarPonteiros();
    resetarPonteirosPesquisa();
    this.puxarparametro(deslocalmentoPagina,"Nao");

    jbtNovo.setEnabled(true);
    jbtSalvarFormulario.setEnabled(false);
    jbtAtualizar.setEnabled(true);
    jbtPesquisar.setEnabled(true);
    jbtEditar.setEnabled(false);
    jbtExcluir.setEnabled(false);
    jbtImpressao.setEnabled(true);
    jbtConfig.setEnabled(true);
    jbtConfirmarDadoCarregados.setEnabled(false);
    CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
    cl.show(jPanelCentralJtable, "cartaoExibeJpanelJTableModel");
    JpCPesquisarFormulario.setVisible(false);
              
    jtf_Id.setEnabled(false);
    jPanelPreNavegador.setVisible(false);
    jToolBarPreNavegador.setEnabled(false);
    jToolBarPreNavegador.setVisible(false);
    jlObjetosEncontrados.setEnabled(false);
    jlObjetosEncontrados.setVisible(false);
    jLabelContagem.setEnabled(false);
    jLabelContagem.setVisible(false);
    
            jbtDesbloquearDelecao.setEnabled(false);
            jbtExportarResultadoJtablePesquisa.setEnabled(false);
            jMenuItemEditar.setEnabled(false);
            jMenuItemExcluir.setEnabled(false);
            jMenuItemExcluirMassa.setEnabled(false);
            
     //   this.EnviaModelo(jTableDadosModel,  pesquisa, deslocalmentoPagina);
    }
     
     public void ComportamentoNovoRegistro(){
         JpCPesquisarFormulario.setEnabled(false);
         JpCPesquisarFormulario.setVisible(false);
         CardLayout cl = (CardLayout)jPanelCentralJtable.getLayout();
         cl.show(jPanelCentralJtable, "cartaojPanelFormularioCadEdit");
         jtf_Id.setEnabled(false);
         JpCNavegador.setEnabled(false);
         JpCNavegador.setVisible(false);
         jbtNovo.setEnabled(false);
         jbtSalvarFormulario.setEnabled(true);
         jbtAtualizar.setEnabled(true);
         jbtPesquisar.setEnabled(false);
         jbtEditar.setEnabled(false);
         jbtExcluir.setEnabled(false);
         jbtAbrirSalvarLote.setEnabled(false);
         jbtImpressao.setEnabled(false);
         jbtConfig.setEnabled(false);
         jbtPesquisar.setSelected(false);
  
//        controller.setId       (null);
//        controller.setNome     (null);
// 
//        jtf_Id.setText(null);
//        jtf_Nome.setText(null);

     }
     
     
     public  void switchSalvar(){
     
     if(switchSalvarFlag.equals("registro")){
    this.ComportamentoSalvarRegistro();
//     JOptionPane.showMessageDialog(null, "1");
     
     }else if(switchSalvarFlag.equals("pesquisa")){
         
    this.ComportamentoSalvarPesquisado();
   //  JOptionPane.showMessageDialog(null, "2");
     }
     
     }
     /*
     
       JpCPesquisarFormulario.setEnabled(false);
//            JpCPesquisarFormulario.setVisible(false);
     */
     public void ComportamentoSalvarRegistro(){
            
   
         if(edicaoDaPesquisa == false){
             
            JpCPesquisarFormulario.setEnabled(false);
            JpCPesquisarFormulario.setVisible(false);
            JpCNavegador.setEnabled(true);
            JpCNavegador.setVisible(true);
            
             jbtNovo.setEnabled(true);
             jbtSalvarFormulario.setEnabled(false);
             jbtAtualizar.setEnabled(true);
             jbtPesquisar.setEnabled(true);
             jbtPesquisar.setSelected(false);
             jbtEditar.setEnabled(false);
             jbtExcluir.setEnabled(false);
             jbtAbrirSalvarLote.setEnabled(true);
             jbtImpressao.setEnabled(true);
             jbtConfig.setEnabled(true);
             CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
             cl.show(jPanelCentralJtable, "cartaoExibeJpanelJTableModel");
             CardLayout c2 = (CardLayout)  JpCNavegador.getLayout();
             c2.show(JpCNavegador, " card3");
             
          //  try {
//                String str;
//                str = limparString.RemoverEspacosEmBranco(jtf_Id.getText());
//                if(str.equals(null) || str.equals("") || str.isEmpty()){
//                    
//                  // controller.setNome((jtf_Nome.getText()));
//                   
//                   
//                 //  controller.salvarVerificado(categoria,"Categoria.findByCategoriaExistente","nome", jtf_Nome.getText());
                    this.ComportamentoAtualizar();
//
//                }
//                else  if(!str.equals(null) || !str.equals("") || !str.isEmpty())
//                {
//                //   controller.setId(Integer.parseInt(limparString.RemoverEspacosEmBranco(jtf_Id.getText())));
//               //   controller.setNome((jtf_Nome.getText()));
//        
//                //   controller.salvar(categoria);
                    this.ComportamentoAtualizar();
//                    }
//                  //  controller.setId(null);
//                    } catch (Exception ex) {   
              //    }
        
                   }else if(edicaoDaPesquisa == true){   
                       
                       
//                        try {
//                        if(jtf_Id.getText() == null 
//                                || jtf_Id.getText().equals("") 
//                                || jtf_Id.getText().equals(" ") 
//                                || jtf_Id.getText().isEmpty()){
//              //     controller.setNome((jtf_Nome.getText()));
//                   
//               //    controller.salvarVerificado(categoria,"Categoria.findByCategoriaExistente","nome", jtf_Nome.getText());
                            this.ComportamentoAtualizar();
//
//                        }else  if(jtf_Id.getText() != null 
//                                || !jtf_Id.getText().equals("") 
//                                || !jtf_Id.getText().equals(" ") 
//                                || !jtf_Id.getText().isEmpty()){
//                           controller.setId(Integer.parseInt(jtf_Id.getText()));
//                           controller.setNome((jtf_Nome.getText()));
//        controller.
                            this.ComportamentoAtualizar();
//                            }
//
//                        controller.setId(null);
//                        } catch (Exception ex) {   
//                      }
                        JpCPesquisarFormulario.setEnabled(true);
                        JpCPesquisarFormulario.setVisible(true);
                        CardLayout cl = (CardLayout)jPanelCentralJtable.getLayout();
                        cl.show(jPanelCentralJtable, "cartaoExibeTableDadosPesquisa"); 
                        CardLayout c2 = (CardLayout)JpCNavegador.getLayout();
                        c2.show(JpCNavegador, "card2");
                        JpCNavegador.setEnabled(true);
                        JpCNavegador.setVisible(true);
         }
         edicaoDaPesquisa = false;
        
     }
     
     
      public void ComportamentoSalvarPesquisado(){
            
      
   if(edicaoDaPesquisaPesquisa == false){
             
//            JpCPesquisarFormulario.setEnabled(false);
//            JpCPesquisarFormulario.setVisible(false);
            JpCPesquisarFormulario.setEnabled(true);
            JpCPesquisarFormulario.setVisible(true);
            JpCNavegador.setEnabled(true);
            JpCNavegador.setVisible(true);
            


             jbtNovo.setEnabled(true);
             jbtSalvarFormulario.setEnabled(false);
             jbtAtualizar.setEnabled(true);
             jbtPesquisar.setEnabled(true);
             jbtPesquisar.setSelected(false);
             jbtEditar.setEnabled(false);
             jbtExcluir.setEnabled(false);
             jbtAbrirSalvarLote.setEnabled(true);
             jbtImpressao.setEnabled(true);
             jbtConfig.setEnabled(true);
             
             
//            try {
//                if(jtf_Id.getText() == null 
//                        || jtf_Id.getText().equals("") 
//                        || jtf_Id.getText().equals(" ") 
//                        || jtf_Id.getText().isEmpty()){
//                    
//                                 controller.setNome((jtf_Nome.getText()));
//                     
//                    
//                    controller.salvarVerificado(categoria,"Categoria.findByCategoriaExistente","nome", jtf_Nome.getText());
                   this.ComportamentoAtualizar();
                    
                     CardLayout c5 = (CardLayout)jPanelCentralJtable.getLayout();
                    c5.show(jPanelCentralJtable, "cartaoExibeTableDadosPesquisa"); 
            
                        CardLayout c6 = (CardLayout)JpCNavegador.getLayout();
                        c6.show(JpCNavegador, "card2");

                //}

                //    controller.setId(null);
               //     } catch (Exception ex) {   
               //   }
        
                 }
                        else  if(edicaoDaPesquisaPesquisa == true){       
                    //    try {
//                        if(jtf_Id.getText() == null 
//                                || jtf_Id.getText().equals("") 
//                                || jtf_Id.getText().equals(" ") 
//                                || jtf_Id.getText().isEmpty()){
//                            
//                                controller.setNome     ((String) jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),1));    
//    
                      //      controller.salvarVerificado(categoria,"Categoria.findByCategoriaExistente","nome", jtf_Nome.getText());
                        this.ComportamentoAtualizar();
                        JpCPesquisarFormulario.setEnabled(true);
                        JpCPesquisarFormulario.setVisible(true);
                        
                           CardLayout c5 = (CardLayout)jPanelCentralJtable.getLayout();
                           c5.show(jPanelCentralJtable, "cartaoExibeTableDadosPesquisa"); 
                           CardLayout c6 = (CardLayout)JpCNavegador.getLayout();
                           c6.show(JpCNavegador, "card2");
                        JpCNavegador.setEnabled(true);
                        JpCNavegador.setVisible(true);
                        }


                   //     controller.setId(null);
                      //  } catch (Exception ex) {   
                     // }
                        
        // }
        edicaoDaPesquisaPesquisa = false;
        
     }

     
     public void ComportamentoAtualizar(){
         // jDialogBarraDeProgresso.setVisible(true);
        JpCPesquisarFormulario.setEnabled(false);
        JpCPesquisarFormulario.setVisible(false);
        CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
        cl.show(jPanelCentralJtable, "cartaoExibeJpanelJTableModel");    
        JpCNavegador.setEnabled(true);
        JpCNavegador.setVisible(true);
        CardLayout c2 = (CardLayout)  JpCNavegador.getLayout();
        c2.show(JpCNavegador, "card3");
        jbtAbrirSalvarLote.setEnabled(true);
        jbtConfirmarDadoCarregados.setEnabled(false);
        this.LimparTabelaLote();
      //  controller.setId(null);
     //   controller.setNome(null);
   
     //   controller.setEmpId(null);
     //   jtf_Id.setText(null);
     //   jtf_Nome.setText(null);
   
        
            jbtDesbloquearDelecao.setEnabled(false);
            jbtExportarResultadoJtablePesquisa.setEnabled(false);
            jMenuItemEditar.setEnabled(false);
            jMenuItemExcluir.setEnabled(false);
            jMenuItemExcluirMassa.setEnabled(false);
            
            jButton1.setSelected(false);
            jbtDesbloquearDelecao.setSelected(false);
            
         if(jbtPesquisar.isSelected())
            {
            this.carregarEstadoPadrao( "CarregaPadraoIDTodosUltimos", 0, "cartaoExibeJpanelJTableModel");

            }
           this.carregarEstadoPadrao( "CarregaPadraoIDTodosUltimos", 0, "cartaoExibeJpanelJTableModel");
        }

     public void ComportamentoSalvarLotes(){
            CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
            cl.show(jPanelCentralJtable, "cartaoExibeJpanelJtableSalvarLotes");
            JpCNavegador.setEnabled(false);
            JpCNavegador.setVisible(false);
            jbtNovo.setEnabled(false);
            jbtPesquisar.setEnabled(false);
            jbtExcluir.setEnabled(false);
            jbtEditar.setEnabled(false);
            jbtImpressao.setEnabled(false);
            jbtAbrirSalvarLote.setEnabled(false);
            jbtConfig.setEnabled(false);
            jDialogBarraDeProgresso.dispose();
     }
     
     
     
     public void ComportamentoEditar(){

        jbtNovo.setEnabled(false);
        jbtSalvarFormulario.setEnabled(true);
        jbtAtualizar.setEnabled(true);
        jbtPesquisar.setEnabled(false);
        jbtEditar.setEnabled(true);
        jbtExcluir.setEnabled(false);
        jbtImpressao.setEnabled(false);
        jbtConfig.setEnabled(false);
        CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
        cl.show(jPanelCentralJtable, "cartaojPanelFormularioCadEdit");
        JpCNavegador.setEnabled(false);
        JpCNavegador.setVisible(false);
        

     }

     
     public void ConfirmarDadosCarregados(){
        jbtNovo.setEnabled(true);  
        jbtSalvarFormulario.setEnabled(false);
        jbtEditar.setEnabled(false);
        jbtAbrirSalvarLote.setEnabled(true);
        jbtPesquisar.setEnabled(true);
        jbtAbrirSalvarLote.setEnabled(true);
        confimarDadosLote();
     }
     
     public void desbloqueiaDelecaoMultipla(){
            jButton1.isSelected();
         if(estadoBotaoDesbloqueio == true){                                    //infra.nbcf.image
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/encrypted.png")));
            jTableDadosModel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
 
                jbtNovo.setEnabled(true);
                jbtAtualizar.setEnabled(true);
                jbtEditar.setEnabled(true);
                jbtPesquisar.setEnabled(true);
                jbtAbrirSalvarLote.setEnabled(true);
                jbtImpressao.setEnabled(true);
                jbtExportarPesquisa.setEnabled(true);
                jbtExcluir.setEnabled(false);
                estadoBotaoDesbloqueio = false;
        


            }else if (estadoBotaoDesbloqueio == false){
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/decrypted.png")));
                    jTableDadosModel.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                    
                    jbtNovo.setEnabled(false);
                    jbtAtualizar.setEnabled(false);
                    jbtEditar.setEnabled(false);
                    jbtPesquisar.setEnabled(false);
               
                    jbtAbrirSalvarLote.setEnabled(false);   
                    jbtImpressao.setEnabled(false);
                    jbtExportarPesquisa.setEnabled(false);
                    jbtExcluir.setEnabled(true);  
                    estadoBotaoDesbloqueio = true;          
            }     
        }
     
    public void desbloqueiaDelecaoMultiplaPesquisa(){

         if(estadoBotaoDesbloqueioPesquisa == true){
            jbtDesbloquearDelecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/image/encrypted.png")));
            jTableDadosPesquisa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
          
                jbtNovo.setEnabled(true);
                jbtAtualizar.setEnabled(true);
                jbtEditar.setEnabled(true);
                jbtPesquisar.setEnabled(true);
                jbtAbrirSalvarLote.setEnabled(true);

                jbtImpressao.setEnabled(true);
                jbtExportarResultadoJtablePesquisa.setEnabled(true);
                jbtExcluir.setEnabled(false);
                estadoBotaoDesbloqueioPesquisa = false;

            }else if (estadoBotaoDesbloqueioPesquisa == false){
//                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/image/decrypted.png")));
//                    jTableDadosModel.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                      jbtDesbloquearDelecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infra/nbcf/image/decrypted.png")));
                      jTableDadosPesquisa.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                  
                    jbtNovo.setEnabled(false);
                    jbtAtualizar.setEnabled(false);
                    jbtEditar.setEnabled(false);
                    jbtPesquisar.setEnabled(false);
               
                    jbtAbrirSalvarLote.setEnabled(false);   
                    jbtImpressao.setEnabled(false);
                    jbtExportarResultadoJtablePesquisa.setEnabled(false);
                    jbtExcluir.setEnabled(true);  
                    estadoBotaoDesbloqueioPesquisa = true;          
            }     
        }
  

          
          public void clicarJTablePesquisa(){
              
             if(jTableDadosPesquisa.isFocusable()){
             
              jMenuItemExcluir.setEnabled(true);
                   jMenuItemEditar.setEnabled(true);


             
             }
          
          
          }
   

        public void ComportamentoPesquisar(){

        if(edicaoDaPesquisa == false){
            jbtNovo.setEnabled(false);
            JpCPesquisarFormulario.setEnabled(true);
            JpCPesquisarFormulario.setVisible(true);
            
            CardLayout cl = (CardLayout)jPanelCentralJtable.getLayout();
            cl.show(jPanelCentralJtable, "cartaoExibeTableDadosPesquisa"); 
            CardLayout c2 = (CardLayout)JpCNavegador.getLayout();
            c2.show(JpCNavegador, "card2");
          

            if(jtextCampoPesquisa.getText().isEmpty() || jtextCampoPesquisa.getText().equals("") || jtextCampoPesquisa.getText().equals(" ") ){
            jtextCampoPesquisa.setRequestFocusEnabled(true);
            jtextCampoPesquisa.setCaretPosition(0);
            
            } else if(!jtextCampoPesquisa.getText().isEmpty() || !jtextCampoPesquisa.getText().equals("")  || !jtextCampoPesquisa.getText().equals(" ") ){        
            puxarparametro(0, "Sim");
            
            }

            jbtAbrirSalvarLote.setEnabled(false);
            edicaoDaPesquisa = true;
        
       }else if(edicaoDaPesquisa == true){ 
            jbtNovo.setEnabled(true);
           JpCPesquisarFormulario.setEnabled(false);
           JpCPesquisarFormulario.setVisible(false);
            CardLayout c3 = (CardLayout)jPanelCentralJtable.getLayout();
            c3.show(jPanelCentralJtable, "cartaoExibeJpanelJTableModel");  
            CardLayout c4 = (CardLayout)JpCNavegador.getLayout();
            c4.show(JpCNavegador, "card3");
                jbtPesquisar.setSelected(false);
                jbtAbrirSalvarLote.setEnabled(true);
                
                edicaoDaPesquisa = false;
        }
     }// edicaoDaPesquisa
     
       public void fecharPesquisaBotaoInterno(){
            JpCPesquisarFormulario.setEnabled(false);
            JpCPesquisarFormulario.setVisible(false);
            CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
            cl.show(jPanelCentralJtable, "cartaoExibeJpanelJTableModel");     
            JpCNavegador.setEnabled(true);
            JpCNavegador.setVisible(true);
            CardLayout c2 = (CardLayout)  JpCNavegador.getLayout();
            c2.show(JpCNavegador, "card3");
            jbtAbrirSalvarLote.setEnabled(true);
       } 

       
     public void ConfiguracaoAcessibilidade(){
        if(jbtPesquisar.isSelected() == true ){
            if(jbtConfig.isSelected() == true){
                   CardLayout cl = (CardLayout) JpCNavegador.getLayout();
                   cl.show(JpCNavegador, "card4");
            }else if(jbtConfig.isSelected() == false){
                    CardLayout cl = (CardLayout) JpCNavegador.getLayout();
                    cl.show(JpCNavegador, "card2");
            }
         
        }else if(jbtPesquisar.isSelected() == false ){
            if(jbtConfig.isSelected() == true){
               CardLayout cl = (CardLayout) JpCNavegador.getLayout();
               cl.show(JpCNavegador, "card4");
            }else if(jbtConfig.isSelected() == false){  
                CardLayout cl = (CardLayout) JpCNavegador.getLayout();
                cl.show(JpCNavegador, "card3");
                }
        }
     }
     
     public void ClicarLista(){
 switchSalvarFlag = "registro";

        if(estadoBotaoDesbloqueio == true){

        jbtEditar.setEnabled(false);
        jbtExcluir.setEnabled(true);
        
        }else if(estadoBotaoDesbloqueio == false){
        jbtEditar.setEnabled(true);
        jbtExcluir.setEnabled(true);
        }
      //  controller.setId(null);
//        controller.setId       ((Integer)jTableDadosModel.getValueAt(jTableDadosModel.getSelectedRow(),0));
//        controller.setNome     ((String) jTableDadosModel.getValueAt(jTableDadosModel.getSelectedRow(),1));    
 

//        jtf_Id.setText(String.valueOf(controller.getId()));
//        jtf_Nome.setText(controller.getNome());  
 
     }

        public void duploClick(){
              switchSalvarFlag = "registro";

                jbtNovo.setEnabled(false);
                jbtSalvarFormulario.setEnabled(true);
                jbtAtualizar.setEnabled(true);
                jbtPesquisar.setEnabled(false);
                jbtEditar.setEnabled(false);
                jbtExcluir.setEnabled(false);
                jbtAbrirSalvarLote.setEnabled(false);
                jbtAbrirSalvarLote.setEnabled(false);
                jbtImpressao.setEnabled(false);
                jbtConfig.setEnabled(false);
                CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
                cl.show(jPanelCentralJtable, "cartaojPanelFormularioCadEdit");
//                controller.setId       ((Integer)jTableDadosModel.getValueAt(jTableDadosModel.getSelectedRow(),0));
//                controller.setNome     ((String) jTableDadosModel.getValueAt(jTableDadosModel.getSelectedRow(),1));    
         
//                jtf_Id.setText(String.valueOf(controller.getId()));
//                jtf_Nome.setText(controller.getNome());  
       
        
        } 

         public void ClicarListaPesquisa(){
            switchSalvarFlag = "pesquisa";
            if(edicaoDaPesquisaPesquisa == false ){
                if(estadoBotaoDesbloqueioPesquisa == true){
                jbtEditar.setEnabled(false);
                 jbtExcluir.setEnabled(true);
                }else if(estadoBotaoDesbloqueioPesquisa == false){
                jbtEditar.setEnabled(true);
                 jbtExcluir.setEnabled(true);
                }
//            controller.setId(null);
//
//        controller.setId       ((Integer)jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),0));
//        controller.setNome     ((String) jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),1));    
//   
//            jtf_Id.setText(String.valueOf(controller.getId()));
//        jtf_Nome.setText(controller.getNome());  
   
        } else if (edicaoDaPesquisaPesquisa  == true){
        if(estadoBotaoDesbloqueioPesquisa == true){

        jbtEditar.setEnabled(false);
        jbtExcluir.setEnabled(true);
        }else if(estadoBotaoDesbloqueioPesquisa == false){
        jbtEditar.setEnabled(true);
        jbtExcluir.setEnabled(true);
        }
//        controller.setId(null);
//        controller.setId       ((Integer)jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),0));
//        controller.setNome     ((String) jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),1));    
//   
//                jtf_Id.setText(String.valueOf(controller.getId()));
//        jtf_Nome.setText(controller.getNome());  
  
        }

     }

        public void duploClickPesquisa(){
            switchSalvarFlag = "pesquisa";
//        if(estadoBotaoDesbloqueioPesquisa == true){
//            }else if(estadoBotaoDesbloqueioPesquisa == false){
                jbtNovo.setEnabled(false);
                jbtSalvarFormulario.setEnabled(true);
                jbtAtualizar.setEnabled(true);
                jbtPesquisar.setEnabled(false);
                jbtEditar.setEnabled(false);
                jbtExcluir.setEnabled(false);
                jbtAbrirSalvarLote.setEnabled(false);
                jbtAbrirSalvarLote.setEnabled(false);
                jbtImpressao.setEnabled(false);
                jbtConfig.setEnabled(false);
                  JpCPesquisarFormulario.setEnabled(false);
            JpCPesquisarFormulario.setVisible(false);
                CardLayout cl = (CardLayout) jPanelCentralJtable.getLayout();
                cl.show(jPanelCentralJtable, "cartaojPanelFormularioCadEdit");
//           controller.setId(null);
//        controller.setId       ((Integer)jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),0));
//        controller.setNome     ((String) jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),1));    
//
//                jtf_Id.setText(String.valueOf(controller.getId()));
//        jtf_Nome.setText(controller.getNome());  
  
              
                //}
        } 
      
      
     public void ExcluirRegistro(){
     
         if(jButton1.isSelected() == false){
         try {
//        controller.setId       ((Integer)jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),0));
//        controller.setNome     ((String) jTableDadosPesquisa.getValueAt(jTableDadosPesquisa.getSelectedRow(),1));    
  
//            controller.remover (Categoria.class, controller.getId());
            jTableDadosModel.clearSelection();

            this.puxarparametro(0,"Sim");
//          this.carregarinformacoes();
            jtf_Id.setText("");
            jtf_Id.setText(null);
            jtf_Nome.setText("");
            jtf_Nome.setText(null);

    
 

           }catch (Exception ex){
                                }
         
         } else if(jButton1.isSelected() == true){

             this.excluirEmMassa();
         }

         
     }

      
 public void CarregarListaSalvaEmLote(
                    String                      dirPadrao,
                    FileNameExtensionFilter     objetoFileNameExtensionFilter,
                    String                      tituloJFileChoose, 
                    String                      tituloColuna){

            String pegalistarow = "";
            try {
            lerCarregaPOI.importExcelToJtableJava(dirPadrao,objetoFileNameExtensionFilter,tituloJFileChoose);
            } catch (InterruptedException ex){
               
            }   
            DefaultTableModel modeloTabela = new DefaultTableModel();            
            modeloTabela.setNumRows(0);
            
            JtableListagemDadosArquivo.setModel(modeloTabela);
            modeloTabela.addColumn(tituloColuna);
            JtableListagemDadosArquivo.getColumnModel().getColumn(0).setPreferredWidth(350);
            this.carregador = lerCarregaPOI.dadosCarregados;
            int verificaBotao = carregador.size();
            this.carregadorConfirma = lerCarregaPOI.dadosCarregados;
            
            for (int row = 0; row < carregador.size(); row++) {
                
                    modeloTabela.addRow(new Object[]{carregador.get(row)});
                }
                      if(JtableListagemDadosArquivo.getRowCount() > 0){
                          jbtConfirmarDadoCarregados.setVisible(true);
                          jbtConfirmarDadoCarregados.setEnabled(true);
                       //   jbtCancelarSalvarLote.setVisible(true);
                       //   jbtCancelarSalvarLote.setEnabled(true);             
                      }else  if(JtableListagemDadosArquivo.getRowCount() == 0){
                          jbtConfirmarDadoCarregados.setVisible(true);
                          jbtConfirmarDadoCarregados.setEnabled(false);
                        //  jbtCancelarSalvarLote.setVisible(true);
                        //  jbtCancelarSalvarLote.setEnabled(true);
                      }
                      this.carregarInformacoes();
            }

   
class SalvarLotesThread extends Thread {

        public void run() {
                Categoria crudSalva = new Categoria();
                String pegalistarowConfirma = "";    

              for (int row = 0; row < carregadorConfirma.size(); row++){
                    pegalistarowConfirma = String.valueOf(carregadorConfirma.get(row));
                    crudSalva.setNome(pegalistarowConfirma); 
                    CarregaJprogressBarSalvar(1, carregadorConfirma.size(), row, pegalistarowConfirma);
                    try {
                        salvarParaLote(pegalistarowConfirma);
                    } catch (Exception ex) {
                       
                    }
                   
                }
                carregador.clear();
                carregadorConfirma.clear();
                carregador = null;
                carregadorConfirma = null;
                jbtAbrirSalvarLote.setEnabled(true);
  
                DefaultTableModel modelo = (DefaultTableModel)JtableListagemDadosArquivo.getModel();
                modelo.setNumRows(0);
                LimparTabelaLote();
                ComportamentoAtualizar();
                jDialogBarraDeProgresso.getOwner().dispose();
                this.stop();
        }
    }
   
         public void confimarDadosLote(){

         jDialogBarraDeProgresso.setSize(601, 52);
         jDialogBarraDeProgresso.setResizable(false);
         jDialogBarraDeProgresso.setLocationRelativeTo(null);
         jDialogBarraDeProgresso.setVisible(true);
         jDialogBarraDeProgresso.pack();
          new SalvarLotesThread().start();
        }

         

    public void salvarParaLote(String entrada) throws Exception{
        Categoria crudSalva = new Categoria();
        crudSalva.setNome(entrada);
//        controller.salvarVerificadoEmLote(crudSalva,"Categoria.findByCategoriaExistente","nome", entrada);
    }
    
    public void LimparTabelaLote(){
            DefaultTableModel modelo = (DefaultTableModel)JtableListagemDadosArquivo.getModel();
            modelo.setNumRows(0);
            JtableListagemDadosArquivo.clearSelection();

    }

    public void puxarparametro(int deslocamento, String inicioDeslocamento ){
            String jcbOrdem = jcbTipoOrdem.getSelectedItem().toString();
            String ordem = "";
            String estadoPesquisa = "";
            Boolean EstadojrdOrdernarUltimos = jrdOrdernarUltimos.isSelected();
            Boolean EstadojrdOrdenarPrimeiros = jrdOrdenarPrimeiros.isSelected();
            jMenuItemEditar.setEnabled(false);
            jMenuItemExcluir.setEnabled(false);
            jMenuItemExcluirMassa.setEnabled(false);
            
            if(EstadojrdOrdenarPrimeiros == true && EstadojrdOrdernarUltimos == false){
                ordem  =  "primeiros";      
            }
            else if(EstadojrdOrdenarPrimeiros == false && EstadojrdOrdernarUltimos == true){
                ordem = "ultimos";               
            }

              if( jRadioComecaCom.isSelected() == true){
                estadoPesquisa = "ComecaCom";
           }
            else if( jRadioContem.isSelected() == true){
                estadoPesquisa = "Contem";
           }
            else if( jRadioTerminaCom.isSelected() == true){
                estadoPesquisa = "TerminaCom";
           } else  if( jRadioComecaCom.isSelected() == false){
                estadoPesquisa = "";
           }
            else if( jRadioContem.isSelected() == false){
                estadoPesquisa = "";
           }
            else if( jRadioTerminaCom.isSelected() == false){
                estadoPesquisa = "";
           }
            
            if(jbtPesquisar.isSelected() == true){

               if(estadoPesquisa.equals("ComecaCom") && jcbOrdem.equals("Codigo") && ordem.equals("primeiros")){
               parametroCodigoAlfabeto = "Codigo";
               parametroASCDESC = "primeiros";             
               if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){        
               }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim")){
                            //   resetarPonteirosPesquisa();
                                this.EnviaModelo(jTableDadosPesquisa, "ComecaComIdPrimeiros", 0);
                                }else if (inicioDeslocamento.equals("Nao") ){ 
                                this.EnviaModelo(jTableDadosPesquisa, "ComecaComIdPrimeiros", deslocamento);    
                        }
                      }
                    }
                    else if (estadoPesquisa.equals("ComecaCom") && jcbOrdem.equals("Codigo") && ordem.equals("ultimos")){
                    parametroCodigoAlfabeto= "Codigo";
                    parametroASCDESC = "ultimos"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                            //   resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "ComecaComIdUltimos", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "ComecaComIdUltimos", deslocamento);   
                        }        
                      }      
                    }

                else if (estadoPesquisa.equals("Contem") && jcbOrdem.equals("Codigo") && ordem.equals("primeiros")){
                    parametroCodigoAlfabeto= "Codigo";
                    parametroASCDESC = "primeiros"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                            //  resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "ContemIdPrimeiros", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "ContemIdPrimeiros", deslocamento);   
                        }        
                      }      
                    }
                    else if (estadoPesquisa.equals("Contem") && jcbOrdem.equals("Codigo") && ordem.equals("ultimos")){
                    parametroCodigoAlfabeto= "Codigo";
                    parametroASCDESC = "ultimos"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                          //     resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "ContemIdUltimos", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "ContemIdUltimos", deslocamento);   
                        }        
                      }      
                    }
               
               else if (estadoPesquisa.equals("TerminaCom") && jcbOrdem.equals("Codigo") && ordem.equals("primeiros")){
                    parametroCodigoAlfabeto= "Codigo";
                    parametroASCDESC = "primeiros"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                            //   resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComIdPrimeiros", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComIdPrimeiros", deslocamento);   
                        }        
                      }      
                    }
                    else if (estadoPesquisa.equals("TerminaCom") && jcbOrdem.equals("Codigo") && ordem.equals("ultimos")){
                    parametroCodigoAlfabeto= "Codigo";
                    parametroASCDESC = "ultimos"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                            //  resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComIdUltimos", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComIdUltimos", deslocamento);   
                        }        
                      }      
                    }
               if(estadoPesquisa.equals("ComecaCom") && jcbOrdem.equals("Alfabeto") && ordem.equals("primeiros")){                        
                parametroCodigoAlfabeto= "Alfabeto";
                parametroASCDESC = "primeiros";            
               if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){        
               }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa = paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim")){
                             //   resetarPonteirosPesquisa();
                                this.EnviaModelo(jTableDadosPesquisa, "ComecaComAlfabetoPrimeiros", 0);
                                }else if (inicioDeslocamento.equals("Nao") ){ 
                                this.EnviaModelo(jTableDadosPesquisa, "ComecaComAlfabetoPrimeiros", deslocamento);    
                        }
                      }
                    }
                    else if (estadoPesquisa.equals("ComecaCom") && jcbOrdem.equals("Alfabeto") && ordem.equals("ultimos")){
                    parametroCodigoAlfabeto= "Alfabeto";
                    parametroASCDESC = "ultimos"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                            //   resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "ComecaComAlfabetoUltimos", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "ComecaComAlfabetoUltimos", deslocamento);   
                        }        
                      }      
                    }

                else if (estadoPesquisa.equals("Contem") && jcbOrdem.equals("Alfabeto") && ordem.equals("primeiros")){
                     parametroCodigoAlfabeto= "Alfabeto";
                    parametroASCDESC = "primeiros"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                             //  resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "ContemAlfabetoPrimeiros", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "ContemIdPrimeiros", deslocamento);   
                        }        
                      }      
                    }
                    else if (estadoPesquisa.equals("Contem") && jcbOrdem.equals("Alfabeto") && ordem.equals("ultimos")){
                     parametroCodigoAlfabeto= "Alfabeto";
                    parametroASCDESC = "ultimos"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                              // resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "ContemAlfabetoUltimos", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "ContemAlfabetoUltimos", deslocamento);   
                        }       
                      }      
                    }
               
               else if (estadoPesquisa.equals("TerminaCom") && jcbOrdem.equals("Alfabeto") && ordem.equals("primeiros")){
                     parametroCodigoAlfabeto= "Alfabeto";
                    parametroASCDESC = "primeiros"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                            //   resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComAlfabetoPrimeiros", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComAlfabetoPrimeiros", deslocamento);   
                        }        
                      }      
                    }
                    else if (estadoPesquisa.equals("TerminaCom") && jcbOrdem.equals("Alfabeto") && ordem.equals("ultimos")){
                     parametroCodigoAlfabeto= "Alfabeto";
                    parametroASCDESC = "ultimos"; 
                    if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                    }else{
                        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPaginaPesquisa =paginarPesquisa;
                        if(inicioDeslocamento.equals("Sim") ){
                             // resetarPonteirosPesquisa();
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComAlfabetoUltimos ", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosPesquisa, "TerminaComAlfabetoUltimos ", deslocamento);   
                        }        
                      }      
                    }
                

            else if(jbtPesquisar.isSelected() == false){
                             System.out.println("Botao nao selecionado");
              }
            } 
            else if(jbtPesquisar.isSelected() == false){
                
     
            
    if( jcbOrdem.equals("Codigo") && ordem.equals("primeiros")){
            parametroCodigoAlfabeto= "Codigo";
            parametroASCDESC = "primeiros";             
            if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){        
                }else{
                        paginar = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPagina =paginar;
                        if(inicioDeslocamento.equals("Sim") ){
                                resetarPonteiros();
                                this.EnviaModelo(jTableDadosModel, "CarregaPadraoIDTodosPrimeiros", 0);    
                                }else if (inicioDeslocamento.equals("Nao") ){
                                this.EnviaModelo(jTableDadosModel, "CarregaPadraoIDTodosPrimeiros", deslocamento);    
                        }
                      }
    }else if ( jcbOrdem.equals("Codigo") && ordem.equals("ultimos")){
              parametroCodigoAlfabeto= "Codigo";
              parametroASCDESC = "ultimos"; 
              if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){         
                }else{
                        paginar = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                        ultimaPagina =paginar;
                        if(inicioDeslocamento.equals("Sim") ){
                               resetarPonteiros();
                               this.EnviaModelo(jTableDadosModel, "CarregaPadraoIDTodosUltimos", 0);   
                               }else if(inicioDeslocamento.equals("Nao")){
                               this.EnviaModelo(jTableDadosModel, "CarregaPadraoIDTodosUltimos", deslocamento);   
                        }        
                      }
    }else if( jcbOrdem.equals("Alfabeto") && ordem.equals("primeiros")){
           parametroCodigoAlfabeto= "Alfabeto";
           parametroASCDESC = "primeiros"; 
           if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){       
           }else{
                       paginar = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                       ultimaPagina =paginar;
                           if(inicioDeslocamento.equals("Sim") ){
                                resetarPonteiros();
                                this.EnviaModelo(jTableDadosModel, "CarregaPadraoNomeTodosPrimeiros", 0);
                                }else if (inicioDeslocamento.equals("Nao") ){
                                this.EnviaModelo(jTableDadosModel, "CarregaPadraoNomeTodosPrimeiros", deslocamento);  
                        }
                      } 
        }else if (jcbOrdem.equals("Alfabeto") && ordem.equals("ultimos")){
                parametroCodigoAlfabeto= "Alfabeto";
                parametroASCDESC = "ultimos"; 
                if(jcbQuantidadePorPagina.getSelectedItem().toString().equals("Todos")){       
                }else{
                           paginar = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
                          ultimaPagina =paginar;
                                if(inicioDeslocamento.equals("Sim") ){
                                resetarPonteiros();
                                this.EnviaModelo(jTableDadosModel, "CarregaPadraoNomeTodosUltimos", 0);
                                }else if(inicioDeslocamento.equals("Nao") ){
                                 this.EnviaModelo(jTableDadosModel, "CarregaPadraoNomeTodosUltimos", deslocamento); 
                              }          
                           }          
                        }
                     }
                  }
  
     
   
    public void  somar(){

         int pagina1 = Integer.valueOf(jLabelTotalPaginas.getText());
         int ajustaPaginacao = pagina1 + 1 ;
         if(memoria < pagina1 && finalPaginaBol == false ){
                    deslocamento1       =   paginaAtual + paginar;  
                    deslocado           =   deslocamento1;
                    paginaAtual         =   deslocado;
                    memoria++;
                    JlPgDe.setText(String.valueOf(memoria));
                    jbtUmaPaginaEsquerda.setEnabled(true);
                    jbtInicioPagina.setEnabled(true);
                    this.puxarparametro(deslocamento1,"Nao");
                 if(memoria == pagina1){
                        jbtUmaPaginaDireita.setEnabled(false);
                        jbtFimPagina.setEnabled(false);
                         finalPaginaBol = true;
                         inicioPaginaBol = false;
                         JOptionPane.showMessageDialog(null, "Fim da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                 }
             }
            else if(memoria < pagina1 && finalPaginaBol == true ){
                    deslocamento1       =   paginaAtual + paginar;  
                    deslocado           =   deslocamento1;
                    paginaAtual         =   deslocado;
                    memoria++;
                    JlPgDe.setText(String.valueOf(memoria));
                    jbtUmaPaginaEsquerda.setEnabled(true);
                    jbtInicioPagina.setEnabled(true);
                    this.puxarparametro(deslocamento1,"Nao");
                  if(memoria == pagina1){
                     jbtUmaPaginaDireita.setEnabled(false);
                     jbtFimPagina.setEnabled(false);
                     finalPaginaBol = true;
                     inicioPaginaBol = false;
                     JOptionPane.showMessageDialog(null, "Fim da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                 }
            }
            System.out.println("memoria :"+memoria+" pagina atual:"+paginaAtual+" paginar:"+paginar+" deslocamento1: "+deslocamento1+" deslocado: "+deslocado+" paginar: "+paginar); 
         }
   
    public void  descontar(){
         int pagina1 = Integer.valueOf(jLabelTotalPaginas.getText());
         if(  memoria > 1 && memoria <= pagina1 && inicioPaginaBol == true ){
             
            deslocamento1 = deslocamento1 - paginar;    
            deslocado = deslocamento1;
            paginaAtual =deslocado;
            --memoria;
            JlPgDe.setText(String.valueOf(memoria));
            
            jbtUmaPaginaDireita.setEnabled(true);
            jbtFimPagina.setEnabled(true);
            this.puxarparametro(deslocamento1,"Nao");
              if(memoria == 1){
                    jbtUmaPaginaDireita.setEnabled(true);
                    jbtFimPagina.setEnabled(true);  

                         inicioPaginaBol = true;
                         finalPaginaBol= false;
                            JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                 }
         }
         
         else if( memoria > 1 && memoria <= pagina1  && inicioPaginaBol == false ){
            deslocamento1 = deslocamento1 - paginar;    
            deslocado = deslocamento1;
            paginaAtual =deslocado;
             --memoria;
              JlPgDe.setText(String.valueOf(memoria));
              this.puxarparametro(deslocamento1,"Nao");
              jbtUmaPaginaDireita.setEnabled(true);
              jbtFimPagina.setEnabled(true);  
           if(finalPaginaBol == true){
             jbtUmaPaginaDireita.setEnabled(true);
             jbtFimPagina.setEnabled(true);  
             
             }
            if(memoria == 1){
                inicioPaginaBol = true;
                finalPaginaBol = false;
                            JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                 }
            }
         }

    public void  somarPesquisa(){
         int pagina1Pesquisa = Integer.valueOf(jLabelTotalPaginasPesquisar.getText());
         int ajustaPaginacao = pagina1Pesquisa + 1 ;
    
         if(memoriaPesquisa < pagina1Pesquisa && finalPaginaBolPesquisa == false ){
                    deslocamento1Pesquisa       =   paginaAtualPesquisa + paginarPesquisa;  
                    deslocadoPesquisa           =   deslocamento1Pesquisa;
                    paginaAtualPesquisa         =   deslocadoPesquisa;  
                    memoriaPesquisa++;
                    JlPgDePesquisa.setText(String.valueOf(memoriaPesquisa));
                    jbtUmaPaginaEsquerdaPesquisa.setEnabled(true);
                    jbtInicioPaginaPesquisa.setEnabled(true);
                     this.puxarparametro(deslocamento1Pesquisa,"Nao");
                     
                 if(memoriaPesquisa == pagina1Pesquisa){
                        jbtUmaPaginaDireitaPesquisa.setEnabled(false);
                        jbtFimPaginaPesquisa.setEnabled(false);
                        finalPaginaBolPesquisa = true;
                        inicioPaginaBolPesquisa = false;
                        JOptionPane.showMessageDialog(null, "Fim da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                 }
             }
            else if(memoriaPesquisa < pagina1Pesquisa && finalPaginaBolPesquisa == true ){
                   deslocamento1Pesquisa        =   paginaAtualPesquisa + paginarPesquisa;  
                    deslocadoPesquisa           =   deslocamento1Pesquisa;
                    paginaAtualPesquisa         =   deslocadoPesquisa;
                      memoriaPesquisa++;
                      JlPgDePesquisa.setText(String.valueOf(memoriaPesquisa));
                      jbtUmaPaginaEsquerdaPesquisa.setEnabled(true);
                      jbtInicioPaginaPesquisa.setEnabled(true);
                      this.puxarparametro(deslocamento1Pesquisa,"Nao");
                          if(memoriaPesquisa == pagina1Pesquisa){
                                jbtUmaPaginaDireitaPesquisa.setEnabled(false);
                                jbtFimPaginaPesquisa.setEnabled(false);
                                finalPaginaBolPesquisa  = true;
                                inicioPaginaBolPesquisa = false;
                               JOptionPane.showMessageDialog(null, "Fim da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                         }
                    }
                   
                 }
   
    public void  descontarPesquisar(){
         int pagina1 = Integer.valueOf(jLabelTotalPaginasPesquisar.getText());
         if(  memoriaPesquisa > 1 && memoriaPesquisa <= pagina1 && inicioPaginaBolPesquisa == true ){
             
            deslocamento1Pesquisa = deslocamento1Pesquisa - paginarPesquisa;    
            deslocadoPesquisa = deslocamento1Pesquisa;
            paginaAtualPesquisa =deslocadoPesquisa;
            --memoriaPesquisa;
            JlPgDePesquisa.setText(String.valueOf(memoriaPesquisa));
            
            jbtUmaPaginaDireitaPesquisa.setEnabled(true);
            jbtFimPaginaPesquisa.setEnabled(true);
            this.puxarparametro(deslocamento1Pesquisa,"Nao");
              if(memoriaPesquisa == 1){
                    jbtUmaPaginaDireitaPesquisa.setEnabled(true);
                    jbtFimPaginaPesquisa.setEnabled(true);  
                    inicioPaginaBolPesquisa = true;
                    finalPaginaBolPesquisa= false;
                    JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                 }
         }
         
         else if( memoriaPesquisa > 1 && memoriaPesquisa <= pagina1  && inicioPaginaBolPesquisa == false ){
           
            deslocamento1Pesquisa = deslocamento1Pesquisa - paginarPesquisa;    
            deslocadoPesquisa = deslocamento1Pesquisa;
            paginaAtualPesquisa =deslocadoPesquisa;
            --memoriaPesquisa;
            JlPgDePesquisa.setText(String.valueOf(memoriaPesquisa));
            this.puxarparametro(deslocamento1Pesquisa,"Nao");
            jbtUmaPaginaDireitaPesquisa.setEnabled(true);
            jbtFimPaginaPesquisa.setEnabled(true); 
           if(finalPaginaBolPesquisa == true){
             jbtUmaPaginaDireitaPesquisa.setEnabled(true);
             jbtFimPaginaPesquisa.setEnabled(true);  
             }
            if(memoriaPesquisa == 1){
               inicioPaginaBolPesquisa = true;
               finalPaginaBolPesquisa = false;
               JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
              }
            }
         }
    
    
      public void resetarPonteirosPesquisa(){
        finalPaginaBolPesquisa = false;
        inicioPaginaBolPesquisa = true;
        jbtUmaPaginaDireitaPesquisa.setEnabled(true);
        jbtFimPaginaPesquisa.setEnabled(true);
        JlPgDePesquisa.setText(String.valueOf(1));
        paginaAtualPesquisa = 0;
        paginarPesquisa = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
        deslocadoPesquisa = 0;
        JlPgDePesquisa.setText(String.valueOf(1));
        memoriaPesquisa = 1;
        deslocamento1Pesquisa =0;
        }
      
      
      public void resetarPonteiros(){
        finalPaginaBol = false;
        inicioPaginaBol = true;
        jbtUmaPaginaDireita.setEnabled(true);
        jbtFimPagina.setEnabled(true);
        JlPgDe.setText(String.valueOf(1));
        paginaAtual = 0;
        paginar = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
        deslocado = 0;
        JlPgDe.setText(String.valueOf(1));
        memoria = 1;
        deslocamento1 =0;
        }
      
         public void inicioPaginaPesquisa(){
            int pagina1 = 1;
            int ajustaPaginacao = 2 ;
            for(int i = memoriaPesquisa; memoriaPesquisa >= ajustaPaginacao; i--){
                    deslocamento1Pesquisa   =   paginaAtualPesquisa - paginarPesquisa;  
                    deslocadoPesquisa       =   deslocamento1Pesquisa;
                    paginaAtualPesquisa     =   deslocadoPesquisa;
                    memoriaPesquisa--;

                if(memoriaPesquisa == pagina1){
                jbtUmaPaginaDireitaPesquisa.setEnabled(true);
                jbtFimPaginaPesquisa.setEnabled(true);
                jbtUmaPaginaEsquerdaPesquisa.setEnabled(true);
                jbtInicioPaginaPesquisa.setEnabled(true);
                JlPgDePesquisa.setText(String.valueOf(memoriaPesquisa));
                         inicioPaginaBolPesquisa = false;
                         finalPaginaBolPesquisa = true;
                         this.puxarparametro(deslocamento1Pesquisa,"Nao"); 
                         JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
              }
        }
      
     public void inicioPagina(){
           int pagina1 = 1;
           int ajustaPaginacao = 2 ;
           for(int i = memoria; memoria >= ajustaPaginacao; i--){
               deslocamento1   =   paginaAtual - paginar;  
               deslocado       =   deslocamento1;
               paginaAtual     =   deslocado;
               memoria--; 
            if(memoria == pagina1){
                jbtUmaPaginaDireita.setEnabled(true);
                jbtFimPagina.setEnabled(true);
                jbtUmaPaginaEsquerda.setEnabled(true);
                jbtInicioPagina.setEnabled(true);
                JlPgDe.setText(String.valueOf(memoria));
                inicioPaginaBol = false;
                finalPaginaBol = true;
                this.puxarparametro(deslocamento1,"Nao"); 
                JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
              }
           }
        }

     public void finalDaPagina(){
        int pagina1 = Integer.valueOf(jLabelTotalPaginas.getText());
        int ajustaPaginacao = pagina1 - 1 ;
        for(int i = memoria; memoria <= ajustaPaginacao; i++){
        deslocamento1   =   paginaAtual + paginar;  
        deslocado       =   deslocamento1;
        paginaAtual     =   deslocado;
        memoria++;
            if(memoria == pagina1){
                jbtUmaPaginaDireita.setEnabled(false);
                jbtFimPagina.setEnabled(false);
                jbtUmaPaginaEsquerda.setEnabled(true);
                jbtInicioPagina.setEnabled(true);
                JlPgDe.setText(String.valueOf(memoria));
                inicioPaginaBol = false;
                finalPaginaBol = true;
                this.puxarparametro(deslocamento1,"Nao"); 
                JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
               }
           }
       }
     
    public void finalDaPaginaPesquisa(){
        int pagina1 = Integer.valueOf(jLabelTotalPaginasPesquisar.getText());
        int ajustaPaginacao = pagina1 - 1 ;
        for(int i = memoriaPesquisa; memoriaPesquisa <= ajustaPaginacao; i++){
        deslocamento1Pesquisa   =   paginaAtualPesquisa + paginarPesquisa;  
        deslocadoPesquisa       =   deslocamento1Pesquisa;
        paginaAtualPesquisa     =   deslocadoPesquisa;
        memoriaPesquisa++;
            if(memoriaPesquisa == pagina1){
                jbtUmaPaginaDireitaPesquisa.setEnabled(false);
                jbtFimPaginaPesquisa.setEnabled(false);
                jbtUmaPaginaEsquerdaPesquisa.setEnabled(true);
                jbtInicioPaginaPesquisa.setEnabled(true);
                JlPgDePesquisa.setText(String.valueOf(memoriaPesquisa));
                         inicioPaginaBolPesquisa = false;
                         finalPaginaBolPesquisa = true;
                         this.puxarparametro(deslocamento1Pesquisa,"Nao"); 
                         JOptionPane.showMessageDialog(null, "Início da Paginação", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
     
        public void carregarInformacoesPesquisa(){
            resultadoPesquisa = 0;
            int quantidadeRegPesquisa   = 0;
            quantidadeRegPesquisa       =  controller.quantRegPesquisaController;
            int jcbPaginasPesquisa      = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
             resultadoPesquisa          = quantidadeRegPesquisa / jcbPaginasPesquisa;
             int restoPesquisa          = quantidadeRegPesquisa % jcbPaginasPesquisa;
             if (restoPesquisa >= 1){
                jLabelTotalPaginasPesquisar.setText(String.valueOf(resultadoPesquisa+1));
             }
             else if (restoPesquisa == 0){                
              jLabelTotalPaginasPesquisar.setText(String.valueOf(resultadoPesquisa));
             }
    }
     
  
    public void carregarInformacoes(){
        resultado = 0;
        //controller.contarTodos("Categoria.findAll");
      //  controller.ContarTodos("Categoria.findAll");
        int quantidadeReg   = 0;
        quantidadeReg       =  controller.quantRegistrosController;
        int jcbPaginas = Integer.parseInt(jcbQuantidadePorPagina.getSelectedItem().toString());
        resultado = quantidadeReg / jcbPaginas;
        int resto = quantidadeReg % jcbPaginas;
        if (resto >= 1){
            jLabelTotalPaginas.setText(String.valueOf(resultado+1));
         }
         else if (resto == 0){             
          jLabelTotalPaginas.setText(String.valueOf(resultado));
         }
    }

    public void exportarExcel(){
        if(jbtPesquisar.isSelected() == true && JtableListagemDadosArquivo.getRowCount() > 0){
            
            exportarJtable.exportarJtable(JtableListagemDadosArquivo);
            
         //   controller.importExcelToJtableJava(pegaDirPadrao, PegaobjetoFileNameExtensionFilter, TITLE_PROPERTY);
            
                    }else if(jbtPesquisar.isSelected() == false && jTableDadosModel.getRowCount() > 0 ){
            exportarJtable.exportarJtable(jTableDadosModel);
            }else {
            JOptionPane.showMessageDialog(null, "Não há dados listados para exportar", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        }

 
       public void exportarExcelPesquisa(){
        if(jbtDesbloquearDelecao.isSelected() == true && jTableDadosPesquisa.getRowCount() > 0){
            exportarJtable.exportarJtable(jTableDadosPesquisa);  
        }else if(jbtDesbloquearDelecao.isSelected() == false && jTableDadosModel.getRowCount() > 0 ){
            exportarJtable.exportarJtable(jTableDadosModel);
        }else {
            JOptionPane.showMessageDialog(null, "Não há dados listados para exportar", "Aviso do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    
 
       
    class ExcluirEmMassaThread extends Thread {
        public void run() {
                int arreioDeLinhaSelecionadas[] = jTableDadosModel.getSelectedRows();
                int jColunnTable = 0;
                int jColunnTableNome = 1;
                  for(int t =0; t < arreioDeLinhaSelecionadas.length;t++){
                      int k = arreioDeLinhaSelecionadas[t];
                      Object objetoResgatado = jTableDadosModel.getValueAt(k, jColunnTable);
                      Object objetoResgatadoNome = jTableDadosModel.getValueAt(k, jColunnTableNome);
                      int codigo = Integer.parseInt(objetoResgatado.toString());
                      CarregaJprogressBarDeletar(0, arreioDeLinhaSelecionadas.length, t, objetoResgatadoNome.toString());
                   //   controller.removerEmMassa(Categoria.class, codigo);
             }
         jTableDadosModel.clearSelection();
        puxarparametro(0,"Sim");
        ComportamentoAtualizar();
         jDialogBarraDeProgresso2.getOwner().dispose();
        this.stop();
       
        }
    }

        public void  excluirEmMassa(){
            
            int opcao;
        Object[] botoes = {" SIM "," NÃO "};
        opcao = JOptionPane.showOptionDialog(
        null, 
       "Confirma a exclusão das linhas selecionadas ?",
       "    PERGUNTA DO SISTEMA     ", 
       JOptionPane.YES_NO_OPTION,
       JOptionPane.WARNING_MESSAGE,
       null,botoes,botoes[0]);
        if (opcao ==  JOptionPane.YES_OPTION) {
         
         jDialogBarraDeProgresso2.setSize(601, 52);
         jDialogBarraDeProgresso2.setResizable(false);
         jDialogBarraDeProgresso2.setLocationRelativeTo(null);
         jDialogBarraDeProgresso2.setVisible(true);
         jDialogBarraDeProgresso2.pack();
            new ExcluirEmMassaThread().start();
             }else if (opcao ==  JOptionPane.NO_OPTION) {
                 jTableDadosModel.clearSelection();
                 jTableDadosPesquisa.clearSelection();
           }
        }
    
     public void EnviaModelo(JTable jTable, String pesquisa,int deslocamento) {
         int limiteLinhas= paginar;
         
          if(pesquisa.equals("ComecaComIdPrimeiros") && parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("primeiros")){
   //      listaCatArray = controller.PesquisarComecaController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaComecaComIdPrimeiros", "nome", jtextCampoPesquisa.getText());
   //     jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
             carregarInformacoesPesquisa();
         }
          else if(pesquisa.equals("ComecaComIdUltimos") && parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("ultimos")){
  //       listaCatArray = controller.PesquisarComecaController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaComecaComIdUltimos", "nome", jtextCampoPesquisa.getText());
  //       jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
             carregarInformacoesPesquisa();
         }
         else if(pesquisa.equals("ContemIdPrimeiros") && parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("primeiros") ){
   //      listaCatArray = controller.PesquisarContemController(limiteLinhas, deslocamento,"Categoria.findByNomeCategoriaContemIdPrimeiros", "nome", jtextCampoPesquisa.getText());
   //      jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
         carregarInformacoesPesquisa();
         }
            else if(pesquisa.equals("ContemIdUltimos")&& parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("ultimos") ){
   //      listaCatArray = controller.PesquisarContemController(limiteLinhas, deslocamento,"Categoria.findByNomeCategoriaContemIdUltimos", "nome", jtextCampoPesquisa.getText());
   //       jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
            carregarInformacoesPesquisa();
         } 
         else if(pesquisa.equals("TerminaComIdPrimeiros")&& parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("primeiros") ){
  //       listaCatArray = controller.PesquisarTerminaComController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaTerminaComIdPrimeiros", "nome", jtextCampoPesquisa.getText());    
  //       jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
            carregarInformacoesPesquisa();
         }
         else if(pesquisa.equals("TerminaComIdUltimos")&& parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("ultimos") ){
 //        listaCatArray = controller.PesquisarTerminaComController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaTerminaComIdUltimos", "nome", jtextCampoPesquisa.getText());    
  //       jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
             carregarInformacoesPesquisa();
         }

         else if(pesquisa.equals("ComecaComAlfabetoPrimeiros") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("primeiros")){
  //       listaCatArray = controller.PesquisarContemController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaComecaComAlfabetoPrimeiros", "nome", jtextCampoPesquisa.getText());
  //       jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
            carregarInformacoesPesquisa();
         }
          else if(pesquisa.equals("ComecaComAlfabetoUltimos") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("ultimos")){
  //       listaCatArray = controller.PesquisarComecaController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaComecaComAlfabetoUltimos", "nome", jtextCampoPesquisa.getText());
   //       jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
             carregarInformacoesPesquisa();
         }
         else if(pesquisa.equals("ContemAlfabetoPrimeiros") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("primeiros") ){
 //        listaCatArray = controller.PesquisarContemController(limiteLinhas, deslocamento,"Categoria.findByNomeCategoriaContemAlfabetoPrimeiros", "nome", jtextCampoPesquisa.getText());
 //        jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
                carregarInformacoesPesquisa();
         }
            else if(pesquisa.equals("ContemAlfabetoUltimos") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("ultimos") ){
 //        listaCatArray = controller.PesquisarContemController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaContemAlfabetoUltimos", "nome", jtextCampoPesquisa.getText());
 //        jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
            carregarInformacoesPesquisa();
         } 
         else if(pesquisa.equals("TerminaComAlfabetoPrimeiros") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("primeiros") ){
  //       listaCatArray = controller.PesquisarTerminaComController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaTerminaComAlfabetoPrimeiros", "nome", jtextCampoPesquisa.getText());    
  //       jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
             carregarInformacoesPesquisa();
         }
         else if(pesquisa.equals("TerminaComAlfabetoUltimos") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("ultimos")){
      //   listaCatArray = controller.PesquisarTerminaComController(limiteLinhas, deslocamento, "Categoria.findByNomeCategoriaTerminaComAlfabetoUltimos", "nome", jtextCampoPesquisa.getText());    
    //     jLNumeroLinhasPesquisar.setText(String.valueOf(controller.quantRegPesquisaController));
            carregarInformacoesPesquisa();
         }
    
        else if(pesquisa.equals("CarregaPadraoIDTodosUltimos") && parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("ultimos")){
//        listaCatArray = controller.PesquisaPaginada(limiteLinhas, deslocamento, "Categoria.CarregaPadraoIDTodosUltimos");              
       //      jLNumeroLinhas.setText(String.valueOf(controller.quantRegistrosController));
             carregarInformacoes();
         }
         else if(pesquisa.equals("CarregaPadraoIDTodosPrimeiros") && parametroCodigoAlfabeto.equals("Codigo") && parametroASCDESC.equals("primeiros")){
     //   listaCatArray = controller.PesquisaPaginada(limiteLinhas, deslocamento, "Categoria.CarregaPadraoIDTodosPrimeiros");              
          
      //         jLNumeroLinhas.setText(String.valueOf(controller.quantRegistrosController));
               carregarInformacoes();
         }
         else if(pesquisa.equals("CarregaPadraoNomeTodosUltimos") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("ultimos")){
  //     listaCatArray = controller.PesquisaPaginada(limiteLinhas, deslocamento, "Categoria.CarregaPadraoNomeTodosUltimos");              
    //           jLNumeroLinhas.setText(String.valueOf(controller.quantRegistrosController));
               carregarInformacoes();
         }
         else if(pesquisa.equals("CarregaPadraoNomeTodosPrimeiros") && parametroCodigoAlfabeto.equals("Alfabeto") && parametroASCDESC.equals("primeiros")){
       // listaCatArray = controller.PesquisaPaginada(limiteLinhas, deslocamento, "Categoria.CarregaPadraoNomeTodosPrimeiros");              
            
        //       jLNumeroLinhas.setText(String.valueOf(controller.quantRegistrosController));
               carregarInformacoes();
         }
        CategoriaTableModel modelController       = new CategoriaTableModel(listaCatArray);
        jTable.setModel(modelController);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(60);
      //  jTable.getColumnModel().getColumn(0).setCellRenderer(corIntegerCellRenderer1);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(300);
      //  jTable.getColumnModel().getColumn(1).setCellRenderer(corStringCellRenderer1);    
//        jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
//        jTable.getColumnModel().getColumn(2).setCellRenderer(corStringCellRenderer1);
//        jTable.getColumnModel().getColumn(3).setPreferredWidth(100);
//        jTable.getColumnModel().getColumn(3).setCellRenderer(corDoubleCellRenderer1);
//        jTable.getColumnModel().getColumn(4).setPreferredWidth(150);
//        jTable.getColumnModel().getColumn(4).setCellRenderer(imageIconCellRenderer1);
//        jTable.getColumnModel().getColumn(5).setPreferredWidth(150);
//        jTable.getColumnModel().getColumn(5).setCellRenderer(corStringCellRenderer1);
        
        
        int tamanhoLista =  modelController.getRowCount();

            if(jbtPesquisar.isSelected() == true && tamanhoLista > 0){

            jbtDesbloquearDelecao.setEnabled(true);
            jbtExportarResultadoJtablePesquisa.setEnabled(true);

            }else if(jbtPesquisar.isSelected() == true && tamanhoLista <= 0){
                
            jbtDesbloquearDelecao.setEnabled(false);
            jbtExportarResultadoJtablePesquisa.setEnabled(false);

            }

    }
     
   public void CarregaJprogressBarSalvar(int minimoValor,int maximoValor,int valorEntrada, String valorNomeEntrada){
                int acumulador = 1;
                acumulador = acumulador + valorEntrada;
               
                 jProgressBar1.setStringPainted(true);
                 jProgressBar1.setMinimum(minimoValor);
                 jProgressBar1.setMaximum(maximoValor);
                 jProgressBar1.setValue(acumulador);
                 jLabel1.setText("Analisando: "+valorNomeEntrada);
                 if(acumulador == jProgressBar1.getMaximum()){
                  acumulador = 1;
                 }
                
                 
   }
           
      public void CarregaJprogressBarDeletar(int minimoValorExclusao,int maximoValorExclusao,int valorEntradaExclusao, String valorNomeEntradaExclusao){
                int acumuladorExclusao = 1;
                acumuladorExclusao = acumuladorExclusao + valorEntradaExclusao;
               
                 jProgressBar2.setStringPainted(true);
                 jProgressBar2.setMinimum(minimoValorExclusao);
                 jProgressBar2.setMaximum(maximoValorExclusao);
                 jProgressBar2.setValue(acumuladorExclusao);
                 jLabel2.setText("Excluindo: "+valorNomeEntradaExclusao);
                 if(acumuladorExclusao == jProgressBar2.getMaximum()){
                  acumuladorExclusao = 1;
                 }            
   }
      
      
      
    public void aumentarFonte(){
           controleFonte.aumentarFonte(jTableDadosModel, jTableDadosPesquisa, posicaoTamanhoFonte);
           posicaoTamanhoFonte = controleFonte.retornoposicao;
           System.out.println(String.valueOf(posicaoTamanhoFonte));
    }

    public void reduzirFonte(){
         controleFonte.reduzirFonte(jTableDadosModel, jTableDadosPesquisa, posicaoTamanhoFonte);
         posicaoTamanhoFonte = controleFonte.retornoposicao;
         System.out.println(String.valueOf(posicaoTamanhoFonte));
    }

}

