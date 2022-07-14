/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.com.nbcf.sacolaosoftware.view;

/**
 *
 * @author nil_b
 */
public class TipoUnidadeJInternalForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form TipoUnidadeJInternalForm
     */
//    public TipoUnidadeJInternalForm() {
//        initComponents();
//    }
    private static TipoUnidadeJInternalForm  tipoUnidadeJInternalForm;
    public static TipoUnidadeJInternalForm getUETipoUnidadeJInternalForm(){
       if(tipoUnidadeJInternalForm == null){
            tipoUnidadeJInternalForm = new TipoUnidadeJInternalForm();
            }
            return tipoUnidadeJInternalForm;
       }
    
     public TipoUnidadeJInternalForm() {
        initComponents();
  //    carregarEstadoPadrao("CarregaPadraoIDTodosUltimos", 0, "cartaoExibeJpanelJTableModel");
    }
      
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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
        jLabel5 = new javax.swing.JLabel();
        jdc_data = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jtf_valor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_estatus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_usuario = new javax.swing.JTextField();
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
        jbtNovo.setText("F1");
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
        jbtSalvarFormulario.setText("F2");
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
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
        jbtCancelarSalvarLote.setFocusable(false);
        jbtCancelarSalvarLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtCancelarSalvarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarSalvarLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtCancelarSalvarLote);
        jToolBar1.add(jSeparator3);

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
        jTableDadosPesquisa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Data:");

        jdc_data.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Valor:");

        jtf_valor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Estatus:");

        jtf_estatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Usuario:");

        jtf_usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelFormularioCadEditLayout = new javax.swing.GroupLayout(jPanelFormularioCadEdit);
        jPanelFormularioCadEdit.setLayout(jPanelFormularioCadEditLayout);
        jPanelFormularioCadEditLayout.setHorizontalGroup(
            jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioCadEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Id)
                    .addComponent(jl_Nome)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtf_estatus, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_valor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdc_data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addComponent(jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(642, Short.MAX_VALUE))
        );
        jPanelFormularioCadEditLayout.setVerticalGroup(
            jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioCadEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormularioCadEditLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Id)
                            .addComponent(jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Nome)
                            .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jdc_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jtf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioCadEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCentralJtable.add(jPanelFormularioCadEdit, "cartaojPanelFormularioCadEdit");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        getContentPane().add(jPanelPreNavegador, gridBagConstraints);

        JpCNavegador.setBackground(new java.awt.Color(204, 204, 204));
        JpCNavegador.setLayout(new java.awt.CardLayout());

        jPanelNavegadorPagina.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jbtInicioPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInicioPaginaActionPerformed(evt);
            }
        });
        jPanelNavegadorPagina.add(jbtInicioPagina);

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

        jbtUmaPaginaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUmaPaginaDireitaActionPerformed(evt);
            }
        });
        jPanelNavegadorPagina.add(jbtUmaPaginaDireita);

        jbtFimPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFimPaginaActionPerformed(evt);
            }
        });
        jPanelNavegadorPagina.add(jbtFimPagina);

        JpCNavegador.add(jPanelNavegadorPagina, "card3");

        jPanelNavegadorPesquisa.setMinimumSize(new java.awt.Dimension(448, 25));
        jPanelNavegadorPesquisa.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jbtInicioPaginaPesquisa.setFocusable(false);
        jbtInicioPaginaPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtInicioPaginaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInicioPaginaPesquisaActionPerformed(evt);
            }
        });
        jPanelNavegadorPesquisa.add(jbtInicioPaginaPesquisa);

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

        jbtUmaPaginaDireitaPesquisa.setFocusable(false);
        jbtUmaPaginaDireitaPesquisa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtUmaPaginaDireitaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtUmaPaginaDireitaPesquisaActionPerformed(evt);
            }
        });
        jPanelNavegadorPesquisa.add(jbtUmaPaginaDireitaPesquisa);

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
      //  ComportamentoNovoRegistro();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarFormularioActionPerformed
      //  ComportamentoSalvarRegistro();

      //  switchSalvar();
    }//GEN-LAST:event_jbtSalvarFormularioActionPerformed

    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
     //   ComportamentoAtualizar();

    //    carregarEstadoPadrao("CarregaPadraoIDTodosUltimos", 0, "cartaoExibeJpanelJTableModel");
    }//GEN-LAST:event_jbtAtualizarActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
     //   ComportamentoPesquisar();
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
      //  ComportamentoEditar();
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
       // ExcluirRegistro();
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtAbrirSalvarLoteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jbtAbrirSalvarLoteComponentResized

    }//GEN-LAST:event_jbtAbrirSalvarLoteComponentResized

    private void jbtAbrirSalvarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAbrirSalvarLoteActionPerformed
     //   ComportamentoSalvarLotes();
    }//GEN-LAST:event_jbtAbrirSalvarLoteActionPerformed

    private void jbtImpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtImpressaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtImpressaoActionPerformed

    private void jbtConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfigActionPerformed
      //  ConfiguracaoAcessibilidade();
    }//GEN-LAST:event_jbtConfigActionPerformed

    private void jRadioTerminaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTerminaComActionPerformed
     //   puxarparametro(0,"Sim");
    }//GEN-LAST:event_jRadioTerminaComActionPerformed

    private void jRadioComecaComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioComecaComActionPerformed
      //  puxarparametro(0,"Sim");
    }//GEN-LAST:event_jRadioComecaComActionPerformed

    private void jRadioContemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioContemActionPerformed
      //  puxarparametro(0,"Sim");
    }//GEN-LAST:event_jRadioContemActionPerformed

    private void jtextCampoPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextCampoPesquisaFocusLost
      //  puxarparametro(0, "Sim");
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

       // fecharPesquisaBotaoInterno();
    }//GEN-LAST:event_jbtFecharPesquisaActionPerformed

    private void jTableDadosModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosModelMouseClicked
