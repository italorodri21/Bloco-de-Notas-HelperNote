package bloconotas;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Dev: Italo Rodri
 * Versão: 2.2.3
 * Ano: 2020
 * 
 */

public final class BlocoNotas extends javax.swing.JFrame {
    
   
    private static void jPanel1(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Construtor
    public BlocoNotas() {
        initComponents();
        
      

        // Configurando icone
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icone_logo_roxo.png")));
        
        // Configurações iniciais
        btnSalvarAnotacao.setVisible(false);
        labelNome.setVisible(false);
        editNomeArquivo.setVisible(false);
        labelLocal.setVisible(false);
        editLocalArquivo.setVisible(false);
        btnSalvarHistorico.setVisible(false);
        labelConfirmarSalvamento.setVisible(false);
        
        // Colocando Configurações para invisivel
        barraConfiguracoes.setVisible(false);
       
    }
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadions = new javax.swing.ButtonGroup();
        telaInicial = new javax.swing.JPanel();
        painelMenuTelaInicial = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        labelContatos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaContatos = new javax.swing.JTable();
        jSeparator7 = new javax.swing.JSeparator();
        labelHistorico = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        editorHistoricoAnotacao = new javax.swing.JTextPane();
        btnArquivo = new javax.swing.JButton();
        carregarAnotacao = new javax.swing.JButton();
        btnNovaAnotacao1 = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        painelDoBloco = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        editorTextoAnotacao = new javax.swing.JTextPane();
        listaCompras = new javax.swing.JCheckBox();
        listaConvidados = new javax.swing.JCheckBox();
        listaCasamento = new javax.swing.JCheckBox();
        listaComprasFesta = new javax.swing.JCheckBox();
        listaTarefas = new javax.swing.JCheckBox();
        botaGoogle = new javax.swing.JButton();
        botaoChat = new javax.swing.JButton();
        botaoChamadaVideo = new javax.swing.JButton();
        botaoWhatsapp = new javax.swing.JButton();
        labelSelecioneiAnotacoesParaVoce = new javax.swing.JLabel();
        campoNumero2 = new javax.swing.JTextField();
        botaoSomar = new javax.swing.JButton();
        botaoSubtrair = new javax.swing.JButton();
        botaoMultiplicar = new javax.swing.JButton();
        botaoDividir = new javax.swing.JButton();
        campoResultado = new javax.swing.JTextField();
        campoNumero1 = new javax.swing.JTextField();
        labelFacaCalculosRapidos = new javax.swing.JLabel();
        editNomeArquivo = new javax.swing.JTextField();
        editLocalArquivo = new javax.swing.JTextField();
        btnSalvarAnotacao = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelOperador = new javax.swing.JLabel();
        botaoPorcentagem = new javax.swing.JButton();
        btnSalvarHistorico = new javax.swing.JButton();
        labelConfirmarSalvamento = new javax.swing.JLabel();
        barraConfiguracoes = new javax.swing.JPanel();
        btnModoBlack = new javax.swing.JToggleButton();
        btnModoCorColorida = new javax.swing.JToggleButton();
        btnTamanhoFonte = new javax.swing.JToggleButton();
        controleGiratorioFont = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1248, 682));
        setMinimumSize(new java.awt.Dimension(0, 680));

        telaInicial.setBackground(new java.awt.Color(255, 255, 255));
        telaInicial.setForeground(new java.awt.Color(40, 0, 204));
        telaInicial.setMaximumSize(new java.awt.Dimension(1248, 682));
        telaInicial.setMinimumSize(new java.awt.Dimension(0, 680));

        painelMenuTelaInicial.setBackground(new java.awt.Color(65, 0, 255));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));

        labelContatos.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelContatos.setForeground(new java.awt.Color(255, 255, 255));
        labelContatos.setText("Contatos");
        labelContatos.setToolTipText("");
        labelContatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane2.setBorder(null);

        tabelaContatos.setBackground(new java.awt.Color(255, 255, 255));
        tabelaContatos.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tabelaContatos.setForeground(new java.awt.Color(65, 0, 255));
        tabelaContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nome exemplo 1", "(83)912345-6789"},
                {"Nome exemplo 2", "(83)912345-6789"},
                {"Nome exemplo 3", "(83)912345-6789"},
                {"Nome exemplo 4", "(83)912345-6789"},
                {"Nome exemplo 5", "(83)912345-6789"},
                {"Nome exemplo 6", "(83)912345-6789"},
                {"Nome exemplo 7", "(83)912345-6789"}
            },
            new String [] {
                "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaContatos.setGridColor(new java.awt.Color(0, 51, 153));
        tabelaContatos.setSelectionBackground(new java.awt.Color(0, 255, 255));
        tabelaContatos.setSelectionForeground(new java.awt.Color(65, 0, 255));
        jScrollPane2.setViewportView(tabelaContatos);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));

        labelHistorico.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelHistorico.setForeground(new java.awt.Color(255, 255, 255));
        labelHistorico.setText("Histórico de anotações");

        jScrollPane5.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setAutoscrolls(true);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        editorHistoricoAnotacao.setBackground(new java.awt.Color(255, 255, 255));
        editorHistoricoAnotacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        editorHistoricoAnotacao.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        editorHistoricoAnotacao.setForeground(new java.awt.Color(65, 0, 255));
        editorHistoricoAnotacao.setCaretColor(new java.awt.Color(65, 0, 255));
        editorHistoricoAnotacao.setMaximumSize(new java.awt.Dimension(303, 288));
        editorHistoricoAnotacao.setMinimumSize(new java.awt.Dimension(303, 288));
        editorHistoricoAnotacao.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editorHistoricoAnotacao.setSelectionColor(new java.awt.Color(0, 255, 255));
        jScrollPane5.setViewportView(editorHistoricoAnotacao);

        btnArquivo.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnArquivo.setForeground(new java.awt.Color(255, 255, 255));
        btnArquivo.setText("Arquivo");
        btnArquivo.setBorderPainted(false);
        btnArquivo.setContentAreaFilled(false);
        btnArquivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });

        carregarAnotacao.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        carregarAnotacao.setForeground(new java.awt.Color(255, 255, 255));
        carregarAnotacao.setText("Carregar anotação");
        carregarAnotacao.setBorderPainted(false);
        carregarAnotacao.setContentAreaFilled(false);
        carregarAnotacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        carregarAnotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarAnotacaoActionPerformed(evt);
            }
        });

        btnNovaAnotacao1.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnNovaAnotacao1.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaAnotacao1.setText("Nova anotação");
        btnNovaAnotacao1.setBorderPainted(false);
        btnNovaAnotacao1.setContentAreaFilled(false);
        btnNovaAnotacao1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovaAnotacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaAnotacao1ActionPerformed(evt);
            }
        });

        btnConfiguracoes.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        btnConfiguracoes.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracoes.setText("Configurações");
        btnConfiguracoes.setBorderPainted(false);
        btnConfiguracoes.setContentAreaFilled(false);
        btnConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuTelaInicialLayout = new javax.swing.GroupLayout(painelMenuTelaInicial);
        painelMenuTelaInicial.setLayout(painelMenuTelaInicialLayout);
        painelMenuTelaInicialLayout.setHorizontalGroup(
            painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                        .addGroup(painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carregarAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                        .addGroup(painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovaAnotacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelMenuTelaInicialLayout.setVerticalGroup(
            painelMenuTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovaAnotacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(carregarAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(labelContatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHistorico)
                .addGap(2, 2, 2)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDoBloco.setBackground(new java.awt.Color(65, 0, 255));

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setAutoscrolls(true);
        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        editorTextoAnotacao.setBackground(new java.awt.Color(255, 255, 255));
        editorTextoAnotacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        editorTextoAnotacao.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        editorTextoAnotacao.setForeground(new java.awt.Color(65, 0, 255));
        editorTextoAnotacao.setCaretColor(new java.awt.Color(65, 0, 255));
        editorTextoAnotacao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        editorTextoAnotacao.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editorTextoAnotacao.setSelectionColor(new java.awt.Color(0, 255, 255));
        jScrollPane6.setViewportView(editorTextoAnotacao);

        javax.swing.GroupLayout painelDoBlocoLayout = new javax.swing.GroupLayout(painelDoBloco);
        painelDoBloco.setLayout(painelDoBlocoLayout);
        painelDoBlocoLayout.setHorizontalGroup(
            painelDoBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDoBlocoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        painelDoBlocoLayout.setVerticalGroup(
            painelDoBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDoBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        listaCompras.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(listaCompras);
        listaCompras.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        listaCompras.setForeground(new java.awt.Color(50, 0, 255));
        listaCompras.setText("Lista de compras");

        listaConvidados.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(listaConvidados);
        listaConvidados.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        listaConvidados.setForeground(new java.awt.Color(50, 0, 255));
        listaConvidados.setText("Lista de convidados");

        listaCasamento.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(listaCasamento);
        listaCasamento.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        listaCasamento.setForeground(new java.awt.Color(50, 0, 255));
        listaCasamento.setText("Lista de casamento");

        listaComprasFesta.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(listaComprasFesta);
        listaComprasFesta.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        listaComprasFesta.setForeground(new java.awt.Color(50, 0, 255));
        listaComprasFesta.setText("Lista de compras para a festa");

        listaTarefas.setBackground(new java.awt.Color(255, 255, 255));
        grupoRadions.add(listaTarefas);
        listaTarefas.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        listaTarefas.setForeground(new java.awt.Color(50, 0, 255));
        listaTarefas.setText("Lista de tarefas");

        botaGoogle.setBackground(new java.awt.Color(65, 0, 255));
        botaGoogle.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        botaGoogle.setForeground(new java.awt.Color(255, 255, 255));
        botaGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_navegador.png"))); // NOI18N
        botaGoogle.setText("Pesquisar");
        botaGoogle.setBorder(null);
        botaGoogle.setBorderPainted(false);
        botaGoogle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaGoogleActionPerformed(evt);
            }
        });

        botaoChat.setBackground(new java.awt.Color(65, 0, 255));
        botaoChat.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        botaoChat.setForeground(new java.awt.Color(255, 255, 255));
        botaoChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_hangouts.png"))); // NOI18N
        botaoChat.setText("Google Hangouts");
        botaoChat.setBorder(null);
        botaoChat.setBorderPainted(false);
        botaoChat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChatActionPerformed(evt);
            }
        });

        botaoChamadaVideo.setBackground(new java.awt.Color(65, 0, 255));
        botaoChamadaVideo.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        botaoChamadaVideo.setForeground(new java.awt.Color(255, 255, 255));
        botaoChamadaVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_chat_video.png"))); // NOI18N
        botaoChamadaVideo.setText("Google Meet");
        botaoChamadaVideo.setBorder(null);
        botaoChamadaVideo.setBorderPainted(false);
        botaoChamadaVideo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoChamadaVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoChamadaVideoActionPerformed(evt);
            }
        });

        botaoWhatsapp.setBackground(new java.awt.Color(65, 0, 255));
        botaoWhatsapp.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        botaoWhatsapp.setForeground(new java.awt.Color(255, 255, 255));
        botaoWhatsapp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ic_whatsapp.png"))); // NOI18N
        botaoWhatsapp.setText("Whatsapp");
        botaoWhatsapp.setBorder(null);
        botaoWhatsapp.setBorderPainted(false);
        botaoWhatsapp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botaoWhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoWhatsappActionPerformed(evt);
            }
        });

        labelSelecioneiAnotacoesParaVoce.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelSelecioneiAnotacoesParaVoce.setForeground(new java.awt.Color(65, 0, 255));
        labelSelecioneiAnotacoesParaVoce.setText("Selecionei algumas anotações para você utilizar.");

        campoNumero2.setBackground(new java.awt.Color(65, 0, 255));
        campoNumero2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        campoNumero2.setForeground(new java.awt.Color(255, 255, 255));
        campoNumero2.setText("0");
        campoNumero2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoNumero2.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        campoNumero2.setSelectionColor(new java.awt.Color(0, 255, 255));

        botaoSomar.setBackground(new java.awt.Color(65, 0, 255));
        botaoSomar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoSomar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSomar.setText("+");
        botaoSomar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoSomar.setBorderPainted(false);
        botaoSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSomarActionPerformed(evt);
            }
        });

        botaoSubtrair.setBackground(new java.awt.Color(65, 0, 255));
        botaoSubtrair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoSubtrair.setForeground(new java.awt.Color(255, 255, 255));
        botaoSubtrair.setText("-");
        botaoSubtrair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoSubtrair.setBorderPainted(false);
        botaoSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubtrairActionPerformed(evt);
            }
        });

        botaoMultiplicar.setBackground(new java.awt.Color(65, 0, 255));
        botaoMultiplicar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        botaoMultiplicar.setText("x");
        botaoMultiplicar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoMultiplicar.setBorderPainted(false);
        botaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultiplicarActionPerformed(evt);
            }
        });

        botaoDividir.setBackground(new java.awt.Color(65, 0, 255));
        botaoDividir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoDividir.setForeground(new java.awt.Color(255, 255, 255));
        botaoDividir.setText("/");
        botaoDividir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoDividir.setBorderPainted(false);
        botaoDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDividirActionPerformed(evt);
            }
        });

        campoResultado.setBackground(new java.awt.Color(65, 0, 255));
        campoResultado.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        campoResultado.setForeground(new java.awt.Color(255, 255, 255));
        campoResultado.setText("Resultado");
        campoResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoResultado.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        campoResultado.setSelectionColor(new java.awt.Color(0, 255, 255));

        campoNumero1.setBackground(new java.awt.Color(65, 0, 255));
        campoNumero1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        campoNumero1.setForeground(new java.awt.Color(255, 255, 255));
        campoNumero1.setText("0");
        campoNumero1.setToolTipText("");
        campoNumero1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoNumero1.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        campoNumero1.setSelectionColor(new java.awt.Color(0, 255, 255));

        labelFacaCalculosRapidos.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        labelFacaCalculosRapidos.setForeground(new java.awt.Color(65, 0, 255));
        labelFacaCalculosRapidos.setText("Faça calculos rápidos");

        editNomeArquivo.setBackground(new java.awt.Color(255, 255, 255));
        editNomeArquivo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        editNomeArquivo.setForeground(new java.awt.Color(65, 0, 255));
        editNomeArquivo.setText("MinhaAnotacao");
        editNomeArquivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editNomeArquivo.setPreferredSize(new java.awt.Dimension(90, 30));
        editNomeArquivo.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editNomeArquivo.setSelectionColor(new java.awt.Color(0, 255, 255));

        editLocalArquivo.setBackground(new java.awt.Color(255, 255, 255));
        editLocalArquivo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        editLocalArquivo.setForeground(new java.awt.Color(65, 0, 255));
        editLocalArquivo.setText("C:\\Users\\italo\\Documents");
        editLocalArquivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        editLocalArquivo.setPreferredSize(new java.awt.Dimension(90, 30));
        editLocalArquivo.setSelectedTextColor(new java.awt.Color(65, 0, 255));
        editLocalArquivo.setSelectionColor(new java.awt.Color(0, 255, 255));

        btnSalvarAnotacao.setBackground(new java.awt.Color(65, 0, 255));
        btnSalvarAnotacao.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnSalvarAnotacao.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAnotacao.setText("Salvar");
        btnSalvarAnotacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalvarAnotacao.setBorderPainted(false);
        btnSalvarAnotacao.setMinimumSize(new java.awt.Dimension(164, 32));
        btnSalvarAnotacao.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSalvarAnotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAnotacaoActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(65, 0, 255));
        labelNome.setText("Nome:");
        labelNome.setPreferredSize(new java.awt.Dimension(90, 30));

        labelLocal.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        labelLocal.setForeground(new java.awt.Color(65, 0, 255));
        labelLocal.setText("Pasta local:");
        labelLocal.setPreferredSize(new java.awt.Dimension(90, 30));

        labelOperador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelOperador.setForeground(new java.awt.Color(65, 0, 255));
        labelOperador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOperador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoPorcentagem.setBackground(new java.awt.Color(65, 0, 255));
        botaoPorcentagem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        botaoPorcentagem.setText("C");
        botaoPorcentagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botaoPorcentagem.setBorderPainted(false);
        botaoPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPorcentagemActionPerformed(evt);
            }
        });

        btnSalvarHistorico.setBackground(new java.awt.Color(65, 0, 255));
        btnSalvarHistorico.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnSalvarHistorico.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarHistorico.setText("Salvar histórico");
        btnSalvarHistorico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalvarHistorico.setBorderPainted(false);
        btnSalvarHistorico.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSalvarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarHistoricoActionPerformed(evt);
            }
        });

        labelConfirmarSalvamento.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        labelConfirmarSalvamento.setForeground(new java.awt.Color(65, 0, 255));
        labelConfirmarSalvamento.setText("Salvo");

        barraConfiguracoes.setBackground(new java.awt.Color(255, 255, 255));

        btnModoBlack.setBackground(new java.awt.Color(65, 0, 255));
        btnModoBlack.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btnModoBlack.setForeground(new java.awt.Color(255, 255, 255));
        btnModoBlack.setText("Modo normal");
        btnModoBlack.setBorderPainted(false);
        btnModoBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoBlackActionPerformed(evt);
            }
        });

        btnModoCorColorida.setBackground(new java.awt.Color(65, 0, 255));
        btnModoCorColorida.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btnModoCorColorida.setForeground(new java.awt.Color(255, 255, 255));
        btnModoCorColorida.setText("Tema");
        btnModoCorColorida.setBorderPainted(false);
        btnModoCorColorida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoCorColoridaActionPerformed(evt);
            }
        });

        btnTamanhoFonte.setBackground(new java.awt.Color(65, 0, 255));
        btnTamanhoFonte.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btnTamanhoFonte.setForeground(new java.awt.Color(255, 255, 255));
        btnTamanhoFonte.setText("Alterar tamanho da fonte");
        btnTamanhoFonte.setBorderPainted(false);
        btnTamanhoFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanhoFonteActionPerformed(evt);
            }
        });

        controleGiratorioFont.setModel(new javax.swing.SpinnerNumberModel(15, 3, 48, 1));

        javax.swing.GroupLayout barraConfiguracoesLayout = new javax.swing.GroupLayout(barraConfiguracoes);
        barraConfiguracoes.setLayout(barraConfiguracoesLayout);
        barraConfiguracoesLayout.setHorizontalGroup(
            barraConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModoBlack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnModoCorColorida)
                .addGap(33, 33, 33)
                .addComponent(btnTamanhoFonte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controleGiratorioFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        barraConfiguracoesLayout.setVerticalGroup(
            barraConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModoBlack)
                    .addComponent(btnModoCorColorida)
                    .addComponent(btnTamanhoFonte)
                    .addComponent(controleGiratorioFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout telaInicialLayout = new javax.swing.GroupLayout(telaInicial);
        telaInicial.setLayout(telaInicialLayout);
        telaInicialLayout.setHorizontalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addComponent(painelMenuTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDoBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(btnSalvarAnotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editLocalArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvarHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(botaGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoChat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoChamadaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(listaCompras)
                                .addGap(18, 18, 18)
                                .addComponent(listaTarefas)
                                .addGap(18, 18, 18)
                                .addComponent(listaConvidados))
                            .addComponent(labelSelecioneiAnotacoesParaVoce, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaInicialLayout.createSequentialGroup()
                                .addComponent(listaCasamento)
                                .addGap(18, 18, 18)
                                .addComponent(listaComprasFesta))
                            .addComponent(barraConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaInicialLayout.createSequentialGroup()
                                .addComponent(campoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelFacaCalculosRapidos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaInicialLayout.createSequentialGroup()
                                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoResultado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaInicialLayout.createSequentialGroup()
                                        .addComponent(botaoSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addComponent(labelConfirmarSalvamento, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        telaInicialLayout.setVerticalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaGoogle)
                    .addComponent(botaoChat)
                    .addComponent(botaoChamadaVideo)
                    .addComponent(botaoWhatsapp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelConfirmarSalvamento)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editLocalArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaInicialLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvarHistorico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvarAnotacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDoBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSelecioneiAnotacoesParaVoce)
                    .addComponent(labelFacaCalculosRapidos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOperador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSomar)
                            .addComponent(botaoSubtrair)
                            .addComponent(botaoMultiplicar)
                            .addComponent(botaoDividir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listaCompras)
                            .addComponent(listaTarefas)
                            .addComponent(listaConvidados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listaCasamento)
                            .addComponent(listaComprasFesta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(painelMenuTelaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     

    
    // +++++++++++++++ Metodo para abrir o Navegador Web +++++++++++++++
    private void botaGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaGoogleActionPerformed
        
        // Chamando metodo main do navegador
        String[] args = null;
        NavegadorWeb.main(args);
        
    }//GEN-LAST:event_botaGoogleActionPerformed

    
    
    // +++++++++++++++ Btn Google Hangouts 
    private void botaoChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChatActionPerformed

        
        
        // Código para abrir o link do Hangouts
        if (java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desk = java.awt.Desktop.getDesktop();
        
        
        if ( desk.isSupported(java.awt.Desktop.Action.BROWSE) ){
            try{
            
                java.net.URI minhaUrl = new java.net.URI("https://hangouts.google.com");
                desk.browse( minhaUrl );
                
            }catch( URISyntaxException | IOException e ){
            
            }
        }
        
        
        
        }
        
    }//GEN-LAST:event_botaoChatActionPerformed

    
    
    // +++++++++++++++ Btn Carregar Anotacao 
    private void carregarAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarAnotacaoActionPerformed
        
       barraConfiguracoes.setVisible(false);
        
        
        // Textos dos checkBox
        String textoListaCompras = "Primeira lista de compras completa\n" +
        "Você acabou de casar ou está indo morar sozinho? Então precisará fazer uma primeira lista de compras completa.\n" +
        "\n" +
        "Confira nossa sugestão de itens para a primeira lista de compras completa. Pegue esse itens essenciais e depois adapte para o que você prefere consumir:\n" +
        "\n" +
        "Açúcar;\n" +
        "Arroz;\n" +
        "Biscoitos;\n" +
        "Café;\n" +
        "Carnes;\n" +
        "Farinha;\n" +
        "Feijão;\n" +
        "Fermento;\n" +
        "Hortaliças;\n" +
        "Iogurte;\n" +
        "Leite;\n" +
        "Macarrão;\n" +
        "Margarina;\n" +
        "Molho de tomate;\n" +
        "Óleo;\n" +
        "Ovos;\n" +
        "Pães;\n" +
        "Queijo ralado;\n" +
        "Sal;\n" +
        "Temperos;\n" +
        "Água Sanitária;\n" +
        "Álcool em gel;\n" +
        "Amaciante;\n" +
        "Desinfetante;\n" +
        "Detergente;\n" +
        "Esponja de aço;\n" +
        "Esponja de pia;\n" +
        "Flanelas;";
        String textoListaTarefas = "Lista de tarefas ( Nome )\n" +
        "\n" +
        "Dia ( ), do Mês (  ).\n" +
        "\n" +
        "1 - Ir ao supermercado.\n" +
        "2 - Ir a casa do meu pai.\n" +
        "3 - Comprar um carro.\n" +
        "4 - Programar\n" +
        "5 - Programar\n" +
        "6 - Programar\n" +
        "7 - Comer\n" +
        "8 - Dormir\n" +
        "9 - Programar\n" +
        "10 - Programar";
        String textoListaConvidados = "Minha Lista de convidados do meu casamento\n" +
        "\n" +
        "1- Italo\n" +
        "2- Italo\n" +
        "3- Italo\n" +
        "4- Italo\n" +
        "5- Italo\n" +
        "6- Italo\n" +
        "7- Italo\n" +
        "8- Italo\n" +
        "9- Italo\n" +
        "10- Italo";
        String textoListaCasamento = "Minha Lista de compras do meu casamento\n" +
        "\n" +
        "1- Buquê de flores\n" +
        "2- Bolo\n" +
        "3- Sofoneiro\n" +
        "4- Cadeiras\n" +
        "5- Doces\n" +
        "6- Salgados\n" +
        "7- +Doces\n" +
        "8- +Salgados\n" +
        "9- +Doces\n" +
        "10- +Salgados";
        String textoListaComprasFesta = "Minha Lista de compras da minha festa\n" +
        "\n" +
        "1- Torta\n" +
        "2- Guardanapo\n" +
        "3- Garfos\n" +
        "4- Colheres\n" +
        "5- Doces\n" +
        "6- Salgados\n" +
        "7- Chapéus\n" +
        "8- Mesa\n" +
        "9- Cadeiras\n" +
        "10- Convidado ";
        
        // Verificando qual dos checkBox estão selecionados
        
        if ( listaCompras.isSelected() ){
            
            editorTextoAnotacao.setText( textoListaCompras );
        
        }else if ( listaTarefas.isSelected() ){
        
            editorTextoAnotacao.setText( textoListaTarefas );
            
        }else if ( listaConvidados.isSelected() ){
        
            editorTextoAnotacao.setText( textoListaConvidados );
            
        }else if ( listaCasamento.isSelected() ){
        
            editorTextoAnotacao.setText( textoListaCasamento );
            
        }else if ( listaComprasFesta.isSelected() ){
        
            editorTextoAnotacao.setText( textoListaComprasFesta );
            
        }
        
    }//GEN-LAST:event_carregarAnotacaoActionPerformed

    
    
    // +++++++++++++++ Btn Google Meet
    private void botaoChamadaVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoChamadaVideoActionPerformed
        
        // Código para abrir o link do google meet
        if (java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desk = java.awt.Desktop.getDesktop();
        
        
        if ( desk.isSupported(java.awt.Desktop.Action.BROWSE) ){
            
            try{
            
                java.net.URI minhaUrl = new java.net.URI("https://apps.google.com/meet/");
                desk.browse( minhaUrl );
                
            }catch( URISyntaxException | IOException e ){
            
            }
        }
        
        }
    }//GEN-LAST:event_botaoChamadaVideoActionPerformed

    
    
    // +++++++++++++++ Btn Whatsapp Web 
    private void botaoWhatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoWhatsappActionPerformed
        
      
        
     
        
        
        // Código abrir link do Whatsapp
        if (java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desk = java.awt.Desktop.getDesktop();
        
        
        if ( desk.isSupported(java.awt.Desktop.Action.BROWSE) ){
            
            try{
            
                java.net.URI minhaUrl = new java.net.URI("https://web.whatsapp.com");
                desk.browse( minhaUrl );
                
            }catch( URISyntaxException | IOException e ){
            
            }
        }
        
        }
        
        
    }//GEN-LAST:event_botaoWhatsappActionPerformed

    
    
    // +++++++++++++++ Btn Somar 
    private void botaoSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomarActionPerformed
        
        labelOperador.setText("+");
        labelOperador.setVisible(true);
        
        // Recuperando textos
        String valor1 = campoNumero1.getText().toString();
        String valor2 = campoNumero2.getText().toString();
        
        // Verificando se os campos estão preenchidos
        if( !valor1.isEmpty() ){
            if( !valor2.isEmpty() ){
        
        // Convertendo de String para int
        int valor1Convertido = Integer.parseInt(valor1);
        int valor2Convertido = Integer.parseInt(valor2);
        
            // Somando    
            int total = valor1Convertido + valor2Convertido;
            
            // Exibindo Resultado
            String totalConvertido = Integer.toString(total);
             campoResultado.setText( totalConvertido );
                
        }else{
                campoResultado.setText("Resultado");
            }
        }else{
            campoResultado.setText("Resultado");
        }
    }//GEN-LAST:event_botaoSomarActionPerformed

    
    
    // +++++++++++++++ Btn Subtrair Calculadora 
    private void botaoSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtrairActionPerformed
        
        labelOperador.setText("-");
        labelOperador.setVisible(true);
        
        // Recuperando textos
        
        String valor1 = campoNumero1.getText().toString();
        String valor2 = campoNumero2.getText().toString();
        
        // Verificando se os campos estão preenchidos
        if( !valor1.isEmpty() ){
            if( !valor2.isEmpty() ){
        
        // Convertendo de String para int   
        int valor1Convertido = Integer.parseInt(valor1);
        int valor2Convertido = Integer.parseInt(valor2);
        
            // Exibindo Resultado
            int total = valor1Convertido - valor2Convertido;
            
            String totalConvertido = Integer.toString(total);
             campoResultado.setText( totalConvertido );
                
        }else{
                campoResultado.setText("Resultado");
            }
        }else{
            campoResultado.setText("Resultado");
        }
    }//GEN-LAST:event_botaoSubtrairActionPerformed

    
    
    // +++++++++++++++ Btn Multiplicar Calculadora 
    private void botaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicarActionPerformed
        
        labelOperador.setText("X");
        labelOperador.setVisible(true);
        
        // Recuperando texto dos campos
        String valor1 = campoNumero1.getText().toString();
        String valor2 = campoNumero2.getText().toString();
        
        // Verificando se os campos estão preenchidos
        if( !valor1.isEmpty() ){
            if( !valor2.isEmpty() ){
        
              // COnvertendo de String para int
        int valor1Convertido = Integer.parseInt(valor1);
        int valor2Convertido = Integer.parseInt(valor2);
        
            // Multiplicando
            int total = valor1Convertido * valor2Convertido;
            
            // Exibindo Resultado
            String totalConvertido = Integer.toString(total);
             campoResultado.setText( totalConvertido );
                
        }else{
                campoResultado.setText("Resultado");
            }
        }else{
            campoResultado.setText("Resultado");
        }    
        
    }//GEN-LAST:event_botaoMultiplicarActionPerformed

    
    
    // +++++++++++++++ Btn Dividir Calculadora 
    private void botaoDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDividirActionPerformed
        
        labelOperador.setText("/");
        labelOperador.setVisible(true);
        
        // Recuperando texto dos campos
        String valor1 = campoNumero1.getText().toString();
        String valor2 = campoNumero2.getText().toString();
        
        // Verificando se os campos estão preenchidos
        if( !valor1.isEmpty() ){
            if( !valor2.isEmpty() ){
        
        // Convertendo de String para int 
        int valor1Convertido = Integer.parseInt(valor1);
        int valor2Convertido = Integer.parseInt(valor2);
        
            // Dividindo
            int total = valor1Convertido / valor2Convertido;
            
            // Exibindo Resultado
            String totalConvertido = Integer.toString(total);
             campoResultado.setText( totalConvertido );
                
        }else{  
                campoResultado.setText("Resultado");
            }
        }else{
            campoResultado.setText("Resultado");
        }
    }//GEN-LAST:event_botaoDividirActionPerformed

    
    // +++++++++++++++ Metodo Salvar anotação 
    public void recuperarSalvar()throws IOException{
    
    // Recuperando textos
    String textoAnotacao   =  editorTextoAnotacao.getText().toString();
    String textoNomeAquivo = editNomeArquivo.getText().toString();
    String localSalvo      = editLocalArquivo.getText().toString();
    
    // Recuperando data e hora
    Date dataHoraSistema = new Date();
    int data    = dataHoraSistema.getDate();
    int mes     = dataHoraSistema.getMonth();
    int hora    = dataHoraSistema.getHours();
    int minutos = dataHoraSistema.getMinutes();
   
    // Corrigindo bug do mes atrasado
    int mesCorreto = mes + 1;
    
    // Verificando se os campos estão preenchidos
    if ( !textoNomeAquivo.isEmpty() ){
        if ( !localSalvo.isEmpty() ){

            
            // Local a ser salvo
            FileWriter arq = new FileWriter( localSalvo+"\\"+textoNomeAquivo+".txt" );
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("ANOTAÇÃO SALVA NO DIA: " + data +"/"+ "0" +mesCorreto + " ÁS " + hora + " HORAS E " + minutos + " MINUTOS. \n \n" + textoAnotacao );
    
            // Finalizar
            arq.close();

            System.out.printf("Salvo com sucesso");
    
                labelConfirmarSalvamento.setVisible(true);
            labelConfirmarSalvamento.setText("Sua anotação foi salva com sucesso!");
           
        }else{
            
                        editLocalArquivo.setText("C:\\Users\\italo\\Documents");
                    labelConfirmarSalvamento.setVisible(true);
                labelConfirmarSalvamento.setText("Ops! Defina o local a ser salvo!");
           System.out.printf("Defina o local a ser salvo!");
           
        }
    }else{
        
                labelConfirmarSalvamento.setVisible(true);
            labelConfirmarSalvamento.setText("Ops! Defina o nome da anotação antes de salvar!");
        System.out.printf("Defina um nome do arquivo antes de salvar!");
        
    }
    
    
    }
    
    
    
    // +++++++++++++++ Btn Salvar Anotação 
    private void btnSalvarAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAnotacaoActionPerformed
       
        try {
            
            recuperarSalvar();
            
        } catch (IOException ex) {
            Logger.getLogger(BlocoNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnSalvarAnotacaoActionPerformed

    
    
    // +++++++++++++++ Btn Nova Anotação 
    private void btnNovaAnotacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaAnotacao1ActionPerformed
        
        // Recuperando textos
        String textoHistorico = editorHistoricoAnotacao.getText().toString();
        String textoAnotacao  = editorTextoAnotacao.getText().toString();
        
        Date dataHoraSistema = new Date();
        int data    = dataHoraSistema.getDate();
        int mes     = dataHoraSistema.getMonth();
        int hora    = dataHoraSistema.getHours();
        int minutos = dataHoraSistema.getMinutes();
        
        // Corrigindo bug do mes atrasado
        int mesCorreto = mes + 1;
        
        // Recuperando anotação e adicionando ao histórico  
        if( !textoAnotacao.isEmpty() ){
        
            editorHistoricoAnotacao.setText( " +++++++++++++++++++++++++++++++++ \n\n"+"ANOTAÇÃO FEITA NO DIA: "+data+"/"+ "0"+mesCorreto+", ÀS "+hora+" HORAS E "+minutos+" MINUTOS. \n\n"+textoAnotacao +"\n\n" + textoHistorico );
            
        }else{

        }
        
        // Configurações 
        editorTextoAnotacao.setText("");
        btnSalvarAnotacao.setVisible(false);
        labelNome.setVisible(false);
        editNomeArquivo.setVisible(false);
        labelLocal.setVisible(false);
        editLocalArquivo.setVisible(false);
        btnSalvarHistorico.setVisible(false);
        labelConfirmarSalvamento.setVisible(false);
        
         // Colocando Configurações para invisivel 
        barraConfiguracoes.setVisible(false);
        
        
    }//GEN-LAST:event_btnNovaAnotacao1ActionPerformed

    
    
    // +++++++++++++++ Btn Arquivo 
    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed
        
        btnSalvarAnotacao.setVisible(true);
        labelNome.setVisible(true);
        editNomeArquivo.setVisible(true);
        labelLocal.setVisible(true);
        editLocalArquivo.setVisible(true);
        btnSalvarHistorico.setVisible(true);
        
        // Colocando Configurações para invisivel
        barraConfiguracoes.setVisible(false);
        
        
    }//GEN-LAST:event_btnArquivoActionPerformed

    
    
    // +++++++++++++++ Btn Zerar Calculadora 
    private void botaoPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPorcentagemActionPerformed
        
        labelOperador.setText("");
        labelOperador.setVisible(true);
        
        campoResultado.setText("Resultado");
        campoNumero1.setText("0");
        campoNumero2.setText("0");
        
    }//GEN-LAST:event_botaoPorcentagemActionPerformed

    
    
    // +++++++++++++++ Btn Salvar Histórico 
    private void btnSalvarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarHistoricoActionPerformed
        
        try {
            // Chamando metodo
            recuperarHistorico();
            
        } catch (IOException ex) {
            Logger.getLogger(BlocoNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnSalvarHistoricoActionPerformed

    
    // +++++++++++++++ Btn Configuração 
    private void btnConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracoesActionPerformed
        
        
        // Colocando Configurações para invisivel
        barraConfiguracoes.setVisible(true);
        
       
    }//GEN-LAST:event_btnConfiguracoesActionPerformed

    
    // +++++++++++++++ Btn Modo Dark 
    private void btnModoBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoBlackActionPerformed
       
        // Cor backGround Modo Dark
        int darkR = 35;
        int darkG = 45;
        int darkB = 54;
        
        // Cor Secundaria Modo Dark
        int secDarkR = 16;
        int secDarkG = 29;
        int secDarkB = 37;
        
        // Cor Botoes Modo Dark
        int btnDarkR = 0;
        int btnDarkG = 176;
        int btnDarkB = 156;
        
        
        // Cor Original
        int origR = 65;
        int origG = 0;
        int origB = 255;
        
        
        Color corOriginal = new Color(origR, origG, origB);
        Color corDark = new Color(darkR, darkG, darkB);
        Color corSecundariaDark = new Color(secDarkR, secDarkG, secDarkB);
        Color corBtnDark = new Color(btnDarkR, btnDarkG, btnDarkB);
        
        // Tema Dark
        if ( btnModoBlack.isSelected() ){
        
        btnModoBlack.setText("Modo Dark");    
            
        painelMenuTelaInicial.setBackground(corDark);
        painelDoBloco.setBackground(corDark);
        botaGoogle.setBackground(corBtnDark);
        botaoChat.setBackground(corBtnDark);
        botaoChamadaVideo.setBackground(corBtnDark);
        botaoWhatsapp.setBackground(corBtnDark);
        btnModoBlack.setBackground(corBtnDark);
        telaInicial.setBackground(corSecundariaDark);
        btnModoCorColorida.setBackground(corBtnDark);
        
        labelSelecioneiAnotacoesParaVoce.setForeground(Color.white);
        labelFacaCalculosRapidos.setForeground(Color.white);
        listaCompras.setForeground(Color.white);
        listaCasamento.setForeground(Color.white);
        listaTarefas.setForeground(Color.white);
        listaComprasFesta.setForeground(Color.white);
        listaConvidados.setForeground(Color.white);
        botaoSomar.setBackground(corBtnDark);
        botaoSubtrair.setBackground(corBtnDark);
        botaoMultiplicar.setBackground(corBtnDark);
        botaoDividir.setBackground(corBtnDark);
        campoResultado.setBackground(Color.white);
        botaoPorcentagem.setBackground(corBtnDark);
        tabelaContatos.setForeground(Color.black);
        campoNumero1.setBackground(Color.white);
        campoNumero2.setBackground(Color.white);
        
        editorTextoAnotacao.setForeground(corSecundariaDark);
        editorHistoricoAnotacao.setForeground(corSecundariaDark);
        campoNumero1.setForeground(corSecundariaDark);
        campoNumero2.setForeground(corSecundariaDark);
        campoResultado.setForeground(corSecundariaDark);
        labelOperador.setForeground(Color.white);
        
        labelConfirmarSalvamento.setForeground(Color.white);
        labelNome.setForeground(Color.white);
        editNomeArquivo.setForeground(corSecundariaDark);
        labelLocal.setForeground(Color.white);
        editLocalArquivo.setForeground(corSecundariaDark);
        btnSalvarAnotacao.setBackground(corBtnDark);
        btnSalvarHistorico.setBackground(corBtnDark);
        tabelaContatos.setForeground(corSecundariaDark);
        barraConfiguracoes.setBackground(corSecundariaDark);
        btnTamanhoFonte.setBackground(corBtnDark);      
        
        // Tema Original     
        }else{
        
        btnModoBlack.setText("Modo normal");
            
        painelMenuTelaInicial.setBackground(corOriginal);
        painelDoBloco.setBackground(corOriginal);
        botaGoogle.setBackground(corOriginal);
        botaoChat.setBackground(corOriginal);
        botaoChamadaVideo.setBackground(corOriginal);
        botaoWhatsapp.setBackground(corOriginal);
        btnModoBlack.setBackground(corOriginal);
        telaInicial.setBackground(Color.white);
        btnModoCorColorida.setBackground(corOriginal);    
            
        labelSelecioneiAnotacoesParaVoce.setForeground(corOriginal);
        labelFacaCalculosRapidos.setForeground(corOriginal);
        listaCompras.setForeground(corOriginal);
        listaCasamento.setForeground(corOriginal);
        listaTarefas.setForeground(corOriginal);
        listaComprasFesta.setForeground(corOriginal);
        listaConvidados.setForeground(corOriginal);
        botaoSomar.setBackground(corOriginal);
        botaoSubtrair.setBackground(corOriginal);
        botaoMultiplicar.setBackground(corOriginal);
        botaoDividir.setBackground(corOriginal);
        campoResultado.setBackground(corOriginal);
        botaoPorcentagem.setBackground(corOriginal);
        tabelaContatos.setForeground(corOriginal);
        campoNumero1.setBackground(corOriginal);
        campoNumero2.setBackground(corOriginal);
        
        
        editorTextoAnotacao.setForeground(corOriginal);
        editorHistoricoAnotacao.setForeground(corOriginal);
        campoNumero1.setForeground(Color.white);
        campoNumero2.setForeground(Color.white);
        campoResultado.setForeground(Color.white);
        labelOperador.setForeground(corOriginal);
        
        labelConfirmarSalvamento.setForeground(corOriginal);
        labelNome.setForeground(corOriginal);
        editNomeArquivo.setForeground(corOriginal);
        labelLocal.setForeground(corOriginal);
        editLocalArquivo.setForeground(corOriginal);
        btnSalvarAnotacao.setBackground(corOriginal);
        btnSalvarHistorico.setBackground(corOriginal);
        barraConfiguracoes.setBackground(Color.white);
        btnTamanhoFonte.setBackground(corOriginal); 
               }
        
    }//GEN-LAST:event_btnModoBlackActionPerformed

    // +++++++++++++++ Btn Modo Colorido
    private void btnModoCorColoridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoCorColoridaActionPerformed
        
        
        // Cor Azul
        
        int azulR = 3;
        int azulG = 135;
        int azulB = 247;
        
        // Cor Rosa
        
        int rosaR = 255;
        int rosaG = 97;
        int rosaB = 201;
        
        Color corAzul = new Color(azulR, azulG, azulB);
        Color corRosa = new Color(rosaR, rosaG, rosaB);
        
        // Tema Azul
        if ( btnModoCorColorida.isSelected() ){
        
        btnModoCorColorida.setText("Tema Blue");
            
        painelMenuTelaInicial.setBackground(corAzul);
        painelDoBloco.setBackground(corAzul);
        botaGoogle.setBackground(corAzul);
        botaoChat.setBackground(corAzul);
        botaoChamadaVideo.setBackground(corAzul);
        botaoWhatsapp.setBackground(corAzul);
        btnModoBlack.setBackground(corAzul);
        telaInicial.setBackground(Color.white);
        btnModoCorColorida.setBackground(corAzul);
        
        
        labelSelecioneiAnotacoesParaVoce.setForeground(corAzul);
        labelFacaCalculosRapidos.setForeground(corAzul);
        listaCompras.setForeground(corAzul);
        listaCasamento.setForeground(corAzul);
        listaTarefas.setForeground(corAzul);
        listaComprasFesta.setForeground(corAzul);
        listaConvidados.setForeground(corAzul);
        botaoSomar.setBackground(corAzul);
        botaoSubtrair.setBackground(corAzul);
        botaoMultiplicar.setBackground(corAzul);
        botaoDividir.setBackground(corAzul);
        campoResultado.setBackground(corAzul);
        botaoPorcentagem.setBackground(corAzul);
        tabelaContatos.setForeground(corAzul);
        campoNumero1.setBackground(corAzul);
        campoNumero2.setBackground(corAzul);
        
        
        editorTextoAnotacao.setForeground(corAzul);
        editorHistoricoAnotacao.setForeground(corAzul);
        campoNumero1.setForeground(Color.white);
        campoNumero2.setForeground(Color.white);
        labelOperador.setForeground(corAzul);
        
        labelConfirmarSalvamento.setForeground(corAzul);
        labelNome.setForeground(corAzul);
        editNomeArquivo.setForeground(corAzul);
        labelLocal.setForeground(corAzul);
        editLocalArquivo.setForeground(corAzul);
        btnSalvarAnotacao.setBackground(corAzul);
        btnSalvarHistorico.setBackground(corAzul);
        campoResultado.setForeground(Color.white);
        barraConfiguracoes.setBackground(Color.white);
        btnTamanhoFonte.setBackground(corAzul);
        
        // Tema Rosa    
        }else{
        
        btnModoCorColorida.setText("Tema Pink");    
            
        painelMenuTelaInicial.setBackground(corRosa);
        painelDoBloco.setBackground(corRosa);
        botaGoogle.setBackground(corRosa);
        botaoChat.setBackground(corRosa);
        botaoChamadaVideo.setBackground(corRosa);
        botaoWhatsapp.setBackground(corRosa);
        btnModoBlack.setBackground(corRosa);
        telaInicial.setBackground(Color.white);
        btnModoCorColorida.setBackground(corRosa);
        
        
        
        labelSelecioneiAnotacoesParaVoce.setForeground(corRosa);
        labelFacaCalculosRapidos.setForeground(corRosa);
        listaCompras.setForeground(corRosa);
        listaCasamento.setForeground(corRosa);
        listaTarefas.setForeground(corRosa);
        listaComprasFesta.setForeground(corRosa);
        listaConvidados.setForeground(corRosa);
        botaoSomar.setBackground(corRosa);
        botaoSubtrair.setBackground(corRosa);
        botaoMultiplicar.setBackground(corRosa);
        botaoDividir.setBackground(corRosa);
        campoResultado.setBackground(corRosa);
        botaoPorcentagem.setBackground(corRosa);
        tabelaContatos.setForeground(corRosa);
        campoNumero1.setBackground(corRosa);
        campoNumero2.setBackground(corRosa);
        
        
        editorTextoAnotacao.setForeground(corRosa);
        editorHistoricoAnotacao.setForeground(corRosa);
        campoNumero1.setForeground(Color.white);
        campoNumero2.setForeground(Color.white);
        labelOperador.setForeground(corRosa);
        campoResultado.setForeground(Color.white);
        
        labelConfirmarSalvamento.setForeground(corRosa);
        labelNome.setForeground(corRosa);
        editNomeArquivo.setForeground(corRosa);
        labelLocal.setForeground(corRosa);
        editLocalArquivo.setForeground(corRosa);
        btnSalvarAnotacao.setBackground(corRosa);
        btnSalvarHistorico.setBackground(corRosa);
        barraConfiguracoes.setBackground(Color.white);
        btnTamanhoFonte.setBackground(corRosa);
        
               }
        
        
    }//GEN-LAST:event_btnModoCorColoridaActionPerformed

    // +++++++++++++++ Btn Alterar Fonte 
    private void btnTamanhoFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamanhoFonteActionPerformed
        
        int valorSpiner = Integer.parseInt(controleGiratorioFont.getValue().toString());
        
        editorTextoAnotacao.setFont(new java.awt.Font("Bahnschrift", 1, valorSpiner));
        
    }//GEN-LAST:event_btnTamanhoFonteActionPerformed

    
    
    // +++++++++++++++ Metodo Recuperar Histórico 
    public void recuperarHistorico() throws IOException{
    
    // Recuperando textos dos campos
    
    String textoNomeAquivo = "Histórico de " + editNomeArquivo.getText().toString();
    String textoHistorico  = editorHistoricoAnotacao.getText().toString();
    String localSalvo      = editLocalArquivo.getText().toString();
    
    // Recuperando data e hora
    
    Date dataHoraSistema = new Date();
    
    int data    = dataHoraSistema.getDate();
    int mes     = dataHoraSistema.getMonth();
    int hora    = dataHoraSistema.getHours();
    int minutos = dataHoraSistema.getMinutes();
    
    // Corrigindo bug do mes atrasado
    int mesCorreto = mes + 1;
    
    // Verificando se as caixas estão preenchidas
    if ( !textoNomeAquivo.isEmpty() ){
        if ( !localSalvo.isEmpty() ){
            if ( !textoHistorico.isEmpty() ){
                      
            // Local a ser salvo
            FileWriter arq = new FileWriter( localSalvo+"\\"+textoNomeAquivo+data+mes+hora+minutos+".txt" );
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("HISTÓRICO SALVO NO DIA: " + data +"/"+ "0" + mesCorreto + " ÁS " + hora + " HORAS E " + minutos + " MINUTOS. \n \n" + textoHistorico );
    
            // Finalizar
            arq.close();
            
            labelConfirmarSalvamento.setVisible(true);
            labelConfirmarSalvamento.setText("Seu histórico de anotações foi salvo com sucesso!");
            
            System.out.printf("Seu histórico de anotações foi salvo com sucesso!");
            
            }else{
      
                        labelConfirmarSalvamento.setVisible(true);
                    labelConfirmarSalvamento.setText("Ops! O seu histórico está vazio!");
                System.out.printf("Ops! O seu histórico está vazio!");
               
            }
        }else{
        
                    labelConfirmarSalvamento.setVisible(true);
                    editLocalArquivo.setText("C:\\Users\\italo\\Documents");
                labelConfirmarSalvamento.setText("Ops! Defina o local a ser salvo!");
            System.out.printf("Ops! Defina o local a ser salvo!");
            
        }
    }else{
    
                labelConfirmarSalvamento.setVisible(true);
            labelConfirmarSalvamento.setText("Ops! Defina o nome do aquivo!");
        System.out.printf("Ops! Defina o nome do aquivo!");
        
    }
    
    
    }
    
    
    
    
    
    
    
    
    // +++++++++++++++ Metodo Main +++++++++++++++
    public static void main(String args[]) {

      
        
        
       // Trantando Excessões
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlocoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlocoNotas().setVisible(true);
            }
        });
        
        
        
        
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraConfiguracoes;
    public static javax.swing.JButton botaGoogle;
    private javax.swing.JButton botaoChamadaVideo;
    private javax.swing.JButton botaoChat;
    private javax.swing.JButton botaoDividir;
    private javax.swing.JButton botaoMultiplicar;
    private javax.swing.JButton botaoPorcentagem;
    private javax.swing.JButton botaoSomar;
    private javax.swing.JButton botaoSubtrair;
    public javax.swing.JButton botaoWhatsapp;
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JToggleButton btnModoBlack;
    private javax.swing.JToggleButton btnModoCorColorida;
    private javax.swing.JButton btnNovaAnotacao1;
    private javax.swing.JButton btnSalvarAnotacao;
    private javax.swing.JButton btnSalvarHistorico;
    private javax.swing.JToggleButton btnTamanhoFonte;
    private javax.swing.JTextField campoNumero1;
    private javax.swing.JTextField campoNumero2;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JButton carregarAnotacao;
    private javax.swing.JSpinner controleGiratorioFont;
    private javax.swing.JTextField editLocalArquivo;
    private javax.swing.JTextField editNomeArquivo;
    public static javax.swing.JTextPane editorHistoricoAnotacao;
    public static javax.swing.JTextPane editorTextoAnotacao;
    private javax.swing.ButtonGroup grupoRadions;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelConfirmarSalvamento;
    private javax.swing.JLabel labelContatos;
    private javax.swing.JLabel labelFacaCalculosRapidos;
    private javax.swing.JLabel labelHistorico;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelOperador;
    private javax.swing.JLabel labelSelecioneiAnotacoesParaVoce;
    private javax.swing.JCheckBox listaCasamento;
    private javax.swing.JCheckBox listaCompras;
    private javax.swing.JCheckBox listaComprasFesta;
    private javax.swing.JCheckBox listaConvidados;
    private javax.swing.JCheckBox listaTarefas;
    private javax.swing.JPanel painelDoBloco;
    private javax.swing.JPanel painelMenuTelaInicial;
    private javax.swing.JTable tabelaContatos;
    private javax.swing.JPanel telaInicial;
    // End of variables declaration//GEN-END:variables

    
}
