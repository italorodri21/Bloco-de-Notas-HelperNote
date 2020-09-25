package bloconotas;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;



public class NavegadorWeb extends JFrame {

    
    private final JFXPanel   jfxPanel         = new JFXPanel();
    private final JPanel     painel           = new JPanel(new BorderLayout());
    private final JButton    btnPesquisar     = new JButton("Recarregar");
    private final JButton    btnPaginaInicial = new JButton("Pesquisar");
    private final JTextField caixaTextoURL    = new JTextField();
    private WebEngine engine;

    
    
    // Construtor
    public NavegadorWeb() {
        super();
        
        initComponents();
        mudarIcone();     
    }    
    
    
    

    // +++++++++++++++ Configurando Icone
    private void mudarIcone(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icone_logo_roxo.png")));
        
    }
    
    
    
    // +++++++++++++++ Iniciando componentes
    private void initComponents() {
        
        // Criando cena
        createScene();
            
        // Ouvinte para o btn Pesquisar
        ActionListener acaoPesquisar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                carregarURL(caixaTextoURL.getText());
                
            }
        };
        
        // Ouvinte para o btn Recarregar
        ActionListener acaoPaginaInicial = new ActionListener(){
        @Override
        
        public void actionPerformed(ActionEvent e){

           carregarURL("www.bing.com");
            
           }
        };
        
        // Referencias
        btnPesquisar.addActionListener(acaoPesquisar);
        btnPaginaInicial.addActionListener(acaoPaginaInicial);
        caixaTextoURL.addActionListener(acaoPesquisar);
        caixaTextoURL.setSelectionColor(Color.cyan);
        
        // Cor do navegador
        int origR = 65;
        int origG = 0;
        int origB = 255;
        
        
        Color corOriginal = new Color(origR, origG, origB);
        
       
       // Configurando Fote e cores dos componentes
        
        btnPesquisar.setBackground(Color.white);
        btnPesquisar.setForeground(corOriginal);
        btnPesquisar.setFont(new java.awt.Font("Bahnschrift", 1, 15));
        
        btnPaginaInicial.setBackground(Color.white);
        btnPaginaInicial.setForeground(corOriginal);
        btnPaginaInicial.setFont(new java.awt.Font("Bahnschrift", 1, 15));
        
        
        // Configurando caixa de texto de URL
        caixaTextoURL.setBackground(corOriginal);
        caixaTextoURL.setForeground(Color.white);
        caixaTextoURL.setFont(new java.awt.Font("Bahnschrift", 1, 15));
        
        // Configurando Paineis
        jfxPanel.setBackground(corOriginal);
        painel.setBackground(corOriginal);
        
        
        // Configurando barra Superior
        JPanel barraSuperior = new JPanel(new BorderLayout(10, 0));
        barraSuperior.setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
        
        
        // Add componentes a barra Superior
        barraSuperior.add(caixaTextoURL, BorderLayout.CENTER);
        barraSuperior.add(btnPesquisar, BorderLayout.WEST);
        barraSuperior.add(btnPaginaInicial, BorderLayout.EAST);
        
        
        // Cor da barra Superior
        barraSuperior.setBackground(corOriginal);
        
     
        // Adicionando e configurando layout
        painel.add(barraSuperior, BorderLayout.NORTH);
        painel.add(jfxPanel, BorderLayout.CENTER);
        
        // Add
        getContentPane().add(painel);
        
        // Configurando dimensão do Frame
        setPreferredSize(new Dimension(1248, 682));
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    
    
    // +++++++++++++++ Criando scene
    private void createScene() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                // WebView
                WebView view = new WebView();
                engine = view.getEngine();
                // Habilitando javaScript
                engine.setJavaScriptEnabled(true);
                
                engine.titleProperty().addListener(new ChangeListener<String>() {
                    
                    
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, final String newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                NavegadorWeb.this.setTitle( newValue );
                            }
                        });
                    }
                });

                
               
                
                engine.locationProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> ov, String oldValue, final String newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                caixaTextoURL.setText( newValue );
                            }
                        });
                    }
                });

               
                jfxPanel.setScene(new Scene(view));
            }
        });
    }
    
    
    
    // +++++++++++++++ Configurando Carregamento da URL
    public void carregarURL(final String url) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String tmp = toURL(url);

                if (tmp == null) {
                    tmp = toURL("http://" + url);
                }

                engine.load(tmp);
            }
        });
    }

    
    
    // +++++++++++++++ Tratando excessão da URL
    private static String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }
    
    
      
    // +++++++++++++++ Metodo main +++++++++++++++
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            // Configurando página inicial da URL
            @Override
            public void run() {
                NavegadorWeb navegador = new NavegadorWeb();
                navegador.setVisible(true);
                navegador.carregarURL("http://www.bing.com");
                
                
            }
        });
    }
    
    
    
    
    
}