//        if (evt.getClickCount() == 1) {
//            ClicarLista();
//
//        } else if (evt.getClickCount() == 2) {
//            duploClick();
//        }
    }//GEN-LAST:event_jTableDadosModelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //    desbloqueiaDelecaoMultipla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtExportarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExportarPesquisaActionPerformed
    //    exportarExcel();
    }//GEN-LAST:event_jbtExportarPesquisaActionPerformed

    private void jbtLocalizarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLocalizarArquivoActionPerformed
//        FileNameExtensionFilter filtoDeNomesDeExtensaoDeArquivos = new FileNameExtensionFilter("Arquivo tipo Planilha", "xls", "xlsx", "xlsm");
//        CarregarListaSalvaEmLote("C:\\",filtoDeNomesDeExtensaoDeArquivos,"Selecione Um Arquivo do Tipo: xls, xlsx, xlsm","Dados Encontrados");
    }//GEN-LAST:event_jbtLocalizarArquivoActionPerformed

    private void jbtConfirmarDadoCarregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmarDadoCarregadosActionPerformed

    //    ConfirmarDadosCarregados();
    //    new SalvarLotesThread().start();
    }//GEN-LAST:event_jbtConfirmarDadoCarregadosActionPerformed

    private void jbtCancelarSalvarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarSalvarLoteActionPerformed
     //   ComportamentoAtualizar();
    }//GEN-LAST:event_jbtCancelarSalvarLoteActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTableDadosPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosPesquisaMouseClicked
