package usuario;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaUsuario extends javax.swing.JFrame {
    
    public TelaUsuario() {
        initComponents();
        configurarEventos();
    }
    
    private void configurarEventos() {
        caixaTextoNome.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                atualizarResultado();
            }
        });

        caixaTextoSobrenome.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                atualizarResultado();
            }
        });
    }
    
    private void atualizarResultado() {
        resultado.setText(caixaTextoNome.getText() + " " + caixaTextoSobrenome.getText());
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        nome = new javax.swing.JLabel();
        sobrenome = new javax.swing.JLabel();
        caixaTextoNome = new javax.swing.JTextField();
        caixaTextoSobrenome = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("Nome:");

        sobrenome.setText("Sobrenome:");

        caixaTextoNome.addActionListener(this::caixaTextoNomeActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sobrenome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(caixaTextoSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(caixaTextoNome))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(caixaTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenome)
                    .addComponent(caixaTextoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultado)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void caixaTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaUsuario().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JTextField caixaTextoSobrenome;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel sobrenome;
    // End of variables declaration                   
}