//        clicarJTablePesquisa();
//
//        if (evt.getClickCount() == 2) {
//            ClicarListaPesquisa();
//
//        }
//
//        if (evt.getClickCount() == 1) {
//            ClicarListaPesquisa();
//
//        } else if (evt.getClickCount() == 2) {
//            duploClickPesquisa();
//        }
    }//GEN-LAST:event_jTableDadosPesquisaMouseClicked

    private void jbtDesbloquearDelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDesbloquearDelecaoActionPerformed
       // desbloqueiaDelecaoMultiplaPesquisa();
    }//GEN-LAST:event_jbtDesbloquearDelecaoActionPerformed

    private void jbtExportarResultadoJtablePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExportarResultadoJtablePesquisaActionPerformed
      //  exportarExcelPesquisa();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtExportarResultadoJtablePesquisaActionPerformed

    private void jbtInicioPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInicioPaginaActionPerformed
     //   inicioPagina();
    }//GEN-LAST:event_jbtInicioPaginaActionPerformed

    private void jbtUmaPaginaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaEsquerdaActionPerformed
     //   descontar();
    }//GEN-LAST:event_jbtUmaPaginaEsquerdaActionPerformed

    private void jbtUmaPaginaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaDireitaActionPerformed
      //  somar();
    }//GEN-LAST:event_jbtUmaPaginaDireitaActionPerformed

    private void jbtFimPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFimPaginaActionPerformed
      //  finalDaPagina();
    }//GEN-LAST:event_jbtFimPaginaActionPerformed

    private void jbtInicioPaginaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInicioPaginaPesquisaActionPerformed
      //  inicioPaginaPesquisa();
    }//GEN-LAST:event_jbtInicioPaginaPesquisaActionPerformed

    private void jbtUmaPaginaEsquerdaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaEsquerdaPesquisaActionPerformed
      //  descontarPesquisar();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtUmaPaginaEsquerdaPesquisaActionPerformed

    private void jbtUmaPaginaDireitaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtUmaPaginaDireitaPesquisaActionPerformed
       // somarPesquisa();
    }//GEN-LAST:event_jbtUmaPaginaDireitaPesquisaActionPerformed

    private void jbtFimPaginaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFimPaginaPesquisaActionPerformed
      //  finalDaPaginaPesquisa();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtFimPaginaPesquisaActionPerformed

    private void jcbQuantidadePorPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbQuantidadePorPaginaActionPerformed
      //  puxarparametro(0,"Sim");
    }//GEN-LAST:event_jcbQuantidadePorPaginaActionPerformed

    private void jrdOrdenarPrimeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdOrdenarPrimeirosActionPerformed
     //   puxarparametro(0,"Sim");
    }//GEN-LAST:event_jrdOrdenarPrimeirosActionPerformed

    private void jrdOrdernarUltimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdOrdernarUltimosActionPerformed
     //   puxarparametro(0,"Sim");
    }//GEN-LAST:event_jrdOrdernarUltimosActionPerformed

    private void jcbTipoOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoOrdemActionPerformed
      //  puxarparametro(0,"Sim");
    }//GEN-LAST:event_jcbTipoOrdemActionPerformed

    private void jbtAumentaFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAumentaFonteActionPerformed
     //   aumentarFonte();
    }//GEN-LAST:event_jbtAumentaFonteActionPerformed

    private void jbtReduzFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtReduzFonteActionPerformed
      //  reduzirFonte();
    }//GEN-LAST:event_jbtReduzFonteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel espacoJLabelNavegadorPagina;
    private javax.swing.JLabel espacoJLabelNavegadorPaginaPesquisa;
    private javax.swing.JToggleButton jButton1;
    private javax.swing.JLabel jLNumeroLinhas;
    private javax.swing.JLabel jLNumeroLinhasPesquisar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelContagem;
    private javax.swing.JLabel jLabelEpacoEntreIndexOrdenado;
    private javax.swing.JLabel jLabelEspacoAntesFonte;
    private javax.swing.JLabel jLabelOrdenado;
    private javax.swing.JLabel jLabelPequisar;
    private javax.swing.JLabel jLabelTotalPaginas;
    private javax.swing.JLabel jLabelTotalPaginasPesquisar;
    private javax.swing.JLabel jListarQuantidadePorPagina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JButton jbtSalvarFormulario;
    private javax.swing.JButton jbtUmaPaginaDireita;
    private javax.swing.JButton jbtUmaPaginaDireitaPesquisa;
    private javax.swing.JButton jbtUmaPaginaEsquerda;
    private javax.swing.JButton jbtUmaPaginaEsquerdaPesquisa;
    private javax.swing.JComboBox<String> jcbQuantidadePorPagina;
    private javax.swing.JComboBox<String> jcbTipoOrdem;
    private com.toedter.calendar.JDateChooser jdc_data;
    private javax.swing.JLabel jlObjetosEncontrados;
    private javax.swing.JLabel jl_Id;
    private javax.swing.JLabel jl_Nome;
    private javax.swing.JRadioButton jrdOrdenarPrimeiros;
    private javax.swing.JRadioButton jrdOrdernarUltimos;
    private javax.swing.JTextField jtextCampoPesquisa;
    private javax.swing.JTextField jtf_Id;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_estatus;
    private javax.swing.JTextField jtf_usuario;
    private javax.swing.JTextField jtf_valor;
    // End of variables declaration//GEN-END:variables
}
